package myrps

import org.mockito.Mockito._
import org.scalatest.FunSuite
import org.scalatest.mockito.MockitoSugar

/**
  * Created by octavian on 03/05/2017.
  */
class MultiPlayerSettingsTest extends FunSuite with MockitoSugar {

  test("testGetRandomChoice returns a number between 0 and the maximum value") {
    val x = (new MultiPlayerSettings).getRandomChoice
    assert(0 <= x && x <= Results.RESULTS_NUMBER + 1)
  }

  test("testRunGame") {
    val mockIOHandler = mock[IOHandler]
    val mpSettings = new MultiPlayerSettings()

    when(mockIOHandler.nextLine).thenReturn("2")
    when(mockIOHandler.nextLine).thenReturn("1")

    mpSettings.runGame(mockIOHandler)

    verify(mockIOHandler).write("Player 1: select 0 for rock, 1 for paper, 2 for scissors")
    verify(mockIOHandler).write("Player 2: select 0 for rock, 1 for paper, 2 for scissors")
    verify(mockIOHandler).write("Player 1 wins!")
  }

  test("decideResult when first player loses") {
    val mockIOHandler = mock[IOHandler]
    val mpSettings = new MultiPlayerSettings()

    mpSettings.decideResult(0, 1, mockIOHandler)
    verify(mockIOHandler).write("Player 2 wins!")
  }

  test("decideResult when first player wins") {
    val mockIOHandler = mock[IOHandler]
    val mpSettings = new MultiPlayerSettings()

    mpSettings.decideResult(1, 0, mockIOHandler)
    verify(mockIOHandler).write("Player 1 wins!")
  }

  test("decideResult when values are equal") {
    val mockIOHandler = mock[IOHandler]
    val mpSettings = new MultiPlayerSettings()

    mpSettings.decideResult(1, 1, mockIOHandler)
    verify(mockIOHandler).write("Equality! Try again!")
  }

}
