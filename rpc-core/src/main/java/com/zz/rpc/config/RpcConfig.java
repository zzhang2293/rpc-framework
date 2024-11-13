package com.zz.rpc.config;

import lombok.Data;

/**
 * rpc framework setting
 */
@Data
public class RpcConfig {
    /**
     * mock remote call
     */
    private boolean mock = false;

    /*
     * name
     */
    private String name = "rpc";

    /*
     * version
     */
    private String version = "1.0";

    /**
     * server host
     */
    private String serverHost = "localhost";

    /**
     * server port number
     */
    private Integer serverPort = 8080;

}
