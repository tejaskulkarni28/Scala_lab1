package Playground

import scala.annotation.tailrec

object Playground3 extends App{
  def factorial(n:Int):BigInt = {
    @tailrec
    def tailRec(n: Int, accumulator: BigInt): BigInt = {
      if(n <= 1) accumulator
      else tailRec(n-1, n * accumulator)
    }
    tailRec(n, 1)
  }
  println(factorial(4))
}
