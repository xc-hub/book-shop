package com.xucan.mapper;

import com.xucan.domain.Order;
import com.xucan.domain.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    //    添加订单
    void insertOrder(Order order);
    //    添加订单详情
    void insertOrderDetail(OrderDetail orderDetail);
    //    更新订单状态
    void updateOrderStatus(String oid);
    //    获取所有订单
    List<Order> findAllOrder(String open_id);
    List<OrderDetail> findOrderDetailByOid(String oid);
    void deletedOrder(String oid);

    void deleteOrderDetail(String oid);

    Order findAllOrderByOid(String oid);
}
