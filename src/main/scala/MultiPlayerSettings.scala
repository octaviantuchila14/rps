import java.util.Scanner

/**
  * Created by octavian on 29/04/2017.
  */
class MultiPlayerSettings extends Settings {

  def runGame(scanner: Scanner): Unit = {

    val player1Hand = new Player().chooseHand(scanner)
    val player2Hand = new Player().chooseHand(scanner)

    if(player1Hand == 0 && player2Hand == 2) {
      println("Player 1 wins!")
    }
    else if(player1Hand == 2 && player2Hand == 0) {
      println("Player 2 wins!!")
    }
    else if(player1Hand > player2Hand) {
      println("Player 1 wins!")
    }
    else if(player1Hand < player2Hand) {
      println("Player 2 wins!")
    }
    else {
      println("Equality! Try again!")
    }

  }


}
