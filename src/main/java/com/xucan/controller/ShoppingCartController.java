package com.xucan.controller;

import com.xucan.domain.SCminineed;
import com.xucan.domain.ShoppingCart;
import com.xucan.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;
    //    添加新记录
    @PostMapping("/shoppingCart")
    public void insert(@RequestBody ShoppingCart shoppingCart){
        shoppingCartService.insert(shoppingCart);
    }
    //    查询所有购物车信息
    @GetMapping("/shoppingCart")
    public List<ShoppingCart> findAll(@RequestParam String open_id){
        return shoppingCartService.findAll(open_id);
    }
    //    根据open_id查询购物车信息
    @GetMapping("/shoppingCart/{open_id}")
    public List<SCminineed> findAllByOpenId(@PathVariable("open_id") String open_id){
        return shoppingCartService.findAllByOpenId(open_id);
    }
    //    更新check状态
    @PutMapping("/shoppingCart/{shopping_id}")
    public void updateChecked(@PathVariable("shopping_id") Integer shopping_id){
        shoppingCartService.updateChecked(shopping_id);
    }
    //    更新count
    @PutMapping("/shoppingCart/{shopping_id}/{count}")
    public void updateCount(@PathVariable("shopping_id")Integer shopping_id,@PathVariable("count")Integer count){
        shoppingCartService.updateCount(shopping_id,count);
    }
    //    根据shopping_id查询购物车信息
    @GetMapping("/shoppingCartBy/{shopping_id}")
    public ShoppingCart findByShoppingId(@PathVariable("shopping_id") Integer shopping_id){
        return shoppingCartService.findByShoppingId(shopping_id);
    }
    //    根据shopping_id删除购物车商品
    @DeleteMapping("/shoppingCart/{shopping_id}")
    public void delete(@PathVariable("shopping_id") Integer shopping_id){
        shoppingCartService.delete(shopping_id);
    }
}
