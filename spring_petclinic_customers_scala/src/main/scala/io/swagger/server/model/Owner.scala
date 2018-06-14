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

case class Owner(
  address: Option[String],
    city: Option[String],
    firstName: Option[String],
    id: Option[Int],
    lastName: Option[String],
    pets: Option[List[Pet]],
    telephone: Option[String]
  )
