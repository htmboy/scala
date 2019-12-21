package com.imooc.scala.course04

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    var person = new People()
    person.name = "Messi"
    println(person.name + "..." + person.age)
    println(person.eat)

    person.watchFootball("Barcelona")

    person.printInfo()
  }

}

class People {

  // 定义属性
  var name:String = _ // 占位符 val 不行，var 可以，需要把类型写上
  val age:Int = 10 // 不能重新赋值

  private [this] val gender = "male" // 只能class内部能访问

  def printInfo(): Unit ={
    println("gender: " + gender)
  }

  def eat():String = {
    name + " eat......"
  }

  def watchFootball(teamName:String): Unit ={
    println(name + " is watching match of " + teamName)
  }
}
