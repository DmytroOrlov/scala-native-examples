package example

import scalanative.native._

object HelloWorld extends App {
  println("123")
  // CString is an alias to Ptr[CChar]
  val msg: CString = c"Hello, world!\n"
  stdio.printf(msg)
}
