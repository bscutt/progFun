package greeter

object curry {

	def multipleAcumulator(x: Int) = {
		if (x % 3 == 0 || x % 5 == 0) x else 0
	}                                         //> multipleAcumulator: (x: Int)Int
	
	def accumulator(x: Int) = x               //> accumulator: (x: Int)Int
	
	def squareAccumulator(x: Int) = x * x     //> squareAccumulator: (x: Int)Int
	
	def loop(f: Int => Int)(acc: Int, position: Int, upper: Int): Int = {
		if(position < upper)
			loop(f)(acc + f(position), position + 1, upper)
		else
			acc
	}                                         //> loop: (f: Int => Int)(acc: Int, position: Int, upper: Int)Int
	
	loop(multipleAcumulator)(0,0, 10)         //> res0: Int = 23
	
	loop(x => x * x * x)(0,0, 10)             //> res1: Int = 2025
	
	loop(squareAccumulator)(0,0, 10)          //> res2: Int = 285
	
	def product(x: Int) = { x * x }           //> product: (x: Int)Int
	
	def sumLoop(f: Int => Int)(position: Int, upper: Int): Int = {
		if(position < upper)
			loop(f) (f(position) * f(position), position + 1, upper)
		else
			1
	}                                         //> sumLoop: (f: Int => Int)(position: Int, upper: Int)Int
	
	sumLoop(x => x * x)(3,7)                  //> res3: Int = 158
}