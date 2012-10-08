package vii

import scala.annotation.exported


package object x
{
 implicit val x:Int = 5
}


package object q {
  @exported import x._
  class Y {
   print("q.Y")
  }
}

object A
{
 import _root_.vii.q._
 val xx = implicitly[Int]
}
