package myrps

import org.mockito.Mockito._
import org.scalatest.FunSuite

/**
  * Created by octavian on 03/05/2017.
  */
class SettingsTest extends FunSuite {

  test("testDecideResult") {


    val mockIOHandler = mock[IOHandler]
    val name = "me"
    val player = new Player(name)

    when(mockIOHandler.nextLine).thenReturn("m")
    when(mockIOHandler.nextLine).thenReturn((Results.RESULTS_NUMBER + 1).toString)
    when(mockIOHandler.nextLine).thenReturn("2")


    player.chooseHand(mockIOHandler)
    verify(mockIOHandler).write(name + ": select 0 for rock, 1 for paper, 2 for scissors")

  }

  test("testGetRandomChoice returns a number between 0 and the maximum value") {
    val x = new Settings.getRandomChoice()
  }

}
