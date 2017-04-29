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

}
