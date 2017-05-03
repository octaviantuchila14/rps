package myrps

/**
  * Created by octavian on 29/04/2017.
  */
trait IOHandler {

  def write(toWrite: String): Unit


  def nextLine: String

}
