
package ciclos;
import java.util.Scanner;
public class Ciclos {

public static class Global{
	static String nombre;
	static String telefono;
	static String organizacion;
	static String nombre1;
	static String telefono1;
	static String nombre3;
	static String telefono3;
	static String nombre4;
	static String telefono4;
	static String organizacion1;
	static String nombre2;
	static String nombre5;
	static String nombre6;
	static String nombre7;
	static String telefono2;
	static String organizacion2;
	static String control;
	static String eliminar;
	static String placa;
	static String marca;
	static String placa1;
	static String marca1;
	static String placa2;
	static String marca2;
	static String placa3;
	static String marca3;
	static String placa4;
	static String marca4;
	static String identificacion;
	static boolean curso;
	static boolean respuesta;
	static String estado;
	static String identificacion1;
	static boolean curso1;
	static boolean respuesta1;
	static String estado1;
	static String identificacion2;
	static boolean curso2;
	static boolean respuesta2;
	static String estado2;
	static String identificacion3;
	static boolean curso3;
	static boolean respuesta3;
	static String estado3;
	static String identificacion4;
	static boolean curso4;
	static boolean respuesta4;
	static String estado4;
	static String identificacion5;
	static boolean curso5;
	static boolean respuesta5;
	static String estado5;
	static String identificacion6;
	static boolean curso6;
	static boolean respuesta6;
	static String estado6;
	static String identificacion7;
	static boolean curso7;
	static boolean respuesta7;
	static String estado7;
        }
    
