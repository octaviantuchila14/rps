package myrps

import java.util.Scanner


/**
  * Created by octavian on 29/04/2017.
  */
class StandardIOHandler(scanner: Scanner) extends IOHandler {

  def write(toWrite: String): Unit = {
    println(toWrite)
  }

  def nextLine: String = {
    scanner.nextLine()
  }

}
