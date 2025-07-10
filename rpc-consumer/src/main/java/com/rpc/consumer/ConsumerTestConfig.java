package com.rpc.consumer;

import com.rpc.common.util.ConfigUtil;
import com.rpc.core.config.KRpcConfig;

public class ConsumerTestConfig {
    public static void main(String[] args) {
        KRpcConfig rpc = ConfigUtil.loadConfig(KRpcConfig.class, "rpc");
        System.out.println(rpc);
    }

}
