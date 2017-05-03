package myrps


/**
  * Created by octavian on 27/04/2017.
  */

class Game(ioHandler: IOHandler) {

  def askGameOption(ioHandler: IOHandler): Char = {
    ioHandler.write("Select M for Multi Player, S for Single Player")
    val gameOption = ioHandler.nextLine.replaceAll("""(?m)\s+$""", "")
    if(List("m", "M", "s", "S").contains(gameOption)) {
      gameOption(0)
    }
    else {
      askGameOption(ioHandler)
    }
  }

  def startGame = {

    ioHandler.write("############################### WELCOME !!! ###############################")

    val gameOption = askGameOption(ioHandler)
    val gameSettings = if(List('m', 'M').contains(gameOption)) {
      new MultiPlayerSettings
    } else {
      new SinglePlayerSettings
    }

    ioHandler.write("###########################################################################")
    ioHandler.write("############################### NEW GAME ##################################")
    ioHandler.write("###########################################################################")

    while(true) {
      ioHandler.write("############################### NEW TURN ##################################")
      gameSettings.runGame(ioHandler)
    }

  }

}

object Game {

  def main(args: Array[String]): Unit = {
    val scanner = new java.util.Scanner(System.in)
    val ioHandler = new StandardIOHandler(scanner)
    val game = new Game(ioHandler)
  }
}
