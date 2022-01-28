/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_juanmolina_11621058;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hwan
 */
public class Lab2P2_JuanMolina_11621058 {

    public static ArrayList <Animales> registroAnimales = new ArrayList<>();
    
    public static Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) {
        registroAnimales.add(new Animales("panthera leo","Leon","sabana","carnivoro","melena de pelo en los machos","Africa",100));
        registroAnimales.add(new Animales("ara macao","guacamaya","bosque tropical","semillas","plumaje rojo,verde,azul","America Central",50));
        registroAnimales.add(new Animales("delphinidae","delfin","oceano","carnivoros","mamiferos acuaticos","Caribe",100));
        do{
            opciones( menu() );
        }while(true);
    }
    
    public static int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1. Agregar Animal\n" +
                            "2. Editar Animal\n" +
                            "3. Imprimir Animal\n" +
                            "4. Alimentacion\n" +
                            "5. Eliminar Animal\n" +
                            "Ingrese la opcion: ");
        return sc.nextInt();
    }
    
    public static void opciones(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1)
            agregarAnimal();
        else if(opcion == 2)
            editarAnimal();
        else if(opcion == 3)
            imprimirAnimal();
        else if(opcion == 4)
            alimentacion();
        else if(opcion == 5)
            eliminarAnimal();
    }
    
    public static void agregarAnimal(){
        System.out.print("Nombre Cientifico: ");
        String nombreCientifico = sc.nextLine();
        nombreCientifico = sc.nextLine();
        while(registroAnimales.contains(nombreCientifico)){
            System.out.print("Ese animal ya esta registrado!");                    
            System.out.print("Nombre Cientifico: ");
            nombreCientifico = sc.nextLine();
        }
        System.out.print("Nombre Comun: ");
        String nombreComun = sc.next();
        System.out.print("Habitat: ");
        String habitat = sc.next();
        System.out.print("Alimentacion: ");
        String alimentacion = sc.next();
        System.out.print("Descripcino de Rasgos: ");
        String descripcionRasgos = sc.next();
        System.out.print("Distribucion Geografica: ");
        String distrGeografica = sc.next();
        System.out.print("Vida: ");
        int vida = sc.nextInt();
        registroAnimales.add(new Animales(nombreCientifico, nombreComun, habitat, alimentacion, descripcionRasgos, distrGeografica, vida));
    }
}
