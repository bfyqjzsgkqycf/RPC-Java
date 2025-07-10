package com.rpc.core.server.ratelimit;

public interface RateLimit {
    //获取访问许可
    boolean getToken();
}
