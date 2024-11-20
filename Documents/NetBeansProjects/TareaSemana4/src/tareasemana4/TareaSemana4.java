package tareasemana4;
// Tarea Semana 4
// @author Juan Ángel Leguizamón
 
public class TareaSemana4 {
    public static void main(String[] args) {

        //1 imprimir la frase “Hola, ya se imprimir frases”.
        System.out.println("Hola, ya se imprimir frases"); 

        //2 imprimir un número entero, porejemplo el 273.
        int z = 273; 
        System.out.println(z); 

        //3 imprimir un número decimal, por ejemplo el 5’3.
        double q = 5.3; 
        System.out.println(q); 

        //4 imprimir la suma de 1234 y 532
        System.out.println(1234 + 532);

        //5 imprimir la resta de 1234 y 532
        System.out.println(1234 - 532);

        //6 imprimir la multiplicación entre 1234 y 532
        System.out.println(1234 * 532);

        //7 imprimir la división de 1234 entre 532.
        System.out.println(1234 / 532);

	//8 imprimir los numeros del 1 al 3
        for (int a = 1; a<=3; a++) {   // Se incrementa a dentro del for ya que
        System.out.println(a); // El operador ++ no se ejecuta dentro del print
        }
        
	//9 imprimir numeros del 1 al 9
        for (int b = 1; b<=9; b++) {   // Se incrementa b dentro del for
        System.out.print(b+" "); 
        }

	//10 imprimir numeros del 1 al 10000
        for (int c = 1; c<=10000; c++) {   // Se incrementa c dentro del for
        System.out.print(c+" ");  
        }

	//11 imprimir numeros del 5 al 10	
        for (int d = 5; d<=10; d++) {   // Se incrementa d dentro del for
        System.out.print(d+" "); 
        }

	//12 imprimir numeros del 5 al 15	
        for (int e = 5; e<=15; e++) {   // Se incrementa e dentro del for
        System.out.print(e+" "); 
        }

	//13 imprimir numeros del 5 al 15000	
        for (int f = 5; f<=15000; f++) {   // Se incrementa f dentro del for
        System.out.print(f+" ");  
        }

	//14 imprimir 200 veces la paralbra Hola
        for (int g = 1; g<=200; g++) {   // Se incrementa g dentro del for
        System.out.print("hola ");  
        }

	//15 imprimir los cuadrados de los 30 primeros números naturales	
        for (int h = 1; h<=30; h++) {   // Se incrementa h dentro del for
        int cuadrado = h*h;             // Halla el cuadrado de h
        System.out.print(cuadrado+" "); // Se imprime el cuadrado
        } 
        
        //16 imprimir la multiplicacion de los 20 primeros números naturales
        long factorial = 1;              // en esta variable Se guardará el producto
        for (int i = 1; i<=20; i++) {    // Se incrementa i dentro del for
        factorial *= i;                  // se multiplica y guarda el procudto
        } 
        System.out.print(factorial+" "); // Se imprime el resultado final


        //17 imprimir la suma de los cuadrados de los 100 primeros números naturales
        int suma = 0;                   // en esta variable Se acumulará la suma
        for (int j = 1; j<=100; j++) {  // Se incrementa j dentro del for
        suma += j*j;                    // se halla el cuadrado y se suma al anterior
        } 
        System.out.print(suma+" ");     // Se imprime el resultado final

      

        }   
}
