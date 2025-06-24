import java.util.Scanner;

public class Executavel {

    // quando for static ele é valor comum para todos
    private static final Scanner sc = new Scanner(System.in);
    private static final Gerenciamento ger = new Gerenciamento();
    private static Usuario professor;

    public static void main(String[]args) {
    	login();
    }

    private static void login(){
        int contador = 0;

        do {
            System.out.println("Digite a sua senha: ");
            String senha = sc.next();
            professor = ger.login(senha);
            contador++;
        } while (professor == null && contador < 3);
        if (professor == null) {
            System.out.println("\nLogin não encontrado");
        } else {
            System.out.println("\nOlá prof " + professor.getNome() + "!");
        }
    }
    
    // metodo de menu
    private static void menu() {
    	int opcao;
    	
    	do {
    		
    	System.out.println(""
    			+ "1 - Cadastrar forma: "
    			+ "2 - Listar formas: "
    			+ "3 - Logout"
    			+ "");
    	
    	opcao = sc.nextInt();
    	
	    	switch (opcao) {
		    	case 1: 
		    		menuCadastro(); 
		    		break;
		    		
		    	case 2: 
		    		menuListar(); 
		    		break;
		    		
		    	case 3: 
		    		System.out.println("Tchau prof° !"); 
		    		break;
		    		
		    	default: 
		    		System.out.println("Opção Inválida! Tente novamente.");
	    	}
    	
    	} while (opcao != 3);
    }
    
    // metodo de listagem
    private static void menuListar() {
    	int opcao;
    	
    	do {
    		
    		System.out.println(""
    				+ "1 - Quadrado"
    				+ "2 - Retângulo"
    				+ "3 - Círculo"
    				+ "4 - Triângulo"
    				+ "5 - Todos"
    				+ "6 - Voltar");
    		
    		opcao = sc.nextInt();
    		switch (opcao) {
	    		case 1: 
	    		case 2: 
	    		case 3: 
	    		case 4: 
	    		case 5: 
	    			System.out.println("Lista de formas: ");
	    			System.out.println(ger.buscarFormas(opcao));
	    		case 6: 
	    			System.out.println("Retornando!"); break;
	    		default: 
	    			System.out.println("Opção inválida! Tente novamente.");
    		}
    	} while (opcao != 6);
	}

    // metodo de menu do cadastro das formas
	private static void menuCadastro() {
    	int opcao;
    	
    	do {
    		
    		System.out.println(""
    				+ "1 - Quadrado"
    				+ "2 - Retângulo"
    				+ "3 - Círculo"
    				+ "4 - Triângulo"
    				+ "5 - Voltar"
    				+ "");
    		
    		opcao = sc.nextInt();
    		switch (opcao) {
	    		case 1: cadastroQuadrado(); break;
	    		case 2: cadastroRetangulo(); break;
	    		case 3: cadastroCirculo(); break;
	    		case 4: cadastroTriangulo(); break;
	    		case 5: 
	    			System.out.println("Retornando!"); break;
	    		default: 
	    			System.out.println("Opção inválida! Tente novamente.");
    		}
    	} while (opcao != 5);
    }
    
    // opção de usar com for tambem
//    private static void loginFor() {
//    	for (int i = 0; i < 3; i++) {
//    		System.out.println("Digite sua senha > ");
//    		String senha = sc.next();
//    		professor = ger.login(senha);
//    		if (professor != null) {
//    			System.out.println("ola seja bem vindo " + professor.getNome());
//    			return;
//    		}
//    	}
//    	System.out.println("Sistema encerrado!");
//    	System.exit(0);
//    }
    
}