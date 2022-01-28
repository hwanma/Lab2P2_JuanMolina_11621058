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
            imprimir();
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
        sc.nextLine();
        String descripcionRasgos = sc.nextLine();
        System.out.print("Distribucion Geografica: ");
        String distrGeografica = sc.nextLine();
        System.out.print("Vida: ");
        int vida = sc.nextInt();
        while(vida<=0){
            System.out.print("Vida: ");
            vida = sc.nextInt();
        }
        registroAnimales.add(new Animales(nombreCientifico, nombreComun, habitat, alimentacion, descripcionRasgos, distrGeografica, vida));
    }
    
    public static void editarAnimal(){
        System.out.println("Ingrese el nombre cientifico: ");
        sc.nextLine();
        String nombreEditar = sc.nextLine();
        
        int counter = 0;
        int pos = 0;
        
        for (Animales animal : registroAnimales) {
            if(animal.getNombreCientifico().equals(nombreEditar)){
                pos = counter;
            }
            counter ++;
        }
        
        System.out.println("1. Editar atributo\n"+
                            "2. Editar todo\n");
        int opcion = sc.nextInt();
        
        if(opcion == 1){
            editarAtributo(pos);
        } else if (opcion == 2){
            editarTodo(pos);
        }
    }
    
    public static void editarAtributo(int pos){
        System.out.println("1. Nombre Cientifico\n"+
                            "2. Nombre Comun\n"+
                            "3. Habitat\n"+
                            "4. Alimentacion\n"+
                            "5. Descripcion de Rasgos\n"+
                            "6. Distribucion Geografica\n"+
                            "7. Vida\n");
        System.out.print("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        if(opcion == 1){
            System.out.println("Nombre Cientifico: ");
            sc.nextLine();
            registroAnimales.get(pos).setNombreCientifico(sc.nextLine());
        }else if(opcion == 2){
            System.out.print("Nombre Comun: ");
            
            registroAnimales.get(pos).setNombreComun(sc.next());
        }else if(opcion == 3){
            System.out.print("Habitat: ");
            registroAnimales.get(pos).setHabitat(sc.next());
        }else if(opcion == 4){
            System.out.print("Alimentacion: ");
            registroAnimales.get(pos).setAlimentacion(sc.next());
        }else if(opcion == 5){
            System.out.print("Descripcion Rasgos: ");
            sc.nextLine();
            registroAnimales.get(pos).setDescripcionRasgos(sc.nextLine());
        }else if(opcion == 6){
            System.out.print("Distribucion Geografica: ");
            sc.nextLine();
            registroAnimales.get(pos).setDistribucionGeografica(sc.nextLine());
        }else if(opcion == 7){
            System.out.println("Vida: ");
            registroAnimales.get(pos).setVida(sc.nextInt());
        }
    }
    
    public static void editarTodo(int pos){
        System.out.println("Nombre Cientifico: ");
        sc.nextLine();
        registroAnimales.get(pos).setNombreCientifico(sc.nextLine());
        System.out.println("Nombre Comun: ");
        
        registroAnimales.get(pos).setNombreComun(sc.next());
        System.out.println("Habitat: ");
        
        registroAnimales.get(pos).setHabitat(sc.next());
        System.out.println("Alimentacion: ");
        
        registroAnimales.get(pos).setAlimentacion(sc.next());
        System.out.println("Descripcion Rasgos: ");
        sc.nextLine();
        registroAnimales.get(pos).setDescripcionRasgos(sc.nextLine());
        System.out.println("Distribucion Geografica: ");
        registroAnimales.get(pos).setDistribucionGeografica(sc.nextLine());
        System.out.println("Vida: ");
        
        registroAnimales.get(pos).setVida(sc.nextInt());
    }
    
    public static void imprimir(){
        System.out.println("1. Solicitar posicion\n"+
                            "2. Solicitar nombre cientifico\n"+
                            "3. Listar Animales\n");
        int opcion = sc.nextInt();
        
        if(opcion == 1){
            imprimirPosicion();
        } else if (opcion == 2){
            imprimirNombreCientifico();
        } else if (opcion == 3){
            imprimirAnimales();
        }
    }
    
    public static void imprimirPosicion(){
        System.out.println("Ingrese la posicion: ");
        int pos = sc.nextInt();
        System.out.println(registroAnimales.get(pos).toString());
    }
    
    public static void imprimirNombreCientifico(){
        System.out.print("Ingrese el nombre cientifico: ");
        sc.nextLine();
        String nombreBuscar= sc.nextLine();
        
        for (Animales animal : registroAnimales) {
            if(animal.getNombreCientifico().equals(nombreBuscar)){
                System.out.println(animal.toString());
            }
        }        
    }
    
    public static void imprimirAnimales(){
        for (Animales animal : registroAnimales) {
            System.out.println(animal.toString());
        }
    }
    
    public static void alimentacion(){
        System.out.print("Ingrese posicion depredador: ");
        int depredador= sc.nextInt();
        int vidaDep = registroAnimales.get(depredador).getVida();
        
        System.out.print("Ingrese el nombre presa: ");
        int presa= sc.nextInt();
        int vidaPresa = registroAnimales.get(presa).getVida();

        registroAnimales.get(depredador).setVida(vidaDep+vidaPresa);
        
        registroAnimales.remove(presa);
    }
    
    public static void eliminarAnimal(){
        System.out.print("Ingrese la posicion del animal a eliminar: ");
        int pos = sc.nextInt();
        registroAnimales.remove(pos);
    }
    
    public static int pos(String n){
        int counter = 0;
        int pos = 0;
        
        for (Animales animal : registroAnimales) {
            if(animal.getNombreCientifico().equals(n)){
                pos = counter;
            }
            counter ++;
        }
        return pos;
    }
}
