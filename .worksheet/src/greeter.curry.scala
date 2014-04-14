package greeter

object curry {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 

	def multipleAcumulator(x: Int) = {
		if (x % 3 == 0 || x % 5 == 0) x else 0
	};System.out.println("""multipleAcumulator: (x: Int)Int""");$skip(31); 
	
	def accumulator(x: Int) = x;System.out.println("""accumulator: (x: Int)Int""");$skip(41); 
	
	def squareAccumulator(x: Int) = x * x;System.out.println("""squareAccumulator: (x: Int)Int""");$skip(164); 
	
	def loop(f: Int => Int)(acc: Int, position: Int, upper: Int): Int = {
		if(position < upper)
			loop(f)(acc + f(position), position + 1, upper)
		else
			acc
	};System.out.println("""loop: (f: Int => Int)(acc: Int, position: Int, upper: Int)Int""");$skip(37); val res$0 = 
	
	loop(multipleAcumulator)(0,0, 10);System.out.println("""res0: Int = """ + $show(res$0));$skip(33); val res$1 = 
	
	loop(x => x * x * x)(0,0, 10);System.out.println("""res1: Int = """ + $show(res$1));$skip(36); val res$2 = 
	
	loop(squareAccumulator)(0,0, 10);System.out.println("""res2: Int = """ + $show(res$2));$skip(35); 
	
	def product(x: Int) = { x * x };System.out.println("""product: (x: Int)Int""");$skip(164); 
	
	def sumLoop(f: Int => Int)(position: Int, upper: Int): Int = {
		if(position < upper)
			loop(f) (f(position) * f(position), position + 1, upper)
		else
			1
	};System.out.println("""sumLoop: (f: Int => Int)(position: Int, upper: Int)Int""");$skip(28); val res$3 = 
	
	sumLoop(x => x * x)(3,7);System.out.println("""res3: Int = """ + $show(res$3))}
}
