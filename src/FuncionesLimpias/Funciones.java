package FuncionesLimpias;

import org.w3c.dom.xpath.XPathResult;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Funciones {

    public static void main(String[] args) {
        System.out.println("Programacion Imperativa: Fibonacci");
        fibonacci();
        System.out.println("Programacion Funcional: Fibonacci");
         fibonacci2();
        System.out.println("Programacion Imperativa: Muestra los pares");
        muestraPar(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Programacion Funcional: Muestra los pares");
        pares(1, 2, 3, 4, 5, 6, 7, 8, 9);

    }

    public static void muestraPar(int ...numero){
        for (int i:numero){
            if (i%2==0){
                System.out.println("par = " + i);
            }
        }
    }
    public static void pares(int ...numero) {
        Arrays.stream(numero).filter(x -> x % 2 == 0).forEach(x-> System.out.println("par = "+x));
    }

    /**
     * Fibonacci con Programacion Imperativa.
     */
    public static void fibonacci(){
        int iNumero1=0;
        int iNumero2=1;
        int iResultado=1;
        for (int i = 0; i < 20; i++) {
            System.out.println(iResultado);
            //se aplica formula: fibonacci = F1 + F2
            iResultado = iNumero1 + iNumero2;
            //Se actualizan las posiciones de los numeros, para continuar con el recorrido.
            iNumero1 = iNumero2;
            iNumero2= iResultado;
        }

    }
    /**
     * Fibonacci de con funcion de alto nivel, programacion funcional.
     * Refactorizacion de codigo.
     */
        public static void fibonacci2() {
            //Stream.Iterate: Itera el Arreglo declarado con esas dos posiciones
            Stream.iterate(new long[] { 0, 1}, p -> new long[] {p[1], p[0] + p[1] })
                    .limit(21)
                    .forEach(p -> System.out.println(p[0]));
    }


    }
