package com.huaa.chapter12.db.mongo.config;

import com.huaa.chapter12.db.mongo.dao.repo.OrderRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Desc:
 *
 * @author zhonghua.wu
 * @date 2019/10/6 17:10
 */
@Configuration
@EnableMongoRepositories(basePackageClasses = OrderRepository.class)
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    public MongoClient mongoClient() {
        String url = "mongodb://192.168.0.104:27017";
        return MongoClients.create(url);
    }
}
