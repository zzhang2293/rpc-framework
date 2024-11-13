package com.yupi.yurpc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * rpc request
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcRequest implements Serializable {
    /**
     * Service name
     */
    private String serviceName;

    /**
     * method name
     */
    private String methodName;

    /**
     * parameters type list
     */
    private Class<?>[] parameterTypes;

    /**
     * parameters
     */
    private Object[] args;


}
