package myrps

/**
  * Created by octavian on 29/04/2017.
  */
class SinglePlayerSettings extends Settings {

  override val messages: Map[String, String] = Map("Loose" -> "You loose!", "Equality" -> "Equality! Try again!", "Win" -> "You win!")

  def runGame(ioHandler: IOHandler): Unit = {

    val userValue = new Player("Player 1").chooseHand(ioHandler)
    val randomValue = getRandomChoice
    val computerValue = Results.gameResults(randomValue)
    ioHandler.write("The computer chose " + computerValue)
    decideResult(userValue, randomValue, ioHandler)
  }

}
