import java.util.Scanner

import scala.util.Random

/**
  * Created by octavian on 27/04/2017.
  */

class Game(outputHandler: OutputHandler) {

  def askGameOption(scanner: Scanner, outputHandler: OutputHandler): Char = {
    outputHandler.write("Select M for Multi Player, S for Single Player")
    val gameOption = scanner.nextLine().replaceAll("""(?m)\s+$""", "")
    if(List("m", "M", "s", "S").contains(gameOption)) {
      gameOption(0)
    }
    else {
      askGameOption(scanner, outputHandler)
    }
  }

  def startGame = {

    val scanner = new java.util.Scanner(System.in)

    outputHandler.write("############################### WELCOME !!! ###############################")

    val gameOption = askGameOption(scanner, outputHandler)
    val gameSettings = if(List('m', 'M').contains(gameOption)) {
      new MultiPlayerSettings
    } else {
      new SinglePlayerSettings
    }

    outputHandler.write("###########################################################################")
    outputHandler.write("############################### NEW GAME ##################################")
    outputHandler.write("###########################################################################")

    while(true) {
      outputHandler.write("############################### NEW TURN ##################################")
      gameSettings.runGame(scanner, outputHandler)
    }

  }

}

object Game {

  def main(args: Array[String]): Unit = {
    val outputHandler = new StandardOutputHandler()
    val game = new Game(outputHandler)
  }
}
