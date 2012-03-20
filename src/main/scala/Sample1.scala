import com.twitter.scalding._

class Sample1(args: Args) extends Job(args) {
  val input = TextLine("data/sample1.txt")
  val output = TextLine("data/sample1-out.txt")

  input.read.write(output)
}
