import java.util.Scanner

/**
  * Created by octavian on 29/04/2017.
  */
class SinglePlayerSettings extends Settings {

  override val messages: Map[String, String] = Map("Loose" -> "You win!", "Equality" -> "Equality! Try again!", "Win" -> "You loose!")

  def runGame(scanner: Scanner): Unit = {

    val userValue = new Player().chooseHand(scanner)
    val randomValue = getRandomChoice
    val computerValue = Results.gameResults(randomValue)
    println("The computer chose " + computerValue)
    decideResult(userValue, randomValue)
  }

}
