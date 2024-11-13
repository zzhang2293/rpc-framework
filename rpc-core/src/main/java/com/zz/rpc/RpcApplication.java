package com.zz.rpc;

import com.zz.rpc.Constant.RpcConstant;
import com.zz.rpc.config.RpcConfig;
import com.zz.rpc.util.ConfigUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RpcApplication {
    /**
     * rpc framework application, same as holder, store the project global setting,
     */

    private static volatile RpcConfig rpcConfig;
    public static void init(RpcConfig newRpcConfig){
        rpcConfig = newRpcConfig;
        log.info("rpc init, config = {}", newRpcConfig.toString());
    }

    public static void init(){
        RpcConfig newRpcConfig;
        try{
            newRpcConfig = ConfigUtils.loadConfig(RpcConfig.class, RpcConstant.DEFAULT_CONFIG_PREFIX);
        }catch (Exception e){
            newRpcConfig = new RpcConfig();
        }
        init(newRpcConfig);
    }
    /**
     * get settings
     */

    public static RpcConfig getRpcConfig(){
        if (rpcConfig == null){
            synchronized (RpcApplication.class){
                if (rpcConfig == null){
                    init();
                }
            }
        }
        return rpcConfig;
    }
}
