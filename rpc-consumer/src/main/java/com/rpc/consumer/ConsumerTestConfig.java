package com.rpc.consumer;

import com.rpc.common.util.ConfigUtil;
import com.rpc.core.config.RpcConfig;

public class ConsumerTestConfig {
    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtil.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);
    }

}
