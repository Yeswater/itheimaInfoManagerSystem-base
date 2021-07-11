package com.ys.info.manager.dao;

import com.ys.info.manager.domain.Student;
import com.ys.info.manager.util.MyPrint;

import javax.management.remote.SubjectDelegationPermission;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class StudentDao extends PersonDao {
    
    //static Student[] arr = new Student[5];     //存储学生对象
    //
    //public boolean add(Student student) {
    //    int index = -1;     //第一个空元素的索引
    //    for (int i = 0; i < arr.length; i++) {  //判断是否有空位置
    //        if (arr[i] == null) {
    //            index = i;
    //            break;
    //        }
    //    }
    //    if (index == -1) {  //没空位置 返回false
    //        return false;
    //    } else {    //有空位置 添加学生 返回 true
    //        arr[index] = student;
    //        return true;
    //    }
    //}
    //
    //public void delete(String id) {
    //
    //    for (int i = 0; i < arr.length; i++) {
    //        if (arr[i].getId().equals(id)) {
    //            arr[i] = null;// 将学生置为空
    //            break;
    //        }
    //    }
    //
    //}
    //
    //public void update(Student student) {
    //
    //    for (int i = 0; i < arr.length; i++) {
    //        if (arr[i].getId().equals(student.getId())) {
    //            arr[i] = student;
    //            break;
    //        }
    //    }
    //
    //}
    //
    //public Student query(String id) {
    //    Student student = new Student();
    //    for (int i = 0; i < arr.length; i++) {
    //        if (arr[i].getId().equals(id)) {
    //            student = arr[i];
    //            break;
    //        }
    //    }
    //    return student;
    //
    //}
    //
    //public boolean isExist(String id) {
    //    boolean flag = false;
    //    for (Student student : arr) {
    //        if (student!=null && student.getId().equals(id)) {
    //            flag = true;
    //            break;
    //        }
    //    }
    //    return flag;
    //}
    //
    //public Student[] queryAll() {
    //    return arr;
    //}
    {
        arr = new Student[5];
    }
    
    
}
