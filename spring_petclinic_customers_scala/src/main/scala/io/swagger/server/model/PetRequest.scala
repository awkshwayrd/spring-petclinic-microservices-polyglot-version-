/**
 * Customers Service Api Documentation
 * Documentation automatically generated
 *
 * OpenAPI spec version: 1.5.3
 * Contact: run2obtain@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */

package io.swagger.server.model
import java.util.Date

case class PetRequest(
  birthDate: Option[Date],
    id: Option[Int],
    name: Option[String],
    typeId: Option[Int]
  )
