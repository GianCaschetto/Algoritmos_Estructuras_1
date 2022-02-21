package algyestruc_examen1;

import java.util.Scanner;
import java.math.BigInteger;

public class Algoritmos {
    //Metodo que retorna un numero entre 1 y 9
    public static int numeroN(){
        Scanner entrada = new Scanner(System.in);
        int x;
        do{
            System.out.print("Ingrese un número entre el 1 y 9: ");
            x = entrada.nextInt();   
            if (x<1 && x>9){
                System.out.print("Ingrese un número entre el 1 y 9: "); 
            }
        }while(x<1 || x>9);
        return x;
    }
    //Meodo que crea la matriz nxn con los numeros random 
    public static int [][] crearMatriz(int n, int matriz[][]){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matriz[i][j] = (int) ((999-(-999))*Math.random() -999);
            }
        }
        return matriz;
    }
    
    //Metodo que muestra una matriz nxn
    public static void mostrarMatriz(int [][]matriz){
        //Mostramos por consola la matriz
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.printf("%7d",matriz[i][j]); 
            }
            System.out.println();
        }
    }
    
    //Metodo que calcula el promedio de la diagonal secundaria
    public static int sumaDiagonalSecundaria(int[][]m){
        int suma=0;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                if(i+j+1 == m.length){
                    suma += m[i][j];
                }            
            }
        }
        return suma;
    }
    
    //Metodo que calcula el promedio de la diagonal secundaria
    public static double promDiagonalSecundaria(int sum, int n){
        return (double) sum / n;
    }
    
    //Metodo que determina el menor elemento positivo
    public static int menorElementoPositivo(int[][]mat){
        int men=1;
        //Se determina el ultimo numero positivo
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]>0){
                    men = mat[i][j];
                }
            }
        }
        //Una vez inicializada la variable men (menor) se puede determinar el menor de todos
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(men>mat[i][j] && mat[i][j]>0){
                    men = mat[i][j];
                }
            }
        }
        return men;
    }
    
    //Metodo que determina el mayor elemento de la matriz
    public static int mayorElemento(int[][]mat){
        int may = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if (may<mat[i][j]){
                    may = mat[i][j];
                }
            }
        }
        return may;
    }
    
    //Potencia del elemento mayor elevado al menor positivo
    public static String potenciaElementos(int menorElemento, int mayorElemento){
        BigInteger pot = new BigInteger("1");
        for(int i=0; i<menorElemento; i++){
            pot = pot.multiply(new BigInteger(Integer.toString(mayorElemento)));
        }
        return pot.toString();
    }
    
    //Division de elemento mayor entre el menor
    public static double dividirElementos(int may, int men){
        return (double) may / men;
    }
    
    //Metodo que ordena de mayr a menor un vector
    public static int [] ordenarDiagonalPrincipal(int mat[][]){
        int vector[] = new int[mat.length];//Inicializamos el vector
        //Añadimos la diagonal principal al vector
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if (i == j){
                    vector[i] = mat[i][j];
                }
            }
        }
        //Ordenamos de mayor a menor el vector
        for(int i=0; i<mat.length;i++){
            for(int j=0; j<mat.length-i-1; j++){
                if (vector[j] < vector[j+1]){
                    int temp = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = temp;
                }
            }
        }  
        return vector;
    }
    
    public static void mostrarVector(int vector[]){
        for(int i=0; i<vector.length; i++){
            System.out.printf("%-2d"+",", vector[i]);
        }
        System.out.println("");
    }
}
