package circe.scalajs

import io.circe._, io.circe.generic.semiauto._

case class Person(name: String, age: Int)

object Person {
  implicit val personDecoder: Decoder[Person] = deriveDecoder
  implicit val personEncoder: Encoder[Person] = deriveEncoder
}
