/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Will Pham
 */
public class Printing {
    StudentList obj = new StudentList();
    CourseList obj2 = new CourseList();
    LecturerList obj3 = new LecturerList();
    Scanner in = new Scanner(System.in);
    Boolean match = false;
    String course = "";
    String keyValue = "";
    
    public void checkOpt(){
        System.out.println("\n[1] - Update attendance of individual student.");
        System.out.println("[2] - List all info.");
        System.out.println("[3] - View a student.");
        System.out.println("[4] - Check attendance.");
        System.out.println("[0] - Exit");
        System.out.println("Enter your choice: ");
    }
    
    public String courseI(){
        obj2.createI();
        Set setNameI = obj2.courseI.entrySet();
        Iterator itrI = setNameI.iterator();
        Set setNameI2 = obj2.courseI.entrySet();
        Iterator itrI2 = setNameI2.iterator();
        System.out.println("Courses list");
        
        while( itrI.hasNext() ){
            Map.Entry mapEntryI = (Map.Entry)itrI.next();
            System.out.println("\nCourse ID: " + mapEntryI.getKey() 
                                + " Name: " + mapEntryI.getValue() );
        }
        System.out.println("Enter the Course ID you want to check");
        course = in.next();
        
        while( match == false){
            while( itrI2.hasNext() ) {
                Map.Entry mapEntryI2 = (Map.Entry)itrI2.next();
                keyValue = mapEntryI2.getKey().toString();
                if( course.equals(keyValue) ){
                    break;
                }
            }
            if( course.equals(keyValue) ){
                    match = true;
            }    
            else{
                System.out.println("Re-enter Course ID: ");
                course = in.next();  
            }
        }
        return course;
    }  
    
    public String courseA(){
        obj2.createA();
        Set setNameA = obj2.courseA.entrySet();
        Iterator itrA = setNameA.iterator();
        Set setNameA2 = obj2.courseA.entrySet();
        Iterator itrA2 = setNameA.iterator();
        System.out.println("Courses list");
        
        while( itrA.hasNext() ){
            Map.Entry mapEntryA = (Map.Entry)itrA.next();
            System.out.println("\nCourse ID: " + mapEntryA.getKey() 
                                + " Name: " + mapEntryA.getValue() );
        }
        System.out.println("\nEnter the Course ID you want to check");
        course = in.next();
        
        while( match == false){
            while( itrA2.hasNext() ) {
                Map.Entry mapEntryA2 = (Map.Entry)itrA2.next();
                keyValue = mapEntryA2.getKey().toString();
                if( course.equals(keyValue) ){
                    break;
                }
            }
            if( course.equals(keyValue) ){
                    match = true;
            }    
            else{
                System.out.println("Re-enter Course ID: ");
                course = in.next();  
            }
        }
        
        return course;
    }
    
    public String courseC(){
        obj2.createC();
        Set setNameC = obj2.courseC.entrySet();
        Iterator itrC = setNameC.iterator();
        Set setNameC2 = obj2.courseC.entrySet();
        Iterator itrC2 = setNameC2.iterator();
        System.out.println("Courses list");
        
        while( itrC.hasNext() ){
            Map.Entry mapEntryC = (Map.Entry)itrC.next();
            System.out.println("\nCourse ID: " + mapEntryC.getKey() 
                                + " Name: " + mapEntryC.getValue() );
        }
        System.out.println("Enter the Course ID you want to check");
        course = in.next();
        
        while( match == false){
            while( itrC2.hasNext() ) {
                Map.Entry mapEntryC2 = (Map.Entry)itrC2.next();
                keyValue = mapEntryC2.getKey().toString();
                if( course.equals(keyValue) ){
                    break;
                }
            }
            if( course.equals(keyValue) ){
                    match = true;
            }    
            else{
                System.out.println("Re-enter Course ID: ");
                course = in.next();  
            }
        }
        return course;
    }
    
    public void startScreen(){
        System.out.println("\n------STUDENT ATTENDENT CHECKER------");
        System.out.println("Welcome lecturer");
        System.out.print("Enter your ID to load your course");
        System.out.println("or enter 0 to exit.");
        System.out.print("Your ID: ");
    }
}
