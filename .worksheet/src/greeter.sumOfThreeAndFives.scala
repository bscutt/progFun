package greeter

object sumOfThreeAndFives {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(170); 

  def loop(f: Int => Int)(i: Int, end: Int, acc: Int): Int = {
    if (i < end) loop(f)(i + 1, end, acc + f(i)) else acc
  };System.out.println("""loop: (f: Int => Int)(i: Int, end: Int, acc: Int)Int""");$skip(65); 

	def divisableByThreeAndFive(x: Int) = x % 3 == 0 || x % 5 == 0;System.out.println("""divisableByThreeAndFive: (x: Int)Boolean""");$skip(65); 

	def matchOrZero(f: Int => Boolean)(x: Int) = if(f(x)) x else 0;System.out.println("""matchOrZero: (f: Int => Boolean)(x: Int)Int""");$skip(127); 

  def sumOfMultiplesThreeAndFive(upperBound: Int) = {
    loop(matchOrZero(divisableByThreeAndFive)(_))(0, upperBound, 0)
  };System.out.println("""sumOfMultiplesThreeAndFive: (upperBound: Int)Int""");$skip(37); val res$0 = 

  sumOfMultiplesThreeAndFive(10000);System.out.println("""res0: Int = """ + $show(res$0))}
}
