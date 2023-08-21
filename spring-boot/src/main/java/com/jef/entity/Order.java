package com.jef.entity;

import lombok.Data;

/**
 * @author tufujie
 * @date 2023/8/21
 */
@Data
public class Order {

    private Double originalPrice; // 订单原始价格，即优惠前的价格
    private Double realPrice; // 订单真实价格，即优惠后的价格

}