import java.util.Scanner

import scala.util.Random

/**
  * Created by octavian on 29/04/2017.
  */
trait Settings {

  val messages: Map[String, String] = Map()

  def getRandomChoice: Int = {
    val randomInt = new Random().nextInt()
    if(randomInt < 0) (randomInt * -1)%3
    else randomInt%3
  }

  def runGame(scanner: Scanner, outputHandler: OutputHandler): Unit

  def decideResult(firstRoll: Int, secondRoll: Int, outputHandler: OutputHandler) = {

    if(firstRoll == 0 && secondRoll == (Results.gameResults.length - 1)) {
      outputHandler.write(messages("Win"))
    }
    else if(firstRoll == (Results.gameResults.length - 1) && secondRoll == 0) {
      outputHandler.write(messages("Loose"))
    }
    else if(firstRoll > secondRoll) {
      outputHandler.write(messages("Win"))
    }
    else if(firstRoll < secondRoll) {
      outputHandler.write(messages("Loose"))
    }
    else {
      outputHandler.write(messages("Equality"))
    }

  }

}
