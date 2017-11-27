package Selecao_FIFA;

public class Main {

	public static void opcoes() {
		System.out.println("	--OPÇÕES:--");
		System.out.println("1 - Mostar Seleção da FIFA");
		System.out.println("2 - Detalhar Jogador");
		System.out.println("3 - Listar Jogador por Posição");
		System.out.println("4 - Votar no Melhor da Temporada");
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Jogadores j = new Jogadores();
		Usuario user = new Usuario();
		
		int opcao;
		do {
			opcoes();
			System.out.println("DIGITE UMA OPÇÃO: ");
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				Selecao s = j.MostarSelecao();
			}
			if(opcao == 2) {
				System.out.println("Digite o Numero do Jogador que você queira detalhar\n");
				int n = sc.nextInt();
				Selecao s = j.Detalhar(n);
			}
			if(opcao == 3) {
				System.out.println("Digite a Posição: (Goleiros, Defensores, Meio-Campistas ou Atacantes)");
				String p = sc.next();
				Selecao s = j.Posicao(p);
			}
			if(opcao == 4) {
				System.out.println("Digite seu Nome para continuar:");
				String nome = sc.next();
				user.setNome(nome);
				System.out.println("Digite a Data do seu Nascimento");
				
			}
			if(opcao == 5) {
				
			}
		
		}while(opcao != 9);

	}

}
