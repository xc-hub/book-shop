package com.xucan.mapper;

import com.xucan.domain.SCminineed;
import com.xucan.domain.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {
//    插入记录
    void insert(ShoppingCart shoppingCart);
//    根据book_id查找count
    Integer findCountByBookId(ShoppingCart shoppingCart);
//    更新count
    void updateCount(ShoppingCart shoppingCart);
//    查询所有购物车记录
    List<ShoppingCart> findAll(String open_id);

//    根据open_id查询购物车信息
    List<SCminineed> findAllByOpenId(String open_id);
//    更新check状态
    void updateChecked(Integer shopping_id);

    void updateCount1(Integer shopping_id, Integer count);
//    根据shopping_id查询购物车信息
    ShoppingCart findByShoppingId(Integer shopping_id);
//    根据shopping_id删除购物车商品
    void delete(Integer shopping_id);
}
