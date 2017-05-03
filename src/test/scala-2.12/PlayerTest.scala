import org.scalactic.source.Position
import org.scalatest.Tag
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito.when
import org.scalatest.prop.PropertyChecks
import org.mockito.Mockito.verify


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
    verify(mockIOHandler).write(name + ": select 0 for rock, 1 for paper, 2 for scissors")
  }


  test("doesn't accept anything but 0-2") {
    val mockIOHandler = mock[IOHandler]
    val name = "me"
    val player = new Player(name)

    when(mockIOHandler.nextLine).thenReturn("m")
    when(mockIOHandler.nextLine).thenReturn("3")
    when(mockIOHandler.nextLine).thenReturn("2")


    player.chooseHand(mockIOHandler)
    verify(mockIOHandler).write(name + ": select 0 for rock, 1 for paper, 2 for scissors")
  }

}
