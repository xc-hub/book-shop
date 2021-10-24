package com.xucan.service.impl;

import com.xucan.domain.SCminineed;
import com.xucan.domain.ShoppingCart;
import com.xucan.mapper.BookMapper;
import com.xucan.mapper.ShoppingCartMapper;
import com.xucan.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    private ShoppingCartMapper shoppingCartMapper;
    @Autowired
    private BookMapper bookMapper;
    //    添加购物车记录
    @Override
    public void insert(ShoppingCart shoppingCart) {
//        Integer shopping_id = shoppingCart.getShopping_id();
        //System.out.println(book_id);
        //System.out.println(shoppingCartMapper.findCountByBookId(book_id));
        if(shoppingCartMapper.findCountByBookId(shoppingCart)==null)
            shoppingCartMapper.insert(shoppingCart);
        else{
            //System.out.println(shoppingCartMapper.findCountByBookId(book_id));
            Integer count =shoppingCartMapper.findCountByBookId(shoppingCart) +1;
            shoppingCart.setCount(count);
            shoppingCartMapper.updateCount(shoppingCart);
        }

    }
    //    查询所有购物车记录
    @Override
    public List<ShoppingCart> findAll(String open_id) {
        return shoppingCartMapper.findAll(open_id);
    }
    //    根据open_id查询购物车书本信息
    @Override
    public List<SCminineed> findAllByOpenId(String open_id) {
//        System.out.println(shoppingCartMapper.findAllByOpenId(open_id));
//        List<ShoppingCart> list= shoppingCartMapper.findAllByOpenId(open_id);
//        ArrayList arrayList = new ArrayList();
//        for (int i=0;i<list.size();i++)
//            arrayList.add(list.get(i).getBook_id());
//        System.out.println(arrayList);
//        for (int i=0;i<arrayList.size();i++)
//            bookMapper.findBookById((Integer) arrayList.get(i));
        return shoppingCartMapper.findAllByOpenId(open_id);
    }
    //    更新check状态
    @Override
    public void updateChecked(Integer shopping_id) {
        shoppingCartMapper.updateChecked(shopping_id);
    }
//    更新count
    @Override
    public void updateCount(Integer shopping_id, Integer count) {
        shoppingCartMapper.updateCount1(shopping_id,count);
    }
//    根据shopping_id查询购物车信息
    @Override
    public ShoppingCart findByShoppingId(Integer shopping_id) {
        return shoppingCartMapper.findByShoppingId(shopping_id);
    }
//    根据shopping_id删除购物车商品
    @Override
    public void delete(Integer shopping_id) {
        shoppingCartMapper.delete(shopping_id);
    }
}
