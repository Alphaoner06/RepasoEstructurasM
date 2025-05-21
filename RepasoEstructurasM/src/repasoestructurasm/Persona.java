/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoestructurasm;

/**
 *
 * @author jorge
 */
public class Persona {
    private String nom,ape;
    private int edad;

    public Persona() {
    }

    public Persona(String nom, String ape, int edad) {
        this.nom = nom;
        this.ape = ape;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom==null&&nom.length()>0){
                this.nom = nom;
        }
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", ape=" + ape + ", edad=" + edad + '}';
    }
}
