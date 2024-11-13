package com.yupi.yurpc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcResponse implements Serializable {
    /**
     * Response data
     */
    private Object Data;

    /**
     * response type
     */
    private Class<?> dataType;

    /**
     * response information
     */
    private String message;

    /**
     * Error information
     */
    private Exception exception;
}
