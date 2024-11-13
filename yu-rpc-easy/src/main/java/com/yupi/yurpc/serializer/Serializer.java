package com.yupi.yurpc.serializer;

import java.io.IOException;

/**
    Serializer interface
 */
public interface Serializer {

    /**
     * serialize java obj
     * @param object object
     * @return <T>
     * @throws IOException exception
     */
    <T> byte[] serialize(T object) throws IOException;


    /**
     * deserialize java obj
     */
    <T> T deserialize(byte[] bytes, Class<T> type) throws IOException;

}
