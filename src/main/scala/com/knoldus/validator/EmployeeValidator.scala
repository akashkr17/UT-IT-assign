package com.knoldus.validator

import com.knoldus.db.{CompanyReadto, EmployeeReadto}
import com.knoldus.models.Employee

class EmployeeValidator(companyReadto: CompanyReadto,
                        validateEmail: EmailValidator) {

  def employeeIsValid(employee: Employee): Boolean = {

    val emailValidate = validateEmail.emailIdIsValid(employee.emailId)
    val companyValidate = companyReadto.getCompanyByName(employee.companyName)

    /**
      * returns true if valid emailid and campany exit in db
      * else returns false
      */
    (emailValidate, companyValidate) match {
      case (true, Some(value)) =>
        true
      case _ =>
        false
    }
  }
}
