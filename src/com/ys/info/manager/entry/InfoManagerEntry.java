package com.ys.info.manager.entry;

import com.ys.info.manager.controller.StudentController;
import com.ys.info.manager.controller.TeacherController;

import java.util.Scanner;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class InfoManagerEntry {
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        for (int i= 1;true;i++){
            if (i == 1) {
                System.out.println("----------------管理系统----------------");
                System.out.println("- 1 -> 学生管理 2 -> 老师管理 3 -> 退出 -");
            }
            System.out.print("黑马管理系统: ");
            String opt = sc.nextLine();
            switch (opt) {
                case "1":
                    StudentController controller = new StudentController();
                    controller.menu();
                    break;
                case "2":
                    TeacherController controller1 = new TeacherController();
                    controller1.menu();
                    break;
                case "3":
                    System.out.println("-> 再见");
                    exit();
                    
            }
        }
    }
    
    private static void exit() {
        System.exit(0);
    }
}
