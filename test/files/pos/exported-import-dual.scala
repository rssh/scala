package vii

import scala.annotation.exported

package x {
 class X {
   print("x.X")
 }
}


package object q1 {
  @exported import q2._
  class Y {
   print("q.Y")
  }
}

package object q2 {
  @exported import q1._
  @exported import x._
}


object A
{
 import _root_.vii.q1._
 val xx = new X()
}
