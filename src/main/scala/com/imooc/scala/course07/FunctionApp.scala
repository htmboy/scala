package com.imooc.scala.course07

/**
 * 匿名函数： 函数是可以命名的，也可以不命名
 * (参数名：参数类型......) => 函数体
 */
object FunctionApp extends App{

  def sayHello(name:String): Unit = {
    println("Hi: " + name)
  }
  sayHello("KO")

  (x:Int) => x+1
  val y = (x:Int) => x+1

  println(y(3))

  def add = (x:Int, y:Int) => {x + y}
  println(add(5, 5))

  def sum(a:Int, b:Int) = a + b
  println(sum(2, 3))

  def sum2(a:Int)(b:Int) = a + b
  println(sum2(2)(3))

  val l = List(1,2,3,4,5,6,7,8,9)
  // map: 逐个去操作集合中的每个元素
  l.map((x:Int) => print(x * 2))
  l.map(x => print(x + 2))
  println()
  l.map(_ * 2).foreach(println)
  l.map(_ * 3).filter(_ > 8).foreach(println)
  println(l.take(4))
  println(l.reduce(_ + _))
  println(l.reduceLeft(_ - _))
  println(l.reduceRight(_ - _))
  println(l.fold(0)(_ - _))
  println(l.sum)
  val f = List(List(1,2), List(3,4), List(5,6,7))
  println(f.flatten)
  println(f.map(_.map(_*2)))
  println(f.flatMap(_.map(_*2)))

  val txt = scala.io.Source.fromFile("C:\\Users\\aooled-laptop\\IdeaProjects\\scala-train\\input\\hello.txt").mkString
  println(txt)

  val txt2 = List(txt)
  txt2.flatMap(_.split(", ").map(x => (x, 1))).foreach(println)
}
