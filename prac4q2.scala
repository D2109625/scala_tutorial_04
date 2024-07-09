def patternmatch(x: Int): String = x match {
  case x if x <= 0 => "Negative/Zero"
  case x if x % 2 == 0 => "Even"
  case x if x % 2 == 1 => "Odd"
}

def main(args: Array[String]): Unit = {
  println("Enter the number:")
  val number = scala.io.StdIn.readInt()
  println(patternmatch(number))
}
