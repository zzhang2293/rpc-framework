package com.zz.rpc.util;
import cn.hutool.core.util.StrUtil;
import cn.hutool.setting.dialect.Props;

/**
 * config util class
 */
public class ConfigUtils {
    /**
     * loading config object
     */
    public static <T> T loadConfig(Class<T> tClass, String prefix){
        return loadConfig(tClass, prefix, "");
    }

    public static <T> T loadConfig(Class<T> tClass, String prefix, String environment){
        StringBuilder configFileBuilder = new StringBuilder("application");
        if (StrUtil.isNotBlank(environment)){
            configFileBuilder.append("-").append(environment);
        }
        configFileBuilder.append(".properties");
        Props props = new Props(configFileBuilder.toString());
        return props.toBean(tClass, prefix);
    }
}
