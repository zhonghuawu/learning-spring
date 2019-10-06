package com.huaa.chapter12.db.mongo.dao.db;

import com.huaa.chapter12.db.mongo.dao.pojo.Order;

import java.util.List;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/6 20:48
 */
public interface OrderReader {
    /**
     * find orders by specific type
     *
     * @param t
     * @return
     */
    List<Order> findByType(String t);
}
