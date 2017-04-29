import java.util.Scanner

/**
  * Created by octavian on 29/04/2017.
  */
class MultiPlayerSettings extends Settings {

  override val messages: Map[String, String] = Map("Loose" -> "Player 2 wins!", "Equality" -> "Equality! Try again!", "Win" -> "Player 1 wins!")

  def runGame(ioHandler: IOHandler): Unit = {

    val player1Hand = new Player("Player 1").chooseHand(ioHandler)
    val player2Hand = new Player("Player 2").chooseHand(ioHandler)
    decideResult(player1Hand, player2Hand, ioHandler)
  }


}
