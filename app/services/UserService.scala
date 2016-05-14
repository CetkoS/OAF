package services

import models._
import play.api.db.slick.Config.driver.simple._


object UserService {

  def findById(id: Long)(implicit session: Session): Option[User] = {
    users.filter(user => user.id === id).firstOption
  }
}
