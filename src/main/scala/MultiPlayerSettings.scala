import java.util.Scanner

/**
  * Created by octavian on 29/04/2017.
  */
class MultiPlayerSettings extends Settings {

  def messages: Map[String, String] = Map("Loose" -> "Player 1 wins!", "Equality" -> "Equality! Try again!", "Win" -> "Player 2 wins!")

  def runGame(scanner: Scanner): Unit = {

    val player1Hand = new Player().chooseHand(scanner)
    val player2Hand = new Player().chooseHand(scanner)
    decideResult(player1Hand, player2Hand)
  }


}
