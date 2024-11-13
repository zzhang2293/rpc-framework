package com.yupi.example.provider;

import com.yupi.example.common.service.UserService;
import com.yupi.yurpc.registry.LocalRegistry;
import com.yupi.yurpc.server.HttpServer;
import com.yupi.yurpc.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String[] args) {
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // start http server
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);

    }
}
