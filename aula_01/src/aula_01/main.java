package aula_01;

public class main {

	public static void main(String[] args) {
		System.out.println("Primeiro programa : Estudando");
		System.out.println("Meu primeiro programa em java !!");
		System.out.println("");
		//Constantes
		final int vida_maxima = 10;
		
		System.out.println("Constante " + vida_maxima);
		
		System.out.println("");
		//Arrays
		
		String[] nome = new String[5];
		nome[0] = "Conde";
		nome[1] = "Vitor";
		
		System.out.println(nome[1]+" "+nome[0]);
		
		
		String[][] var2 = new String[5][5];
		var2[0][0] = "Vitor";
		
		System.out.println("Array multi Dimensional "+var2[0][0]);
		System.out.println("");
		//Condi��es
		
		int vida = 100;
		
		if(vida == 100) {
			vida++;
			vida+=100;
			System.out.println("Minha vida � "+vida);
		}else {
			System.out.println("Minha vida n�o � 100, � "+vida);
		}
		
		
		String nome2 = "Vitor";
		
		if(nome2 == "Vitor") {
			System.out.println("Nome � igual a Vitor");
		}else if(nome2 != "Jo�o") {
			System.out.println("Nome n�o � Jo�o, � "+nome2);
		}
		System.out.println("");
		//Switch e Case
		
		
		int vida2 = 100;
		
		switch(vida2)
		{
			case 90:
			// Executar
				System.out.println("Personagem corra mais rapido");
			break;
			case 30:
				System.out.println("Minha vida � igual a 30");
			break;
			default:
				System.out.println("Nenhuma condi��o bateu! Tenho 100 de vida");
		}
		System.out.println("");
		//Opera��es avan�adas e opera��es matem�ticas
		
		int vida_1 = 100;
		int vida_2 = 200;
		int vida_final = vida_1 + vida_2;
		
		System.out.println("Minha vida final � de : "+vida_final);
		
		int vida_final2 = (vida_1 + vida_2) / 2;
		
		System.out.println("Minha vida final 2 � de : "+vida_final2);
		
		String nome_jogador = "Vitor Conde";
		int idade2 = 25;
		
		if(nome_jogador == "Vitor Conde" && idade2 == 25) {
			System.out.println("Condi��o E");
		}
		if(nome_jogador == "Vitor Conde" || idade2 == 30) {
			System.out.println("Condi��o OU");
		}
		
		System.out.println("");
		//Loopings
		
		int contador = 0;
		
		while(contador <10) {
			System.out.println(" Contador while em "+contador);
			contador++;
		}
		

		for(int i = 0;i<10;i++) {
			System.out.println("Contador for em "+i);
		}
		
		contador = 0;
		do {
			System.out.println("Contador Do while em"+contador);
			contador++;
		}while(contador<3);
		
	}
	
}
