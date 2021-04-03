package com.example.myapplication

import java.util.*;
fun main()
{
    var sc=Scanner(System.`in`)
    println("Enter radius of the circle")
    val r=sc.nextInt()
    val r1=3.14*r*r
    val r2=2*3.14*r
    println("Area of the circle is $r1")
    println("perimeter of the circle is $r2")
    val r3=r2/4
    println("length of the side of square is $r3")
}
