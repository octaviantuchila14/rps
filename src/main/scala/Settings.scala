import java.util.Scanner

import scala.util.Random

/**
  * Created by octavian on 29/04/2017.
  */
trait Settings {

  def getRandomChoice: Int = {
    val randomInt = new Random().nextInt()
    if(randomInt < 0) (randomInt * -1)%3
    else randomInt%3
  }

  def runGame(scanner: Scanner): Unit = {

    var userValue = 4
    do {

      println("Select 0 for rock, 1 for paper, 2 for scissors")
      userValue = scanner.nextLine().replaceAll("""(?m)\s+$""", "").toInt

    } while(!List(0, 1, 2).contains(userValue))


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
