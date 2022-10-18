package capitulo2;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		float base_imponible = (float)32.60;
		int IVA = 21;
		
		float total = base_imponible + base_imponible*IVA/100;
		
		System.out.print("El total es ");
		System.out.printf("%.2f", total);
		System.out.print(" euros");
		
		
	}

}
