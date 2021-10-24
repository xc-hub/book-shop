package com.xucan.service;

import com.xucan.domain.Order;
import com.xucan.domain.OrderDetail;

import java.util.List;

public interface OrderService {
    //    添加订单
    void insertOrder(Order order);
    //    添加订单详情
    void insertOrderDetail(OrderDetail orderDetail);
    //    更新订单状态
    void updateOrderStatus(String oid);
    //    获取所有订单
    List<Order> findAllOrder(String open_id);

    void deletedOrder(String oid);

    Order findAllOrderByOid(String oid);
}
