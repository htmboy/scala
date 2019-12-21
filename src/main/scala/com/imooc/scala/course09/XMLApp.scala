package com.imooc.scala.course09
import scala.xml.XML
object XMLApp {

  def main(args: Array[String]): Unit = {

  }

  def loadXML(): Unit ={
    val xml1 = XML.load(this.getClass.getClassLoader.getResource("/input/test.xml"))
  }
}
