
package condicionales;
import java.util.Scanner;
public class Condicionales {
        
    public static void main(String[] args) {
        int menu;
        String nombre;
        String apellido;
        String nombrepadre;
        String apellidopadre;
        String nombremadre;
        String apellidomadre;
        String ciudad;
        String marca;
        String placa;
        String fecha;
        String usuario;
        int edad;
        int menu2;
        int menu3;
        int menu5;
        Boolean menu4;
        String obs;
        String pais;
        double estatura;
        double peso;
        double imc;
        double base;
        double altura;
        double resultado;
        double basemayor;
        String modelo;
        System.out.println("Bienvenido al taller de condicionales elija un punto del 1 al 10");
        Scanner in = new Scanner(System.in);
        menu = in.nextInt();
        if(menu == 1){
         System.out.println("Señor usuario bienvenido, por favor digite su edad: ");
	 edad = in.nextInt();
         if(edad >= 18){
             System.out.println("Usted es mayor de edad");
              }
        else{
            System.out.println("Usted no es mayor de edad"); 
        }
         }
       		
        if(menu == 2){
              System.out.println("Señor usuario bienvenido, por favor digite su edad: ");
	 edad = in.nextInt();
         if(edad <= 18){
             System.out.println("Usted aún es un niño(a)");
              }
        else{
            System.out.println("Usted es mayor de edad"); 
        }
        }
        if(menu == 3){
        System.out.println("Señor usuario bienvenido, por favor digite su nombre: ");
	nombre = in.next();
	System.out.println("por favor digite su apellido: ");
	apellido = in.next();
	System.out.println("por favor digite su edad: ");
	edad = in.nextInt();
        System.out.flush();
	if(edad >= 18){
        System.out.println(nombre+ " "+ apellido+ " "+ "usted es mayor de edad,"+ " "+ "por lo tanto puede entrar a la fiesta.");
        }
        else{
	System.out.println(nombre+ " "+ apellido+ " "+ "usted es menor de edad,"+ " "+ "por lo tanto no puede entrar a la fiesta, por favor devuélvase a su casa.");		
        }
        }
        if(menu == 4){
        System.out.println("Señor usuario bienvenido, Elija su opcion: ");
	System.out.println("1. para alquilar una pelicula. 2. para consultar peliculas disponibles. 3. Para recibir pelicuas en la video tienda: ");
	menu2 = in.nextInt();
        if(menu2 == 1){
            System.out.println("Elija la pelicula que desea: ");
            System.out.println("1. Black Panter");
	    System.out.println("2. Los vengadores");
            System.out.println("3. Blade");
            System.out.println("4. Spyderman");
            System.out.println("5. Tom Ryder");
            System.out.println("6. Fight Club");
            System.out.println("7. Matriz");
            System.out.println("8. John Wick");
            System.out.flush();
            menu3 = in.nextInt();
            if(menu3 == 1 ){
            System.out.println("Listo, has elegido Black Panter, disfrutala");
            }
	    if(menu3 == 2){
	    System.out.println("Listo, has elegido Los vengadores, disfrutala");
        }
            if(menu3 == 4){
                System.out.println("Listo, has elegido Spyderman, disfrutala");
            }
            if(menu3 == 5){
                System.out.println("Listo, has elegido Tom Ryder, disfrutala");
            }
            if(menu3 == 6){
                System.out.println("Listo, has elegido Fight Club, disfrutala");
            }
                if(menu3 == 7){
                System.out.println("Listo, has elegido Matriz, disfrutala");
            }
	      if(menu3 == 8){
                System.out.println("Listo, has elegido John Wick, disfrutala");
            }
        }
	if(menu2 == 2){
	System.out.println("Estas son las peliculas disponibles actualmente: ");
	System.out.println("1. Black Panter");
	System.out.println("2. Los vengadores");
        System.out.println("3. Blade");
        System.out.println("4. Spyderman");
        System.out.println("5. Tom Ryder");
        System.out.println("6. Fight Club");
        System.out.println("7. Matriz");
        System.out.println("7. Matriz");
        System.out.println("8. John Wick");
        }
	if(menu2 == 3){
	System.out.println("Elija la pelicula que desea: ");
        System.out.println("1. Black Panter: ");
        System.out.println("2. Los vengadores: ");
        System.out.println("3. Blade: ");
        System.out.println("4. Spyderman: ");
        System.out.println("5. Tom Ryder");
        System.out.println("6. Fight Club");
        System.out.println("7. Matriz");
        System.out.println("8. John Wick");
	menu3 = in.nextInt();
	if(menu3 == 1){
	System.out.println("Listo, has elegido Black Panter, ¿Deseas realizar alguna anotación?: Escriba Verdadero para Sí o Falso para No");
	menu4 = in.nextBoolean();
	if(menu4 == true){ 
	System.out.println("Escriba una observación: ");
	obs = in.next();
	System.out.println("Observación almacenada: ");}
        else{
	System.out.println("Gracias por su compra que la disfrute: ");
	}
        }
	if(menu3 == 2){
	System.out.println("Listo, has elegido Los vengadores, ¿Deseas realizar alguna anotación?: Escriba Verdadero para Sí o Falso para No");
	menu4 = in.nextBoolean();
	if(menu4 == true){
	System.out.println("Escriba una observación: ");
	obs = in.next();
	System.out.println("Observación almacenada: ");
        }
        else{
	 System.out.println("Gracias por su compra que la disfrute: ");
                }
        }			
	if(menu3 == 3){
	System.out.println("Listo, has elegido Blade, ¿Deseas realizar alguna anotación?: Escriba Verdadero para Sí o Falso para No");
	menu4 = in.nextBoolean();
	if(menu4 == true){
	System.out.println("Escriba una observación: ");
	obs = in.next();
	System.out.println("Observación almacenada: ");
        }
        
        else{
	System.out.println("Gracias por su compra que la disfrute: ");
        }
        }
	if(menu3 == 4){
	System.out.println("Listo, has elegido Spyderman, ¿Deseas realizar alguna anotación?: Escriba Verdadero para Sí o Falso para No");
	menu4 = in.nextBoolean();
	if(menu4 == true){
	System.out.println("Escriba una observación: ");
	obs = in.next();
	System.out.println("Observación almacenada: ");
        }
        else{
	System.out.println("racias por su compra que la disfrute: ");
        }
        }
        if(menu3 == 5){ 
	System.out.println("Listo, has elegido Tom Ryder, ¿Deseas realizar alguna anotación?: Escriba Verdadero para Sí o Falso para No");
	menu4 = in.nextBoolean();
	if(menu4 == true){
	System.out.println("Escriba una observación: ");
	obs = in.next();
	System.out.println("Observación almacenada: ");
        }
        else{
	 System.out.println("Gracias por su compra que la disfrute: ");
        }
        }
         if(menu3 == 6){ 
	System.out.println("Listo, has elegido Fight Club, ¿Deseas realizar alguna anotación?: Escriba Verdadero para Sí o Falso para No");
	menu4 = in.nextBoolean();
	if(menu4 == true){
	System.out.println("Escriba una observación: ");
	obs = in.next();
	System.out.println("Observación almacenada: ");
        }
        else{
	 System.out.println("Gracias por su compra que la disfrute: ");
        }
        }
        if(menu3 == 7){ 
	System.out.println("Listo, has elegido Matrix, ¿Deseas realizar alguna anotación?: Escriba Verdadero para Sí o Falso para No");
	menu4 = in.nextBoolean();
	if(menu4 == true){
	System.out.println("Escriba una observación: ");
	obs = in.next();
	System.out.println("Observación almacenada: ");
        }
        else{
	 System.out.println("Gracias por su compra que la disfrute: ");
        }
        }
         if(menu3 == 8){ 
	System.out.println("Listo, has elegido John Wick, ¿Deseas realizar alguna anotación?: Escriba Verdadero para Sí o Falso para No");
	menu4 = in.nextBoolean();
	if(menu4 == true){
	System.out.println("Escriba una observación: ");
	obs = in.next();
	System.out.println("Observación almacenada: ");
        }
        else{
	 System.out.println("Gracias por su compra que la disfrute: ");
        }
        }
				
        
        }
        if(menu == 5){}
        if(menu == 5){}
        if(menu == 6){}
        if(menu == 7){}
        if(menu == 8){}
        if(menu == 9){}
        if(menu == 10){}
        
    }
    if(menu == 5){
    System.out.println("Señor usuario bienvenido, Elija su opcion: ");
    System.out.println("1. para comprar producto. 2. para consultar precios por producto. 3. Devolución: ");
    menu2 = in.nextInt();
    if(menu2 == 1){
    System.out.println("Elija el producto que desea comprar: ");
    System.out.println("1. Acetaminofen");
    System.out.println("2. Dolex");
    System.out.println("3. Adbil");
    System.out.println("4. Diclofenaco");
    System.out.println("5. Aspirina");
    System.out.println("6. Jarabe");
    System.out.println("7. Inyección");
    System.out.println("8. Curas");
    menu3 = in.nextInt();
    if(menu3 == 1){
        System.out.println("Listo, has comprado Acetaminofen!!");
    }
     if(menu3 == 2){
        System.out.println("Listo, has comprado Dolex!!");
    }
    if(menu3 == 3){
        System.out.println("Listo, has comprado Adbil!!");
    }
     if(menu3 == 4){
        System.out.println("Listo, has comprado Diclofenaco!!");
    }
     if(menu3 == 5){
        System.out.println("Listo, has comprado Aspirina!!");
    }
      if(menu3 == 6){
        System.out.println("Listo, has comprado jarabe!!");
    }
      if(menu3 == 7){
        System.out.println("Listo, has comprado Inyección!!");
    }
     if(menu3 == 8){
        System.out.println("Listo, has comprado Curas!!");
    }
	
			
                                        }
if(menu2 == 2){
    System.out.println("Estos son los precios actualmeten: ");
    System.out.println("1. Acetaminofen cuesta $1000 pesos");
    System.out.println("2. Dolex cuesta $4000 pesos");
    System.out.println("3. Adbil cuesta $3000 pesos");
    System.out.println("4. Diclofenaco cuesta $1200 pesos");
    System.out.println("5. Apirina cuesta $800 pesos");
    System.out.println("6. Jarabe cuesta $5000 pesos");
    System.out.println("7. Inyección cuesta $1500 pesos");
    System.out.println("8. Curas cuesta $2500 pesos");
    }
if(menu2 == 3){ 
    System.out.println("Elija el producto que desea devolver: ");
    System.out.println("1. Acetaminofen cuesta $1000 pesos");
    System.out.println("2. Dolex cuesta $4000 pesos");
    System.out.println("3. Adbil cuesta $3000 pesos");
    System.out.println("4. Diclofenaco cuesta $1200 pesos");
    System.out.println("5. Apirina cuesta $800 pesos");
    System.out.println("6. Jarabe cuesta $5000 pesos");
    System.out.println("7. Inyección cuesta $1500 pesos");
    System.out.println("8. Curas cuesta $2500 pesos");
    menu3 = in.nextInt();
    if(menu3 == 1){
        System.out.println("Listo, la solicitud devolución del producto Acetaminofen se reazizó correctamente, ¿Cual es la razón de la devolución?:");
	System.out.println("Escriba la razón: ");
        obs = in.next();
        System.out.println("Observación almacenada, analizaremos su solicitud y daremos pronta respuesta: ");					
}
       if(menu3 == 2){
        System.out.println("Listo, la solicitud devolución del producto Dolex se reazizó correctamente, ¿Cual es la razón de la devolución?:");
	System.out.println("Escriba la razón: ");
        obs = in.next();
        System.out.println("Observación almacenada, analizaremos su solicitud y daremos pronta respuesta: ");					
}
if(menu3 == 3){
        System.out.println("Listo, la solicitud devolución del producto Adbil se reazizó correctamente, ¿Cual es la razón de la devolución?:");
	System.out.println("Escriba la razón: ");
        obs = in.next();
        System.out.println("Observación almacenada, analizaremos su solicitud y daremos pronta respuesta: ");					
}
   if(menu3 == 4){
        System.out.println("Listo, la solicitud devolución del producto Diclofenáco se reazizó correctamente, ¿Cual es la razón de la devolución?:");
	System.out.println("Escriba la razón: ");
        obs = in.next();
        System.out.println("Observación almacenada, analizaremos su solicitud y daremos pronta respuesta: ");					
}
      if(menu3 == 5){
        System.out.println("Listo, la solicitud devolución del producto Aspirina se reazizó correctamente, ¿Cual es la razón de la devolución?:");
	System.out.println("Escriba la razón: ");
        obs = in.next();
        System.out.println("Observación almacenada, analizaremos su solicitud y daremos pronta respuesta: ");					
}
         if(menu3 == 6){
        System.out.println("Listo, la solicitud devolución del producto Jarabe se reazizó correctamente, ¿Cual es la razón de la devolución?:");
	System.out.println("Escriba la razón: ");
        obs = in.next();
        System.out.println("Observación almacenada, analizaremos su solicitud y daremos pronta respuesta: ");					
}
            if(menu3 == 7){
        System.out.println("Listo, la solicitud devolución del producto Inyección se reazizó correctamente, ¿Cual es la razón de la devolución?:");
	System.out.println("Escriba la razón: ");
        obs = in.next();
        System.out.println("Observación almacenada, analizaremos su solicitud y daremos pronta respuesta: ");					
}
   if(menu3 == 8){
        System.out.println("Listo, la solicitud devolución del producto Curas se reazizó correctamente, ¿Cual es la razón de la devolución?:");
	System.out.println("Escriba la razón: ");
        obs = in.next();
        System.out.println("Observación almacenada, analizaremos su solicitud y daremos pronta respuesta: ");					
}						
                                        }
    }
    if(menu == 6){
    
    System.out.println("Señor usuario bienvenido, Elija su opcion: ");
    System.out.println("1. para registro de vehiculo. 2. para salida de vehiculo. 3. Arreglos realizados: ");
    menu2 = in.nextInt();
    if(menu2 == 1){ 
        System.out.println("Digite la marca de la moto: ");
	marca = in.next();
	System.out.println("Digite la placa de la moto: ");
        placa = in.next();
	System.out.println("Digite el modelo de la moto: ");
	modelo = in.next();
	System.out.println("Digite la fecha de entrada: ");
	fecha = in.next();
	System.out.println("Observaciónes del usuario: ");
	usuario = in.next();
	System.out.println("La información se almacenó correctamente: ");
    }
        if(menu2 == 2){ 
        System.out.println("Digite la marca de la moto: ");
	marca = in.next();
	System.out.println("Digite la placa de la moto: ");
        placa = in.next();
	System.out.println("Digite el modelo de la moto: ");
	modelo = in.next();
	System.out.println("Digite la fecha de entrada: ");
	fecha = in.next();
	System.out.println("Observaciónes del usuario: ");
	usuario = in.next();
	System.out.println("La información se almacenó correctamente: ");
    }
            if(menu2 == 3){ 
        System.out.println("Digite la marca de la moto: ");
	marca = in.next();
	System.out.println("Digite la placa de la moto: ");
        placa = in.next();
	System.out.println("Digite el modelo de la moto: ");
	modelo = in.next();
	System.out.println("Digite la fecha de entrada: ");
	fecha = in.next();
	System.out.println("Observaciónes del usuario: ");
	usuario = in.next();
	System.out.println("La información se almacenó correctamente: ");
    }
    
    }
   if(menu == 7){
   System.out.println("Por favor digite su peso en kilogramos: ");
   peso = in.nextDouble();
   System.out.println("Por favor digite su estatura en metros: ");
   estatura = in.nextDouble();
   imc = peso / Math.pow(estatura, 2);
   System.out.println("Su indice de masa corporal es: "+ " "+ imc);
   if( imc < 18.5){
       System.out.println("Usted está en bajo peso");
   }
   if(imc >= 18.5 && imc <= 24.9){
 System.out.println("Usted está en normopeso");
   }
   if(imc >= 25 && imc <= 26.9){
System.out.println("Usted está en sobre peso");
   }
   
   
   }
   if(menu == 8){
   System.out.println("Bienvenido a la tienda de Don Carlos: ");
   System.out.println("Elija el color que mas le guste: ");
   System.out.println("1. para café");
   System.out.println("2. para Azul");
   System.out.println("3. para Amarillo");
   menu3 = in.nextInt();
   if(menu3 == 1 ){
   System.out.println("Has elegido Café");
   System.out.println("Elige tu sabor favorito: ");
   System.out.println("1. Chocolate");
   System.out.println("2. Fresa");
   System.out.println("3. Cereza");
   menu2 = in.nextInt();
   if(menu2 == 1){
       System.out.println("Has elegido Chocolate");
       System.out.println("Elige tu decoración favorita: ");
       System.out.println("1. Flores");
       System.out.println("2. Rosas");
       menu5 = in.nextInt();
       if(menu5 == 1){
System.out.println("Elegiste Flores, felicidades por tu comprar");
   }
       if(menu5 == 2){
           System.out.println("Elegiste Rosas, felicidades por tu comprar");
   }
                                                }
   if(menu2 == 2){
       System.out.println("Has elegido Fresa");
       System.out.println("Elige tu decoración favorita: ");
       System.out.println("1. Flores");
       System.out.println("2. Rosas");
       menu5 = in.nextInt();
       if(menu5 == 1){
           System.out.println("Elegiste Flores, felicidades por tu compra");
   }
       if(menu5 == 2){
           System.out.println("Elegiste Rosas, felicidades por tu compra");
   }
                                                }
   if(menu2 == 3){
       System.out.println("Has elegido Cereza");
       System.out.println("Elige tu decoración favorita: ");
       System.out.println("1. Flores");
       System.out.println("2. Rosas");
       menu5 = in.nextInt();
       if(menu5 == 1){
           System.out.println("Elegiste Flores, felicidades por tu compra");
   }
       if(menu5 == 2){
           System.out.println("Elegiste Risas, felicidades por tu compra");
   }					
                                                        }
   
   }
   if(menu3 == 2){
       System.out.println("Has elegido Azul");
       System.out.println("Elige tu sabor favorito: ");
       System.out.println("1. Chocolate");
       System.out.println("2. Fresa");
       System.out.println("3. Cereza");
       menu2 = in.nextInt();
       if(menu2 == 1){
           System.out.println("Has elegido Chocolate");
           System.out.println("Elige tu decoración favorita: ");
           System.out.println("1. Flores");
           System.out.println("2. Rosas");
           menu5 = in.nextInt();
           if(menu5 == 1){
               System.out.println("Elegiste Flores, felicidades por tu comprar");
       }
           if(menu5 == 2){
               System.out.println("Elegiste Rosas, felicidades por tu comprar");
       }
                                                }
        if(menu2 == 2){
            System.out.println("Has elegido Fresa");
            menu5 = in.nextInt();
            if(menu5 == 1){ 
                System.out.println("Elegiste Flores, felicidades por tu compra");
        }
            if(menu5 == 2){
                System.out.println("Elegiste Rosas, felicidades por tu compra");
        }
                                                }
        if(menu2 == 3){
            System.out.println("Has elegido Cereza");
            System.out.println("Elige tu decoración favorita: ");
            System.out.println("1. Flores");
            System.out.println("2. Rosas");
            menu5 = in.nextInt();
            if(menu5 == 1){
                System.out.println("Elegiste Flores, felicidades por tu compra");
        }
            if(menu5 == 2){ 
                System.out.println("Elegiste Rosas, felicidades por tu compra");
        }
                                                }		
   
   }
   if(menu ==3 ){
   System.out.println("Has elegido Amarillo");
   System.out.println("Elige tu sabor favorito: ");
   System.out.println("1. Chocolate");
   System.out.println("2. Fresa");
   System.out.println("3. Cereza");
   menu2 = in.nextInt();
   if(menu2 == 1){
       System.out.println("Has elegido Chocolate");
       System.out.println("Elige tu decoración favorita: ");
       System.out.println("1. Flores");
       System.out.println("2. Rosas");
       menu5 = in.nextInt();
       if(menu5 == 1){
           System.out.println("Elegiste Flores, felicidades por tu comprar");
   }
       if(menu5 == 2){
           System.out.println("Elegiste Rosas, felicidades por tu comprar");
       }
                                                }
   if(menu2 == 2){
       System.out.println("Has elegido Fresa");
       System.out.println("Elige tu decoración favorita: ");
       System.out.println("1. Flores");
       System.out.println("2. Rosas");
       menu5 = in.nextInt();
       if(menu5 == 1){
           System.out.println("Elegiste Flores, felicidades por tu compra");
   }
       if(menu5 == 2){
           System.out.println("Elegiste Rosas, felicidades por tu compra");
   }
   }
   if(menu2 == 3){
       System.out.println("Has elegido Cereza");
       System.out.println("Elige tu decoración favorita: ");
       System.out.println("1. Flores");
       System.out.println("2. Rosas");
       menu5 = in.nextInt();
       if(menu5 == 1){
           System.out.println("Elegiste Flores, felicidades por tu compra");
   }
       if(menu5 == 2){
           System.out.println("Elegiste Rosas, felicidades por tu compra");
       }
                                                }		
   
   }
                                
   }
   if(menu == 9){
       System.out.println("Estimado estudiante por favor elija su opción"); 
       System.out.println("1. Para área de un rectángulo: ");
       System.out.println("2. Para área de un triángulo: ");
       System.out.println("3. Para área de un trapecio: ");
       menu2 = in.nextInt();
       if(menu2 == 1){
           System.out.println("Digite por favor la base del rectángulo: ");
           base = in.nextDouble();
           System.out.println("Digite por la altura del rectángulo: ");
           altura = in.nextDouble();
           resultado = base*altura;
           System.out.println("El área del rectángulo es: "+ resultado);
   }
       if(menu2 == 2){
           System.out.println("Digite por favor la base del triágulo: ");
           base = in.nextDouble();
           System.out.println("Digite por la altura del triángulo: ");
	   altura = in.nextDouble();
           resultado = (base*altura)/2;
           System.out.println("El área del triángulo es: "+ resultado);
   }
       if(menu2 == 3){
           System.out.println("Digite por la base mayor del trapecio: ");
           basemayor = in.nextDouble();
           System.out.println("Digite por favor la base menor del trapecio: ");
           base = in.nextDouble();
           System.out.println("Digite por la altura del trapecio: ");
           altura = in.nextDouble();
           resultado = (base+basemayor)/2*(altura);
           System.out.println("El área del trapecio es: "+ resultado);
   }
   }
   if(menu == 10){
       System.out.println("Bienvenido señor usuario, ¿que desea hacer hoy?: ");
       System.out.println("Ingresos: digite 1");
       System.out.println("Consultas: digite 2");
       System.out.println("Retiros: digite 3");
       menu2 = in.nextInt();
       if(menu2 == 1){
          double saldo;
          saldo = 100000;
          System.out.println("Digite el valor que desea ingresar: ");
          double ingreso = in.nextDouble();
          resultado = ingreso + saldo;
				if(ingreso < 0){
                                    System.out.println("El valor ingresado no es valido ya que es negativo");
       }
                                else{
            System.out.println("Usted ingreso un valor de: "+ "$"+ ingreso+ " "+ "pesos");
            System.out.println("Su saldo total es de: "+ resultado);
                                }
   }
       if(menu2 == 2){
           double saldo;
           saldo = 100000;
           System.out.println("Su saldo es de:"+ "$"+ saldo+ " "+ "Pesos");
   }
       if(menu2 == 3){
           double saldo;
           double retiro;
           saldo = 100000;
           System.out.println("¿Cuanto deseas retirar?");
           retiro = in.nextDouble();
           resultado = saldo - retiro;
           if(retiro > saldo){
            System.out.println("Saldo insuficiente por favor comunicarse con el banco: ");
       }
           else{
               System.out.println("Bien hecho! tu retiro fue exitoso");
               System.out.println("Tu retiro fue por un valor de "+ "$"+retiro+ " "+"Pesos");
               System.out.println("Tu saldo actual es de: "+ "$"+ resultado+ " "+"Pesos"); 
       }		
                                        }
   }
}
        }
    

