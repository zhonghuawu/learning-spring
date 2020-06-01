package com.huaa.learning.spring.mongo.web;

import com.huaa.learning.spring.mongo.dao.PersonRepository;
import com.huaa.learning.spring.mongo.domain.Location;
import com.huaa.learning.spring.mongo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Desc:
 *
 * @author wu_zh
 * @date 2019/11/23 14:25
 */
@RestController
public class DataController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Person save() {
        Person p = new Person("wzh", 22);
        Collection<Location> locations = new LinkedHashSet<Location>() {
            {
                add(new Location("bengbu", "2008"));
                add(new Location("hefei", "2011"));
                add(new Location("nanjing", "2015"));
                add(new Location("shanghai", "2018"));
            }
        };

        p.setLocations(locations);
        return personRepository.save(p);
    }

    @RequestMapping(value = "/q1", method = RequestMethod.GET)
    public Person q1(String name) {
        return personRepository.findByName(name);
    }

    @RequestMapping(value = "/q2", method = RequestMethod.GET)
    public List<Person> q2(Integer age) {
        return personRepository.withQueryFindByAge(age);
    }

}
