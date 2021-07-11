package com.ys.info.manager.controller;

import com.ys.info.manager.domain.Person;
import com.ys.info.manager.domain.Student;
import com.ys.info.manager.entry.InfoManagerEntry;
import com.ys.info.manager.service.StudentService;
import com.ys.info.manager.util.MyPrint;

import java.util.Scanner;


/**
 * @author yes_water
 * @create 2021/7/10
 */
public class PersonController {
    
    StudentService service = new StudentService();
    Scanner sc = new Scanner(System.in);
    String sys_name = "学生/老师";
    String id_name = "学号/工号";
    String identity_name = "学生/老师";
    
    public void menu() {
        for (int i = 1; true; i++) {
            if (i == 1) {
                System.out.println("--------------"+sys_name+"管理系统--------------");
                System.out.println("-  1 添加 2 删除 3 修改 4 查询 5 退出   -");
            }
            //System.out.println("---------------------------------------");
            System.out.print(sys_name +"管理系统 ： ");
            String opt = sc.nextLine();
            switch (opt) {
                case "1"://增加
                    add();
                    break;
                case "2"://删除
                    delete();
                    break;
                case "3"://更改
                    update();
                    break;
                case "4"://查询
                    query();
                    break;
                case "5"://退回 黑马管理系统
                    System.out.println("-> 退回到黑马管理系统 ");
                    InfoManagerEntry.menu();
                    break;
                default:
                    System.out.println("-> 没有 "+ opt +" 操作 ");
            }
        }
    }
    
    //增加学生/老师
    public void add() {
        String id = null;
        
        //如果学号已存在，则重新输入，学号不存在，则添加学生
        while (true) {
            System.out.print(id_name +"：");
            id = sc.nextLine();
            boolean flag = service.isExist(id);
            if (flag) {
                System.out.println("-> "+id_name+"为 " + id + " 的"+identity_name+"已存在，请重新输入 ");
            } else {
                break;
            }
        }
        System.out.print("姓名：");
        String name = sc.nextLine();
        System.out.print("年龄：");
        String age = sc.nextLine();
        
        Person person = new Person(id, name, age);
        
        if (service.add(person)) {
            System.out.println("-> 添加成功");
        } else {
            System.out.println("-> 没有空位，添加失败 ");
        }
    }
    
    //删除学生/老师
    public void delete() {
        System.out.print(id_name +"：");
        String id = sc.nextLine();
        if (service.isExist(id)) {//判断学生/老师是否存在
            service.delete(id);
            System.out.println("-> 成功删除"+id_name+"为 " + id + " 的"+identity_name+" ");
        } else {
            System.out.println("-> "+id_name+"为 " + id + " 的"+identity_name+"不存在 ");
        }
    }
    
    //更改学生/老师
    public void update() {
        System.out.print(id_name +"：");
        String id = sc.nextLine();
        System.out.print("姓名：");
        String name = sc.nextLine();
        System.out.print("年龄：");
        String age = sc.nextLine();
        Person person = new Person(id, name, age);
        service.update(person);
        
        boolean flag = service.isExist(id);
        if (flag) {
            service.update(person);
        } else {
            System.out.println("-> "+id_name+"为 " + id + " 的"+identity_name+"不存在 ");
        }
    }
    
    //查询学生/老师
    public void query() {
        System.out.print("-> 1 单个查询 2 全部查询： ");
        switch (sc.nextLine()) {
            case "1":
                System.out.print("-> 学号：");
                String id = sc.nextLine();
                if (service.isExist(id)) {
                    Person person = service.query(id);//接收service层的结果并自定义输出
                    MyPrint.firstLine();
                    MyPrint.table("ID", "name", "age");
                    MyPrint.table(person.getId(), person.getName(), person.getAge());
                } else {
                    System.out.println("-> "+id_name+"为 " + id + " 的"+identity_name+"不存在 ");
                }
                break;
            case "2":
                Person[] arr = service.queryAll();//接收service层的结果并自定义输出
                System.out.println("");
                MyPrint.firstLine();
                MyPrint.table("ID", "name", "age");
                for (Person person : arr) {
                    if (person != null) {
                        MyPrint.table(person.getId(), person.getName(), person.getAge());
                    }
                }
                break;
            default:
                System.out.println("-> 输入有误 ");
        }
        
    }
    
    
}
