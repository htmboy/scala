package com.imooc.scala.course07

object StringApp extends App{

  val s = "Hello"
  val name = "PK"
  println(s + name)
  println(s"Hello:$name")

  val b =
    """
      |这是一个多行字符串
      |hello
      |ko
      |world
      |""".stripMargin

  println(b)

}
