/**
  * Created by octavian on 28/04/2017.
  */

object Results {
  sealed trait EnumVal
  case object Rock extends EnumVal
  case object Paper extends EnumVal
  case object Scissors extends EnumVal
  val gameResults = Seq(Rock, Paper, Scissors)
}

