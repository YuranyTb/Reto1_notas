package Estaticas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        // 1. Declarar Matriz
        int [][] matriz1=new int [3][3];

        // 2. Rellenar datos manual por posicion
         matriz1[0][0]=30;
         matriz1[1][0]=85;
         matriz1[2][0]=32;

        // 3. Imprimir una posicion de la matriz
        System.out.println(matriz1[2][0]+"  "+matriz1[0][0]);

        //5. Rellenar matriz con datos 
        for (int f=0;f<3;f++){
        //Entre las filas
            for (int c=0;c<3;c++){
            //Entre las columnas
                System.out.println("Ingrese el valor de la posicion "+f+" "+c);
                matriz1[f][c]=leer.nextInt(); 

            }
        }

        //4. Recorrer matriz para imprimir
        for (int f=0;f<3;f++){
        //Entre las filas
            for (int c=0;c<3;c++){
            //Entre las columnas
                System.out.print(matriz1[f][c]+"\t");
            }
        System.out.println(" ");
        }

        leer.close();
    
    






    }
}
