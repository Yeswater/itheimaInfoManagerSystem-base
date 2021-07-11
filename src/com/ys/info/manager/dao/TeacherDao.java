package com.ys.info.manager.dao;

import com.ys.info.manager.domain.Student;
import com.ys.info.manager.domain.Teacher;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class TeacherDao extends PersonDao {
    
    //static Teacher[] tArr = new Teacher[5];     //存储老师对象
    //
    //public boolean add(Teacher Teacher) {
    //    int index = -1;     //第一个空元素的索引
    //    for (int i = 0; i < tArr.length; i++) {  //判断是否有空位置
    //        if (tArr[i] == null) {
    //            index = i;
    //            break;
    //        }
    //    }
    //    if (index == -1) {  //没空位置 返回false
    //        return false;
    //    } else {    //有空位置 添加老师 返回 true
    //        tArr[index] = Teacher;
    //        return true;
    //    }
    //}
    //
    //public void delete(String id) {
    //
    //    for (int i = 0; i < tArr.length; i++) {
    //        if (tArr[i].getId().equals(id)) {
    //            tArr[i] = null;// 将老师置为空
    //            break;
    //        }
    //    }
    //
    //}
    //
    //public void update(Teacher Teacher) {
    //
    //    for (int i = 0; i < tArr.length; i++) {
    //        if (tArr[i].getId().equals(Teacher.getId())) {
    //            tArr[i] = Teacher;
    //            break;
    //        }
    //    }
    //
    //}
    //
    //public Teacher query(String id) {
    //    Teacher Teacher = new Teacher();
    //    for (int i = 0; i < tArr.length; i++) {
    //        if (tArr[i].getId().equals(id)) {
    //            Teacher = tArr[i];
    //            break;
    //        }
    //    }
    //    return Teacher;
    //
    //}
    //
    //public boolean isExist(String id) {
    //    boolean flag = false;
    //    for (Teacher Teacher : tArr) {
    //        if (Teacher!=null && Teacher.getId().equals(id)) {
    //            flag = true;
    //            break;
    //        }
    //    }
    //    return flag;
    //}
    //
    //public Teacher[] queryAll() {
    //    return tArr;
    //}
    
    
    
}
