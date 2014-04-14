package greeter

object HelloWorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(52); 
  val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(22); 
  var y = increase(x);System.out.println("""y  : Int = """ + $show(y ));$skip(14); val res$1 = 
  increase(y);System.out.println("""res1: Int = """ + $show(res$1));$skip(56); 
  def and(x: Boolean, y: Boolean) = if (x) y else false;System.out.println("""and: (x: Boolean, y: Boolean)Boolean""");$skip(55); 
  def or(x: Boolean, y: => Boolean) = if (!x) y else x;System.out.println("""or: (x: Boolean, y: => Boolean)Boolean""");$skip(18); val res$2 = 
  or(true, false);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(18); val res$3 = 
  or(false, true);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(45); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(130); 

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(89); 

  def isGoodEnough(guess: Double, x: Double) =
    abs((guess * guess) - x) < guess / x;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(71); 

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(42); 

  def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(13); val res$4 = 

  sqrt(1.0);System.out.println("""res4: Double = """ + $show(res$4));$skip(153); 

  def factorial(x: Long) = {
    def loop(value: Long, n: Long): Long = {
      if (n < 1) value else loop(value * n, n - 1)
    }

    loop(1, x)

  };System.out.println("""factorial: (x: Long)Long""");$skip(16); val res$5 = 

  factorial(0);System.out.println("""res5: Long = """ + $show(res$5))}


}
