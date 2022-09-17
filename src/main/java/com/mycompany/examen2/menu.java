
package com.mycompany.examen2;

import java.util.Scanner;


public class menu {
    
    private static final Scanner scanner= new Scanner(System.in);
    private static int opcion = -1;
  
   
   
    
    
    public static void main(String[] args){
               //Mientras la opcion elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- mostrar todo"
                        + "\n2.- Agregar vendedor\n"
                        + "3.- actualizar ventas\n"
                        + "4.- consulta por NIV\n"
                        + "5.- lista de totales\n"
                        + "6.- eliminar\n"
                        + "7.- actualizar nombre\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        principal.ej1();
                        break;
                    case 2:
                        //2. agregar informacion archivo
                        System.out.println("ingresa el nombre del vendedor:");
                        String nombre = scanner.nextLine();
                       principal.ej2(nombre);
                        break;
                    case 3:
                        System.out.println("ingresa el NIV para actualizar el nombre:");
                        int idd = Integer.parseInt(scanner.nextLine());
                      if(idd !=0)
                          {
                          System.out.println("ingresa las ventas del mes de enero");
                        int m1 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de febrero");
                        int m2 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de marzo");
                         int m3 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de abril");
                         int m4 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de mayo");
                         int m5 = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingresa las ventas del mes de junio");
                         int m6 = Integer.parseInt(scanner.nextLine());
                         principal.notas(idd,m1,m2,m3,m4,m5,m6);
                          }
                        break;
                    case 4:
                        System.out.println("ingresa el NIV del vendedor");
                        int id = Integer.parseInt(scanner.nextLine());
                       principal.niv(id);
                        break;
                        case 5:
                            principal.nomb();
                    principal.totales();
                        break;
                        
                         case 6:
                    System.out.println("ingresa el NIV para borrar:");
                        int in = Integer.parseInt(scanner.nextLine());
                       principal.eliminar(in);
                        System.out.println("precione 1 para borrar y 2 para cancelar");
                       int op = Integer.parseInt(scanner.nextLine());
                       if (op != 1)
                       { 
                          
                       
                        System.out.println("se borro el NIV ingresado");
                       }
                       
                        break;
                        case 7:
                    System.out.println("ingresa el NIV para actualizar el nombre:");
                        int inh = Integer.parseInt(scanner.nextLine());
                         System.out.println("ingrese el nuevo nombre");
                         String opp = scanner.nextLine();
                       principal.elimin(inh,opp);
                       
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }

    }
    
}
