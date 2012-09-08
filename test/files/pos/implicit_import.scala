package vii

package x {
 class X {
   print("x.X")
 }
}

package object q {
  implicit import x._
  class Y {
   print("q.Y")
  }
}

object A
{
 import _root_.vii.q._
 val xx = new X()
}
