package acadgild

object GCD {
  
  def main(args: Array[String]): Unit = {
 //MAIN METHOD
    
    println("************GCD OF TWO NUMBERS***************")
    println("------Enter Two Numbers-------")
    println()

 //GCD Number Intitalised    
    var gcd  = 1 
  
 //Taking Input from User    
    println("Enter First Number ")
    val num1 = scala.io.StdIn.readInt()
    
    println("Enter Second Number ")
    val num2 = scala.io.StdIn.readInt()
    
 //Logic for Calculating GCD
    
    for(i <- 1 to num1 ; i <- 1 to num2)
    {
      if(num1 % i == 0 && num2 % i ==0){
        
        gcd = i 
      }  
    }   
    println(s"GCD OF $num1 and $num2 is : $gcd")
 }
   
}