package ud03;

import java.util.Scanner;

public class Gastos{
    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);
      int opcion;
      double importe;
      double suma = 0;
      double contador = 0;

      

      do{
        System.out.println("----------Menú----------");
        System.out.println("1 - Añadir gasto");
        System.out.println("2 - Ver total");
        System.out.println("3 - Ver número de gastos");
        System.out.println("0 - FIN");
        System.out.println("Opción: ");
        System.out.println("------------------------");

        System.out.print("Introducir una opción: ");

        opcion = scanner.nextInt();
       
        switch(opcion){
            
            case 1:
                System.out.print("Añadir gastos: ");
                importe = scanner.nextDouble();

                if(importe <= 0){
                    System.out.println("El importe debe ser mayor que cero.");
                }else{
                    suma += importe;
                    contador ++;
                }
                break;

            case 2:
                System.out.printf("Total: %.2f%n" , suma);
                break;
                

            case 3:
                System.out.println("Gastos resgistrados: " + contador);               
                break;

            case 0:
                System.out.println("Programa terminado");
                break;

            default:
                System.out.println("Opción no válida.");
                break;                
        } 
         
      }while (opcion != 0);
        scanner.close();
    }

}
