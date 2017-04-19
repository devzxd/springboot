package com.zxd.bean;

import com.alibaba.fastjson.JSON;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * 订单
 *
 * @author zxd
 * @create 2017-03-31 16:34
 **/
@Document
public class Order {
    @Id
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
