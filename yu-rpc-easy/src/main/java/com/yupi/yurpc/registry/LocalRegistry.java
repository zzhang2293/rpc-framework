package com.yupi.yurpc.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalRegistry {
    /**
     * registry info storage
     */
    private static final Map<String, Class<?>> map = new ConcurrentHashMap<>();


    /**
     * register a service
     * @param serviceName service name
     * @param implClass impl class
     */
    public static void register(String serviceName, Class<?> implClass){
        map.put(serviceName, implClass);
    }

    /**
     * get a impl class by the service name
     * @param serviceName service name
     * @return service impl class
     */
    public static Class<?> get(String serviceName){
        return map.get(serviceName);
    }

    /**
     * remove a service
     * @param serviceName remove a service by the service name
     */
    public static void remove(String serviceName){
        map.remove(serviceName);
    }
}
