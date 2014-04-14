package greeter

object sumOfThreeAndFives {
	def sumOfMultiplesThreeAndFive(upperBound: Int) = {
		
		def loop(f: Int => Int, acc: Int, position: Int): Int = {
			if(position < upperBound)
				loop(f, acc + f(position), position + 1)
			else
				acc
		}

		loop(x => if (x % 3 == 0 || x % 5 == 0) x else 0, 0, 0)
	}                                         //> sumOfMultiplesThreeAndFive: (upperBound: Int)Int
	
	sumOfMultiplesThreeAndFive(10000)         //> res0: Int = 23331668
}