/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanformjava2.Function;

import java.util.Date;
import latihanformjava2.Model.ModelProgram;

/**
 *
 * @author user
 */
public class ProgramLogic extends ModelProgram{
    ModelProgram mp = new ModelProgram();
    
    public String result(String name, String born_date, String mental, String gender){
        
        String noun = mp.returnGenderNoun(gender);
        String mental_status = mp.returnMental(mental);
        
        return "The name is " + name + " \nwas born at " + born_date + ".\n" + noun + " is currently " + mental_status;
    }
    
    public String result(String name){
        return "The name is " + name + ".";
    }
    
    public String result(String name, String mental){
        String mental_status = mp.returnMental(mental);
        
        return "The name is " + name + " \nis currently " + mental_status + ".";
    }
}
