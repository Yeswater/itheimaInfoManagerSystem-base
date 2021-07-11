package com.ys.info.manager.controller;

import com.ys.info.manager.domain.Student;
import com.ys.info.manager.entry.InfoManagerEntry;
import com.ys.info.manager.service.StudentService;
import com.ys.info.manager.util.MyPrint;
import java.util.Scanner;


/**
 * @author yes_water
 * @create 2021/7/10
 */
public class StudentController extends PersonController {
    
    public void menu() {
        super.sys_name = "学生";
        super.id_name = "学号";
        super.identity_name = "学生";
        super.menu();
    }

    //增加学生
    public void add() {
        super.add();
    }

    //删除学生
    public void delete() {
        super.delete();
    }

    //更改学生
    public void update() {
        super.update();
    }

    //查询学生
    public void query() {
        super.query();
    }
    
    
}
