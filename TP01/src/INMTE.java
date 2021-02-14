
/* O objetivo desse trabalho é coletar e gerar previsões sobre os
dados meteorológicos brasileiros para o INMTE( Instituto Nacional de Meteorologia)
Nome: Hiterson
Matricula: 130114227
*/

import java.util.Scanner;
public class INMTE {

	
	// função que verifica se foram inseridos dados de temperatura
	// Se a soma de todos os valores forem zeros, então, nao está inserido nada.
	// Mas se for 0.01, por exemplo, então está inserido alguma temperatura.
	
	 static double verifica(double[] vetor) {
			double soma = 0;
			for(int i = 0; i < vetor.length; i++ ) {
				
				soma = soma + vetor[i];
			}
			
			return soma;
	 }
	 
	// função que calcula a média das temperatura do mês
	 
	 static double mediaTemp(double[] vetor) {
		    double media;
			double soma = 0;
			double N = vetor.length;
			for(int i = 0; i < vetor.length; i++ ) {
				
				soma = soma + vetor[i];
			}
			
			media  = soma/N;
			
			return media;
	 } 
	  	
// função que encontra o menor valor de temperatura do mês
	 
	 static double menorValorTemp(double[] vetor) {
		 
		    double  menor = vetor[0];
		  
			for(int i = 0; i < vetor.length; i++) {
				
				  if (vetor[i] < menor) {
				     menor = vetor[i];
			}		
	 } 
	 		
			return menor;
}	 
	 	
// função que encontra os dias dos menores valores	 
	 
	 static void EncontraMenor(double[] vetor, double menor, int mes, int ano) {
		 int cont = 0;
		 
		 for(int i = 0; i < vetor.length; i++) {
				
			  if (vetor[i] == menor) {
				 cont = i+1;
			     System.out.println(" O menor valor de temperatura ocorreu no dia " + cont + " mês " + mes + " ano " + ano );
		     }
			  cont = 0;
         } 
		  
	 }
	 	 
 // função que encontra o maior valor de temperatura do mês
	 
	 static double maiorValorTemp(double[] vetor) {
		 
		    double  maior = vetor[0];
		  
			for(int i = 0; i < vetor.length; i++) {
				
				  if (vetor[i] > maior) {
				     maior = vetor[i];
			}		
	 } 
	 		
			return maior;
	 }	 
	 		 
	 
	 
	// função que encontra os dias dos maiores valores	 
	 
		 static void EncontraMaior(double[] vetor, double maior, int mes, int ano) {
			 int cont = 0;
			 
			 for(int i = 0; i < vetor.length; i++) {
					
				  if (vetor[i] == maior) {
					 cont = i+1;
				     System.out.println(" O maior valor de temperatura ocorreu no dia " + cont + " mês " + mes + " ano " + ano );
			     }
				  cont = 0;
	         } 
			  
		 }

	// função que mostra a media dos dias do mês	 
		 
		 static void MostraMediaDias(double[] vetor) { 
		        
			 int cont = 0;
			 System.out.println(" A média dos dias do mês!! ");
			 System.out.println("  ");
			 
			 for(int i = 0; i < vetor.length; i++) {
				 cont = i + 1;
				 System.out.println(" A média do dia " + cont + " é: " + vetor[i] );
				 cont = 0;
	         } 
			 
		 }
		 
	// função que cadastra as médias da temperatura dos dias	
		 
