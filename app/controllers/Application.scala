package controllers

import play.api._
import play.api.i18n.Messages
import play.api.mvc._
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

class Application extends Controller {

  def index = Action { implicit request =>
    Ok(views.html.index("Your new application is ready."))
  }

}