    public static void main(String[] args) {
        int menu;
	int i;
	int j;
	int suma;	
	int m;
	int x;
	int x1;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido al taller de ciclos elija un punto del 1 al 8");
        menu = in.nextInt();
        switch (menu){

            case 1:{
                
                for(i = 1;i <= 10;i++){
                for(j = 1;j <= i;j++){
                    System.out.print("*");
                }
                System.out.println("");
                }
                break;
            }

            case 2:{
	i = 0;
        while(i < 100){
        i = i+1;
        m = 0;
        suma = 0;
        x = 0;
        System.out.print(" ");
        if(i==10){
        System.out.println("*");
        }
         if(i==19){
        System.out.println("**");
        }
          if(i==27){
        System.out.println("***");
        }
            if(i==34){
        System.out.println("****");
        }
                 if(i==40){
        System.out.println("*****");
        }
                         if(i==45){
        System.out.println("******");
        }
                         if(i==49){
        System.out.println("*******");
        }
                     if(i==52){
        System.out.println("********");
        }
                     if(i==54){
        System.out.println("*********");
        }
                  if(i==55){
        System.out.println("**********");
        }
        }
                break;

            }

            case 3:{
                i = 0;
        do{
                i = i + 1;
                System.out.print(" ");
                 if(i==10){
        System.out.println("*");
        }
         if(i==19){
        System.out.println("***");
        }
          if(i==27){
        System.out.println("*****");
        }
            if(i==34){
        System.out.println("*******");
        }
                 if(i==40){
        System.out.println("*********");
        }
                         if(i==45){
        System.out.println("***********");
        }
                         if(i==49){
        System.out.println("*************");
        }
                     if(i==52){
        System.out.println("***************");
        }
                     if(i==54){
        System.out.println("*****************");
        }
                  if(i==55){
        System.out.println("*******************");
        }
                  if(i==64){
        System.out.println("***");
        }
                  if(i==73){
        System.out.println("***");
        }
                  if(i==81){
        System.out.println("*****");
        }
                  if(i==89){
        System.out.println("*****");
        }        
                }while(i <= 140);
                break;

            }
              case 4:{
              System.out.println("Por favor digite el número de la tabla: ");
	      m = in.nextInt();
              for(i = 1;i<=10;i++){
                  suma = i * m;
                  System.out.println(i+ " "+ "x"+ " "+ m+" "+ "="+ " "+ suma);
              }

                break;

            }
                case 5:{
                    m = 0;
			while( m != 3){
			System.out.println("Menú de usuario");
			System.out.println("1. Capturar nombre");
			System.out.println("2. Saludar persona ");
			System.out.println("3. Salir del sistema ");
			m = in.nextInt();
                }

                break;

            }
                case 6:{

m = 10;
while(m != 6){
    System.out.println("Menú de usuario");
    System.out.println("Por favor guarde los contactos en orden ascedente: ");
    System.out.println("1. Guardar Contacto1 ");
    System.out.println("2. Guardar Contacto2 ");
    System.out.println("3. Guardar Contacto3 ");
    System.out.println("4. Consultar Contacto ");
    System.out.println("5. Eliminar Contacto ");
    System.out.println("6. Finalizar ");
    m = in.nextInt();
    if(m == 1){
        System.out.println("Por favor digite su nobmre completo");
        Global.nombre = in.next();
        System.out.println("Por favor digite su telefono");
	Global.telefono = in.next();
        System.out.println("Por favor digite la organización");
	Global.organizacion = in.next();
}
	if(m == 2){
            System.out.println("Por favor digite su nobmre completo");
	    Global.nombre1 = in.next();
	if(Global.nombre == Global.nombre1){
            System.out.println("El contacto ya está almacenado por favor verifique"); 
		m = 5;
        }
        System.out.println("Por favor digite su telefono");
        Global.telefono1 = in.next();
        if(Global.telefono == Global.telefono1){
	System.out.println("El contacto ya está almacenado por favor verifique"); 
	m = 5;
        }
        System.out.println("Por favor digite la organización");
        Global.organizacion1 = in.next();
	if(Global.organizacion == Global.organizacion1){
            System.out.println("El contacto ya está almacenado por favor verifique"); 
	m = 5;
        }
                                                }
		if(m == 3){
                    System.out.println("Por favor digite su nobmre completo");
		    Global.nombre2 = in.next() ;
		if(Global.nombre1 == Global.nombre2 && Global.nombre2 == Global.nombre){
                    System.out.println("El contacto ya está almacenado por favor verifique"); 
			m = 5;
                }
                System.out.println("Por favor digite su telefono");
                Global.telefono2 = in.next();
		if(Global.telefono2 == Global.telefono1 && Global.telefono2 == Global.telefono){
		System.out.println("El contacto ya está almacenado por favor verifique"); 
		m = 5;
                }
                System.out.println("Por favor digite la organización");
		Global.organizacion2 = in.next();
			if(Global.organizacion2 == Global.organizacion1 && Global.organizacion2 == Global.organizacion){
			System.out.println("El contacto ya está almacenado por favor verifique"); 
						m = 5;
                }
                                                }
		if(m == 4){
                 System.out.println("Digite el contacto que desea consultar");
		Global.control = in.next();
		if(Global.control == Global.telefono){
	        System.out.println(Global.nombre);
                System.out.println(Global.telefono);
                System.out.println(Global.organizacion);				
                }
                if(Global.control == Global.telefono1){
		System.out.println(Global.nombre1);
		System.out.println(Global.telefono1);
                System.out.println(Global.organizacion1);
                }
		if(Global.control == Global.telefono2){
		System.out.println(Global.nombre2);
		System.out.println(Global.telefono2);
                System.out.println(Global.organizacion2);
                }
                                                }
			if(m == 5){
                        System.out.println("Digite el nombre del contacto que desea eliminar: ");
			Global.eliminar = in.next();
			if(Global.eliminar == Global.nombre){
			Global.nombre = "";
			Global.telefono = "";
			Global.organizacion = "";
			System.out.println("Contacto eliminado ");
                        }
		if(Global.eliminar == Global.nombre1){
		Global.nombre1 = "";
		Global.telefono1 = "";
		Global.organizacion1 = "";
		System.out.println("Contacto eliminado ");
                }
		if(Global.eliminar == Global.nombre2){
		Global.nombre2 = "";
		Global.telefono2 = "";
		Global.organizacion2 = "";
		System.out.println("Contacto eliminado ");
                }
                                                }
                                              }
                break;

            }
                case 7:{

                m = 10;
		while(m != 8){
		System.out.println("Menú de usuario");
                System.out.println("Por favor ingrese los vehiculos en orden ascedente: ");
		System.out.println("1. Ingresar vehiculo 1 ");
                System.out.println("2. Ingresar vehiculo 2 ");
                System.out.println("3. Ingresar vehiculo 3 ");
                System.out.println("4. Ingresar vehiculo 4 ");
                System.out.println("5. Ingresar vehiculo 5 ");
                System.out.println("6. Consultar vehiculo  ");
		System.out.println("7. Retirar vehiculo ");
                System.out.println("8. Finalizar ");
		m = in.nextInt();
		if(m == 1){
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre = in.next();
		System.out.println("Por favor digite su telefono");
		Global.telefono = in.next();
		System.out.println("Por favor digite la marca");
                Global.marca = in.next();
		System.out.println("Por favor digite la placa");
		Global.placa = in.next();
                }
		if(m == 2){
                System.out.println("Por favor digite su nobmre completo");
		Global.nombre1 = in.next();
		System.out.println("Por favor digite su telefono");
		Global.telefono1 = in.next();
		System.out.println("Por favor digite la marca");
		Global.marca1 = in.next();
		System.out.println("Por favor digite la placa");
		Global.placa1 = in.next() ;
                }
		if(m == 3){
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre2 = in.next();
		System.out.println("Por favor digite su telefono");
	        Global.telefono2 = in.next();
		System.out.println("Por favor digite la marca");
		Global.marca2 = in.next();
		System.out.println("Por favor digite la placa");
		Global.placa2 = in.next();
                }
		if(m == 4){
                System.out.println("Por favor digite su nobmre completo");
		Global.nombre3 = in.next();
		System.out.println("Por favor digite su telefono");
		Global.telefono3 = in.next() ;
		System.out.println("Por favor digite la marca");
	        Global.marca3 = in.next();
		System.out.println("Por favor digite la placa");
		Global.placa3 = in.next();
                }
		if(m == 5){
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre4 = in.next();
		System.out.println("Por favor digite su telefono");
		Global.telefono4 = in.next();
		System.out.println("Por favor digite la marca");
		Global.marca4 = in.next(); 
		System.out.println("Por favor digite la placa");
		Global.placa4 = in.next();
                }
		if(m == 6){
		System.out.println("Consulte por número de placa");
		Global.control = in.next();
		if(Global.control == Global.placa){
		System.out.println(Global.nombre);
                System.out.println(Global.telefono);
		System.out.println(Global.placa);
		System.out.println(Global.marca);
                }
		if(Global.control == Global.placa1){
		System.out.println(Global.nombre1);
                System.out.println(Global.telefono1);
		System.out.println(Global.placa1);
                System.out.println(Global.marca1);
                }
		if(Global.control == Global.placa2){
	        System.out.println(Global.nombre2);
                System.out.println(Global.telefono2);
		System.out.println(Global.placa2);
                System.out.println(Global.marca2);
                }
                if(Global.control == Global.placa3){
	        System.out.println(Global.nombre3);
                System.out.println(Global.telefono3);
		System.out.println(Global.placa3);
                System.out.println(Global.marca3);
                }
		if(Global.control == Global.placa4){
	        System.out.println(Global.nombre4);
                System.out.println(Global.telefono4);
		System.out.println(Global.placa4);
                System.out.println(Global.marca4);
                }
                }
	 if(m == 7){
	System.out.println("Digite el nombre del contacto que desea retirar: ");
        Global.eliminar = in.next() ;
	if(Global.eliminar == Global.nombre){
	Global.nombre = "";
	Global.telefono = "";
        Global.marca = "";
        Global.placa = "";
        System.out.println("Contacto retirado ");
         }
        if(Global.eliminar == Global.nombre1){
	Global.nombre1 = "";
	Global.telefono1 = "";
        Global.marca1 = "";
        Global.placa1 = "";
        System.out.println("Contacto retirado ");
         }
        if(Global.eliminar == Global.nombre2){
	Global.nombre2 = "";
	Global.telefono2 = "";
        Global.marca2 = "";
        Global.placa2 = "";
        System.out.println("Contacto retirado ");
         }
        if(Global.eliminar == Global.nombre3){
	Global.nombre3 = "";
	Global.telefono3 = "";
        Global.marca3 = "";
        Global.placa3 = "";
        System.out.println("Contacto retirado ");
         }
	if(Global.eliminar == Global.nombre4){
	Global.nombre4 = "";
	Global.telefono4 = "";
        Global.marca4 = "";
        Global.placa4 = "";
        System.out.println("Contacto retirado ");
         }
                                                }
                                                }

                break;

            }
                case 8:{
m = 0;
	while(m != 10){
            System.out.println("Menú de usuario");
	    System.out.println("Por favor guarde la información en orden ascedente: ");
	    System.out.println("1. Estudiante 1 ");
            System.out.println("2. Estudiante 2 ");
            System.out.println("3. Estudiante 3 ");
            System.out.println("4. Estudiante 4 ");
            System.out.println("5. Estudiante 5 ");
            System.out.println("6. Estudiante 6 ");
	    System.out.println("7. Estudiante 7 ");
            System.out.println("8. Estudiante 8 ");
            System.out.println("9. Consultar 9 ");
            System.out.println("10. Finalizar ");
            m = in.nextInt();
	    if(m == 1){
                System.out.println("Por favor digite su identificación");
		Global.identificacion = in.next();
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre = in.next();
                System.out.println("¿Desea presentar el curso?");
                Global.curso = in.nextBoolean();
			if(Global.curso ==true){
		System.out.println("¿HTML no es un lenguaje de programación: Falso o Vedadero: ");
		Global.respuesta = in.nextBoolean();
				if(Global.respuesta == true){
				System.out.println("Es correcto, aprobaste el curso");
				Global.estado = "Aprobado";
                        }
            if(Global.respuesta == false){
                System.out.println("Es Incorrecto, reprobaste el curso");
            
		Global.estado = "Reprobado";
						
                        }
                                                        }
                                                        }
              if(m == 2){
                System.out.println("Por favor digite su identificación");
		Global.identificacion1 = in.next();
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre1 = in.next();
                System.out.println("¿Desea presentar el curso?");
                Global.curso1 = in.nextBoolean();
			if(Global.curso1 ==true){
		System.out.println("¿HTML no es un lenguaje de programación: Falso o Vedadero: ");
		Global.respuesta1 = in.nextBoolean();
				if(Global.respuesta1 == true){
				System.out.println("Es correcto, aprobaste el curso");
				Global.estado1 = "Aprobado";
                        }
            if(Global.respuesta1 == false){
                System.out.println("Es Incorrecto, reprobaste el curso");
            
		Global.estado1 = "Reprobado";
						
                        }
                                                        }
                                                        }
			  if(m == 3){
                System.out.println("Por favor digite su identificación");
		Global.identificacion2 = in.next();
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre2 = in.next();
                System.out.println("¿Desea presentar el curso?");
                Global.curso2 = in.nextBoolean();
			if(Global.curso2 ==true){
		System.out.println("¿HTML no es un lenguaje de programación: Falso o Vedadero: ");
		Global.respuesta2 = in.nextBoolean();
				if(Global.respuesta2 == true){
				System.out.println("Es correcto, aprobaste el curso");
				Global.estado2 = "Aprobado";
                        }
            if(Global.respuesta2 == false){
                System.out.println("Es Incorrecto, reprobaste el curso");
            
		Global.estado2 = "Reprobado";
						
                        }
                                                        }
                                                        }
				  if(m == 4){
                System.out.println("Por favor digite su identificación");
		Global.identificacion3 = in.next();
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre3 = in.next();
                System.out.println("¿Desea presentar el curso?");
                Global.curso3 = in.nextBoolean();
			if(Global.curso3 ==true){
		System.out.println("¿HTML no es un lenguaje de programación: Falso o Vedadero: ");
		Global.respuesta3 = in.nextBoolean();
				if(Global.respuesta3 == true){
				System.out.println("Es correcto, aprobaste el curso");
				Global.estado3 = "Aprobado";
                        }
            if(Global.respuesta3 == false){
                System.out.println("Es Incorrecto, reprobaste el curso");
            
		Global.estado3 = "Reprobado";
						
                        }
                                                        }
                                                        }
				  if(m == 5){
                System.out.println("Por favor digite su identificación");
		Global.identificacion4 = in.next();
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre4 = in.next();
                System.out.println("¿Desea presentar el curso?");
                Global.curso4 = in.nextBoolean();
			if(Global.curso4 ==true){
		System.out.println("¿HTML no es un lenguaje de programación: Falso o Vedadero: ");
		Global.respuesta4 = in.nextBoolean();
				if(Global.respuesta4 == true){
				System.out.println("Es correcto, aprobaste el curso");
				Global.estado4 = "Aprobado";
                        }
            if(Global.respuesta4 == false){
                System.out.println("Es Incorrecto, reprobaste el curso");
            
		Global.estado4 = "Reprobado";
						
                        }
                                                        }
                                                        }
			  if(m == 6){
                System.out.println("Por favor digite su identificación");
		Global.identificacion5 = in.next();
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre5 = in.next();
                System.out.println("¿Desea presentar el curso?");
                Global.curso5 = in.nextBoolean();
			if(Global.curso5 ==true){
		System.out.println("¿HTML no es un lenguaje de programación: Falso o Vedadero: ");
		Global.respuesta5 = in.nextBoolean();
				if(Global.respuesta5 == true){
				System.out.println("Es correcto, aprobaste el curso");
				Global.estado5 = "Aprobado";
                        }
            if(Global.respuesta5 == false){
                System.out.println("Es Incorrecto, reprobaste el curso");
            
		Global.estado5 = "Reprobado";
						
                        }
                                                        }
                                                        }
				  if(m == 7){
                System.out.println("Por favor digite su identificación");
		Global.identificacion6 = in.next();
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre6 = in.next();
                System.out.println("¿Desea presentar el curso?");
                Global.curso6 = in.nextBoolean();
			if(Global.curso6 ==true){
		System.out.println("¿HTML no es un lenguaje de programación: Falso o Vedadero: ");
		Global.respuesta6 = in.nextBoolean();
				if(Global.respuesta6 == true){
				System.out.println("Es correcto, aprobaste el curso");
				Global.estado6 = "Aprobado";
                        }
            if(Global.respuesta6 == false){
                System.out.println("Es Incorrecto, reprobaste el curso");
            
		Global.estado6 = "Reprobado";
						
                        }
                                                        }
                                                        }
				  if(m == 8){
                System.out.println("Por favor digite su identificación");
		Global.identificacion7 = in.next();
		System.out.println("Por favor digite su nobmre completo");
		Global.nombre7 = in.next();
                System.out.println("¿Desea presentar el curso?");
                Global.curso7 = in.nextBoolean();
			if(Global.curso7 ==true){
		System.out.println("¿HTML no es un lenguaje de programación: Falso o Vedadero: ");
		Global.respuesta7 = in.nextBoolean();
				if(Global.respuesta7 == true){
				System.out.println("Es correcto, aprobaste el curso");
				Global.estado7 = "Aprobado";
                        }
            if(Global.respuesta7 == false){
                System.out.println("Es Incorrecto, reprobaste el curso");
            
		Global.estado7 = "Reprobado";
						
                        }
                                                        }
                                                        }
		if(m == 9){
                    System.out.println("Consulte por número de identificación");
		    Global.control = in.next();
		if(Global.control == Global.identificacion){
		System.out.println(Global.identificacion);
                System.out.println(Global.nombre);
                System.out.println(Global.estado);
						
                }
                if(Global.control == Global.identificacion1){
		System.out.println(Global.identificacion1);
                System.out.println(Global.nombre1);
                System.out.println(Global.estado1);
						
                }
                
                if(Global.control == Global.identificacion2){
		System.out.println(Global.identificacion2);
                System.out.println(Global.nombre2);
                System.out.println(Global.estado2);
						
                }
                if(Global.control == Global.identificacion3){
		System.out.println(Global.identificacion3);
                System.out.println(Global.nombre3);
                System.out.println(Global.estado3);
						
                }
                if(Global.control == Global.identificacion4){
		System.out.println(Global.identificacion4);
                System.out.println(Global.nombre4);
                System.out.println(Global.estado4);
						
                }
                if(Global.control == Global.identificacion5){
		System.out.println(Global.identificacion5);
                System.out.println(Global.nombre5);
                System.out.println(Global.estado5);
						
                }
                if(Global.control == Global.identificacion6){
		System.out.println(Global.identificacion6);
                System.out.println(Global.nombre6);
                System.out.println(Global.estado6);
						
                }
                if(Global.control == Global.identificacion7){
		System.out.println(Global.identificacion7);
                System.out.println(Global.nombre7);
                System.out.println(Global.estado7);
						
                }
					
                                                        }
						
                                                        }
			

                break;

            }
                case 9:{

                System.out.println("Usted eligió la opcion 3.");

                break;

            }

            default: {

                System.out.println("Opcion incorrecta");

            }

      }
        
        
    }
    
}
