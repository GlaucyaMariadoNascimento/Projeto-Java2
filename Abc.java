package br.com.generation.voluntariado;

import java.util.Scanner;

public class Abc {

	void abc() {
		
        System.out.println("Escolha uma cidade do ABC Paulista: "
                + "\n[1] Santo Andr� \n[2] S�o Bernardo do Campo");
        Scanner entrada = new Scanner (System.in);
        int voluntariarAbc, regAndre, regBernardo;
        voluntariarAbc=entrada.nextInt();
        if(voluntariarAbc==1) {
        
        System.out.println("Escolha uma das institui��es para saber mais: \n[1] Am�lia Rodrigues\n[2] Projeto J.E.D.A\n[3] Casa do Caminho Ananias\n[4] AVSSA");
        	
        regAndre=entrada.nextInt();
        if(regAndre==1) {
        	System.out.println("Raz�o Social: Institui��o Assistencial e Educacional Am�lia Rodrigues \n"
    				+ "Descri��o: A Institui��o Am�lia Rodrigues tem como objetivo proporcionar o desenvolvimento \n"
    				+ "integral de crian�as e oferecer condi��es de trabalho �s m�es, visando melhoria na renda familiar. \n"
    				+ "�rea de Atua��o: Educa��o \n"
    				+ "R. Tamarutaca, 190 \n"
    				+ "Vila Guiomar \n"
    				+ "CEP 09071-130 \n"
    				+ "ameliarodrigues@ameliarodrigues.org.br \n"
    				+ "www.ameliarodrigues.org.br \n");
    				
        }
        else if(regAndre==2) {
    		System.out.println("Raz�o Social: Assoc.Civil Projeto Juventude Esperan�a do Amanh� \n"                		
    				+ "�rea de Atua��o: Educa��o"
    				+ "Descri��o: O JEDA atua na defesa dos direitos de crian�as, adolescentes e suas fam�lias,\n"
    				+ "executando a��es que previnem a ocorr�ncia de situa��es de risco social e fortalecendo a \n"
    				+ "conviv�ncia familiar e comunit�ria. \n"
    				+ "R. Dr. Eduardo Monteiro, 946 \n"
    				+ "Jd. Bela Vista \n"
    				+ "CEP 09041-300 \n"
    				+ "projetojeda@aol.com \n"
    				+ "http://www.projetojeda.org.br/index.html \n");
        }
        else if(regAndre==3) {
    		System.out.println("Raz�o Social: Institui��o Assistencial Casa do Caminho Ananias \n"
    				+ "�rea de Atua��o: Assist�ncia a idosos e adultos \n"
    				+ "Descri��o: A Casa do Caminho Ananias oferece acolhimento de idosas acamadas e o fortalecimento \n"
    				+ "de v�nculos para crian�as, adolescentes e fam�lias em situa��o de vulnerabilidade social e econ�mica. \n"
    				+ "Rua Andorinhas, n� 09 \n"
    				+ "Jardim do Sol \n"
    				+ "CEP 09071-120 \n"
    				+ "https://www.casadocaminhoananias.org.br/ \n");
        }
        else if(regAndre==4) {
    		System.out.println("Raz�o Social: Associa��o dos Volunt�rios da Sa�de de Santo Andr� - AVSSA \n"
    				+ "Descri��o: A Associa��o busca humanizar o atendimento da rede p�blica de sa�de de Santo Andr� \n"
    				+ "atrav�s de a��es de apoio e acolhimento. \n"
    				+ "�rea de Atua��o: Sa�de \n"
    				+ "Av. Jo�o Ramalho, 305 \n"
    				+ "Vila Assun��o \n"
    				+ "CEP 09041-030 \n"
    				+ "mariaemilia@avssa.org.br \n"
    				+ "www.avssa.org.br \n");
        }
        else {
    		System.out.println("Voc� digitou um n�mero inv�lido");
        }
    	
 }
    
        else if(voluntariarAbc==2) {
      
    	System.out.println("Escolha uma das institui��es para saber mais: \n[1] Casa dos Velhinhos Dona Adelaide\n[2] IAIP - Irm�o Palminha\n[3] AGDS\n[4] Casa de Estar S�o Luiz\n[5] Instituto Mam�e Clory");
    	
        regBernardo=entrada.nextInt();
        if(regBernardo==1) {
    		System.out.println("Raz�o Social: Casa dos Velhinhos Dona Adelaide \n"
    				+ "Descri��o: A institui��o promove a qualidade de vida e inclus�o social da pessoa idosa em situa��o \n"
    				+ "de vulnerabilidade atrav�s de moradia e atividades sociais. \n"
    				+ "�rea de Atua��o: Assist�ncia a idosos e adultos \n"
    				+ "Rua Pr�ncipe Humberto, 250 \n"
    				+ "Campestre \n"
    				+ "CEP 09725-200 \n"
    				+ "contato@velhinhosadelaide.org.br \n"
    				+ "http://velhinhosadelaide.org.br/ \n"
    				);
        }
        else if(regBernardo==2) {
    		System.out.println("Raz�o Social: Institui��o Assistencial Irm�o Palminha \n"                		
    				+ "�rea de Atua��o: Assist�ncia a crian�as \n"
    				+ "Descri��o: A IAIP realiza atendimento socioassistencial para fam�lias em situa��o de vulnerabilidade, \n"
    				+ "exclus�o e risco social pois acredita que o n�cleo familiar, independente de sua organiza��o, � o primeiro\n"
    				+ "espa�o de refer�ncia, prote��o e socializa��o do indiv�duo. \n"
    				+ "Rua Benedito Conrado Filho, 65 \n"
    				+ "Jardim Beatriz \n"
    				+ "CEP 09895-110 \n"
    				+ "palminha@palminha.org.br \n"
    				+ "www.iaip.org.br \n");
        }
        else if(regBernardo==3) {
    		System.out.println("Raz�o Social: Assoc.Global para o Desenvolvimento Sustentado \n"
    				+ "�rea de Atua��o: Ambientalismo \n"
    				+ "Descri��o: A Associa��o desenvolve e implanta projetos e programas de educa��o ambiental, gest�o \n"
    				+ "e recupera��o de �reas a serem preservadas nos diversos biomas brasileiros e representa a sociedade \n"
    				+ "junto aos f�runs oficiais em temas relacionados � educa��o e ao meio ambiente. \n"
    				+ "Av.Vivaldi, 1421 \n"
    				+ "Rudge Ramos \n"
    				+ "CEP 09617-000 \n"
    				+ "agds@agds.org.br \n"
    				+ "www.agds.org.br \n");
        }
        else if(regBernardo==4) {
    		System.out.println("Raz�o Social: Associa��o S�o Luiz \n"
    				+ "Descri��o: A entidade promove o acolhimento e a preserva��o dos v�nculos familiares, sociais \n"
    				+ "e comunit�rios atrav�s do exerc�cio da cidadania. Oferece atendimento e acompanhamento m�dico,\n"
    				+ "odontol�gico e psicol�gico, atividades pedag�gicas e recreativas e tratamento especializado para\n"
    				+ "crian�as com necessidades especiais. \n"
    				+ "�rea de Atua��o: Assist�ncia a crian�as \n"
    				+ "R. Miguel Arco e Flecha, 41 \n"
    				+ "Vila Euclides \n"
    				+ "CEP 09725-500 \n"
    				+ "https://associacaosaoluiz.org.br/ \n");
        }
        else if(regBernardo==5) {
    		System.out.println("Raz�o Social: Lar da Mam�e Clory \n"
    				+ "Descri��o: O Lar da Mam�e Clory atua com o objetivo de amparar e assistir crian�as e adolescentes \n"
    				+ "e mant�m diversas atividades como creche, apoio educacional, cultural e esportivo, n�cleo de educa��o \n"
    				+ "ambiental e n�cleo de atendimento � fam�lia. \n"
    				+ "�rea de Atua��o: Assist�ncia e servi�os sociais \n"
    				+ "R. Francisco Visentainer, 438 \n"
    				+ "Assun��o \n"
    				+ "CEP 09861-630 \n"
    				+ "diretoria@mamaeclory.org.br \n"
    				+ "www.mamaeclory.org.br \n");
        }
        else {
    	     System.out.println("Voc� digitou um n�mero inv�lido");
        }
}
         entrada.close();
    }
}
