package com.imooc.scala.course04

object ConstructorApp {
  def main(args: Array[String]): Unit = {
//    val person = new Person("zhangsan", 30)
//    println(person.name + ":" + person.age + ":" + person.school)
//
//    val person2 = new Person("zhangsan", 30, "M")
//    println(person2.name + ":" + person2.age + ":" + person2.school + ":" + person2.gender)

    val student = new Student("ko", 23, "me")
    println(student.name + ":" + student.major)
    println(student.toString)
  }

}

// 主构造器
class Person(val name:String, val age:Int) {
  println("Person Constructor enter......")

  val school = "ustc"
  var gender:String = _

  // 附属构造器
  def this(name:String, age:Int, gender:String) {
    this(name, age) // 附属构造器的第一行代码必须要调用主构造器或者其他附属构造器
    this.gender = gender
  }

  println("Person Constructor leave......")
}

class Student(name:String, age:Int, var major:String) extends Person(name, age){
  println("Person Student enter......")

  override val school = "peking" // 重写父类的school

  override def toString() = "Person: override def toString" + school

  println("Person Student leave......")
}
