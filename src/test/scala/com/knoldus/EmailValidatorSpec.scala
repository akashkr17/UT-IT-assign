
package validator

import com.knoldus.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorSpec extends AnyFlatSpec {

  "email id" should "send success for valid email" in {
    val email = (new EmailValidator).emailIdIsValid("akash.kumar@knoldus.com")
    assert(email == true)
  }

  "email id" should "send failed for invalid email" in {
    val email = (new EmailValidator).emailIdIsValid("jakash.kumar@knol.om")
    assert(email == false)
  }
}
