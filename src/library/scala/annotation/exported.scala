package scala.annotation

/**
 * import annotation which used to mark import statement
 * be exported to object, which import scope of statement definition.
 * Usage:
{{{
 package object dependencies {
    @exported import com.library1._
    @exported import com.library2._
 }
}}}
 *
 * @since 2.11
 */
final class exported(inherited:Boolean = false) extends annotation.StaticAnnotation
