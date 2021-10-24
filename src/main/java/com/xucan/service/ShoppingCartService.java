package com.xucan.service;

import com.xucan.domain.SCminineed;
import com.xucan.domain.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    //    插入购物车记录
    void insert(ShoppingCart shoppingCart);
    //    查询所有购物车记录
    List<ShoppingCart> findAll(String open_id);
    //    根据open_id查询购物车信息
    List<SCminineed> findAllByOpenId(String open_id);
    //    更新check状态
    void updateChecked(Integer shopping_id);
    //    更新count
    void updateCount(Integer shopping_id, Integer count);
    //    根据shopping_id查询购物车信息
    ShoppingCart findByShoppingId(Integer shopping_id);
    //    根据shopping_id删除购物车商品
    void delete(Integer shopping_id);
}
