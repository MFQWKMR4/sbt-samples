package bbb

import example.Hello2

object Hello extends Greeting2 with App {
  println(greeting)

  Hello2.sample
}

trait Greeting2 {
  lazy val greeting: String = "hello"
}
