import java.util.Scanner;

public class SumaNuneros
{
    public static void main( String[] args )
    {
        int n1, n2,n3,n4,n5,n6,n7,n8,n9,n10,suma;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();
        
         System.out.print( "Introduzca primer número: " );
        n3 = teclado.nextInt();
        
         System.out.print( "Introduzca primer número: " );
        n4 = teclado.nextInt();
        
         System.out.print( "Introduzca primer número: " );
        n5 = teclado.nextInt();
        
         System.out.print( "Introduzca primer número: " );
        n6 = teclado.nextInt();
        
         System.out.print( "Introduzca primer número: " );
        n7 = teclado.nextInt();
        
         System.out.print( "Introduzca primer número: " );
        n8 = teclado.nextInt();
        
         System.out.print( "Introduzca primer número: " );
        n9 = teclado.nextInt();
        
         System.out.print( "Introduzca primer número: " );
        n10 = teclado.nextInt();

        suma = n1 + n2 + n3+n4+n5+n6+n7+n8+n9+n10;

        System.out.println( "La suma de los 10 numeros es " );
        System.out.print(suma);
                
    }
}
