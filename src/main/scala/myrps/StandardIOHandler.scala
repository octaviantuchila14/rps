package myrps

import java.util.Scanner


/**
  * Created by octavian on 29/04/2017.
  */
class StandardIOHandler(scanner: Scanner) extends IOHandler {

  /*
    Manages output.
   */
  def write(toWrite: String): Unit = {
    println(toWrite)
  }

  /*
    Manages input.
   */
  def nextLine: String = {
    scanner.nextLine()
  }

}
