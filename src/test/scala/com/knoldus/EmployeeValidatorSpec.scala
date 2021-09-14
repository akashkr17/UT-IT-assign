package validator

import com.knoldus.db.EmployeeReadto
import com.knoldus.db.CompanyReadto
import com.knoldus.models.Employee
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeValidatorSpec extends AnyFlatSpec {

  val employeeRead = new EmployeeReadto

  val companyRead = new CompanyReadto
  val emailValidate = new EmailValidator
  val employeeValidate = new EmployeeValidator(companyRead, emailValidate)
  val employeeImpl = new EmployeeImpl(employeeValidate)

  "Employee details" should "send success for valid Employee - Employee company present in the database" in {
    val employeeAkash = Employee("Akash", "Kumar", 24, 15000, "Intern", "Knoldus", "akash.kumar@knoldus.com")
    val res = employeeValidate.employeeIsValid(employeeAkash)
    assert(res == true)
  }

  "Employee details" should "send failure for valid Employee - Employee company is not present in the database" in {
    val employeeAkash = Employee("Akash", "Kumar", 24, 15000, "Intern", "Wipro", "akash.kumar@knoldus.com")
    val res = employeeValidate.employeeIsValid(employeeAkash)
    assert(res == false)
  }

  "Employee details" should "send failed for invalid Employee(wrong email id)" in {
    val employeeInvalid = Employee("Akash", "Kumar", 24, 15000, "Intern", "Knoldus", "akash.kumar@knold.om")
    val res = employeeValidate.employeeIsValid(employeeInvalid)
    assert(res == false)
  }

}
