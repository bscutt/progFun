package greeter

object rational {

	val x = new Rational(1, 3)                //> x  : greeter.rational.Rational = 1/3
	val y = new Rational(5, 7)                //> y  : greeter.rational.Rational = 5/7
	val z = new Rational(3, 2)                //> z  : greeter.rational.Rational = 3/2
	
	x.sub(y).sub(z)                           //> res0: greeter.rational.Rational = -79/42
  
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