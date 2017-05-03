package myrps

import org.mockito.Mockito.{verify, when, times}
import org.scalatest.mockito.MockitoSugar


/**
  * Created by octavian on 29/04/2017.
  */
class PlayerTest extends org.scalatest.FunSuite with MockitoSugar {

  test("accepts a numeric code for rock, paper, scissors") {
    val mockIOHandler = mock[IOHandler]
    val name = "me"
    val player = new Player(name)

    when(mockIOHandler.nextLine).thenReturn("0")

    player.chooseHand(mockIOHandler)
    verify(mockIOHandler).write(name + Results.SELECTION_MESSAGE)
  }


  test("doesn't accept anything but from 0 to Results.RESULTS_NUMBER") {
    val mockIOHandler = mock[IOHandler]
    val name = "me"
    val player = new Player(name)

    when(mockIOHandler.nextLine).thenReturn("m").thenReturn((Results.RESULTS_NUMBER + 1).toString).thenReturn("2")

    player.chooseHand(mockIOHandler)
    verify(mockIOHandler, times(3)).write(name + Results.SELECTION_MESSAGE)
  }

}
