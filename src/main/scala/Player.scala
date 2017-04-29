import java.util.Scanner

/**
  * Created by octavian on 29/04/2017.
  */
class Player {

  def chooseHand(scanner: Scanner): Int = {
    var userValue = 4
    do {

      println("Select 0 for rock, 1 for paper, 2 for scissors")
      userValue = scanner.nextLine().replaceAll("""(?m)\s+$""", "").toInt

    } while(!List(0, 1, 2).contains(userValue))
    userValue
  }

}
