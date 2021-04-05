package com.example.myapplication

import java.util.*;
fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)
    println("Enter no.of digits")
    var n=sc.nextInt()
    var r1=0
    var r2=1
    var i=1
    if(n==1)
    {
        println(0)
    }
    else if(n==2)
    {
        println(r1)
        println(r2)
    }
    else
    {
        println(r1)
        println(r2)
        while(i<=n-2)
        {
            var sum=r1+r2
            println(sum)
            r1=r2
            r2=sum
            i++
        }

    }
}
