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

  def runGame(ioHandler: IOHandler): Unit

  def decideResult(firstRoll: Int, secondRoll: Int, ioHandler: IOHandler) = {

    if(firstRoll == 0 && secondRoll == (Results.gameResults.length - 1)) {
      ioHandler.write(messages("Win"))
    }
    else if(firstRoll == (Results.gameResults.length - 1) && secondRoll == 0) {
      ioHandler.write(messages("Loose"))
    }
    else if(firstRoll > secondRoll) {
      ioHandler.write(messages("Win"))
    }
    else if(firstRoll < secondRoll) {
      ioHandler.write(messages("Loose"))
    }
    else {
      ioHandler.write(messages("Equality"))
    }

  }

}
