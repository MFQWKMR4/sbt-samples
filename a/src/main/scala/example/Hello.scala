package example

object Hello extends Greeting with App {
  println(greeting)
}

object Hello2 {
  
  def sample = {
    println("hello2 from sample1/a")
  }
}

trait Greeting {
  lazy val greeting: String = "hello from sample1/a"
}
