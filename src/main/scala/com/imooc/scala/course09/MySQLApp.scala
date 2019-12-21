package com.imooc.scala.course09

import java.sql.{Connection, DriverManager}

object MySQLApp {
  def main(args: Array[String]): Unit = {
    val url = "jdbc:mysql://139.199.77.144/mysql?useSSL=false"
    val username = "root"
    val password = "htmboy8@MSN.com"

    var connection:Connection = null
    try{

      classOf[com.mysql.cj.jdbc.Driver]
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("select host,user from user")
      while (resultSet.next()){
        val host = resultSet.getString("host")
        val user = resultSet.getString("user")
        println(s"$host, $user")
      }
    } catch {
      case e:Exception => e.printStackTrace()
    } finally {

    }

  }

}
