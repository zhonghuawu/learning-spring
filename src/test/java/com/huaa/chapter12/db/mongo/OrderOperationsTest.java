package com.huaa.chapter12.db.mongo;

import com.google.common.collect.Lists;
import com.huaa.chapter12.db.mongo.config.MongoConfig;
import com.huaa.chapter12.db.mongo.dao.repo.OrderRepository;
import com.huaa.chapter12.db.mongo.dao.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/6 20:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MongoConfig.class)
public class OrderOperationsTest {

    @Autowired
    private OrderRepository repository;

    @Test
    public void notNullAddFindAll() {
        Assert.notNull(repository, "repo is null");
//        repository.findAll().forEach(System.out::println);
    }

    @Test
    public void findByType() {
        List<Order> orders = repository.findByType("WEB");
        Assert.notEmpty(orders);
        orders.forEach(System.out::println);
    }

    @Test
    public void findByCustomer() {
        List<Order> orders = repository.findByCustomer("customer-0");
        Assert.notEmpty(orders);
        orders.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        final int count=5;
        List<Order> orders = Lists.newArrayList();
        for(int i=0; i<count; i++) {
        Order order = new Order();
            order.setId(String.valueOf(i));
            order.setCustomer("customer-" + i);
            order.setType(i%2==0?"WEB":"NET");
            order.setItems(Lists.newArrayList());
            orders.add(order);
        }
//        repository.saveAll(orders);
    }

}
