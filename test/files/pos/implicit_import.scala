package vii

import scala.annotation.exported

package x {
 class X {
   print("x.X")
 }
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
 val xx = new X()
}
