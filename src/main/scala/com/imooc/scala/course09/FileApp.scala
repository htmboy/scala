package com.imooc.scala.course09

import scala.io.Source

object FileApp {

  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("C:\\Users\\aooled-laptop\\IdeaProjects\\scala-train\\input\\hello.txt")(scala.io.Codec.UTF8)

    def readLine(): Unit ={
      for(line <- file.getLines()){
        println(line)
      }
    }
//    readLine()

    def readChar(): Unit ={
      for(ele <- file){
        print(ele)
      }
    }
//    readChar()

    def readNet(): Unit ={
      val file = Source.fromURL("https://www.baidu.com")
      for(line <- file.getLines()){
        println(line)
      }
    }
    readNet()
  }
}
