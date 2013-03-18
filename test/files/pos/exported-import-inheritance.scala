package vii

import scala.annotation.exported

package x {
 class X {
   print("x.X")
 }
}

class X {
  @exported import x._
  class Y {
   print("q.Y")
  }
}

object A extends X
{
 val xx = new X()
}
