package myrps

import org.mockito.Mockito._
import org.scalatest.FunSuite
import org.scalatest.mockito.MockitoSugar

/**
  * Created by octavian on 03/05/2017.
  */
class GameTest extends FunSuite with MockitoSugar {

//  test("testStartGame") {
//    val mockIOHandler = mock[IOHandler]
//    when(mockIOHandler.nextLine).thenReturn("XXX").thenReturn("XXX")
//    val game = new Game(mockIOHandler)
//    game.startGame
//
//    verify(mockIOHandler).write("############################### WELCOME !!! ###############################")
//  }

  test("testAskGameOption") {
    val mockIOHandler = mock[IOHandler]
    when(mockIOHandler.nextLine).thenReturn("XXX").thenReturn("M")
    val game = new Game(mockIOHandler)
    game.askGameOption

    verify(mockIOHandler).write("Select M for Multi Player, S for Single Player")
    verify(mockIOHandler).write("Select M for Multi Player, S for Single Player")
  }

}
