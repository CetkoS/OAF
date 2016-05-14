package controllers

import play.api.db.slick.DBAction
import play.api.mvc.{Action, Controller}
import services.UserService
import play.api.db.slick._

class RegistrationController extends Controller {

  def showRegistration = DBAction { implicit request =>
    val user = UserService.findById(1)
    Ok(user.toString)
  }
}
