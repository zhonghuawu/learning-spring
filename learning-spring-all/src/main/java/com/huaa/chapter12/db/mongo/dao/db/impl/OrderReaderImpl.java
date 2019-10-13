package com.huaa.chapter12.db.mongo.dao.db.impl;

import com.huaa.chapter12.db.mongo.dao.db.OrderReader;
import com.huaa.chapter12.db.mongo.dao.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Objects;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/6 20:50
 */
public class OrderReaderImpl implements OrderReader {

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public List<Order> findByType(String t) {
        String type = Objects.requireNonNull(t).equals("NET") ? "WEB" : t;
        Criteria where = Criteria.where("type").is(type);
        Query query = Query.query(where);
        return mongoOperations.find(query, Order.class);
    }

}
