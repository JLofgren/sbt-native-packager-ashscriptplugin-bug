package example

object Hello {
  def main(args: Array[String]): Unit = {
    val formattedArgs = args.toList.map(arg => s"'$arg'").toString
    println(s"argsLength=${args.length}, args=$formattedArgs")
  }
}
