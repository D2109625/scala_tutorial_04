object Main {
  def toUpper(name: String): String = {
    name.toUpperCase
  }

  def toLower(name: String): String = {
    name.toLowerCase
  }

  def formatName(name: String)(f: String => String): String = {
    f(name)
  }

  def main(args: Array[String]): Unit = {
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    println(formatName(name1)(toUpper))

    println(formatName(name2.substring(0, 2))(toUpper) + formatName(name2.substring(2))(toLower))
    println(formatName(name3)(toLower))
    println(formatName(name4.substring(0, 1))(toUpper) + formatName(name4.substring(1, 5))(toLower) + formatName(name4.substring(5))(toUpper))
  }
}
