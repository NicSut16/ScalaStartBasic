import java.io._
object runWebScrape {
  def main(args: Array[String]): Unit = {
    val pw= new PrintWriter(new File("OutPut/comics.html"))
    pw.write("<html> \n <head><title>My Comics Page</title></head> \n")
    pw.write("<body>\n this is a webpage </body> \n </html>")
    pw.close()
  }
}
