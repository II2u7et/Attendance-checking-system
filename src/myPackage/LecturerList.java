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
public class LecturerList {
    private int lecturerID;
    private String lecturerName;
    CourseList cr = new CourseList();
    
    
    public LecturerList(){
        lecturerID = 0;
        lecturerName = "";

    }
    
    HashMap< Integer, String> lec = new HashMap< Integer, String>();
    HashMap< Integer, HashMap< String, String>> courseList = new HashMap< Integer, HashMap< String, String>>();
    HashMap< String, String> I = cr.courseI;
    HashMap< String, String> A = cr.courseA;
    HashMap< String, String> C = cr.courseC;
    public void createLecturer(){
        lec.put(11111, "Ian");
        lec.put(22222, "Anthony" );
        lec.put(33333, "Chalire");
    }
      
    public void createCL(){
        courseList.put(11111, I);
        courseList.put(22222, A);
        courseList.put(33333, C);
    }
}
