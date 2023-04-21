import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<ContaPoupanca> vetorContaP = new ArrayList<>();
		ArrayList<ContaCorrente> vetorContaC = new ArrayList<>();
		
		int controle = 0;
		int idContaCorrente = 0;
		int idContaPoupanca = 0;
		int menu = 0;
		
		System.out.println("*** Exercicio - 02 ***\n5 valores para conta corrente.\n+\n5 valores para conta poupanca.");
		
		while(controle != -1) {
			if(idContaCorrente == 5 && idContaPoupanca == 5) {
				controle = -1;
				System.out.println("\n*** CONTA CORRENTE/POUPANCA - PREENCHIDO ***\n");
				break;
			}
			try {
				System.out.print("\n*** MENU ***\n1 - Inserir valor em conta corrente.\n2 - Inserir valor em conta poupanca.\n3 ou maior - Para sair.\n\nDigite a opcao: ");
				menu = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("ERRO - Não foi digitado um número inteiro.");
				break;
			}
			
			if(menu >= 3) {
				controle = -1;
				System.out.println("\n*** SAINDO DO LOOP ***\n");
				break;
			}
			else if(menu == 1 || menu == 2) {
				if(menu == 2 && idContaPoupanca == 5) {
					System.out.println("*** AVISO ***\nQUANTIDADE DE CONTAS POUPANCAS ALCANÇADO.\nO PROXIMO VALOR SERÁ INCLUSO NA CONTA CORRENTE.");
					menu = 1;
				}
				else if(menu == 1 && idContaCorrente == 5) {
					System.out.println("*** AVISO ***\nQUANTIDADE DE CONTAS CORRENTES ALCANÇADO.\nO PROXIMO VALOR SERÁ INCLUSO NA CONTA POUPANCA.");
					menu = 2;
				}
				
				try {
					System.out.print("\nDigite o valor: ");
					double saldo = sc.nextDouble();
					
					if(menu == 1 && idContaCorrente < 5) {
						ContaCorrente contaCorrente = new ContaCorrente();
						contaCorrente.setSaldo(saldo);
						vetorContaC.add(idContaCorrente, contaCorrente);
						System.out.println("STATUS: " +(idContaCorrente + 1) +"/" + 5);
						idContaCorrente++;
					}
					else if(menu == 2 && idContaPoupanca < 5) {
						ContaPoupanca contaPoupanca = new ContaPoupanca();
						contaPoupanca.setSaldo(saldo);
						vetorContaP.add(idContaPoupanca, contaPoupanca);
						System.out.println("STATUS: " +(idContaPoupanca + 1) +"/" + 5);
						idContaPoupanca++;
					}
				}
				catch(Exception e) {
					System.out.println("\nErro: Valor digitado não é um número de ponto flutuante esperado. EX:(5,00)");
					sc.nextLine();
					break;
				}
			}
			else if(menu <= 0) {
				System.out.println("*** OPCAO INVALIDA - TENTE NOVAMENTE");
			}
		}
		controle = 0;
		while(controle != -1 && idContaPoupanca > 0 || idContaCorrente > 0) {
			try {
				System.out.print("*** OPERAÇÕES DISPONÍVEIS - MENU ***\n1 - Depositar.\n2 - Sacar.\n3 - Mostrar saldo.\n4 ou maior - Para sair.\n\nDigite a opcao: ");
				menu = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("ERRO - Não foi informado um número inteiro.");
				break;
			}			
			if(menu >= 4) {
				System.out.println("\n*** SAINDO DO LOOP ***\n");
				controle = -1;
				break;
			}
			else if(menu == 3) {
				imprimirClientesContaCorrente(vetorContaC);
				
				imprimirClientesContaPoupanca(vetorContaP);
			}
			else if(menu == 2) {
				try {
					System.out.println("\n*** SAQUE DE CONTA CORRENTE/POUPANCA ***\n");
					System.out.print("1 - Saque em conta corrente.\n2 - Saque em conta poupanca.\n\nDigite a opcao: ");
					int opcao = sc.nextInt();
					if(opcao == 1) {
						imprimirClientesContaCorrente(vetorContaC);
						System.out.print("\nDigite o numero do cliente da conta corrente: ");
						idContaCorrente = sc.nextInt();
						
						System.out.println("\nCliente[" + idContaCorrente + "]:");
						System.out.printf("SALDO DISPONÍVEL: R$ %.2f", vetorContaC.get(idContaCorrente - 1).getSaldo());
						
						System.out.print("\nDigite o valor para saque: R$ ");
						double valor = sc.nextDouble();
						
						try {
							efetuandoSaqueContaCorrente(vetorContaC, idContaCorrente, valor);
							
						}
						catch(RuntimeException e) {
							System.out.printf("%n*** Erro ao sacar: %s ***%n%n", e.getMessage());
						}
					}
					else if(opcao == 2) {
						imprimirClientesContaPoupanca(vetorContaP);
						System.out.print("\nDigite o numero do cliente da conta poupanca: ");
						idContaPoupanca = sc.nextInt();
						
						System.out.println("\nCliente[" + idContaPoupanca + "]:");
						System.out.printf("SALDO DISPONÍVEL: R$ %.2f", vetorContaP.get(idContaPoupanca - 1).getSaldo());
						
						System.out.print("\nDigite o valor para saque: R$ ");
						double valor = sc.nextDouble();
						
						try {
							efetuandoSaqueContaPoupanca(vetorContaP, idContaPoupanca, valor);
							
						}
						catch(RuntimeException e) {
							System.out.printf("%n*** Erro ao sacar: %s ***%n%n", e.getMessage());
						}
					}
				}
				catch(RuntimeException e) {
					System.out.println("ERRO - Informação diferente do que o esperado.\nSendo para:\nOpcao: Um número inteiro('1, 2, 3, ...')\nNúmero cliente: Um número inteiro entre '1' a '5'.\nValor: Um número de ponto flutuante('100,00').");
					break;
				}
			}
			else if(menu == 1) {
				try {
					System.out.println("*** DEPOSITO EM CONTA CORRENTE/POUPANCA ***\n");
					System.out.print("1 - Depositar em conta corrente.\n2 - Depositar em conta poupanca.\n\nDigite a opcao: ");
					int opcao = sc.nextInt();
					
					if(opcao == 1) {
						imprimirClientesContaCorrente(vetorContaC);
						System.out.print("\nDigite o numero do cliente da conta corrente: ");
						idContaCorrente = sc.nextInt();
						System.out.println("\nCliente[" + idContaCorrente + "]:");
						System.out.printf("SALDO DISPONÍVEL: R$ %.2f", vetorContaC.get(idContaCorrente - 1).getSaldo());
						
						System.out.print("\nDigite o valor para deposito: R$ ");
						double valor = sc.nextDouble();
						
						try {
							efetuandoDepositoContaCorrente(vetorContaC, idContaCorrente, valor);						
						}
						catch(RuntimeException e) {
							System.out.printf("%n*** Erro ao depositar: %s ***%n%n", e.getMessage());
						}
					}
					else if(opcao == 2) {
						imprimirClientesContaPoupanca(vetorContaP);
						System.out.print("\nDigite o numero do cliente da conta poupanca: ");
						idContaPoupanca = sc.nextInt();
						
						System.out.println("\nCliente[" + idContaPoupanca + "]:");
						System.out.printf("SALDO DISPONÍVEL: R$ %.2f", vetorContaP.get(idContaPoupanca - 1).getSaldo());
						
						System.out.print("\nDigite o valor para deposito: R$ ");
						double valor = sc.nextDouble();
						
						try {
							efetuandoDepositoContaPoupanca(vetorContaP, idContaPoupanca, valor);					
						}
						catch(RuntimeException e) {
							System.out.printf("%n*** Erro ao depositar: %s ***%n%n", e.getMessage());
						}				
					}
				}
				catch(Exception e) {
					System.out.println("ERRO - Informação diferente do que o esperado.\nSendo para:\nOpcao: Um número inteiro('1, 2, 3 ...').\nNúmero cliente: Um número inteiro entre '1' a '5'.\nValor: Um número de ponto flutuante('100,00').");
					break;
				}
			}
			else if(menu <= 0) {
				System.out.println("*** OPCAO INVALIDA - TENTE NOVAMENTE");
			}
		}
		System.out.println("*** FIM ***");
		sc.close();
	}
	
	private static void imprimirClientesContaCorrente(ArrayList<ContaCorrente> listaContaC) {
		System.out.println("\n*** CLIENTES DE CONTA CORRENTE ***");
		for(int i = 0; i < listaContaC.size(); i++) {
			System.out.println("Cliente[" + (i + 1) + "]:");
			System.out.printf("SALDO ATUAL: R$ %.2f%n%n", listaContaC.get(i).getSaldo());
		}
	}
	
	private static void imprimirClientesContaPoupanca(ArrayList<ContaPoupanca> listaContaP) {
		System.out.println("\n*** CLIENTES DE CONTA POUPANCA ***");
		for(int j = 0; j < listaContaP.size(); j++) {
			System.out.println("Cliente[" + (j + 1) + "]:");
			System.out.printf("SALDO ATUAL: R$ %.2f%n%n", listaContaP.get(j).getSaldo());
		}
	}
	
	private static void efetuandoSaqueContaCorrente(ArrayList<ContaCorrente> listaContaC, int numeroClienteC, double debito ) {
		listaContaC.get(numeroClienteC - 1).sacar(debito);
		System.out.println("\nCliente[" + numeroClienteC + "]:");
		System.out.printf("SALDO ATUAL: R$ %.2f%n%n", listaContaC.get(numeroClienteC - 1).getSaldo());		
	}
	
	private static void efetuandoSaqueContaPoupanca(ArrayList<ContaPoupanca> listaContaP, int numeroClienteP, double debito) {
		listaContaP.get(numeroClienteP - 1).sacar(debito);
		System.out.println("\nCliente[" + numeroClienteP + "]:");
		System.out.printf("SALDO ATUAL: R$ %.2f%n%n", listaContaP.get(numeroClienteP - 1).getSaldo());
	}
	
	private static void efetuandoDepositoContaCorrente(ArrayList<ContaCorrente> listaContaC, int numeroClienteC, double credito) {
		listaContaC.get(numeroClienteC - 1).depositar(credito);
		System.out.println("\nCliente[" + numeroClienteC + "]:");
		System.out.printf("SALDO ATUAL: R$ %.2f%n%n", listaContaC.get(numeroClienteC - 1).getSaldo());		
	}
	
	private static void efetuandoDepositoContaPoupanca(ArrayList<ContaPoupanca> listaContaP, int numeroClienteP, double credito) {
		listaContaP.get(numeroClienteP - 1).depositar(credito);
		System.out.println("\nCliente[" + numeroClienteP + "]:");
		System.out.printf("SALDO ATUAL: R$ %.2f%n%n", listaContaP.get(numeroClienteP - 1).getSaldo());
	}
}
