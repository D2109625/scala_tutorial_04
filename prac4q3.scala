object MeanCalculator {
  def arithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    mean
  }

  def main(args: Array[String]): Unit = {
    val mean = arithmeticMean(13, 30)
    println(f"$mean%.2f") 
  }
}
