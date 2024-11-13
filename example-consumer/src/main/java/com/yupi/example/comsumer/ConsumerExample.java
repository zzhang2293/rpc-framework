package com.yupi.example.comsumer;

import com.zz.rpc.config.RpcConfig;
import com.zz.rpc.util.ConfigUtils;

public class ConsumerExample {
    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);
    }
}
