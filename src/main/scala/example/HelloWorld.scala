package example

import scalanative.native._
import scalanative.native.stdio._

object HelloWorld extends App {
  println("123")
  // CString is an alias to Ptr[CChar]
  val msg: CString = c"Hello, world!\n"
  printf(msg)

  type Vec = CStruct3[Double, Double, Double]

  val vec = stackalloc[Vec] // allocate c struct on stack
  !vec._1 = 10.0            // initialize fields
  !vec._2 = 20.0
  !vec._3 = 30.0
  printf(c"(%.2f %.2f %.2f)\n", !vec._1, !vec._2, !vec._3)
  println(s"${!vec._1} ${!vec._2} ${!vec._3}")
}
