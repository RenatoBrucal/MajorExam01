object MajorWs {
  println("Welcome to the Scala worksheet")
  println("NUmber#1")
  val n = Int

	
  def fib(n: Int): Int = {
  val x = true
  
  val y = true

    if (n==0) {
       return 1
    } else if (n==1) {
    return 1
    }
    else {
      fib(n - 2) + fib(n - 1)
    }

  }
  
  fib (5)


println("Number 2")

def fizzString(fizzString:String):Unit = {




if (fizzString.startsWith("f")&&fizzString.endsWith("b"))
{
println("FizzBuzz")
}
else if (fizzString.startsWith("b")&&fizzString.endsWith("f"))
{
println("FizzBuzz")
}
else if (fizzString.startsWith("f"))
{
println("FIzz")
}
else if (fizzString.startsWith("b"))
{
println("BUzz")
}
}

println(fizzString("fig"))

println(fizzString("big"));

println(fizzString("fib"))



println("Number#3")


def factor(a:Int): Int = {

val a = 1

if(a == 1)
{
	
	a * a
 
return a

}


}
println(factor(1));





}