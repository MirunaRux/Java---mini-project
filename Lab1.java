/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import test.TestClass;
/**
 *
 * @author Student
 */
public class Lab1 {
    private int numar;
    private String nume;
    private Lab1 Object;
    private int [] vector;
    
    private void functie(int a, int [] b){
        a = 100;
        b[2] = 200;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lab1 ob = new Lab1();
       ob.numar = 5;
       ob.Object = ob;
       ob.vector = new int [] {1, 2, 3, 4, 5};
       System.out.println(ob.numar);
       System.out.println(ob.vector[2]);
       ob.functie(ob.numar, ob.vector);
       System.out.println(ob.numar);
       System.out.println(ob.vector[2]);
       TestClass ob2 = new TestClass();
    }
    
}
