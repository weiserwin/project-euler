object P1 {

//  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//  Find the sum of all the multiples of 3 or 5 below 1000.

  def sumMultiples(threshold: Int): Double = {
    return Range.Double(0d, threshold,1).filter( n => ((n % 5 == 0) || (n % 3 == 0))).sum
  }

  def main(args: Array[String]) {
    println(sumMultiples(1000))
    
  }
}
