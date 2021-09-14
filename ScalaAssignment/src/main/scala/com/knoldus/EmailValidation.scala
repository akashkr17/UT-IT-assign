package com.knoldus

import scala.util.matching.Regex

object EMailValidation {

  /** *
    * check if eamil is valid
    *
    * @param mail
    * @return Boolean
    */
  def validEmail(mail: String): Boolean = {
    val emailPattern = "^([a-zA-Z\\d\\.-]+)@([a-zA-Z\\d-]+)\\.(com|net|org)$"
    mail.matches(emailPattern)
  }

  def main(args: Array[String]): Unit = {
    println(validEmail("akash.kumar@knoldus.com"))
    println(validEmail("ak1797@knoldus.cot"))
    println(validEmail("al1797@gmail.netw"))
    println(validEmail("ak1797@knoldus23.com"))
    println(validEmail("ak1797knoldus.com"))

  }
}
