/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario_1;
/**
 *
 * @author CAMILO MORALES
 */
import java.util.Scanner;
public class ArbolBinario_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
         ArbolTDA ArbolEjemplo = new ArbolTDA();       
         int Pivote = 0;
         int seleccion = 0;
         do {
             do {
                System.out.println("\n 🟥🟥  Laboratorio Arboles Binarios del Busqueda 🟥🟥 \n");
                System.out.println("    1. Insertar Nodo.");
                System.out.println("    2. Recorrer el arbol en Inorden");
                System.out.println("    3. Recorrer el arbol en Preorden");
                System.out.println("    4. Recorrer el arbol en Postorden");
                System.out.println("    5. Eliminar un Nodo del Arbol.");
                System.out.println("    6. Salir.");
                System.out.println("\n Por favor seleccione una opción: \n");
                System.out.println("Desarrollado por: Juan Camilo Morales Lopez.");

                seleccion = Teclado.nextInt();

                if (seleccion >= 1 && seleccion <= 8) {
                    Pivote = 1;
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println(" Funcion no disponible, vuelva a intentar porfavor.");
                    System.out.println("-------------------------------------------------");
                }
            } while (Pivote == 0);
            switch (seleccion) {
                case 1:
                    {
                        System.out.println("Ingrese el Numero del Nodo a Insertar");
                        int x = Teclado.nextInt();
                        System.out.println("El Numero Ingresado Con Exito Es: " + x);
                        ArbolEjemplo.insertar(x);
                        break;
                    }
                case 2:
                    System.out.println("La Opcion Ingresada Con Exito Es: " + seleccion + " Para Recorrido En Inorden");
                    System.out.println("\n El Recorrido Del Arbol es: ⬇ \n");
                    ArbolEjemplo.inorden();
                    break;
                case 3:
                    System.out.println("La Opcion Ingresada Con Exito Es: " + seleccion + " Para Recorrido En Preorden");
                    System.out.println("\n El Recorrido Del Arbol es: ⬇ \n");
                    ArbolEjemplo.preorden();
                    break;
                case 4:
                    System.out.println("La Opcion Ingresada Con Exito Es: " + seleccion + " Para Recorrido En Postorden");
                    System.out.println("\n El Recorrido Del Arbol es: ⬇ \n");
                    ArbolEjemplo.postorden();
                    break;
                case 5:
                    {
                        System.out.println("Ingrese el valor del Nodo a Eliminar");
                        int x = Teclado.nextInt();
                        ArbolEjemplo.eliminar(x);
                        System.out.println("El Nodo Eliminado Es: " + x);
                        break;                                 
                    }
                case 6:
                    System.out.println("--------------------------");
                    System.out.println("¡Gracias!, vuelva pronto.");
                    System.out.println("--------------------------");
                    Pivote = 2;
                    break;
                default:
                    break;              
            }
        } while (Pivote != 2);
    }   
}