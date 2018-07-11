/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Functions {
    LecturerList obj2 = new LecturerList();
    CourseList obj = new CourseList();
    
    public boolean checkLec(int idL){
        obj2.createLecturer();
        Set setNameL = obj2.lec.entrySet();    
        Iterator itrL = setNameL.iterator();
        while( itrL.hasNext() ){
            Map.Entry mapEntryL = (Map.Entry)itrL.next();
            String code2 = mapEntryL.getKey().toString();
            int id2 = Integer.parseInt(code2);
            if( id2 == idL)
                return true;
        }
        return false;
    }
    


}
