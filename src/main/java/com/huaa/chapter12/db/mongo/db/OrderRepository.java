package com.huaa.chapter12.db.mongo.db;

import com.huaa.chapter12.db.mongo.dao.pojo.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Desc:
 *
 * @author zhonghua.wu
 * @date 2019/10/6 17:59
 */
public interface OrderRepository extends MongoRepository<Order, String> {

}
