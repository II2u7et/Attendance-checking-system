/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Will Pham
 */
public class Checking { 
    public static void main( String[] avgr){
        Scanner in = new Scanner(System.in);
        StudentList obj = new StudentList();
        CourseList obj2 = new CourseList();
        LecturerList obj3 = new LecturerList();
        Printing prt = new Printing();
        Functions fun = new Functions();
        obj3.createLecturer();
        obj.createStudentPG();
        
        obj2.createStuList();
        
        String outKey = "";
        int inKey;
        
        
        HashMap< String, HashMap< Integer, Boolean>> outM = obj2.stuList;
        HashMap< Integer, Boolean> inM2 = outM.get(outKey);
        HashMap< Integer, String> inM = new HashMap< Integer, String>();
        
        prt.startScreen();
        int input = in.nextInt();
        while( input != 0 ){
            
            while( fun.checkLec(input)== false){
                System.out.println("Enter ID again:");
                input = in.nextInt();
            }
                String code = obj3.lec.get(input);
                System.out.println("Hello " + code);

            if( input == 11111)
                outKey = prt.courseI();
            else if(input == 22222)
                outKey = prt.courseA();
            else
                outKey = prt.courseC();
            
            if( outKey.equals("IT111")){
                inM2 = obj.attendPG;
                inM = obj.namePG;
            }
            else if( outKey.equals("IT222")){
                inM2 = obj.attendPG2;
                inM = obj.namePG2;
            }
            else if( outKey.equals("IT333")){
                inM2 = obj.attendPG3;
                inM = obj.namePG3;
            }
            else if( outKey.equals("IT444")){
                inM2 = obj.attendPG4;
                inM = obj.namePG4;
            }
            else if( outKey.equals("IT555")){
                inM2 = obj.attendPG5;
                inM = obj.namePG5;
            }
            else {
                inM2 = obj.attendPG6;
                inM = obj.namePG6;
            }
            
            System.out.println("\nAttendence checking of " + outKey);
            prt.checkOpt();
            int choice = in.nextInt();
            while( choice != 0 ){
                switch(choice){
                    case 1:
                        System.out.println("Enter student ID you want to update attendance");    
                        int id3 = in.nextInt();
                        System.out.println("Attend? [ Y/ N]");
                        char input2 = in.next().charAt(0);
                        
                        if( (input2 == 'y') || (input2 == 'Y'))
                            inM2.replace(id3, true);
                        else
                            inM2.replace(id3, false);
                        break;    

                    case 2:
                        Set setName = inM.entrySet();
                        Set setAttend = inM2.entrySet();
                        Iterator itr = setName.iterator();
                        Iterator itr2 = setAttend.iterator();
                        while( (itr.hasNext()) && (itr2.hasNext()) ){
                            Map.Entry mapEntry = (Map.Entry)itr.next();
                            Map.Entry mapEntry2 = (Map.Entry)itr2.next();
                            System.out.println("\nName: " + mapEntry.getValue() 
                                                + " ID: " + mapEntry.getKey() 
                                                + " Attendance: " + mapEntry2.getValue());
                        }
                        break;       

                    case 3:
                        System.out.println("Enter student ID  you want to search: ");
                        int id = in.nextInt();
                        String value = obj.namePG.get(id);
                        boolean attended = inM2.get(id);
                        System.out.println("ID: " + id + " Name: " + value 
                                            + " Attendence: " + attended);
                        break;

                    case 4:
                        Set setName1 = inM.entrySet();
                        Set setAttend1 = inM2.entrySet();
                        Iterator itr3 = setName1.iterator();
                        Iterator itr4 = setAttend1.iterator();

                        while( (itr3.hasNext()) && (itr4.hasNext()) ){
                            Map.Entry mapEntry3 = (Map.Entry)itr3.next();
                            Map.Entry mapEntry4 = (Map.Entry)itr4.next();
                            System.out.println("\nName: " + mapEntry3.getValue() 
                                                + " ID: " + mapEntry4.getKey());

                            String code3 = mapEntry3.getKey().toString();
                            int id4 = Integer.parseInt(code3);
                            System.out.println("Attend? [Y/N]");
                            char input3 = in.next().charAt(0);

                            if( (input3 == 'y') || (input3 == 'Y'))
                                obj.attendPG.replace( id4, true);
                            else
                                obj.attendPG.replace(id4, false);
                        }
                        break;
                        
                    default:
                            System.out.println("Wrong choice");
                }
                prt.checkOpt();
                choice = in.nextInt();
                if(choice == 0)
                    break;
            }
            prt.startScreen();
            input = in.nextInt();
        }
        
    }
}

