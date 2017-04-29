/**
  * Created by octavian on 29/04/2017.
  */
class StandardOutputHandler extends OutputHandler {

  def write(toWrite: String): Unit = {
    println(toWrite)
  }

}
