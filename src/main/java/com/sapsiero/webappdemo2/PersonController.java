package com.sapsiero.webappdemo2;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tim
 * Date: 4/27/12
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
@Named
@RequestScoped
public class PersonController {

    @Inject
    PersonEntity personEntity;

    @Inject
    PersonBean personBean;

    public List<PersonEntity> getListAll() {
        return personBean.list();
    }

    public String save() {
        personBean.save(personEntity);
        return "index";
    }

    public String edit(long personId) {
        personEntity = personBean.load(personId);
        return "edit";
    }

    public String delete(long personId) {
        personBean.delete(personId);
        return "index";
    }

    public PersonEntity getPersonEntity() {
        return personEntity;
    }

    public void setPersonEntity(PersonEntity personEntity) {
        this.personEntity = personEntity;
    }
}
