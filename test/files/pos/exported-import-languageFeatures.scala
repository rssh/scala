package vii

import scala.annotation.exported

object fullscala
{
 @exported import language._
 @exported import language.experimental._
}


object A
{
 import fullscala._
 import scala.reflect.macros._

 def m(x: Int): String = macro mImpl

  
 def mImpl(c:Context)(x:c.Expr[Int]) = {
   import c.universe._
   reify(x.toString)
 }


}
