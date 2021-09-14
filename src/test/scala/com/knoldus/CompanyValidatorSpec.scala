package validator

import com.knoldus.db.CompanyReadto
import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorSpec extends AnyFlatSpec {
  val companyRead = new CompanyReadto
  val emailValidate = new EmailValidator
  val companyValidate = new CompanyValidator(companyRead, emailValidate)

  "Company details" should "send success as company does not exist" in {

    val wiproCompany: Company = Company("Wipro", "wipro@gmail.com", "Noida")
    val res = companyValidate.companyIsValid(wiproCompany)
    assert(res == true)
  }

  "Company details" should "send failed as company already exist" in {

    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val res = companyValidate.companyIsValid(knoldusCompany)
    assert(res == false)
  }

  "Company details" should "send failed for invalid parameter" in {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.om", "Noida")
    val res = companyValidate.companyIsValid(knoldusCompany)
    assert(res == false)
  }

}