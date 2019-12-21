package com.imooc.scala.course08

object ImplicitClassApp extends App{

  implicit class Calculator(x:Int) {

    def add(a:Int) = a + x
  }

  println(1.add(3)) // 1本身没有add方法，但是隐式转化之后就具有了add方法，Int类型的
}


