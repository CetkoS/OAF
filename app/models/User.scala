package models

import enums.{UserRole, UserStatus}
import slick.lifted.Tag
import play.api.db.slick.Config.driver.simple._


case class User(id: Option[Long], firstName: String, lastName: String,
                username: String, status: UserStatus.Value, companyId: Option[Long], role: UserRole.Value, password: Option[String])


class UserTable(tag: Tag) extends Table[User](tag, "USER") {

    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def firstName = column[String]("first_name", O.NotNull)
    def lastName = column[String]("last_name", O.NotNull)
    def username = column[String]("username", O.NotNull)
    def status = column[UserStatus.Value]("status", O.NotNull)
    def companyId = column[Long]("company_id", O.Nullable)
    def role = column[UserRole.Value]("role", O.NotNull)
    def password = column[String]("password",O.Nullable)

    def * = (id.?, firstName, lastName, username, status, companyId.?, role, password.?) <> (User.tupled, User.unapply _)
}