	static void CadastroTemp(double[] vetor, int mes, int ano) {
				Scanner ler = new Scanner(System.in);
				int dia;
				for(int c = 1; c <= vetor.length; c++ ) {
					System.out.println("Digite a temperatura média do ano " + ano +" do mês " + mes + " do dia " + c );
					dia = ler.nextInt();
					vetor[c-1] = dia;
				}
				
				
			}
		  
		 
	public static void main(String[] args) {
		
		// Variaveis
	
		int escolha; // escolha do menu
		int mes;    // mês
		int ano;    // ano
		int n;      // saida do programa
		double t;   // verifica se tem algo inserido nos vetores
		double media; // média das temperaturas
		double menor; // menor temperatura
		double maior; // maior temperatura
		
		// ano 2011
		
		double jan2011[] = new double [31];
		double feve2011[] = new double [28]; 
		double mar2011[] = new double [31]; 
		double abril2011[] = new double [30]; 
		double mai2011[] = new double [31]; 
		double junh2011[] = new double [30]; 
		double julh2011[] = new double [31]; 
		double agos2011[] = new double [31]; 
		double setem2011[] = new double [30]; 
		double outu2011[] = new double [31]; 
		double novem2011[] = new double [30]; 
		double decem2011[] = new double [31]; 
		// ano 2012
		double jan2012[] = new double [31]; 
		double feve2012[] = new double [29]; 
		double mar2012[] = new double [31]; 
		double abril2012[] = new double [30]; 
		double mai2012[] = new double [31]; 
		double junh2012[] = new double [30]; 
		double julh2012[] = new double [31]; 
		double agos2012[] = new double [31]; 
		double setem2012[] = new double [30]; 
		double outu2012[] = new double [31]; 
		double novem2012[] = new double [30]; 
		double decem2012[] = new double [31]; 
		// ano 2013
		double jan2013[] = new double [31]; 
		double feve2013[] = new double [28]; 
		double mar2013[] = new double [31]; 
		double abril2013[] = new double [30]; 
		double mai2013[] = new double [31]; 
		double junh2013[] = new double [30]; 
		double julh2013[] = new double [31]; 
		double agos2013[] = new double [31]; 
		double setem2013[] = new double [30]; 
		double outu2013[] = new double [31]; 
		double novem2013[] = new double [30]; 
		double decem2013[] = new double [31]; 
		// ano 2014
		double jan2014[] = new double [31]; 
		double feve2014[] = new double [28]; 
		double mar2014[] = new double [31]; 
		double abril2014[] = new double [30]; 
		double mai2014[] = new double [31]; 
		double junh2014[] = new double [30]; 
		double julh2014[] = new double [31]; 
		double agos2014[] = new double [31]; 
		double setem2014[] = new double [30]; 
		double outu2014[] = new double [31]; 
		double novem2014[] = new double [30]; 
		double decem2014[] = new double [31]; 
		// ano 2015
		double jan2015[] = new double [31]; 
		double feve2015[] = new double [28]; 
		double mar2015[] = new double [31]; 
		double abril2015[] = new double [30]; 
		double mai2015[] = new double [31]; 
		double junh2015[] = new double [30]; 
		double julh2015[] = new double [31]; 
		double agos2015[] = new double [31]; 
		double setem2015[] = new double [30]; 
		double outu2015[] = new double [31]; 
		double novem2015[] = new double [30]; 
		double decem2015[] = new double [31]; 
		// ano 2016
		double jan2016[] = new double [31]; 
		double feve2016[] = new double [29]; 
		double mar2016[] = new double [31]; 
		double abril2016[] = new double [30]; 
		double mai2016[] = new double [31]; 
		double junh2016[] = new double [30]; 
		double julh2016[] = new double [31]; 
		double agos2016[] = new double [31]; 
		double setem2016[] = new double [30]; 
		double outu2016[] = new double [31]; 
		double novem2016[] = new double [30]; 
		double decem2016[] = new double [31]; 
		// ano 2017
		double jan2017[] = new double [31]; 
		double feve2017[] = new double [28]; 
		double mar2017[] = new double [31]; 
		double abril2017[] = new double [30]; 
		double mai2017[] = new double [31]; 
		double junh2017[] = new double [30]; 
		double julh2017[] = new double [31]; 
		double agos2017[] = new double [31]; 
		double setem2017[] = new double [30]; 
		double outu2017[] = new double [31]; 
		double novem2017[] = new double [30]; 
		double decem2017[] = new double [31]; 
		// ano 2018
		double jan2018[] = new double [31]; 
		double feve2018[] = new double [28]; 
		double mar2018[] = new double [31]; 
		double abril2018[] = new double [30]; 
		double mai2018[] = new double [31]; 
		double junh2018[] = new double [30]; 
		double julh2018[] = new double [31]; 
		double agos2018[] = new double [31]; 
		double setem2018[] = new double [30]; 
		double outu2018[] = new double [31]; 
		double novem2018[] = new double [30]; 
		double decem2018[] = new double [31]; 
		// ano 2019
		double jan2019[] = new double [31]; 
		double feve2019[] = new double [28]; 
		double mar2019[] = new double [31]; 
		double abril2019[] = new double [30]; 
		double mai2019[] = new double [31]; 
		double junh2019[] = new double [30]; 
		double julh2019[] = new double [31]; 
		double agos2019[] = new double [31]; 
		double setem2019[] = new double [30]; 
		double outu2019[] = new double [31]; 
		double novem2019[] = new double [30]; 
		double decem2019[] = new double [31]; 
		// ano 2020
		double jan2020[] = {1,2,5,7,8,9,10,32,4,-4,-5,-10,-6,8,6,25,26,27,27,6,9,7,6,10,11,30,26,29,29,9,5};  //31
		double feve2020[] = new double [29]; 
		double mar2020[] = new double [31]; 
		double abril2020[] = new double [30]; 
		double mai2020[] = new double [31]; 
		double junh2020[] = new double [30]; 
		double julh2020[] = new double [31]; 
		double agos2020[] = new double [31]; 
		double setem2020[] = new double [30]; 
		double outu2020[] = new double [31]; 
		double novem2020[] = new double [30]; 
		double decem2020[] = new double [31]; 
	
		do {
		Scanner ler = new Scanner(System.in);
		System.out.print(" ----- Menu do INMTE -----  \n -- Ano 2011 a 2020 -- \n 1 - Entradas das Temperaturas\n 2 - Cálculo da temperatura média\n 3 - Cálculo da temperatura minima\n 4 - Cálculo da temperatura máxima\n 5 - Relatório meteorológico \n ");	
		System.out.print("Escolha uma opção?\n ") ;
		escolha = ler.nextInt();
				
		
		if(escolha >= 1 && escolha <=5 ) {
			if (escolha == 1) {
				
				System.out.print("Digite o ano entre 2011 a 2020 para cadastrar as temperaturas!! \n ") ;
				ano = ler.nextInt();

				switch(ano) {
				
				case 2011: 
					System.out.print("Digite o mês para cadastrar as temperaturas!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						CadastroTemp(jan2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						
						CadastroTemp(feve2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						CadastroTemp(mar2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						
						CadastroTemp(abril2011,mes,ano);
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						
						CadastroTemp(mai2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						
						CadastroTemp(junh2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						
						CadastroTemp(julh2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						
						CadastroTemp(agos2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						
						CadastroTemp(setem2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
						
                	   CadastroTemp(outu2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
						
                	   CadastroTemp(novem2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
						
                	   CadastroTemp(decem2011,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					
				   break;
				   
				case 2012: 
					
					System.out.print("Digite o mês para cadastrar as temperaturas!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						CadastroTemp(jan2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperaturas média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						CadastroTemp(feve2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperaturas média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						CadastroTemp(mar2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						
						CadastroTemp(abril2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						CadastroTemp(mai2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						CadastroTemp(junh2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						
						CadastroTemp(julh2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						
						CadastroTemp(agos2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						
						CadastroTemp(setem2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
						
                	   CadastroTemp(outu2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
						
                	   CadastroTemp(novem2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
                	    CadastroTemp(decem2012,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					  
				     break;
				     
				case 2013:
					
					System.out.print("Digite o mês para cadastrar as temperatura!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						
						CadastroTemp(jan2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						CadastroTemp(feve2013,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						
						CadastroTemp(mar2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						
						CadastroTemp(abril2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						
						CadastroTemp(mai2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						
						CadastroTemp(junh2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						
						CadastroTemp(julh2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						
						CadastroTemp(agos2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						
						CadastroTemp(setem2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
                	   CadastroTemp(outu2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
                	   CadastroTemp(novem2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
                	    CadastroTemp(decem2013,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					
				     break;
				     
				case 2014:
					 
					System.out.print("Digite o mês para cadastrar as temperatura!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						CadastroTemp(jan2014,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						CadastroTemp(feve2014,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						
						CadastroTemp(mar2014,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						CadastroTemp(abril2014,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						CadastroTemp(mai2014,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						CadastroTemp(junh2014,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						CadastroTemp(julh2014,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						
						CadastroTemp(agos2014,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						
						CadastroTemp(setem2014,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
                	   CadastroTemp(outu2014,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
						
                	   CadastroTemp(novem2014,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
						
                	    CadastroTemp(decem2014,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					
				     break;
				
				case 2015:
					System.out.print("Digite o mês para cadastrar as temperatura!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						CadastroTemp(jan2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						CadastroTemp(feve2015,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						
						CadastroTemp(mar2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						CadastroTemp(abril2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						
						CadastroTemp(mai2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						
						CadastroTemp(junh2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						
						CadastroTemp(julh2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						
						CadastroTemp(agos2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						
						CadastroTemp(setem2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
                	   CadastroTemp(outu2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
						
                	   CadastroTemp(novem2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
                	   CadastroTemp(decem2015,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					
				     break;
				
				case 2016:
					
					System.out.print("Digite o mês para cadastrar as temperatura!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						
						CadastroTemp(jan2016,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						
						CadastroTemp(feve2016,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						
						CadastroTemp(mar2016,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						CadastroTemp(abril2016,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						
						CadastroTemp(mai2016,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						CadastroTemp(junh2016,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						
						CadastroTemp(julh2016,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						CadastroTemp(outu2016,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						
						CadastroTemp(setem2016,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
                	   CadastroTemp(outu2016,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
                	   CadastroTemp(novem2016,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
                	   CadastroTemp(decem2016,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					
				     break;
				     
				case 2017:
					System.out.print("Digite o mês para cadastrar as temperatura!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						
						CadastroTemp(jan2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						CadastroTemp(feve2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						CadastroTemp(mar2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						
						CadastroTemp(abril2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						
						CadastroTemp(mai2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						
						CadastroTemp(junh2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						
						CadastroTemp(julh2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						
						CadastroTemp(agos2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						
						CadastroTemp(setem2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
						
                		CadastroTemp(outu2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
						
                		CadastroTemp(novem2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
						
                		CadastroTemp(decem2017,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					
				     break;
				     
				case 2018:
					
					System.out.print("Digite o mês para cadastrar as temperatura!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						CadastroTemp(jan2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						CadastroTemp(feve2018,mes,ano);
						
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						
						CadastroTemp(mar2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperaturas média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						CadastroTemp(abril2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						CadastroTemp(mai2018,mes,ano);
						
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						
						CadastroTemp(junh2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						
						CadastroTemp(julh2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						
						CadastroTemp(agos2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						
						CadastroTemp(setem2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
						
                		CadastroTemp(outu2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
						
                		CadastroTemp(novem2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
						
                		CadastroTemp(decem2018,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					
		
				     break;
				     
				case 2019:
					
					System.out.print("Digite o mês para cadastrar as temperatura!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						
						CadastroTemp(jan2019,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						
						CadastroTemp(feve2019,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						
						CadastroTemp(mar2019,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						CadastroTemp(abril2019,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						CadastroTemp(mai2019,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						
						CadastroTemp(junh2019,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						CadastroTemp(julh2019,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						
						CadastroTemp(agos2019,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						
						CadastroTemp(setem2019,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
						
                	   CadastroTemp(outu2019,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
                	   CadastroTemp(novem2019,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
                	   CadastroTemp(decem2019,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					
				     break;
				     
				case 2020:
					 
					System.out.print("Digite o mês para cadastrar as temperatura!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de janeiro\n\n ") ;
						CadastroTemp(jan2020,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês  de janeiro!!\n ") ;
					    break;	
					
					case 2:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de fevereiro\n\n ") ;
						
						CadastroTemp(feve2020,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de fevereiro!!\n ") ;
					    break;	
						
					case 3:

						System.out.print("Digite a média das temperaturas nos dias do mês de Março\n\n ") ;
						CadastroTemp(mar2020,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Março!!\n ") ;
					    break;	
						
					case 4:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Abril\n\n ") ;
						CadastroTemp(abril2020,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Abril!!\n ") ;
					    break;	
						
					case 5:
						System.out.print("Digite a média das temperaturas nos dias do mês de Maio\n\n ") ;
						
						CadastroTemp(mai2020,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Maio!!\n ") ;
					    break;	
						
					case 6:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Junho\n\n ") ;
						
						CadastroTemp(junh2020,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Junho!!\n ") ;
					    break;
					    
					case 7:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Julho\n\n ") ;
						
						CadastroTemp(julh2020,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Julho!!\n ") ;
					    break;
						
                    case 8:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Agosto\n\n ") ;
						
						CadastroTemp(agos2020,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Agosto!!\n ") ;
					    break;	
						
                   case 9:
						
						System.out.print("Digite a média das temperaturas nos dias do mês de Setembro\n\n ") ;
						CadastroTemp(setem2020,mes,ano);
						
						System.out.print("Foram cadastradas todas as temperatura média do mês de Setembro!!\n ") ;
					    break;	
						
                   case 10:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Outubro\n\n ") ;
						
                	    CadastroTemp(outu2020,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Outubro!!\n ") ;
					    break;
                	   
                   case 11:
                	   
                	   System.out.print("Digite a média das temperaturas nos dias do mês de Novembro\n\n ") ;
						
                	   CadastroTemp(novem2020,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Novembro!!\n ") ;
					    break;
						
						
                   case 12:
                	   
                	    System.out.print("Digite a média das temperaturas nos dias do mês de Dezembro\n\n ") ;
                	    CadastroTemp(decem2020,mes,ano);
						System.out.print("Foram cadastradas todas as temperatura média do mês de Dezembro!!\n ") ;
					    break;
						
                	 default:
                		 
                		System.out.println("Mês Inválida");
             			break;
	
					}
					
				     break;
				     
				default:
					System.out.println("Ano Inválido");
					break;
				}
				
			}else if(escolha == 2) {
				
				System.out.print("Digite o ano entre 2011 a 2020 para calcular a temperatura média!! \n ") ;
				ano = ler.nextInt();

				switch(ano) {
				
				case 2011: 
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2011) ;
						if( t == 0) {
	
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2011);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2011);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2011);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2011);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2011);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2011);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2011);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2011);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2011);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2011);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2011);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2011);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					
					}
					
				break;	
				
				case 2012:
				
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2012);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2012);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2012);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2012);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2012);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2012);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2012);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2012);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2012);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2012);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2012);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2012);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					}
				
				break;
				case 2013:
					
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2013);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2013);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2013);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2013);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2013);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2013);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2013);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2013);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2013);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2013);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2013);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2013);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					}
					
				break;
				case 2014:
					
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2014);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2014);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2014);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2014);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2014);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2014);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2014);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2014);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2014);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2014);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2014);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2014);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					}
				
					
			    break;
				case 2015:
					
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2015);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2015);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2015);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2015);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2015);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2015);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2015);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2015);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2015);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2015);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2015);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2015);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					}
					
					
				break;
				case 2016:
					
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2016);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2016);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2016);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2016);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2016);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2016);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2016);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2016);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2016);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2016);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2016);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2016);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					}
				
				break;
				case 2017:
					
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2017);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2017);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2017);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2017);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2017);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2017);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2017);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2017);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2017);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2017);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2017);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2017);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					}	
				
					
			   break;
				case 2018:
					
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2018);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2018);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2018);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2018);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2018);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2018);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2018);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2018);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2018);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2018);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2018);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2018);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					}
					
				
			    break;
				case 2019:
					
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2019);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2019);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2019);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2019);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2019);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2019);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2019);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2019);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2019);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2019);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2019);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2019);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					}
				
				break;
				case 2020:
					
					System.out.print("Digite o mês para calcular a temperatura média!! \n ") ;
					mes = ler.nextInt();
	
					switch(mes) {
					case 1:
				        t = verifica(jan2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(jan2020);
							System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						}
							
					break;
				
					case 2:
				        t = verifica(feve2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(feve2020);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
						}
						
						
					break;
					
					case 3:
						
					    t = verifica(mar2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mar2020);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
						}
						
					break;
					
					case 4 :
						
					    t = verifica(abril2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(abril2020);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
						}
						
					break;
						
					case 5:
						
					    t = verifica(mai2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(mai2020);
							System.out.println(" A média da temperatura do mês de maio do ano " + ano + " é: " + media) ;
						}	
						
					
					break;
					case 6:
						
					    t = verifica(junh2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(junh2020);
							System.out.println(" A média da temperatura do mês de junho do ano " + ano + " é: " + media) ;
						}	
							
					
					break;
						
					case 7:
						
					    t = verifica(julh2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(julh2020);
							System.out.println(" A média da temperatura do mês de julho do ano " + ano + " é: " + media) ;
						}	
								

					break;
					case 8:
					
					    t = verifica(agos2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(agos2020);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
						}	
					
						
					break;
					
					case 9:
					    t = verifica(setem2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(setem2020);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 10:
						
					    t = verifica(outu2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(outu2020);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
						}	
							
					break;
					
					case 11:
					    t = verifica(novem2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(novem2020);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
						}	
						
					break;
					
					case 12:
					    t = verifica(decem2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							media = mediaTemp(decem2020);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
						}		
						
					break;
					
					default:
	               		System.out.println("Mês Inválida");
	             	break;
						
					}
					
				break;
				default:
					System.out.println("Ano Inválido");
					break;
				}		
				
		} else if(escolha == 3) {
			
			System.out.print("Digite o ano entre 2011 a 2020 para encontrar a menor temperatura!! \n ") ;
			ano = ler.nextInt();

			switch(ano) {
			
			case 2011:
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2011) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2011);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2011, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2011);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2011, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2011);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2011, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2011);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2011, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2011);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2011, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2011);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2011, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2011);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2011, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2011);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2011, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2011);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2011, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2011);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2011, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2011);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2011, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2011);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2011, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			
			case 2012:
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2012) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2012);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2012, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2012);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2012, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2012);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2012, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2012);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2012, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2012);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2012, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2012);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2012, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2012);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2012, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2012);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2012, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2012);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2012, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2012);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2012, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2012);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2012, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2012);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2012, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2013:
				
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2013) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2013);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2013, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2013);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2013, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2013);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2013, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2013);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2013, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2013);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2013, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2013);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2013, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2013);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2013, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2013);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2013, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2013);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2013, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2013);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2013, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2013);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2013, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2013);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2013, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2014:
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2014) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2014);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2014, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2014);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2014, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2014);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2014, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2014);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2014, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2014);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2014, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2014);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2014, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2014);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2014, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2014);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2014, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2014);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2014, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2014);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2014, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2014);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2014, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2014);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2014, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2015:
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2015) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2015);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2015, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2015);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2015, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2015);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2015, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2015);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2015, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2015);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2015, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2015);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2015, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2015);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2015, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2015);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2015, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2015);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2015, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2015);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2015, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2015);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2015, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2015);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2011, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2016:
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2016) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2016);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2016, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2016);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2016, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2016);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2016, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2016);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2016, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2016);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2016, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2016);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2016, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2016);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2016, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2016);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2016, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2016);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2011, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2016);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2016, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2016);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2011, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2016);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2016, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2017:
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2017) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2017);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2017, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2017);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2017, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2017);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2017, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2017);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2017, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2017);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2017, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2017);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2017, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2017);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2017, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2017);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2017, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2017);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2017, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2017);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2017, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2017);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2017, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2017);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2017, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2018:
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2018) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2018);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2018, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2018);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2018, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2018);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2018, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2018);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2018, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2018);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2018, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2018);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2018, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2018);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2018, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2018);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2018, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2018);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2018, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2018);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2018, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2018);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2018, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2018);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2018, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2019:
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2019) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2019);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2019, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2019);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2019, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2019);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2019, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2019);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2019, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2019);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2019, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2019);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2019, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2019);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2019, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2019);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2019, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2019);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2019, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2019);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2019, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2019);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2019, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2019);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2019, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2020:
				System.out.print("Digite o mês para encontrar a temperatura minima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2020) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						menor = menorValorTemp(jan2020);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						EncontraMenor(jan2020, menor, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(feve2020);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							EncontraMenor(feve2020, menor, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mar2020);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							EncontraMenor(mar2020, menor, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(abril2020);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							EncontraMenor(abril2020, menor, mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(mai2020);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							EncontraMenor(mai2020, menor, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(junh2020);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							EncontraMenor(junh2020, menor, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(julh2020);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							EncontraMenor(julh2020, menor, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(agos2020);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							EncontraMenor(agos2020, menor, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(setem2020);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(setem2020, menor, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(outu2020);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							EncontraMenor(outu2020, menor, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(novem2020);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(novem2020, menor, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							menor = menorValorTemp(decem2020);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							EncontraMenor(decem2020, menor, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			default:
				System.out.println("Ano Inválido");
				break;
			}
			
			
		} else if(escolha == 4) {
			
			System.out.print("Digite o ano entre 2011 a 2020 para encontrar a maior temperatura!! \n ") ;
			ano = ler.nextInt();

			switch(ano) {
			
			case 2011:
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2011) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2011);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2011, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2011);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2011, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2011);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2011, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2011);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2011, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2011);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2011, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2011);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2011, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2011);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2011, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2011);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2011, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2011);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2011, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2011);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2011, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2011);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2011, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2011) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2011);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2011, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			
			case 2012:
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2012) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2012);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2012, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2012);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2012, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2012);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2012, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2012);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2012, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2012);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2012, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2012);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2012, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2012);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2012, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2012);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2012, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2012);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2012, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2012);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2012, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2012);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2012, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2012) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2012);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2012, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;	
			case 2013:
				
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2013) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2013);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2013, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2013);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2013, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2013);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2013, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2013);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2013, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2013);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2013, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2013);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2013, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2013);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2013, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2013);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2013, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2013);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2013, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2013);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2013, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2013);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2013, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2013) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2013);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2013, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2014:
				
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2014) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2014);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2014, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2014);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2014, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2014);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2014, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2014);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2014, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2014);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2014, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2014);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2014, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2014);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2014, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2014);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2014, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2014);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2014, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2014);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2014, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2014);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2014, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2014) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2014);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2014, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2015:
				
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2015) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2015);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2015, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2015);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2015, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2015);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2015, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2015);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2015, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2015);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2015, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2015);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2015, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2015);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2015, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2015);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2015, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2015);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2015, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2015);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2015, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2015);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2015, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2015) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2015);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2015, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2016:
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2016) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2016);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2016, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2016);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2016, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2016);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2016, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2016);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2016, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2016);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2016, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2016);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2016, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2016);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2016, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2016);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2016, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2016);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2016, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2016);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2016, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2016);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2016, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2016) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2016);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2016, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2017:
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2017) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2017);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2017, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2017);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2017, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2017);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2017, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2017);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2017, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2017);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2017, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2017);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2017, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2017);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2017, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2017);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2017, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2017);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2017, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2017);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2017, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2017);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2017, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2017) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2017);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2017, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2018:
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2018) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2018);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2018, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2018);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2018, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2018);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2018, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2018);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2018, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2018);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2018, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2018);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2018, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2018);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2018, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2018);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2018, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2018);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2018, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2018);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2018, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2018);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2018, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2018) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2018);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2018, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2019:
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2019) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2019);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2019, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2019);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2019, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2019);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2019, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2019);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2019, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2019);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2019, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2019);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2019, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2019);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2019, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2019);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2019, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2019);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2019, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2019);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2019, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2019);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2019, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2019) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2019);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2019, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			case 2020:
				System.out.print("Digite o mês para encontrar a temperatura máxima!! \n ") ;
				mes = ler.nextInt();

				switch(mes) {
				case 1:
			        t = verifica(jan2020) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						maior = maiorValorTemp(jan2020);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						EncontraMaior(jan2020, maior, mes, ano);
					}
						
				break;
				case 2:
					 t = verifica(feve2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(feve2020);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							EncontraMaior(feve2020, maior, mes, ano);
						}
							
				break;
				case 3:
					 t = verifica(mar2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = menorValorTemp(mar2020);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							EncontraMaior(mar2020, maior, mes, ano);
						}
							
				break;
				case 4:
					 t = verifica(abril2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(abril2020);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							EncontraMaior(abril2020, maior , mes, ano);
						}
							
				break;	
				case 5:
					 t = verifica(mai2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(mai2020);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							EncontraMaior(mai2020, maior, mes, ano);
						}
							
				break;	
				case 6:
					 t = verifica(junh2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(junh2020);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							EncontraMaior(junh2011, maior, mes, ano);
						}
							
				break;	
				case 7:
					 t = verifica(julh2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(julh2020);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							EncontraMaior(julh2020, maior, mes, ano);
						}
							
				break;	
				case 8 :
					 t = verifica(agos2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(agos2020);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							EncontraMaior(agos2020, maior, mes, ano);
						}
							
				break;	
				case 9:
					 t = verifica(setem2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(setem2020);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(setem2020, maior, mes, ano);
						}
							
				break;		
				case 10:
					 t = verifica(outu2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(outu2020);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							EncontraMaior(outu2020, maior, mes, ano);
						}
							
				break;		
				case 11:
					 t = verifica(novem2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(novem2020);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(novem2020, maior, mes, ano);
						}
							
				break;	
				case 12:
					 t = verifica(decem2020) ;
						if( t == 0) {
							
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							maior = maiorValorTemp(decem2020);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							EncontraMaior(decem2020, maior, mes, ano);
						}
							
				break;		
				default:
               		System.out.println("Mês Inválida");
             	break;	
				
				}
				
			break;
			default:
				System.out.println("Ano Inválido");
				break;	
		
			}
			

		}else if(escolha == 5) {
			
			System.out.print("----- Relatório Meteorológico ------- \n ") ;
			System.out.print("Digite o ano entre 2011 a 2020 para o relatório!! \n ") ;
			ano = ler.nextInt();

			switch(ano) {
			
			case 2011:
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2011) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2011);
						System.out.println(" ");
						media = mediaTemp(jan2011);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2011);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2011);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2011);
							System.out.println(" ");
							media = mediaTemp(feve2011);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2011);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2011);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2011);
							System.out.println(" ");
							media = mediaTemp(mar2011);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2011);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2011);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2011);
							System.out.println(" ");
							media = mediaTemp(abril2011);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2011);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2011);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2011);
							System.out.println(" ");
							media = mediaTemp(mai2011);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2011);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2011);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2011);
							System.out.println(" ");
							media = mediaTemp(junh2011);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2011);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2011);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2011);
							System.out.println(" ");
							media = mediaTemp(julh2011);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2011);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2011);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2011);
							System.out.println(" ");
							media = mediaTemp(agos2011);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2011);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2011);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2011);
							System.out.println(" ");
							media = mediaTemp(setem2011);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2011);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2011);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2011);
							System.out.println(" ");
							media = mediaTemp(outu2011);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2011);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2011);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2011);
							System.out.println(" ");
							media = mediaTemp(novem2011);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2011);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2011);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2011) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2011);
							System.out.println(" ");
							media = mediaTemp(decem2011);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2011);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2011);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
	
			break;
			case 2012:
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2012) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2012);
						System.out.println(" ");
						media = mediaTemp(jan2012);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2012);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2012);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2012);
							System.out.println(" ");
							media = mediaTemp(feve2012);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2012);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2012);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2012);
							System.out.println(" ");
							media = mediaTemp(mar2012);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2012);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2012);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2012);
							System.out.println(" ");
							media = mediaTemp(abril2012);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2012);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2012);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2012);
							System.out.println(" ");
							media = mediaTemp(mai2012);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2012);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2012);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2012);
							System.out.println(" ");
							media = mediaTemp(junh2012);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2012);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2012);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2012);
							System.out.println(" ");
							media = mediaTemp(julh2012);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2012);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2012);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2012);
							System.out.println(" ");
							media = mediaTemp(agos2012);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2012);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2012);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2012);
							System.out.println(" ");
							media = mediaTemp(setem2012);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2012);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2012);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2012);
							System.out.println(" ");
							media = mediaTemp(outu2012);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2012);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2012);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2012);
							System.out.println(" ");
							media = mediaTemp(novem2012);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2012);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2012);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2012) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2012);
							System.out.println(" ");
							media = mediaTemp(decem2012);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2012);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2012);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
		
			break;
			case 2013:
				
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2013) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2013);
						System.out.println(" ");
						media = mediaTemp(jan2013);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2013);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2013);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2013);
							System.out.println(" ");
							media = mediaTemp(feve2013);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2013);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2013);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2013);
							System.out.println(" ");
							media = mediaTemp(mar2013);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2013);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2013);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2013);
							System.out.println(" ");
							media = mediaTemp(abril2013);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2013);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2013);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2013);
							System.out.println(" ");
							media = mediaTemp(mai2013);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2013);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2013);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2013);
							System.out.println(" ");
							media = mediaTemp(junh2013);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2013);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2013);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2013);
							System.out.println(" ");
							media = mediaTemp(julh2013);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2013);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2013);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2013);
							System.out.println(" ");
							media = mediaTemp(agos2013);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2013);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2013);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2013);
							System.out.println(" ");
							media = mediaTemp(setem2013);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2013);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2013);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2013);
							System.out.println(" ");
							media = mediaTemp(outu2013);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2013);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2013);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2013);
							System.out.println(" ");
							media = mediaTemp(novem2013);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2013);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2013);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2013) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2013);
							System.out.println(" ");
							media = mediaTemp(decem2013);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2013);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2013);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
				
			break;
			case 2014:
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2014) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2014);
						System.out.println(" ");
						media = mediaTemp(jan2014);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2014);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2014);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2014);
							System.out.println(" ");
							media = mediaTemp(feve2014);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2014);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2014);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2014);
							System.out.println(" ");
							media = mediaTemp(mar2014);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2014);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2014);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2014);
							System.out.println(" ");
							media = mediaTemp(abril2014);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2014);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2014);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2014);
							System.out.println(" ");
							media = mediaTemp(mai2014);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2014);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2014);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2014);
							System.out.println(" ");
							media = mediaTemp(junh2014);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2014);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2014);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2014);
							System.out.println(" ");
							media = mediaTemp(julh2014);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2014);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2014);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2014);
							System.out.println(" ");
							media = mediaTemp(agos2014);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2014);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2014);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2014);
							System.out.println(" ");
							media = mediaTemp(setem2014);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2014);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2014);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2014);
							System.out.println(" ");
							media = mediaTemp(outu2014);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2014);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2014);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2014);
							System.out.println(" ");
							media = mediaTemp(novem2014);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2014);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2014);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2014) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2014);
							System.out.println(" ");
							media = mediaTemp(decem2014);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2014);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2014);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
			
			break;
			case 2015:
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2015) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2015);
						System.out.println(" ");
						media = mediaTemp(jan2015);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2015);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2015);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2015);
							System.out.println(" ");
							media = mediaTemp(feve2015);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2015);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2015);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2015);
							System.out.println(" ");
							media = mediaTemp(mar2015);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2015);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2015);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2015);
							System.out.println(" ");
							media = mediaTemp(abril2015);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2015);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2015);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2015);
							System.out.println(" ");
							media = mediaTemp(mai2015);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2015);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2015);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2015);
							System.out.println(" ");
							media = mediaTemp(junh2015);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2015);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2015);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2015);
							System.out.println(" ");
							media = mediaTemp(julh2015);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2015);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2015);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2015);
							System.out.println(" ");
							media = mediaTemp(agos2015);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2015);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2015);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2015);
							System.out.println(" ");
							media = mediaTemp(setem2015);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2015);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2015);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2015);
							System.out.println(" ");
							media = mediaTemp(outu2015);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2015);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2015);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2015);
							System.out.println(" ");
							media = mediaTemp(novem2015);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2015);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2015);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2015) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2015);
							System.out.println(" ");
							media = mediaTemp(decem2015);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2015);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2015);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
				
			break;
			case 2016:
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2016) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2016);
						System.out.println(" ");
						media = mediaTemp(jan2016);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2016);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2016);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2016);
							System.out.println(" ");
							media = mediaTemp(feve2016);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2016);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2016);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2016);
							System.out.println(" ");
							media = mediaTemp(mar2016);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2016);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2016);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2016);
							System.out.println(" ");
							media = mediaTemp(abril2016);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2016);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2016);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2016);
							System.out.println(" ");
							media = mediaTemp(mai2016);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2016);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2016);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2016);
							System.out.println(" ");
							media = mediaTemp(junh2016);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2016);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2016);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2016);
							System.out.println(" ");
							media = mediaTemp(julh2016);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2016);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2016);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2016);
							System.out.println(" ");
							media = mediaTemp(agos2016);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2016);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2016);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2016);
							System.out.println(" ");
							media = mediaTemp(setem2016);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2016);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2016);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2016);
							System.out.println(" ");
							media = mediaTemp(outu2016);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2016);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2016);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2016);
							System.out.println(" ");
							media = mediaTemp(novem2016);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2016);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2016);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2016) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2016);
							System.out.println(" ");
							media = mediaTemp(decem2016);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2016);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2016);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
				
				
			break;
			
			case 2017:
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2017) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2017);
						System.out.println(" ");
						media = mediaTemp(jan2017);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2017);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2017);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2017);
							System.out.println(" ");
							media = mediaTemp(feve2017);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2017);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2017);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2017);
							System.out.println(" ");
							media = mediaTemp(mar2017);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2017);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2017);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2017);
							System.out.println(" ");
							media = mediaTemp(abril2017);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2017);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2017);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2017);
							System.out.println(" ");
							media = mediaTemp(mai2017);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2017);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2017);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2017);
							System.out.println(" ");
							media = mediaTemp(junh2017);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2017);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2017);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2017);
							System.out.println(" ");
							media = mediaTemp(julh2017);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2017);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2017);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2017);
							System.out.println(" ");
							media = mediaTemp(agos2017);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2017);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2017);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2017);
							System.out.println(" ");
							media = mediaTemp(setem2017);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2017);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2017);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2017);
							System.out.println(" ");
							media = mediaTemp(outu2017);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2017);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2017);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2017);
							System.out.println(" ");
							media = mediaTemp(novem2017);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2017);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2017);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2017) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2017);
							System.out.println(" ");
							media = mediaTemp(decem2017);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2017);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2017);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
				
				
			break;
			case 2018:
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2011) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2011);
						System.out.println(" ");
						media = mediaTemp(jan2011);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2011);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2011);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2018);
							System.out.println(" ");
							media = mediaTemp(feve2018);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2018);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2018);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2018);
							System.out.println(" ");
							media = mediaTemp(mar2018);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2018);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2018);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2018);
							System.out.println(" ");
							media = mediaTemp(abril2018);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2018);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2018);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2018);
							System.out.println(" ");
							media = mediaTemp(mai2018);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2018);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2018);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2018);
							System.out.println(" ");
							media = mediaTemp(junh2018);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2018);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2018);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2018);
							System.out.println(" ");
							media = mediaTemp(julh2018);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2018);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2018);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2018);
							System.out.println(" ");
							media = mediaTemp(agos2018);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2018);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2018);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2018);
							System.out.println(" ");
							media = mediaTemp(setem2018);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2018);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2018);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2018);
							System.out.println(" ");
							media = mediaTemp(outu2018);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2018);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2018);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2018);
							System.out.println(" ");
							media = mediaTemp(novem2018);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2018);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2018);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2018) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2018);
							System.out.println(" ");
							media = mediaTemp(decem2018);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2018);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2018);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
				
			break;
			case 2019:
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2019) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2019);
						System.out.println(" ");
						media = mediaTemp(jan2019);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2019);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2019);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2019);
							System.out.println(" ");
							media = mediaTemp(feve2019);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2019);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2019);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2019);
							System.out.println(" ");
							media = mediaTemp(mar2019);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2019);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2019);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2019);
							System.out.println(" ");
							media = mediaTemp(abril2019);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2019);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2019);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2019);
							System.out.println(" ");
							media = mediaTemp(mai2019);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2019);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2019);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2019);
							System.out.println(" ");
							media = mediaTemp(junh2019);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2019);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2019);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2019);
							System.out.println(" ");
							media = mediaTemp(julh2019);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2019);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2019);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2019);
							System.out.println(" ");
							media = mediaTemp(agos2019);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2019);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2019);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2019);
							System.out.println(" ");
							media = mediaTemp(setem2019);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2019);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2019);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2019);
							System.out.println(" ");
							media = mediaTemp(outu2019);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2019);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2019);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2019);
							System.out.println(" ");
							media = mediaTemp(novem2019);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2019);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2019);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2019) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2019);
							System.out.println(" ");
							media = mediaTemp(decem2019);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2019);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2019);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
				
			break; 
			case 2020:
				System.out.print("Digite o mês!!! \n ") ;
				mes = ler.nextInt();
				switch(mes) {
				case 1:
			        t = verifica(jan2020) ;
					if( t == 0) {
						
						System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
					}else {
						
						MostraMediaDias(jan2020);
						System.out.println(" ");
						media = mediaTemp(jan2020);
						System.out.println(" A média da temperatura do mês de janeiro do ano " + ano + " é: " + media) ;
						menor = menorValorTemp(jan2020);
						System.out.println(" O menor valor da temperatura do mês de janeiro do ano " + ano + " é: " + menor) ;
						maior = maiorValorTemp(jan2020);
						System.out.println(" O maior valor da temperatura do mês de janeiro do ano " + ano + " é: " + maior) ;
						
					}
						
				break;
				case 2:
					
			        t = verifica(feve2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(feve2020);
							System.out.println(" ");
							media = mediaTemp(feve2020);
							System.out.println(" A média da temperatura do mês de fevereiro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(feve2020);
							System.out.println(" O menor valor da temperatura do mês de fevereiro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(feve2020);
							System.out.println(" O maior valor da temperatura do mês de fevereiro do ano " + ano + " é: " + maior) ;
							
						}
							
					break;
				case 3:
			        t = verifica(mar2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mar2020);
							System.out.println(" ");
							media = mediaTemp(mar2020);
							System.out.println(" A média da temperatura do mês de Março do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mar2020);
							System.out.println(" O menor valor da temperatura do mês de Março do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mar2020);
							System.out.println(" O maior valor da temperatura do mês de Março do ano " + ano + " é: " + maior) ;
							
						}
				break;
				
				case 4:
					  t = verifica(abril2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(abril2020);
							System.out.println(" ");
							media = mediaTemp(abril2020);
							System.out.println(" A média da temperatura do mês de Abril do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(abril2020);
							System.out.println(" O menor valor da temperatura do mês de Abril do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(abril2020);
							System.out.println(" O maior valor da temperatura do mês de Abril do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 5:
					
					  t = verifica(mai2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(mai2020);
							System.out.println(" ");
							media = mediaTemp(mai2020);
							System.out.println(" A média da temperatura do mês de Maio do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(mai2020);
							System.out.println(" O menor valor da temperatura do mês de Maio do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(mai2020);
							System.out.println(" O maior valor da temperatura do mês de Maio do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 6:
					  t = verifica(junh2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(junh2020);
							System.out.println(" ");
							media = mediaTemp(junh2020);
							System.out.println(" A média da temperatura do mês de Junho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(junh2020);
							System.out.println(" O menor valor da temperatura do mês de Junho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(junh2020);
							System.out.println(" O maior valor da temperatura do mês de Junho do ano " + ano + " é: " + maior) ;
							
						}
				break;
				case 7:
					  t = verifica(julh2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(julh2020);
							System.out.println(" ");
							media = mediaTemp(julh2020);
							System.out.println(" A média da temperatura do mês de Julho do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(julh2020);
							System.out.println(" O menor valor da temperatura do mês de Julho do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(julh2020);
							System.out.println(" O maior valor da temperatura do mês de Julho do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 8:
					  t = verifica(agos2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(agos2020);
							System.out.println(" ");
							media = mediaTemp(agos2020);
							System.out.println(" A média da temperatura do mês de Agosto do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(agos2020);
							System.out.println(" O menor valor da temperatura do mês de Agosto do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(agos2020);
							System.out.println(" O maior valor da temperatura do mês de Agosto do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 9:
					
					  t = verifica(setem2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(setem2020);
							System.out.println(" ");
							media = mediaTemp(setem2020);
							System.out.println(" A média da temperatura do mês de Setembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(setem2020);
							System.out.println(" O menor valor da temperatura do mês de Setembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(setem2020);
							System.out.println(" O maior valor da temperatura do mês de Setembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 10:
					  t = verifica(outu2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(outu2020);
							System.out.println(" ");
							media = mediaTemp(outu2020);
							System.out.println(" A média da temperatura do mês de Outubro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(outu2020);
							System.out.println(" O menor valor da temperatura do mês de Outubro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(outu2020);
							System.out.println(" O maior valor da temperatura do mês de Outubro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 11:
					  t = verifica(novem2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(novem2020);
							System.out.println(" ");
							media = mediaTemp(novem2020);
							System.out.println(" A média da temperatura do mês de Novembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(novem2020);
							System.out.println(" O menor valor da temperatura do mês de Novembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(novem2020);
							System.out.println(" O maior valor da temperatura do mês de Novembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				case 12:
					
					  t = verifica(decem2020) ;
						if( t == 0) {
							System.out.print("Não é possivel realizar a operação. Inseri os dados primeiro!!! \n ") ;
						}else {
							
							MostraMediaDias(decem2020);
							System.out.println(" ");
							media = mediaTemp(decem2020);
							System.out.println(" A média da temperatura do mês de Dezembro do ano " + ano + " é: " + media) ;
							menor = menorValorTemp(decem2020);
							System.out.println(" O menor valor da temperatura do mês de Dezembro do ano " + ano + " é: " + menor) ;
							maior = maiorValorTemp(decem2020);
							System.out.println(" O maior valor da temperatura do mês de Dezembro do ano " + ano + " é: " + maior) ;
							
						}
				break;	
				default:
               		System.out.println("Mês Inválida");
             	break;
             	
				}
				
			break;
			default:
				System.out.println("Ano Inválido");
				break;
			}	
		
		}	
			
	}else {
		
		System.out.println(" Não existe essa opção!!");	
	}
			
		 System.out.println("Digite 1 se quiser sair do programa ou 0 para continuar!!");
		 n = ler.nextInt();
		 
	
		} while(n == 0);
		
			
	}
}

