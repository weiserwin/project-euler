object P2 {

//  Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2
//  the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//  By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

  def fibo(max : Int, fiboSeq : Seq[Int]) : Seq[Int] = {
    if (fiboSeq.last < max) return fibo(max, fiboSeq :+ (fiboSeq.last + fiboSeq.init.last))
    else return fiboSeq
  }

  def evenSum(fiboSeq : Seq[Int]): Int = {
    return fiboSeq.filter(n => n % 2 == 0).sum
  }

  def main(args: Array[String]) {
    println(evenSum(fibo(4000000, Seq(0,1))))
  }
}
