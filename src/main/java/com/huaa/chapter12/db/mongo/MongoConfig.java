package com.huaa.chapter12.db.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClientFactory;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Desc:
 *
 * @author zhonghua.wu
 * @date 2019/10/6 17:10
 */
@Configuration
@EnableMongoRepositories(basePackages = "orders.db")
public class MongoConfig extends AbstractMongoClientConfiguration {
    /**
     *  todo unknown basePackages meas?
     */

    @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    public MongoClient mongoClient() {
        String url = "mongodb://10.27.20.177:27017,10.27.20.178:27017";
        return MongoClients.create(url);
    }
}
