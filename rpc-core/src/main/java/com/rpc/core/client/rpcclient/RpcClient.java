package com.rpc.core.client.rpcclient;

import com.rpc.common.message.RpcRequest;
import com.rpc.common.message.RpcResponse;

public interface RpcClient {
    RpcResponse sendRequest(RpcRequest request);
    void close();
}
