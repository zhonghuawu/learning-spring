package com.huaa.chapter12.db.mongo.dao.repo;

import com.huaa.chapter12.db.mongo.dao.db.OrderReader;
import com.huaa.chapter12.db.mongo.dao.db.OrderWriter;
import com.huaa.chapter12.db.mongo.dao.pojo.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Desc:
 *
 * @author zhonghua.wu
 * @date 2019/10/6 17:59
 */
public interface OrderRepository extends MongoRepository<Order, String>,
        OrderReader, OrderWriter {

    /**
     * find by customer
     *
     * @param c
     * @return
     */
    List<Order> findByCustomer(String c);

}
