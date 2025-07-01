import java.util.Scanner;

public class Executavel {

	private static Scanner sc = new Scanner(System.in);
	private static final Gerenciamento ger = new Gerenciamento();
	private static Usuario professor;
	
	
	public static void main(String[] args) {
		do {
		loginDoWhile();
		menu();
	} while (true);
}
	
	private static void menu() {
		
		int opcao;
		do {
		System.out.println("""
				1 - Cadastrar forma
				2 - Listar formas
				3 - Logout
				""");
		opcao = sc.nextInt();
		switch (opcao) {
			case 1: 
				menuCadastro(); 
				break;
			case 2: 
				menuListar(); 
				break;
			case 3: 
				System.out.println("Saindo do sistema..."); 
				break;
			default:
				System.out.println("Opção inválida! Tente novamente."); 
		 	}
		} while (opcao != 3);
	}

	private static void menuListar() {
		int opcao;
		do {
			System.out.println("""
					1 - Quadrado
					2 - Retângulo
					3 - Círculo
					4 - Triângulo
					5 - Todos
					6 - Voltar
					""");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1: 

				case 2: 

				case 3: 

				case 4: 

				case 5:
					System.out.println("Lista de formas: ");
					System.out.println(ger.buscarFormas(opcao));
					break;
				case 6:
					System.out.println("Retornando!"); 
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 6);
	}
	
	private static void menuCadastro() {
		int opcao;
		do {
			System.out.println("""
					1 - Quadrado
					2 - Retângulo
					3 - Círculo
					4 - Triângulo
					5 - Voltar
					""");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1: 
					cadastroQuadrado(); 
					break;
				case 2: 
					cadastroRetangulo(); 
					break;
				case 3: 
					cadastroCirculo(); 
					break;
				case 4: 
					cadastroTriangulo(); 
					break;
				case 5:
					System.out.println("Retornando!"); 
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 5);
	}

	private static void cadastroTriangulo() {
		System.out.println("Qual a medida da base do triângulo?");
		double lado1 = sc.nextDouble();
		System.out.println("Qual a medida do lado direito do triângulo?");
		double lado2 = sc.nextDouble();
		System.out.println("Qual a medida do lado esquerdo do triângulo?");
		double lado3 = sc.nextDouble();
		Triangulo triangulo = 
				Triangulo.criarTriangulo(lado1, lado2, lado3);
		if(triangulo.validar()) {
			ger.cadastrarForma(triangulo);
		} else {
			System.out.println(
					"As medidas informadas não formam um triângulo");
		}
	}

	private static void cadastroCirculo() {
		System.out.println("Qual a medida de raio do círculo?");
		double raio = sc.nextDouble();
		ger.cadastrarForma(new Circulo(raio));
	}

	private static void cadastroRetangulo() {
		System.out.println("Qual a medida da base do retângulo?");
		double lado1 = sc.nextDouble();
		System.out.println("Qual a medida de altura do retângulo?");
		double lado2 = sc.nextDouble();
		Retangulo validacao = new Retangulo(lado1, lado2);
		if (validacao.validar()) {
			ger.cadastrarForma(validacao);
		} else {
			System.out.println("As medidas informadas não formam um retângulo!");
		}
		ger.cadastrarForma(new Retangulo(lado1, lado2));
	}

	private static void cadastroQuadrado() {
		System.out.println("Qual a medida de um dos lados do quadrado?");
		double medidaLado = sc.nextDouble();
		Quadrado quadrado = new Quadrado(medidaLado);
		ger.cadastrarForma(quadrado);
		
	}

	private static void loginDoWhile() {
        int contador = 0;
        
        do {
        System.out.println("Digite sua senha: ");
        String senha = sc.next();
        professor = ger.login(senha);
        
        if(professor != null) {
            System.out.println("Bem vindo, " + professor.getNome() + "!");
            return;
        }
        
        contador++;
        
        } while (contador < 3);
        System.err.println("Sistema Encerrado...");
        System.exit(0);
    }
}