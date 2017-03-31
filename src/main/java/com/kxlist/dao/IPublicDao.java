package com.kxlist.dao;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * @author zxd
 * @create 2017-03-31 18:04
 **/
public interface IPublicDao<T> {
     void update(Query query, Update update, Class T);
}
