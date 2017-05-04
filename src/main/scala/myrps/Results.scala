package myrps

/**
  * Created by octavian on 28/04/2017.
  */

/*
  Holds the result type as well as the message displayed to the user when asking for a result.
 */
object Results {
  sealed trait EnumVal
  case object Rock extends EnumVal
  case object Paper extends EnumVal
  case object Scissors extends EnumVal
  val gameResults = Seq(Rock, Paper, Scissors)
  val RESULTS_NUMBER = gameResults.length
  val SELECTION_MESSAGE = ": select 0 for rock, 1 for paper, 2 for scissors"
}

