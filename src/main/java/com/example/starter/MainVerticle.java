package com.example.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServer;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Future<Void> startFuture) {

    HttpServer server = vertx.createHttpServer();

    server.requestHandler(req -> {
      req.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x 3!");
    });

    server.listen(8888, ar -> {
      if (ar.succeeded()) {
        System.out.println("HTTP server started on port 8888");
        startFuture.complete();
      } else {
        startFuture.fail(ar.cause());
      }
    });
  }
}
