package SmallTasks

// Task 1:  A Greeting function(name,age) => "Hii, my name is $name and I am $age years old
// Task 2:  Factorial function 1 * 2 * 3 * ..... * n
// Task 3:  A fibonacci function
//          f(1)=1, f(2)=1, f(n)=f(n-1)+f(n-2)
// Task 4: Test if a number is prime
object Task4 extends App{
  def PrimeNumber(n: Int): Boolean = {
    if(n % 2 == 0) true
    else false
  }
  println(PrimeNumber(11))
}
