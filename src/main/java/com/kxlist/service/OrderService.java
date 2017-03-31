package com.kxlist.service;

import com.kxlist.bean.Order;
import com.kxlist.dao.IPublicDao;
import com.kxlist.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zxd
 * @create 2017-03-31 17:06
 **/
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private IPublicDao<Order> publicDao;
    public void save(Order order) {
        orderRepository.save(order);
    }

    public Order findOne(String id) {
        return orderRepository.findOne(id);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public int updateNameById(String id, String name) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("name",name);
        publicDao.update(query,update,Order.class);
        return 1;
    }

    public void deleteById(String id) {
        orderRepository.delete(id);
    }
}
