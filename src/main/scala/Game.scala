import scala.util.Random

/**
  * Created by octavian on 27/04/2017.
  */

object Game {

  def getRandomChoice: Int = {
    val randomInt = new Random().nextInt()
    if(randomInt < 0) (randomInt * -1)%3
    else randomInt%3
  }

  def main(args: Array[String]): Unit = {

    while(true) {

      println("Select 0 for rock, 1 for paper, 2 for scissors")
      val userValue = readInt()

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

}
