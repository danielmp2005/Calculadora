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
	
	public static void main(String [] args) {
		Scanner tecInt = new Scanner(System.in);
		System.out.println("Primer parámetro: ");
		
	}
}
