package br.com.generation.voluntariado;

import java.util.Scanner;

public class Teste_sul {

	void sul() {
		
		Scanner entrada =new Scanner(System.in);
		int  regSul;
		System.out.println("Escolha uma das institui��es para saber mais: \n[1] Associa��o Beneficente Parsifal\n[2] GRAACC - Grupo de Apoio a Adolescentes e � Crian�a com C�ncer\n[3] Funda��o Bunge\n[4] Assoc.Desportiva para Deficientes");
		regSul=entrada.nextInt();
		
    	if(regSul==1) {
    		System.out.println("Raz�o Social: Assoc.Beneficente Parsifal \n"
    				+ "Descri��o: A Parsifal, institui��o de Pedagogia Curativa e Terapia Social, foi fundada em 1991 \n"
    				+ "e tem como objetivo promover o desenvolvimento pessoal e o conv�vio social de crian�as, jovens \n"
    				+ "e adultos com defici�ncias e dist�rbios ps�quicos. \n"
    				+ "�rea de Atua��o: Assist�ncia a pessoas com defici�ncia \n"
    				+ "R.Rob�lia 59 \n"
    				+ "Jardim Prud�ncia \n"
    				+ "CEP 04648-240 \n"
    				+ "(11) 5547 0201 \n"
    				+ "aparsifal@terra.com.br \n"
    				+ "https://parsifal.org.br");
    	}
    	else if(regSul==2) {
    		System.out.println("Raz�o Social: GRAACC - Grupo de Apoio a Adolescentes e � Crian�a com C�ncer \n"                		
    				+ "Descri��o: Garantir a crian�as e adolescentes com c�ncer, dentro do mais avan�ado padr�o cient�fico,\n"
    				+ "o direito de alcan�ar todas as chances de cura com qualidade de vida. \n"
    				+ "�rea de Atua��o: Assist�ncia a crian�as \n"
    				+ "R.Botucatu 743 \n"
    				+ "Vila Clementino \n"
    				+ "CEP 04023-062  \n"
    				+ "(11) 5080 8400 \n"
    				+ "graacc@graacc.org.br \n"
    				+ "www.graacc.org.br");
    	}
    	else if(regSul==3) {
    		System.out.println("Raz�o Social: Funda��o Bunge \n"
    				+ "Descri��o: Contribuir para o desenvolvimento sustent�vel por meio de a��es que valorizem o avan�o da ci�ncia,\n"
    				+ "a educa��o e a conserva��o dos recursos naturais. \n"
    				+ "�rea de Atua��o: Educa��o e pesquisa \n"
    				+ "Av.Maria Coelho Aguiar 215 Bloco D - 5� andar \n"
    				+ "Jardim S�o Luiz \n"
    				+ "CEP 05804-900 \n"
    				+ "(11) 3741 6832 \n"
    				+ "fundacao@bunge.com.br \n"
    				+ "www.fundacaobunge.org.br");
    	}
    	else if(regSul==4) {
    		System.out.println("Raz�o Social: ADD- Assoc.Desportiva para Deficientes \n"
    				+ "Descri��o: Miss�o Incentivar e promover o desenvolvimento e a inclus�o de pessoas com defici�ncia por meio \n"
    				+ "do esporte e do apoio educacional em �mbito nacional. Princ�pios e Valores: ADD valoriza os talentos \n"
    				+ "e capacidades das pessoas, apoiando-se em princ�pios �ticos e morais. \n"
    				+ "�rea de Atua��o: Assist�ncia a pessoas com defici�ncia \n"
    				+ "Rua das Pitombeiras, 296 \n"
    				+ "Vila Parque Jabaquara \n"
    				+ "CEP 04321-160 \n"
    				+ "(11) 50116133 \n"
    				+ "contato@add.org.br \n"
    				+ "www.add.org.br \n"
    				+ "addassociacao \n"
    				+ "@addaddociacao");
    	}
    	else {
    		System.out.println("Voc� digitou um n�mero inv�lido");
    	}
    	entrada.close();
    	}

	}