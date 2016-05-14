package enums

abstract class DBEnum extends Enumeration {

import play.api.db.slick.Config.driver.simple._
import play.api.db.slick.Config.driver.MappedJdbcType

  implicit val enumMapper = MappedJdbcType.base[Value, Int](_.id, this.apply)
}