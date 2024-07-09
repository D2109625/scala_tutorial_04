object StringFilter {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    
    val sampleList = List("amara", "nayana", "chanchala", "kamal", "sunil", "dinushika", "pawan")

    
    val filteredList = filterLongStrings(sampleList)

    
    println("Original list: " + sampleList)
    println("Filtered list (strings longer than 5 characters): " + filteredList)
  }
}
