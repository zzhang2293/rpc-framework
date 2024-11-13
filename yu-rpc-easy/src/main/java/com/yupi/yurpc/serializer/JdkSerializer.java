package com.yupi.yurpc.serializer;

import java.io.*;

public class JdkSerializer implements Serializer{

    /**
     * JDK serializer impl
     * @param object object
     */
    @Override
    public <T> byte[] serialize(T object) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        return outputStream.toByteArray();


    }

    /**
     * deserialize
     */
    @Override
    public <T> T deserialize(byte[] bytes, Class<T> type) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        try{
            Object obj = objectInputStream.readObject();
            if (type.isInstance(obj)){
                return type.cast(obj);
            } else{
                throw new ClassCastException();
            }
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        } finally {
            objectInputStream.close();
        }
    }
}
