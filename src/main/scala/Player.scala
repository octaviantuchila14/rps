import java.util.Scanner

/**
  * Created by octavian on 29/04/2017.
  */
class Player(name: String) {

  def chooseHand(scanner: Scanner, outputHandler: OutputHandler): Int = {
    outputHandler.write(name + ": select 0 for rock, 1 for paper, 2 for scissors")
    val userValue = scanner.nextLine().replaceAll("""(?m)\s+$""", "").toInt
    if(List(0, 1, 2).contains(userValue)) {
      userValue
    }
    else {
      chooseHand(scanner, outputHandler)
    }
  }

}
