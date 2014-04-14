package greeter

object sumOfThreeAndFives {

  def loop(f: Int => Int)(i: Int, end: Int, acc: Int): Int =
    if (i < end) loop(f)(i + 1, end, acc + f(i)) else acc
                                                  //> loop: (f: Int => Int)(i: Int, end: Int, acc: Int)Int

  def divisableByThreeAndFive(x: Int) = x % 3 == 0 || x % 5 == 0
                                                  //> divisableByThreeAndFive: (x: Int)Boolean

  def matchOrZero(f: Int => Boolean)(x: Int) = if (f(x)) x else 0
                                                  //> matchOrZero: (f: Int => Boolean)(x: Int)Int

  def sumOfMultiplesThreeAndFive(upperBound: Int) =
    loop(matchOrZero(divisableByThreeAndFive)(_))(0, upperBound, 0)
                                                  //> sumOfMultiplesThreeAndFive: (upperBound: Int)Int

  sumOfMultiplesThreeAndFive(10000)               //> res0: Int = 23331668
}