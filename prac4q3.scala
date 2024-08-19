def PatternMatch(x:Int):String = x match {
  case x if x<=0 => "Negative/Zero";
  case x if x%2==0 => "Even";
  case x if x%2==1 => "Odd";
}

object O4 extends App{
    println(PatternMatch(2))
    println(PatternMatch(3))
    println(PatternMatch(-4))
}
