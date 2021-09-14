package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadto {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val techCompany: Company =
    Company("Tech Mahindra", "techmahindra@gmail.com", "Noida")
  val companies: HashMap[String, Company] =
    HashMap("Knoldus" -> knoldusCompany, "Philips" -> techCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
