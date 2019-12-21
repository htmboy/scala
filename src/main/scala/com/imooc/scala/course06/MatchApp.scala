package com.imooc.scala.course06

import scala.util.Random

object MatchApp extends App{
  val names = Array("Akiho Yoshizawa", "Yui Hatano", "Aoi Sola")
  val name = names(Random.nextInt(names.length))

  name match {
    case "Akiho Yoshizawa" => println("吉老师")
    case "Yui Hatano" => println("波老师")
    case _ => println("真不知道，你们在说什么")
  }

  def judgeGrade(grade:String): Unit ={
    grade match{
      case "A" => println("Excellent")
      case "B" => println("Good...")
      case "C" => println("Just so so...")
      case _ => println("You need work harder")
    }
  }

  judgeGrade("A")

  def judgeGrade2(name:String, grade:String): Unit ={
    grade match{
      case "A" => println("Excellent")
      case "B" => println("Good...")
      case "C" => println("Just so so...")
      case _ if(name == "lisi") => println(name + ", You are a good boy, but ...")
      case _ => println("You need work harder...")
    }
  }

  judgeGrade2("zhangsan", "D")
  judgeGrade2("lisi", "A")
  judgeGrade2("lisi", "D") // 双重过滤


  def greeting(array:Array[String]): Unit ={
    array match {
      case Array("zhangsan") => println("Hi:zhangsan")
      case Array(x, y) => println("Hi:" + x + " , " + y)
      case Array("zhangsan", _*) => println("Hi:zhangsan and other friends...")
      case _ => println("Hi: everybody...")
    }
  }

  greeting(Array("zhangsan"))
  greeting(Array("lisi", "wanwu"))
  greeting(Array("zhangsan", "lisi", "wangwu"))
  greeting(Array("lisi", "wangwu", "zhangsan"))


  def greeting2(list:List[String]): Unit ={
    list match {
      case "zhangsan"::Nil => println("Hi: zhangsan")
      case x::y::Nil => println("Hi: " + x + " , " + y)
      case "zhangsan"::tail => println("Hi: zhangsan and other friends...")
      case _ => println("Hi: everybody...")
    }
  }
  greeting2(List("zhangsan"))
  greeting2(List("lisi", "zhangsan"))
  greeting2(List("zhangsan", "lisi")) // 走先匹配的

  def matchType(obj:Any): Unit ={
    obj match {
      case x:Int => println("Int")
      case s:String => println("String")
      case m:Map[_, _] => m.foreach(println)
      case _ => println("other type")
    }
  }
  matchType("1")
  matchType(1L)
  matchType(Map("name" -> "PK"))
}
