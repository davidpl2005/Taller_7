package Taller7.Ejercicio2;

public class Matematicas {


    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        System.out.println("Suma: " + suma(num1, num2));            
        System.out.println("Resta: " + resta(num1, num2));            
        System.out.println("Multiplicación: " + multiplicacion(num1, num2)); 
        System.out.println("División: " + division(num1, num2));
    }
}