package com.huaa.chapter12.db.mongo.dao.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Desc:
 *
 * @author zhonghua.wu
 * @date 2019/10/6 17:48
 */
@Data
@Document
public class Order {
    @Id
    private String id;

    @Field("client")
    private String customer;

    private String type;
    private Collection<Item> items = new LinkedHashSet<>();


}
