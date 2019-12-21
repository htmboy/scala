package com.imooc.scala.course05

object ListApp extends App{
  val l = List(1, 2, 3, 4, 5);
  println(l.head)
  println(l.tail)

  val l2 = 1::Nil
  println(l2)
  val l3 = 2::l2
  println(l3)

  val l4 = 1::2::3::4::Nil
  println(l4)

  println(l4.length)

  // 可变list
  val l5 = scala.collection.mutable.ListBuffer[Int]()

  l5 += 2
  l5 ++= 1::2::4::Nil

  println(l5)
  l5 -= 2
  println(l5)
  l5 -= (2, 5)
  println(l5)


  def sum(nums:Int*):Int ={
    if(nums.length == 0)
      0
    else
      nums.head + sum(nums.tail:_*) // _*表示可以重复的

  }

  println(sum(1,2,3,4,5))


  val set = Set(1,2,3,1,4,3)
  println(set)

  var set2 = scala.collection.mutable.Set[Int]()
  set2 += 1
  set2 += (2, 2, 4, 6, 2)
  println(set2)

}
