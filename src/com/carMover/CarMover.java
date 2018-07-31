/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carMover;

import com.cochecillo.Coche;
import com.cochecillo.Types.Deportivo;
import com.cochecillo.Types.Familiar;
import com.cochecillo.Types.Todoterreno;
import java.util.Scanner;

/**
 *
 * @author cibarba
 */
public class CarMover {
    //La distancia son 100 kilometros
    public static int distancia = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner scan = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        Coche cocheA = new Coche();
        Coche cocheB = new Coche();
        
        
        //Programa principal
        System.out.println("********Bienvenido********** \n");
        //************** Primer coche ***************
        System.out.println("Dime cual es tu coche");
        String scanCoche = scan.nextLine();
        int opcion = menu();
        menuSeleccion(cocheA , opcion);
        System.out.println("Dime cual es su velocidad");
        int scanVelocidad = scan.nextInt();
        cocheA = new Coche(scanCoche, /*scanTipo,*/ scanVelocidad);
        System.out.println("El coche " + cocheA.getMarca() + /*" de tipo " + cocheA.getTipo() +*/ " tiene una velocidad de " + cocheA.getVelocidad());
        double tiempoCoche = tiempo(cocheA);
        System.out.println("El tiempo en recorrer los 100km es de: " + tiempoCoche + " minutos");
        
        //************** Segundo coche ***************
        System.out.println("Dime cual es tu coche");
        String scanCoche2 = scann.nextLine();
        //System.out.println("Dime cual es el tipo");
        //String scanTipo2 = scann.nextLine();
        int opcion2 = menu();
        menuSeleccion(cocheB , opcion2);
        System.out.println("Dime cual es su velocidad");
        int scanVelocidad2 = scann.nextInt();
        cocheB = new Coche(scanCoche2, scanVelocidad2);
        System.out.println("El coche " + cocheB.getMarca() + /*" de tipo " + cocheB.getTipo() +*/ " tiene una velocidad de " + cocheB.getVelocidad());
        double tiempoCoche2 = tiempo(cocheB);
        System.out.println("El tiempo en recorrer los 100km es de: " + tiempoCoche2 + " minutos");
        
        Coche cocheWin = comparar(cocheA , cocheB);
        System.out.println("El coche mas rapido es " + cocheWin.getMarca());
    }
    //Calculo de tiempo en funcion de la distancia recorrida y velocidad del coche registrada
    
    /*public Coche primerCoche(Coche cocheA){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime cual es tu coche");
        String scanCoche = scan.nextLine();
        System.out.println("Dime cual es el tipo");
        String scanTipo = scan.nextLine();
        System.out.println("Dime cual es su velocidad");
        int scanVelocidad = scan.nextInt();
        cocheA = new Coche(scanCoche, scanTipo, scanVelocidad);
        System.out.println("El coche " + cocheA.getMarca() + " de tipo " + cocheA.getTipo() + " tiene una velocidad de " + cocheA.getVelocidad());
        double tiempoCoche = tiempo(cocheA);
        System.out.println("El tiempo en recorrer los 100km es de: " + tiempoCoche);
        
        return cocheA;
    }
    
    public Coche segundoCoche(Coche cocheB){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime cual es tu coche");
        String scanCoche = scan.nextLine();
        System.out.println("Dime cual es el tipo");
        String scanTipo = scan.nextLine();
        System.out.println("Dime cual es su velocidad");
        int scanVelocidad = scan.nextInt();
        cocheB = new Coche(scanCoche, scanTipo, scanVelocidad);
        System.out.println("El coche " + cocheB.getMarca() + " de tipo " + cocheB.getTipo() + " tiene una velocidad de " + cocheB.getVelocidad());
        double tiempoCoche = tiempo(cocheB);
        System.out.println("El tiempo en recorrer los 100km es de: " + tiempoCoche);
        return cocheB;
    }*/
    
    public static double tiempo(Coche coche){
        //Medicion de km/h
        double tiempo = ((double) distancia / coche.getVelocidad()) * 60;
        return tiempo;
    }
    
    //Compara la velocidad de un coche con otro
    public static Coche comparar(Coche cocheA, Coche cocheB){
        double tiempoA = tiempo(cocheA);
        double tiempoB = tiempo(cocheB);
        if (tiempoA < tiempoB) {
            //System.out.println("El mas rapido es " + cocheA.getMarca());
            return cocheA;
        }
        else{
            return cocheB;
        }
        
    }
    
    public static int menu(){
        Scanner scanCoche = new Scanner(System.in);
        System.out.println("Elige que tipo de coche es tu coche");
        System.out.println("1. Deportivo");
        System.out.println("2. Familiar");
        System.out.println("3. Todoterreno");
        int tipoCoche = scanCoche.nextInt();
        return tipoCoche;
    }
    
    public static void menuSeleccion (Coche coche ,int tipoCoche){
        Scanner scanTipo = new Scanner(System.in);
        switch(tipoCoche){
            case 1:
                //Coche deportivo se compone adicionalmente de
                // Si es roadster o no,
                //Que motor tiene, 8 cilindros, 4 o 6,
                //Si tiene puertas alas o no
                coche = new Deportivo();
                System.out.println("Es roadster? 1 para si, 2 para no");
                int roadster = scanTipo.nextInt();
                boolean isRoadster = false;
                if (roadster == 1) {
                    isRoadster = true;
                }
                
            break;
            
            case 2:
                coche = new Familiar();
            break;
            
            case 3:
                coche = new Todoterreno();
            break;
            
            default:
                System.out.println("Elige otra opcion");
                coche = new Coche();
            break;
        }
        
    }
    
    
    
}
