package com.sapsiero.webappdemo2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertFalse;

/**
 * Created with IntelliJ IDEA.
 * User: tim
 * Date: 4/27/12
 * Time: 2:23 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class PersonEntity {

    long id;

    String name;

    String firstName;

    int age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
