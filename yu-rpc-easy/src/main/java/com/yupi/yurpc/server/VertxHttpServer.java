package com.yupi.yurpc.server;

import io.vertx.core.Vertx;

public class VertxHttpServer implements HttpServer{


    @Override
    public void doStart(int port) {
        Vertx vertx = Vertx.vertx();
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();
        // create a http server
        server.requestHandler(new HttpServerHandler());

        // assign the port, and start the server
        server.listen(port, result ->{
            if (result.succeeded()){
                System.out.println("Server is now listening on port " + port);
            }else{
                System.err.println("Failed to start server: " + result.cause());
            }
        });

    }
}
