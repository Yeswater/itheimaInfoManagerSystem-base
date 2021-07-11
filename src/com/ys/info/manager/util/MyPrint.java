package com.ys.info.manager.util;

/**
 * @author yes_water
 * @create 2021/7/10
 */
public class MyPrint {
    public static void table(String id, String name, String age) {
        int size = 12;
        String[] table = {id, name, age};
        for (int i = 0; i < 3; ++i) {
            System.out.print("|");
            int len = table[i].length();
            int left_space =  (size-len)%2==0 ?(size-len)/2 :(size-len)/2+1 ;
            int right_space =    (size-len)/2    ;
            for (int j = 0; j <   left_space   ; ++j) {
                System.out.print(" ");
            }
            System.out.print(table[i]);
            
            for (int j = 0; j <   right_space     ; ++j) {
                System.out.print(" ");
            }
        }
        System.out.print("|\n");
        for (int i = 0; i < 3; ++i) {
            System.out.print("+");
            for (int j = 0; j < size; ++j) {
                System.out.print("-");
            }
        }
        System.out.print("+\n");
    }
    
    public static void firstLine(){
        int size = 12;
        for (int i = 0; i < 3; ++i) {
            System.out.print("+");
            for (int j = 0; j < size; ++j) {
                System.out.print("-");
            }
        }
        System.out.print("+\n");
    }
}
