import scala.slick.lifted.TableQuery

package object models {

  val users = TableQuery[UserTable]

}
