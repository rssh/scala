import scala.reflect.macros.Context
import language.experimental.macros

object Macros {
  def impl(c: Context)(x: c.Tree) = {
    import c.universe._
    x match {
      case Bind(name, tree) => Bind(TermName(name.toString + name.toString), tree)
    }
  }

  def unapply(x: _) = macro impl
}