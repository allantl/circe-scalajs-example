package circe.scalajs

import io.circe.parser._

object App {
  def main(args: Array[String]): Unit = {
    val json =
      """{
        |  "name": "Michael",
        |  "age": 30
        |}""".stripMargin
    val decoded = decode[Person](json)
    println(decoded)
  }
}