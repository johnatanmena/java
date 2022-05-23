/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofka;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Sofka {

    public static void main(String[] args) {
        int menu;
        String nombre;
        String apellido;
        String nombrepadre;
        String apellidopadre;
        String nombremadre;
        String apellidomadre;
        String ciudad;
        int edad;
        String pais;
        double estatura;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite 1 para primer punto, 2 para segundo punto, 3 para tercer punto 4 para cuarto punto 5 para quinto punto");
        menu = in.nextInt();
        if(menu == 1){ 
        System.out.println("Bienvenido al punto 1");
        System.out.println("Por favor señor escriba su nombre");
        nombre = in.next();
        System.out.println("Por favor señor escriba su apellido"); 
        apellido = in.next();
        }
        if(menu == 2){
       System.out.println("Bienvenido al punto 2");
       System.out.println("Por favor señor escriba su nombre");
       nombre = in.next();
       System.out.println("Por favor señor escriba sus apellido");
       apellido = in.next();
       System.out.println("Por favor señor escriba su edad");
       edad = in.nextInt();
       System.out.println("Por favor señor escriba su estatura");
       estatura = in.nextDouble();
        }
        if(menu == 3){
        System.out.println("Bienvenido al punto 3");
	System.out.println("Por favor señor escriba su nombre");
	nombre = in.next();
	System.out.println("Por favor señor escriba sus apellidos");
        apellido = in.next();
	System.out.println("Por favor señor escriba el nombre de su padre");
	nombrepadre = in.next();
	System.out.println("Por favor señor escriba el apellido de su padre");
        apellidopadre = in.next();
	System.out.println("Por favor señor escriba el nombre de su madre") ;
	nombremadre = in.next();
	System.out.println("Por favor señor escriba el apellido de su mandre");
	apellidomadre = in.next();
        System.out.flush();
        System.out.println("Yo"+ " " + nombre+ " "+ apellido+ " ,"+ " "+ "soy hijo de"+ " "+ nombremadre+ " "+ apellidomadre+ " "+ "y"+ " "+ nombrepadre+ " "+ apellidopadre);
        }
        if(menu == 4){
            
        System.out.println("Bienvenido al punto 4");
	System.out.println("¿Cual es el nombre del país");
        pais = in.next();
	System.out.println("¿Cual es el nombre de la ciudad?");
	ciudad = in.next();
	System.out.flush();
	System.out.println("La ciudad de"+ ' '+ ciudad+ ","+ " "+ "es la capital del país"+ " "+ pais);
        }
        if(menu == 5){
        System.out.println("Bienvenido al punto 5");
	System.out.println("Por favor señor escriba el nombre de su mascota");
	String nombremascota = in.next();
        System.out.println("Por favor señor escriba la edad de su mascota");
	int edadmascota = in.nextInt();
	System.out.println("Por favor señor escriba el tipo de mascota");
	String tipomascota = in.next();
	System.out.println("Por favor señor escriba su nombre");
	nombre = in.next();
        System.out.println("Por favor señor escriba su apellido");
	apellido = in.next();
	System.out.flush();
	System.out.println(nombremascota+ " "+ "es un(a)"+ " "+ tipomascota+ ", "+ "el cual, tiene"+ " "+ edadmascota+ " "+ "años de edad y"+ " "+ nombre+ " "+ apellido+ " "+ "es actualmente su dueño(a)");     
        }
    }
    
}
