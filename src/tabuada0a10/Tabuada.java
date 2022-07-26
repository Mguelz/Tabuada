package tabuada0a10;

public class Tabuada {
	
	public static void main(String[] args) {
		//for (int j = 10; j > 0; j--) {
			//System.out.println(j);
		//}
		
		System.out.println("TABUADA");
		for (int tabuada = 1; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor<= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}

	}
}
