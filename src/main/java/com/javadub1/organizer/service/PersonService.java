package com.javadub1.organizer.service;

import com.javadub1.organizer.database.EntityDao;
import com.javadub1.organizer.model.Person;

import java.util.List;

public class PersonService {

    private EntityDao entityDao;

    public PersonService() {
        entityDao = new EntityDao();
    }

    public List<Person> getAllPersons() {
        return entityDao.list(Person.class);
    }

    public void add(Person person) {
        entityDao.saveOrUpdate(person);
    }

    public void delete(Long orderId) {

        Person person = entityDao.getById(Person.class, orderId);
        entityDao.delete(person);
    }

}
