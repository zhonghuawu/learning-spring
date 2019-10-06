package com.huaa.chapter12.db.redis;

import com.google.common.collect.Lists;
import com.huaa.chapter12.db.redis.config.RedisConfig;
import com.huaa.chapter12.db.redis.dao.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Objects;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/10/6 22:32
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RedisConfig.class)
public class RedisTemplateTest {
    @Autowired
    private StringRedisTemplate stringRedis;
    @Autowired
    private RedisTemplate<String, Product> redis;


    @Test
    public void testStoreString() {
        BoundValueOperations<String, String> boundValueOperations = stringRedis.boundValueOps("str-1");
        boundValueOperations.set("value-1");
        String value = boundValueOperations.get();
        System.out.println(value);
    }

    @Test
    public void testStoreProduct() {
        List<Product> products = Lists.newArrayList();
        int count = 5;
        for (int i = 0; i < count; i++) {
            Product product = new Product();
            product.setSku("sku-" + i);
            product.setName("name-" + i);
            product.setDesc("desc " + i);
            products.add(product);
        }
        products.stream()
                .peek(System.out::println)
                .forEach(p->redis.opsForValue().set(p.getSku(), p));
        products.stream().map(Product::getSku)
                .map(redis.opsForValue()::get)
                .forEach(System.out::println);

        BoundListOperations<String, Product> boundListOperations = redis.boundListOps("product-key");
        boundListOperations.rightPushAll(products.toArray(new Product[0]));
        System.out.println("get all");
        Objects.requireNonNull(boundListOperations.range(0, 10)).forEach(System.out::println);
    }

}
