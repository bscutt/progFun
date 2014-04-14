package greeter

object sumOfThreeAndFives {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(316); 
	def sumOfMultiplesThreeAndFive(upperBound: Int) = {
		
		def loop(f: Int => Int, acc: Int, position: Int): Int = {
			if(position < upperBound)
				loop(f, acc + f(position), position + 1)
			else
				acc
		}

		loop(x => if (x % 3 == 0 || x % 5 == 0) x else 0, 0, 0)
	};System.out.println("""sumOfMultiplesThreeAndFive: (upperBound: Int)Int""");$skip(37); val res$0 = 
	
	sumOfMultiplesThreeAndFive(10000);System.out.println("""res0: Int = """ + $show(res$0))}
}
