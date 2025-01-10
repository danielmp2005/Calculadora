import java.util.Scanner;

public class Calculadora {
    private double operando1;
    private double operando2;

    public void reset() {
        this.operando1 = 0.0;
        this.operando2 = 0.0;
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    // Métodos para las operaciones básicas
    public double sumar() {
        return operando1 + operando2;
    }

    public double restar() {
        return operando1 - operando2;
    }

    public double multiplicar() {
        return operando1 * operando2;
    }

    public double dividir() {
        if (operando2 != 0) {
            return operando1 / operando2;
        } else {
            System.out.println("Error: División por cero no permitida.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Primer operando: ");
                calculadora.setOperando1(scanner.nextDouble());

                System.out.print("Segundo operando: ");
                calculadora.setOperando2(scanner.nextDouble());

                double resultado;
                switch (opcion) {
                    case 1:
                        resultado = calculadora.sumar();
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = calculadora.restar();
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = calculadora.multiplicar();
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        resultado = calculadora.dividir();
                        if (!Double.isNaN(resultado)) {
                            System.out.println("Resultado: " + resultado);
                        }
                        break;
                }
            } else if (opcion == 5) {
                salir = true;
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}