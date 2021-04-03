package com.example.myapplication

import java.util.*
fun main()
{
    var sc=Scanner(System.`in`)
    println("Enter no.of terms that we want in fibonacci")
    var n=sc.nextInt()
    var r1=0
    var r2=1
    if(n==1)
    {
        println(0)
    }
    else if(n==2)
    {
        println(r1)
        println(r2)
    }
    else {
        for (i in 1..n-2) {
            print("$r1 + ")

            val sum = r1 + r2
            r1 = r2
            r2 = sum
        }
    }
}