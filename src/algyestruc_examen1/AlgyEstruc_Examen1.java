package algyestruc_examen1;


public class AlgyEstruc_Examen1 {
    public static void main(String[] args) {
        //Declaracion de variables
        int n, mat[][], suma, menor, mayor, diagPrincipal[];
        String potencia;
        double prom, division;
        //Entrada de datos
        n = Algoritmos.numeroN();//Numero entre 1 y 9
        mat = new int[n][n]; //Inicializacion de la matriz
        //Procedimiento
        Algoritmos.crearMatriz(n, mat);//Creamos la matriz con los numeros random
        suma = Algoritmos.sumaDiagonalSecundaria(mat); //Suma de la diagonal secundaria
        prom = Algoritmos.promDiagonalSecundaria(suma, n); //Promedio de la diagonal secundaria
        menor = Algoritmos.menorElementoPositivo(mat); //Menor elemento positivo
        mayor = Algoritmos.mayorElemento(mat); //Mayor elemento 
        potencia = Algoritmos.potenciaElementos(menor, mayor); //Potencia del mayor elevado al menor
        division = Algoritmos.dividirElementos(mayor, menor);
        diagPrincipal = Algoritmos.ordenarDiagonalPrincipal(mat);
        
        //Mostrando resultados
        Algoritmos.mostrarMatriz(mat); //Mostramos la matriz
        System.out.println("La suma de la diagonal secundaria es: "+suma);
        System.out.println("El promedio de la diagonal secundaria es: "+prom);
        System.out.println("El menor elemento positivo es: "+menor);
        System.out.println("El mayor elemento es: "+mayor);
        System.out.println("La potencia de "+mayor+" elevado a "+menor+" es: "+potencia);
        System.out.printf("La division entre "+mayor+" y "+menor+" es: %2.2f\n",division);
        System.out.println("La diagonal principal ordenada descendentemente es:");
        Algoritmos.mostrarVector(diagPrincipal);

        
    }
    
}
