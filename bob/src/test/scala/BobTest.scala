/**
  * Created by espataro on 01/12/16.
  */
import org.scalatest._

class BobTest extends FunSuite with Matchers {

  def teenager = new Bob

  test("respond to a question") {
    teenager.hey("Hi! Are you fine today?") should be ("Sure.")
  }
  test("respond to a shout") {
    teenager.hey("HEY SHUT UP!!!") should be ("Whoa, chill out!")
  }
  test("respond to nothing") {
    teenager.hey("") should be ("Fine. Be that way!")
  }
  test("respond to anything") {
    teenager.hey("Today is gonna be raining!") should be ("Whatever.")
  }
  test("respond to a question with numbers") {
    teenager.hey("Are you 11?") should be ("Sure.")
  }
  test("respond to a shout with numbers") {
    teenager.hey("1, 2, 3, GO!!!") should be ("Whoa, chill out!")
  }
  test("respond to a shouting question") {
    teenager.hey("WHAT THE HELL ARE YOU DOING?") should be ("Whoa, chill out!")
  }
  test("respond to a statement with a question in the middle") {
    teenager.hey("Ending with ? means a question.") should be ("Whatever.")
  }
  test("respond to an empty string") {
    teenager.hey(" ") should be ("Fine. Be that way!")
  }
  test("respond to a question with only numbers") {
    teenager.hey("11? 12?") should be ("Sure.")
  }
}
