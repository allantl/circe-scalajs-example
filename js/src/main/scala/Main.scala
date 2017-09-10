import io.circe.parser._
import io.circe.syntax._

object Main {
  def main(args: Array[String]): Unit = {
    val json =
      """{
        |  "username": "Henriette.Hand29",
        |  "password": "7FvtXLmNPaVFVbl"
        |}""".stripMargin
    val user = new User("Henriette.Hand29", "7FvtXLmNPaVFVbl")
    println(user.asJson)
    val decoded = decode[User](json)
    println(decoded)
  }
}