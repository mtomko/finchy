package org.example

import io.finch._
import io.finch.syntax._
import com.twitter.finagle.Http
import com.twitter.util.Await

object Finchy {
  def main(args: Array[String]): Unit = {
    val api: Endpoint[String] = get(/) { Ok("Hello, World!") }

    println("started http://localhost:8080")
    val _ = Await.ready(Http.server.serve(":8080", api.toServiceAs[Text.Plain]))
  }
}
