package vii

package x {
 class X {
   print("x.X")
 }
}

package object q {
  implicit import x._
  //import x._
}

object A
{
 import _root_.vii.q._
 val x = new X()
}
