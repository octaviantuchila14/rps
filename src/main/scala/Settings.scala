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

  def runGame(scanner: Scanner): Unit

  def decideResult(firstRoll: Int, secondRoll: Int) = {

    if(firstRoll == 0 && secondRoll == (Results.gameResults.length - 1)) {
      println(messages("Win"))
    }
    else if(firstRoll == (Results.gameResults.length - 1) && secondRoll == 0) {
      println(messages("Loose"))
    }
    else if(firstRoll > secondRoll) {
      println(messages("Win"))
    }
    else if(firstRoll < secondRoll) {
      println(messages("Loose"))
    }
    else {
      println(messages("Equality"))
    }

  }

}
