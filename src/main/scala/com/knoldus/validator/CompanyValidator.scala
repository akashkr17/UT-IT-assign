package com.knoldus.validator

import java.security.KeyStore.TrustedCertificateEntry

import com.knoldus.db.CompanyReadto
import com.knoldus.models.Company

class CompanyValidator(companyRead: CompanyReadto,
                       validateEmail: EmailValidator) {

  def companyIsValid(company: Company): Boolean = {

    val emailValidate = validateEmail.emailIdIsValid(company.emailId)
    val companyValidate = companyRead.getCompanyByName(company.name)

    /** *
      * returns true if email is valid and company not exist in db
      * else returns false
      *
      */
    (emailValidate, companyValidate) match {
      case (true, None) =>
        true
      case _ =>
        false
    }
  }

}
