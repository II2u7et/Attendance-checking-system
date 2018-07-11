/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.util.HashMap;

/**
 *
 * @author Will Pham
 */
public class CourseList {
    private String courseID;
    private String coureseName;
    StudentList stu = new StudentList();
    
    public CourseList(){
        courseID = "";
        coureseName = "";
    }
    
    HashMap< String, String> courseI = new HashMap< String, String>();
    HashMap< String, String> courseA = new HashMap< String, String>();
    HashMap< String, String> courseC = new HashMap< String, String>();
    HashMap< String, HashMap< Integer, Boolean>> stuList = new HashMap< String, HashMap< Integer, Boolean>>();
    HashMap< Integer, Boolean> PG = stu.attendPG;
    HashMap< Integer, Boolean> PG2 = stu.attendPG2;
    HashMap< Integer, Boolean> PG3 = stu.attendPG3;
    HashMap< Integer, Boolean> PG4 = stu.attendPG4;
    HashMap< Integer, Boolean> PG5 = stu.attendPG5;
    HashMap< Integer, Boolean> PG6 = stu.attendPG6;

        public void createI(){
        courseI.put("IT111","Electronic");
        courseI.put("IT222","Software Testing");              
    }
    
    public void createA(){
        courseA.put("IT333", "Math");
        courseA.put("IT444", "C++");
    }
    
    public void createC(){
        courseC.put("IT555", "Software Development");
        courseC.put("IT666", "Java");
    }
    
    public void createStuList(){
        stuList.put("IT111", PG);
        stuList.put("IT222", PG2);
        stuList.put("IT333", PG3);
        stuList.put("IT444", PG4);
        stuList.put("IT555", PG5);
        stuList.put("IT666", PG6);
    }
}
