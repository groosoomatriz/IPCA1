
package nombreyedad;

import java.util.Scanner;

public class NombreyEdad {

 
    public static void main(String[] args) {
        Scanner ten = new Scanner(System.in);
           String sexo, f = null, m;
        int edad;
        System.out.println(" Ingrese sexo ");
        System.out.println(" Si es hombre (f)o si es Mujer (m) ");
        sexo = ten.nextLine();
        System.out.println(" Ingrese Edad");
        edad = ten.nextInt();
        if(sexo == null ? f == null : sexo.equals(f) )
            System.out.println("mujer");
        else 
            System.out.println("Hombre");
       if(edad>18)
      System.out.println("Puedes votar");
       else
           System.out.println("No puedes votar ");
      
       
        
    }
    
}
