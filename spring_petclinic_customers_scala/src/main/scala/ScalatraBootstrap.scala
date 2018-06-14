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


import io.swagger.server.api._
import io.swagger.app.{ ResourcesApp, SwaggerApp }
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  implicit val swagger = new SwaggerApp

  override def init(context: ServletContext) {
    try {
      context mount (new OwnerResourceApi, "//OwnerResource/*")
      context mount (new PetResourceApi, "//PetResource/*")
      
      context mount (new ResourcesApp, "/api-docs/*")
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }
}
