package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeReadto {
  val employeeAkash = Employee("Akash",
                               "Kumar",
                               24,
                               15000,
                               "Intern",
                               "Knoldus",
                               "akash.kumar@knoldus.com")
  val employee2 = Employee("firstName",
                           "lastName",
                           24,
                           15000,
                           "Designation",
                           "Company",
                           "email@domain.com")
  val employees: HashMap[String, Employee] =
    HashMap("Akash" -> employeeAkash, "Employee2" -> employee2)

  /** *
    * get employee details with key of hashmap
    *
    * @param name
    * @return Option[Employee]
    */
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)
}
