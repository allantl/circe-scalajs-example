import io.circe.{Decoder, Encoder, _}
import io.circe.generic.semiauto._

case class User(username: String, password: String)

object User {
  implicit val userDecoder: Decoder[User] = deriveDecoder
  implicit val userEncoder: Encoder[User] = deriveEncoder
}

