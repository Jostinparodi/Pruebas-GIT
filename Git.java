package git;


import java.util.*;

public class Git{


    public static void main(String[] args) {
        String Prueba;
        Scanner scnLeer = new Scanner(System.in);

        System.out.println("Esta es una prueba de git");

        Prueba = scnLeer.nextLine();
        System.out.println(Prueba);
        
        for(int i=0;i<3;i++){
            System.out.println("Me repito " + i + " veces");
        }
    }

}