/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodinvoking;

import java.lang.reflect.Method;

/**
 *
 * @author aedemirsen
 */
public class MethodInvoker {   
    
    public static void main(String[] args) {
        
        String catName = "Kedi";
        String className = "methodinvoking.Cat"; //with package name
        
        try {
            Class c = Class.forName(className);
            Object o = c.newInstance(); //Create a new instance of class
            
            Method method;
            //setName
            method = c.getMethod("setName",String.class);
            method.invoke(o, catName); //called setName method
            //printName
            method = c.getMethod("printName");
            method.invoke(o); //called printName method
            
        } catch (Exception e) {}
    }
}

class Cat{
    
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    
    public void printName(){
        System.out.println(this.name);
    }
}
