package br.com.generation.voluntariado;

import java.util.Scanner;

public class Norte {
	
	void norte() {
		
		Scanner entrada =new Scanner(System.in);
		int  regNorte;
		System.out.println("Escolha uma das institui��es para saber mais: \n[1] Instituto Resgatando Vidas\n[2] Associa��o Tia Marly\n[3] Associa��o Cultural e Esportiva Viva ZN\r\n[4] Moradia Associa��o Civil\r\n");
		regNorte=entrada.nextInt();
		
    	if(regNorte==1) {
    		System.out.println("Raz�o Social: Instituto Resgatando Vidas Para Vida \n"
    				+ "Descri��o: Tem como objetivo principal promover cidadania e transforma��o social atrav�s da educa��o \n"
    				+ "e empreendedorismo junto � popula��o aos arredores do bairro da Vila Nova Cachoeirinha \n"
    				+ "�rea de Atua��o: Cidadania e vida \n"
    				+ "Rua Augusto Gil 465 \n"
    				+ "Vila Dionisia \n"
    				+ "CEP  02670-070 \n"
    				+ "(11) 3774-5981 \n"
    				+ "contato@institutoresgatandovidas.org.br"
    				);
    	}
    	else if(regNorte==2) {
    		System.out.println("Raz�o Social: Associa��o Tia Marly \n"                		
    				+ "Descri��o: A associa��o Tia Marly � uma organiza��o social, n�o conveniada a �rg�os p�blicos, \n "
    				+ "sem fins lucrativos, fundada em 27 de junho de 2007, atrav�s da iniciativa de um grupo de amigos. \n "
    				+ "Na unidade s�o oferecidas 17 vagas para acolhida integral de crian�as e adolescentes de 0 a 17 anos e 11 meses.\n"
    				+ "V�timas de maus tratos, abuso, viol�ncia e abandono. \n"
    				+ "�rea de Atua��o: Assist�ncia a crian�as \n"
    				+ "Rua Duarte de Azevedo 608 \n"
    				+ "Santana- SP \n"
    				+ "CEP 02036-022 \n"
    				+ "(11) 2099-3725 \n"
    				+ "marly@casatiamarly.org.br");
    	}
    	else if(regNorte==3) {
    		System.out.println("Raz�o Social: Associa��o Cultural e Esportiva Viva ZN \n"
    				+ "Descri��o: A Viva ZN � uma entidade sem fins lucrativos que acredita no potencial que a cultura, \n"
    				+ "a educa��o e o esporte t�m para transformar a realidade social de crian�as e adolescentes que vivem em regi�es perif�ricas. \n"
    				+ "�rea de Atua��o: Cultura, educa��o e esportes \n"
    				+ "Rua Engenheiro C�sar 76 \n"
    				+ "Santana - SP \n"
    				+ "CEP 02018-070 \n"
    				+ "(11) 9989-6654 \n"
    				+ "associacaovivazn@gmail.com \n");
    	}
    	else if(regNorte==4) {
    		System.out.println("Raz�o Social: Moradia Associa��o Civil \n"
    				+ "Descri��o: As Casas Taiguara s�o Casas de Acolhimento e Abrigos para crian�as e adolescentes sem moradia,\n"
    				+ "principalmente aqueles que est�o nas ruas de S�o Paulo. Desde 1996, seguem uma metodologia de trabalho \n"
    				+ "pioneira e atuante: o acolhimento 24 horas, oferecendo moradia segura, volta � escola, boa alimenta��o e calor humano. \n"
    				+ "�rea de Atua��o: Acolhimento e abrigos para moradores de rua \n"
    				+ "Rua Felipe Fragoso 177 \n"
    				+ "Bairro Freguesia do � \n"
    				+ "CEP 02558-060 \n"
    				+ "(11) 3951-6987 \n"
    				+ "valeriagonpassaro@gmail.com");
    	}
    	else {
    		System.out.println("Voc� digitou um n�mero inv�lido");
    	}
    	entrada.close();

    }
}

