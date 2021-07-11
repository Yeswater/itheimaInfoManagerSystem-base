package com.ys.info.manager.service;

import com.ys.info.manager.dao.PersonDao;
import com.ys.info.manager.dao.StudentDao;
import com.ys.info.manager.domain.Person;
import com.ys.info.manager.domain.Student;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class PersonService {
    
    PersonDao dao = new PersonDao();
    
    public boolean add(Person person){
        return dao.add(person);
    }
    
    public void delete(String id) {
        dao.delete(id);
    }
    
    public void update(Person person) {
        dao.update(person);
    }

    
    public Person query(String id) {
        return dao.query(id);
    }
    
    public Person[] queryAll(){
        return dao.queryAll();
    }
    
    public boolean isExist(String id) {
        return dao.isExist(id);
    }
    
}
