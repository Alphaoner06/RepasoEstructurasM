/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoestructurasm;

/**
 *
 * @author jorge
 */
public class GestionPersona {
    private Persona[] listPersonas;
    private int tam;

    public GestionPersona(int tam) {
        this.listPersonas = new Persona[tam];
        tam=tam;
    }
    
    public void insertar(Persona n){
        if(n!=null && tam!=0){
            for(int i=0;i<this.listPersonas.length;i++){
                if(listPersonas[i]==null){
                    listPersonas[i]=n;
                    tam-=1;
                    break;
                }
            }
        }else{
            System.out.println("Error...");
        }
    }
    
}
