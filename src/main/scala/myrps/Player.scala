package myrps

import java.lang.Character

/**
  * Created by octavian on 29/04/2017.
  */
class Player(name: String) {

  def chooseHand(ioHandler: IOHandler): Int = {
    ioHandler.write(name + Results.SELECTION_MESSAGE)
    val userValue = ioHandler.nextLine.replaceAll("""(?m)\s+$""", "")
    if(userValue != "" && userValue.forall(_.isDigit) && List(0, 1, 2).contains(userValue.toInt)) {
      userValue.toInt
    }
    else {
      chooseHand(ioHandler)
    }
  }

}
