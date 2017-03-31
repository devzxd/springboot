package com.zxd.controller;

import com.alibaba.fastjson.JSON;
import com.zxd.bean.Order;
import com.zxd.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zxd
 * @create 2017-03-31 16:45
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 保存
     * @param order
     * @return
     */
    @PostMapping
    public String saveOrder(Order order){
        orderService.save(order);
        return order.toString();
    }

    @GetMapping("/{id}")
    public String findOrder(@PathVariable("id") String id){
        return orderService.findOne(id).toString();
    }

    @GetMapping
    public String findAll(){
        return JSON.toJSONString(orderService.findAll());
    }

    @PutMapping("/{id}")
    public String updateName(@PathVariable(value = "id") String id,@RequestParam("name") String name){
        return orderService.updateNameById(id,name)+"";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        orderService.deleteById(id);
        return "删除成功！";
    }
}
