package myrps

import org.mockito.Mockito._
import org.scalatest.FunSuite
import org.scalatest.mockito.MockitoSugar

/**
  * Created by octavian on 03/05/2017.
  */
class SinglePlayerSettingsTest extends FunSuite with MockitoSugar {

  test("testRunGame") {
    val mockIOHandler = mock[IOHandler]
    val mpSettings = new MultiPlayerSettings()

    when(mockIOHandler.nextLine).thenReturn("2").thenReturn("1")

    mpSettings.runGame(mockIOHandler)

    verify(mockIOHandler).write("Player 1: select 0 for rock, 1 for paper, 2 for scissors")
  }

}
