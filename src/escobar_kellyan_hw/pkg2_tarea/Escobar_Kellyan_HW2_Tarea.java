package escobar_kellyan_hw.pkg2_tarea;
import java.util.Scanner;
public class Escobar_Kellyan_HW2_Tarea {

    public static void main(String[] args) {
        Scanner lea=new Scanner (System.in);
       
int menu=0;
       while (menu!=4){
           System.out.println("------ Menu Principal ------"+
                       "\n 1 Palabra Diagonal"
                     + "\n 2 Piramide"
                     + "\n 3 Palindroma"
                     + "\n 4 Salir del programa"
                     + "\n Elija una opcion del (1 al 4)");
           menu=lea.nextInt();
           lea.nextLine();
           
          //menu 1 de la palabra diagonal
          if (menu==1){
              System.out.println("------ Palabra Diagonal ------");
              System.out.println("Ingrese una palabra: ");
              String palabra=lea.nextLine();
              int longitud=palabra.length();

        for (int i=0; i<longitud; i++){
            for (int j=0; j<i; j++) {
                System.out.print("    "); 
            }
            System.out.println(palabra.charAt(i));
        }

        for (int i=longitud - 2; i >=0; i--){
            for (int j=0; j<i; j++){
                System.out.print("    "); 
            }
            System.out.println(palabra.charAt(i));
        }
              
           //menu 2 de piramide invertida          
           }else if (menu==2){
               System.out.println("------ Piramide ------");
               System.out.println("Ingrese un numero: ");
               int numero=lea.nextInt();
        
        for (int i=1; i <=numero; i++){
            for (int j=1; j<i; j++) {
                System.out.print("  "); 
            }
            
            // Parte para arriba
            for (int j=i; j<=numero; j++){
                System.out.print(j + " ");
            }
            
            // Parte para abajo
            for (int j=numero - 1; j>=i; j--){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }           
               
           //menu 3 de la palabra palindroma
           }else if (menu==3){
             System.out.println("----------- Palindroma -------------");
             System.out.println("Ingrese el numero de palabras: ");
             int n=lea.nextInt();
             lea.nextLine(); 

        String palindromas="";
        String noPalindromas="";

        for (int i=1; i<=n; i++){
            System.out.println("Palabra #" + i + ": ");
            String palabra=lea.nextLine();
            String invertida=new StringBuilder(palabra.toLowerCase()).reverse().toString();

            if (palabra.toLowerCase().equals(invertida)){
                palindromas +="#" + i +" "+ palabra +"\n";
            }else{
                noPalindromas +="#" + i +" "+ palabra +"\n";
            }
        }
        System.out.println("Palabras palindromas son:\n" + palindromas);
        System.out.println("Palabras no palindromas son:\n" + noPalindromas);
    
            //menu 4  
           }else if (menu==4){
               
                 System.out.println("------ FIN DEL PROGRAMA ------");
                   System.out.println("Gracias por su visita.");
               
            }else{
               System.out.println("Seleccione una opcion valida");
            }
       }
    }
    
}
