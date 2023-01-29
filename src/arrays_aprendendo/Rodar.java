package arrays_aprendendo;
import java.util.Scanner;

public class Rodar {
	
	 public static void main(String[] args) {
		 
		 Scanner leitor = new Scanner(System.in);
		 String[] cars = {"pao", "queijo", "mortadela", "pizza"};
		 String sim = "sim";
		 System.out.println("esse é o formato original");
	     
	     int valorVetor = cars.length;
	     /*for(int i = 0; i <= valorVetor; i++) {
			 System.out.println(cars[i]);
		 }*/
	     System.out.println("valor total do vetor" + cars.length);
	     int i = 0;
	     while (i < valorVetor) {
	    	 System.out.println(cars[i]);
	    	 i++;
	     }
	     
		 System.out.println("digite deseja adicionar?");
	     String decicao = leitor.next();
	    
		 
		 if (decicao.equals(sim)) {
			 System.out.println("digite o nome a ser adicionado");
		     String novo = leitor.next();
		     System.out.println("digite o posicao a ser adicionado");
		     int posicao = leitor.nextInt();   
		     cars[posicao] = novo;
		     System.out.println(cars[posicao]);
		     
			 
			 for(int j = 0; i == cars.length; i++) {
				 System.out.println(cars[j]);
				 
			 }
		 }
		 else {
			 for(int u = 0; i == cars.length; i++) {
				 System.out.println(cars[u]);
				 
			 }
			 
		 }
	 }
	 
}
