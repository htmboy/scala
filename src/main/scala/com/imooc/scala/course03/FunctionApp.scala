package com.imooc.scala.course03

object FunctionApp {
  def main(args: Array[String]): Unit = {
    println(add(2, 3))
    println(three())
    println(three) // 没有入参的函数，调用时括号时可以省略的
    sayHello
    sayHello("lisi")

    sayName()
    sayName("ok")

    println(speed(100, 10))
    println(speed(distance = 100, time = 10))
    println(speed(time = 10, distance = 100))

    println(sum(1, 3))

    println(sum(1, 3, 5))
    println(sum2(1, 3, 5))
    println(1.to(10))
    println(1 until 10)
    println(Range(1,10,-1))
    for(i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }

    var courses = Array("Hadoop", "Spark SQL", "Spark Streaming", "Storm", "Scala")

//    for(course <- courses){
//      println(course)
//    }

    courses.foreach(x => println(x))

    var (num, max) = (100, 0)
    while(num > 0) {
      max = max + num
      num = num - 1
    }
    println(max)
  }

  def add(x:Int, y:Int):Int = {
    x + y // 最后一行就是返回值
  }

  def three() = 1 + 2

  def sayHello(): Unit ={
    println("Say Hello!")
  }

  def sayHello(name:String): Unit = {
    println("Hello " + name)
  }

  def sayName(name:String = "ko"): Unit = {
    println(name)
  }

  def speed(distance:Float, time:Float):Float = {
    distance/time
  }

  def sum(a:Int, b:Int) ={
    a + b
  }

  def sum(a:Int, b:Int, c:Int) ={
    a + b + c
  }

  def sum2(numbers:Int*) = {
    var result = 0
    for(number <- numbers)
      result += number

    result
  }
}
