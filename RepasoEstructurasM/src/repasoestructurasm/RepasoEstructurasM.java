/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoestructurasm;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class RepasoEstructurasM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables iniciales
        int num = 7;
        char caracter = '\t';

        num = num + 1; // 8
        num += 1;      // 9
        num++;         // 10

        // Persona de prueba
        Persona per1, per2;
        per1 = new Persona();
        per2 = null;

        System.out.println(per1);
        System.out.println(per2);

        // ------------------- MENÚ CON GESTIÓN DE PERSONAS ---------------------
        GestionPersona gp = new GestionPersona(10);
        boolean continuar = true;

        while (continuar) {
            String menu = "1. Agregar persona\n"
                        + "2. Mostrar personas\n"
                        + "3. Eliminar persona\n"
                        + "4. Salir\n"
                        + "Seleccione una opción:";
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
                    String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
                    Persona nueva = new Persona(nombre, apellido, edad);
                    gp.insertar(nueva);
                    break;

                case 2:
                    gp.mostrar();
                    break;

                case 3:
                    int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice de la persona a eliminar:"));
                    gp.eliminar(indice);
                    break;

                case 4:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}

