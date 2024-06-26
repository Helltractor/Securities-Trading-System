package com.warp.exchange.match;

import com.warp.exchange.entity.trade.order.OrderEntity;

import java.math.BigDecimal;

public record MatchDetailRecord(BigDecimal price, BigDecimal quantity, OrderEntity takerOrder, OrderEntity makerOrder) {
}
