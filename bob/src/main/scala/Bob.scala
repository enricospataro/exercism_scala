/**
  * Created by espataro on 01/12/16.
  */
class Bob {

  def hey(str: String): String =  str match {
    case s if s.trim.isEmpty => "Fine. Be that way!"
    case s if (s == s.toUpperCase && s.exists(_.isLetter)) => "Whoa, chill out!"
    case s if s.endsWith("?") == true => "Sure."
    case _ => "Whatever."
  }

}
