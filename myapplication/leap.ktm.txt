import java.util.*;
fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)
    println("Enter year to check leap oor not?")
    var year=sc.nextInt()
     var flag : Int

    if (year % 4 == 0) {

      if (year % 100 == 0) {

        if (year % 400 == 0)
          flag = 1
        else
          flag = 0
      }
      
      // if the year is not century
      else
        flag = 1
    }
    
    else
      flag = 0

    if (flag==1)
      println("$year  is a leap year.")
    else
      println("$year is not a leap year.")
  }
