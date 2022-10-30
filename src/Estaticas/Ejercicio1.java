package Estaticas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        

        //1.Declarar array
        int [] vector1=new int [10];
        //Llenar vector manualmente
        // vector1[0]=30;
        // vector1[1]=50;
        // vector1[2]=25;
        // vector1[3]=85;
        // vector1[4]=12;
        // vector1[5]=6;
        // vector1[6]=32;
        // vector1[7]=41;
        // vector1[8]=23;
        // vector1[9]=63;

        
        /*3 Imprimir array con for normal
        for (int p=0;p<vector1.length;p++){
            System.out.println(vector1[p]);
        }

        System.out.println(vector1[5]+vector1[3]);*/

        //5. Ciclo para rellenar el array

        for(int dato:vector1){
            System.out.println(dato);
        
        }

        //4. Imprimir array con for mejorado


        System.out.println("Ingrese el valor de la posición "+p);
        vector1[p]=leer.nextInt();

 



    }
}
