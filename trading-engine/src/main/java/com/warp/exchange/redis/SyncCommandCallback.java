package com.warp.exchange.redis;

import io.lettuce.core.api.sync.RedisCommands;

@FunctionalInterface
public interface SyncCommandCallback<T> {
    
    T doInConnection(RedisCommands<String, String> commands);
}
