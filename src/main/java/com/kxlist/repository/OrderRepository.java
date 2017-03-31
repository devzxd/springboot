package com.kxlist.repository;

import com.kxlist.bean.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zxd
 * @create 2017-03-31 16:36
 **/
@Repository
public interface OrderRepository extends MongoRepository<Order,String> {

}
