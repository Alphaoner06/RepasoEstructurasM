/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoestructurasm;

/**
 *
 * @author jorge
 */
public class RepasoEstructurasM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=7;
        char caracter='\t';
        
        num=num+1;//8
        num+=1;//9
        num++;//10
        
        /*for(int i=0;i<num;i++){
           System.out.println(i);
        }*/
        
        Persona per1, per2;
        per1=new Persona();
        per2=null;
        
        System.out.println(per1);
        System.out.println(per2);
    }
    
}
