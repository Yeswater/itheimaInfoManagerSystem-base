package com.ys.info.manager.controller;

import com.ys.info.manager.domain.Teacher;
import com.ys.info.manager.entry.InfoManagerEntry;
import com.ys.info.manager.service.TeacherService;
import com.ys.info.manager.util.MyPrint;

import java.util.Scanner;


/**
 * @author yes_water
 * @create 2021/7/10
 */
public class TeacherController extends PersonController {
    
    public void menu() {
        super.sys_name = "老师";
        super.id_name = "工号";
        super.identity_name = "老师";
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
