package greeter

object rational {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 

	val x = new Rational(1, 3);System.out.println("""x  : greeter.rational.Rational = """ + $show(x ));$skip(28); 
	val y = new Rational(5, 7);System.out.println("""y  : greeter.rational.Rational = """ + $show(y ));$skip(28); 
	val z = new Rational(3, 2);System.out.println("""z  : greeter.rational.Rational = """ + $show(z ));$skip(19); val res$0 = 
	
	x.sub(y).sub(z);System.out.println("""res0: greeter.rational.Rational = """ + $show(res$0))}
  
  class Rational(x: Int, y: Int) {
		def numer = x
		def denom = y
		
		def add(that: Rational) =
			new Rational(
				numer * that.denom + that.numer * denom,
				denom * that.denom)
		
		def neg: Rational = new Rational(-numer, denom)
		
		def sub(that: Rational) = add(that.neg)
		
		override def toString = numer + "/" + denom
	}
}
