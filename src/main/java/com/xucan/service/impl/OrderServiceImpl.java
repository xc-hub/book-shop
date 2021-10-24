package com.xucan.service.impl;

import com.xucan.domain.Order;
import com.xucan.domain.OrderDetail;
import com.xucan.mapper.OrderMapper;
import com.xucan.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    //    添加订单
    @Override
    public void insertOrder(Order order) {
        orderMapper.insertOrder(order);
    }
    //    添加订单详情
    @Override
    public void insertOrderDetail(OrderDetail orderDetail) {
        orderMapper.insertOrderDetail(orderDetail);
    }
    //    更新订单状态
    @Override
    public void updateOrderStatus(String oid) {
        orderMapper.updateOrderStatus(oid);
    }
    //    获取所有订单
    @Override
    public List<Order> findAllOrder(String open_id) {
       return orderMapper.findAllOrder(open_id);
    }

    @Override
    public void deletedOrder(String oid) {
        orderMapper.deleteOrderDetail(oid);
//        List<OrderDetail> allOrderDetailByOid = orderMapper.findAllOrderDetailByOid(oid);
        orderMapper.deletedOrder(oid);
    }

    @Override
    public Order findAllOrderByOid(String oid) {
        return orderMapper.findAllOrderByOid(oid);
    }
}
