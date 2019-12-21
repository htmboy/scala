package com.imooc.scala.course05

object ArrayApp extends App{

  val a = new Array[String] (5)
  println(a.length)
  a(1) = "Hello"
  println(a(1))

  val b = Array("hadoop", "spark", "storm")
  b(2) = "java"
  println(b(2))

  val c = Array(2,3,4,5,6,7,8,9)
  println(c.max)
  println(c.min)
  println(c.mkString(","))


  val d = scala.collection.mutable.ArrayBuffer[Int]()
  d += 1
  d += 2
  d += (3,4,5)
  d ++= Array(6,7,8)
  d.insert(8, 0)
  println(d)
  d.remove(1)
  println(d)
  d.remove(0, 3)
  println(d)
  d.trimEnd(2)
  println(d)
  println(d.toArray.mkString(","))

  for(i <- 0 until d.length) {
    println(d(i))
  }

  for(ele <- d){
    println(ele)
  }

  for(i <- (0 until d.length).reverse) {
    println(d(i))
  }
}
