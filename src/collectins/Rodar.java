package collectins;
import java.util.ArrayList;
import java.util.Scanner;

public class Rodar {

	public static void main(String[] args) {
		ArrayList<String> nome = new ArrayList<String>();
		//ArrayList<String> numero = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		Adicionar adicionar = new Adicionar();
		Pesquisar pesquisar = new Pesquisar();
		Remover remover = new Remover();
		int pp = 1;
		
		
		while(pp >= 1) {
		System.out.println("------*estoque*------\n ***escolha um numero para dar andamento***"
				+ "\n-----------------------------------------------------------------------------------------------"
				+ "\n 1.adicionar novo iten\n 2.pesquisar iten\n 3.remover iten\n 4.sair");
		System.out.println("------------------------------------------------------------------------------------");
		int escolha = ler.nextInt();
		System.out.println("------------------------------------------------------------------------------------");
		
		
		if(escolha == 1) {
			int escolhalop = 1;
			  while(escolhalop >= 1) {
			  int idnome = nome.size();
			  System.out.println(" o codigo dos item estar na ordem cresente do 0 ao *" +idnome+ 
					  "\n* Portanto escolha algum codigo de rastrei aparti do ultimo numero na ordem "
					  + "\n----------------------------------------------------------------------------------------------");
			  //int idnumero = nome.size();
			  System.out.println("digite o nome do iten a ser adicionado");
			  String novoNome = ler.next();
			  
			  System.out.println("digite o codigo do iten a ser adicionado");
			  int codigo = ler.nextInt();
			  
			  nome.add(codigo, novoNome);
			  //numero.add(idnumero, novoNumero);
			  System.out.println("deseja \n 1.continuar \n 2.voltar ao menu \n 3.sai");
			  String escolha1 = ler.next();
			  if(escolha1.equals("1")){
				  escolhalop++;
			  }
			  else {
				  escolhalop = 0;
				  System.out.println("todos itens que foram adicionado");
				  System.out.println(nome);
				  //System.out.println(numero);
				  pp = 2;
			  }
			  if(escolha1 == "3") {
				  pp = 0;
			  }
			 }
		}
		
        if(escolha == 2) {
        	
        	  System.out.println("sabe o indice do item \n 1.sim \n 2.não");
			  int escolhaindice = ler.nextInt();
			  
        	if(escolhaindice == 2) {  
        		System.out.println("digite o nome do item");
	        	String nomei = ler.next();
	        	int indice = nome.indexOf(nomei);

	        	System.out.println("O valor " + nomei + " está na posição: " + indice);
	        	System.out.println("digite o nome do indice do item");
	        	int indicei = ler.nextInt();
	        	System.out.println(nome.get(indicei));
	        	
        	}else {
        		
        	System.out.println("digite o nome do indice do item");
        	int indicei = ler.nextInt();
        	System.out.println(nome.get(indicei));
        	}
			
		}
        if(escolha == 3) {
			
		}
        if(escolha == 4) {
			
		}
	 }
	}
}
		/*switch(escolha) {
		  case 1:
			  System.out.println("digite o nome do iten a ser adicionado");
			  String novoNome = ler.next();
			  System.out.println("digite o codigo do iten a ser adicionado");
			  String novoNumero = ler.next();
			  nome.add(novoNome);
			  numero.add(novoNumero);
			  System.out.println("iten adicionado : ");
			  System.out.println("-->" + novoNome);
			  System.out.println("-->" + novoNumero);
			  
			  System.out.println("todos itens");
			  for (int i = 0; i < nome.size(); i++) {
			      System.out.println(nome.get(i));
			      System.out.println(numero.get(i));
			    }
			  break;
		///////////////////
		  case 2:
			  System.out.println("digite ");
			  System.out.println(nome.get(1));
		    break;
		  case 3:
			    // code block
			    break;
		  case 4:
			    // code block
			    break;
		  default:
		    // code block
	}*/
/*lista.add("paste");
lista.add("pizza");
lista.add("presunto");
System.out.println(lista);*/