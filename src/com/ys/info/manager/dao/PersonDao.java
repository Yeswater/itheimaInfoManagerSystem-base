package com.ys.info.manager.dao;

import com.ys.info.manager.domain.Person;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class PersonDao {
    
    /**
     * 这里有bug，学生和老师存一个数组里面了，后续改
     */
    Person[] arr = new Person[10] ;     //存储学生对象

    public boolean add(Person person) {
        int index = -1;     //第一个空元素的索引
        for (int i = 0; i < arr.length; i++) {  //判断是否有空位置
            if (arr[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {  //没空位置 返回false
            return false;
        } else {    //有空位置 添加学生 返回 true
            arr[index] = person;
            return true;
        }
    }

    public void delete(String id) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals(id)) {
                arr[i] = null;// 将学生置为空
                break;
            }
        }

    }

    public void update(Person person) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals(person.getId())) {
                arr[i] = person;
                break;
            }
        }

    }

    public Person query(String id) {
        Person person = new Person();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals(id)) {
                person = arr[i];
                break;
            }
        }
        return person;

    }

    public boolean isExist(String id) {
        boolean flag = false;
        for (Person person : arr) {
            if (person!=null && person.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Person[] queryAll() {
        return arr;
    }


}
