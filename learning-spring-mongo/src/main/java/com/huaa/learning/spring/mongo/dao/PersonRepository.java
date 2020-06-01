package com.huaa.learning.spring.mongo.dao;

import com.huaa.learning.spring.mongo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/11/23 14:23
 */
public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByName(String name);

    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);

}
