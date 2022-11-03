package clase10;

import java.util.Scanner;

/**
 *
 * @author docente
 */
public class Clase10 {
    static Scanner sc = new Scanner(System.in);
    static int op=0, ce=0, cv=0;
    static String frase= "";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        do{
            ingresar();
            op = sc.nextInt();
            calculos(op);            
        }while(op!=5);
    }
   static void ingresar(){
        System.out.println("====MENU====");
        System.out.println("[1].Ingresar Frase");
        System.out.println("[2].# de espacios en blanco.");
        System.out.println("[3].# de Vocales. ");
        System.out.println("[4].Dimensión de la cadena.");
        System.out.println("[5]. Salir");
        System.out.println("Opción [1-5]: ");
   }
   static void calculos(int opc){
       switch(opc){
           case 1: leerFrase();break;
           case 2: System.out.println("N°de espacios en blanco: "+espacios());break;
           case 3: System.out.println("N° de vocales: "+vocales()); break;
           case 4: System.out.println("Longitud de Cadena: "+longitud()); break;
       }
   }
   static void leerFrase(){
       System.out.println("Ingresar Frase: ");
       frase = sc.nextLine();
   }
   static int espacios(){
       
       for(int i = 0; i<frase.length(); i++){
           if(frase.charAt(i) == ' ')
               ce++;
       }
       return ce;
   }
   static int vocales(){
       for(int i = 0; i<frase.length(); i++){
           if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u')
               cv++;
       }
       return cv;
   }
   static int longitud(){
       return frase.length();
   }
   
}
