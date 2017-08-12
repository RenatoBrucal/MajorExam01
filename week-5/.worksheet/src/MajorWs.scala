object MajorWs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(22); 
  println("NUmber#1");$skip(14); 
  val n = Int;System.out.println("""n  : Int.type = """ + $show(n ));$skip(193); 

	
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

  };System.out.println("""fib: (n: Int)Int""");$skip(13); val res$0 = 
  
  fib (5);System.out.println("""res0: Int = """ + $show(res$0));$skip(22); 


println("Number 2");$skip(333); 

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
};System.out.println("""fizzString: (fizzString: String)Unit""");$skip(28); 

println(fizzString("fig"));$skip(30); 

println(fizzString("big"));$skip(28); ;

println(fizzString("fib"));$skip(23); 



println("Number#3");$skip(81); 


def factor(a:Int): Int = {

val a = 1

if(a == 1)
{
	
	a * a
 
return a

}


};System.out.println("""factor: (a: Int)Int""");$skip(20); 
println(factor(1));}





}
