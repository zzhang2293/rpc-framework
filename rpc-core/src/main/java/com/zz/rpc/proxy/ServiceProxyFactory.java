package com.zz.rpc.proxy;

import com.zz.rpc.RpcApplication;

import java.lang.reflect.Proxy;

/**
 * service proxy factory, use to create proxy
 */
public class ServiceProxyFactory {
    @SuppressWarnings("unchecked")
    public static <T> T getProxy(Class<T> serviceClass){
        if (RpcApplication.getRpcConfig().isMock()){
            return getMockProxy(serviceClass);
        }
        return null;
//        return (T) Proxy.newProxyInstance(
//                serviceClass.getClassLoader(),
//                new Class[]{serviceClass},
//                new ServiceProxy()
//        );
    }

    @SuppressWarnings("unchecked")
    public static <T> T getMockProxy(Class<T> serviceClass){
        return (T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new MockServiceProxy()
        );
    }
}
