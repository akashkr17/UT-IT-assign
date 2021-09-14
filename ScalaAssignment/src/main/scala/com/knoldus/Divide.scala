package com.knoldus
import scala.io.StdIn._

object Divide {
  def main(args: Array[String]) {
    print("Enter the first number : ")
    val number1 = readInt()
    print("Enter the second number : ")
    val number2 = readInt()
    println(s"$number1 / $number1 : " + division(number1, number1))
  }

  /**
    * function divides two integers values
    *
    * @param n1
    * @param n2
    * @return Any
    */
  def division(n1: Int, n2: Int) = {
    try {
      n1 / n2
    } catch {
      case i: Exception =>
        println(i.getMessage)
        "Not defined"
    }
  }

}
