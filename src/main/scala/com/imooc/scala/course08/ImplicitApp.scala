package com.imooc.scala.course08

import java.io.File
import ImplicitAspect._

object ImplicitApp extends App{


  val man = new Man("KO")
  man.fly()


  val file = new File("C:\\Users\\aooled-laptop\\IdeaProjects\\scala-train\\input\\hello.txt")
  file.read()

  def testParam(implicit name:String): Unit ={
    println(name + "~~~~~~~~~~~~~~~~")
  }

//  testParam("zhangsan")

//  implicit val name = "implicit_name"


  implicit val s1 = "s1"
//  implicit val s2 = "s2"
  testParam
}

class Man(val name:String){
  def eat(): Unit = {
    println(s"man [ $name ] eat ......")
  }
}

class Superman(val name:String){
  def fly(): Unit = {
    println(s"superman[ $name ] fly ......")
  }
}

class RichFile(val file:File) {
  def read() = {
    println(scala.io.Source.fromFile(file.getPath).mkString)
  }
}
