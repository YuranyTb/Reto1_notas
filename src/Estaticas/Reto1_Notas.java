package Estaticas;

import java.util.Scanner;

public class Reto1_Notas {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);

        double suma=0.0, promedio=0.0;
        int n;

        System.out.println("Ingrese la cantidad de notas que desea promediar");
        n=leer.nextInt();

        double[] vector1=new double [n];

        for (int p = 0; p<vector1.length; p++){
            System.out.println("Ingrese la nota número "+p);
            vector1[p]=leer.nextDouble();
            suma=suma+(vector1[p]);
            promedio=suma/n;

        }

        
        if (promedio<=0 || promedio<=2.9){
            System.out.println("¡Reprobaste la asignatura! Tu promedio final es de "+promedio);
            
        }

        else if (promedio<=3.0 || promedio<=4.0){
            System.out.println("¡Pasaste raspando la asignatura! Tu promedio final es de "+promedio);
        }

        else if (promedio<=4.1 || promedio<=5.0){
            System.out.println("¡Aprobaste la asignatura con buenos resultados! Tu promedio final es de "+promedio);
        }

         leer.close();

        
    }
}
