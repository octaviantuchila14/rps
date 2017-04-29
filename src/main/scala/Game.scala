import scala.util.Random

/**
  * Created by octavian on 27/04/2017.
  */

object Game {

  def main(args: Array[String]): Unit = {

    val scanner = new java.util.Scanner(System.in)


    println("############################### WELCOME !!! ###############################")

    var gameOption = "I"
    do {
      println("Select M for Multi Player, S for Single Player")
      gameOption = scanner.nextLine().replaceAll("""(?m)\s+$""", "")
    } while(!List("m", "M", "s", "S").contains(gameOption))


    val gameSettings = if(List("m", "M").contains(gameOption)) {
      new MultiPlayerSettings
    } else {
      new SinglePlayerSettings
    }

    println("###########################################################################")
    println("############################### NEW GAME ##################################")
    println("###########################################################################")


    while(true) {

      println("############################### NEW TURN ##################################")
      gameSettings.runGame(scanner)
    }

  }

}
