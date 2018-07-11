/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.util.HashMap;

public class StudentList {
    
    public int studentID;
    public String studentName;
    public boolean attendance;

    
    public StudentList(){
        studentID = 0;
        studentName = "";
        attendance = false;
    }
    
    HashMap< Integer, String> namePG = new HashMap< Integer, String>();
    HashMap< Integer, Boolean> attendPG = new HashMap< Integer, Boolean>();
    
    HashMap< Integer, String> namePG2 = new HashMap< Integer, String>();
    HashMap< Integer, Boolean> attendPG2 = new HashMap< Integer, Boolean>();

    HashMap< Integer, String> namePG3 = new HashMap< Integer, String>();
    HashMap< Integer, Boolean> attendPG3 = new HashMap< Integer, Boolean>();

    HashMap< Integer, String> namePG4 = new HashMap< Integer, String>();
    HashMap< Integer, Boolean> attendPG4 = new HashMap< Integer, Boolean>();

    HashMap< Integer, String> namePG5 = new HashMap< Integer, String>();
    HashMap< Integer, Boolean> attendPG5 = new HashMap< Integer, Boolean>();

    HashMap< Integer, String> namePG6 = new HashMap< Integer, String>();
    HashMap< Integer, Boolean> attendPG6 = new HashMap< Integer, Boolean>();


    public void createStudentPG(){
        namePG.put(1110, "Ngan");
        namePG.put(2808, "Sana");
        namePG.put(1810, "June" );
        

        namePG2.put(1502, "ViJay");
        namePG2.put(1512, "Dat");
        namePG2.put(1710, "Will");
        
        
        namePG3.put(2101, "Kelvin");
        namePG3.put(5002, "Tony");
        namePG3.put(6009,"Micheal");
        
        namePG4.put(2505, "Ken");
        namePG4.put(2708, "Kiran");
        namePG4.put(7001, "Danak");
        
        namePG5.put(2711, "Phuc");
        namePG5.put(2504, "Cao");
        namePG5.put(1805, "Alyssa");
        
        namePG6.put(5007, "Hiep");
        namePG6.put(1111, "Nhat");
        namePG6.put(2006, "Mathan");

        attendPG.put(1110, false);
        attendPG.put(2808, false);
        attendPG.put(1810, false);
        
        attendPG2.put(1502, false);
        attendPG2.put(1512, false);
        attendPG2.put(1710, false);

        
        attendPG3.put(2101, false);
        attendPG3.put(5002, false);
        attendPG3.put(6009, false);
        
        attendPG4.put(2505, false);
        attendPG4.put(2708, false);
        attendPG4.put(7001, false);
        
        attendPG5.put(2711, false);
        attendPG5.put(2504, false);
        attendPG5.put(1805, false);
        
        attendPG6.put(5007, false);
        attendPG6.put(1111, false);
        attendPG6.put(2006, false);
        
    }
    
}


