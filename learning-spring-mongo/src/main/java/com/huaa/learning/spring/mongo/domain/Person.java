package com.huaa.learning.spring.mongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/11/23 14:18
 */
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    private String id;

    private String name;
    private Integer age;

    @Field("locs")
    private Collection<Location> locations = new LinkedHashSet<>();

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

}
