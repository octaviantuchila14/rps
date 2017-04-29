import java.util.Scanner

/**
  * Created by octavian on 29/04/2017.
  */
class SinglePlayerSettings extends Settings {

  def runGame(scanner: Scanner): Unit = {

    val userValue = new Player().chooseHand(scanner)

    val randomValue = getRandomChoice

    println("Random value is: " + randomValue)
    val computerValue = Results.gameResults(randomValue)


    println("The computer chose " + computerValue)
    if(userValue == 0 && randomValue == 2) {
      println("You win!")
    }
    else if(userValue == 2 && randomValue == 0) {
      println("You loose!")
    }
    else if(userValue > randomValue) {
      println("You win!")
    }
    else if(userValue < randomValue) {
      println("You loose!")
    }
    else {
      println("Equality! Try again!")
    }

  }

}
