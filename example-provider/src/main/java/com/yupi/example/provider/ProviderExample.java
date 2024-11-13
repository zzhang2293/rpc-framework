package com.yupi.example.provider;

import com.yupi.example.common.service.UserService;
import com.yupi.yurpc.registry.LocalRegistry;
import com.yupi.yurpc.server.HttpServer;
import com.yupi.yurpc.server.VertxHttpServer;
import com.zz.rpc.RpcApplication;

public class ProviderExample {
    public static void main(String[] args) {
        RpcApplication.init();
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(RpcApplication.getRpcConfig().getServerPort());

    }
}
