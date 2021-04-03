package com.example.myapplication

import java.util.*;
fun main()
{
    var sc=Scanner(System.`in`)
    println("Enter marks of 3 subjects:")
    val r1  = sc.nextInt()
    val r2  = sc.nextInt()
    val r3  = sc.nextInt()
    val tot = r1+r2+r3
    println("Total marks for a student is $tot")
    val per =(tot*100)/300
    println("Percentage is $per")

}
