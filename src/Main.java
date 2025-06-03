import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoPokemon;
        int opcao;
        do {
            System.out.println("\n===== Menu Pokemon =====");
            System.out.println("1. Cadastrar Pokemons");
            System.out.println("2. Listar Pokemons"); // Vai listar somente os nomes dos pokemons
            System.out.println("3. Listar Treinadores Cadastrados"); // Vai listar somente o nome dos treinadores
            System.out.println("4. Listar Dados Pokemons"); // Vai passar a lista geral dos pokemon , nome tipo ...
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("1. Agua");
                    System.out.println("2. Fogo");
                    System.out.println("3. Raio");
                    System.out.println("4. Lutador");
                    System.out.println("5. Sair");
                    System.out.print("Escolha uma opcao: ");
                    opcaoPokemon = sc.nextInt();
                    if(opcaoPokemon == 1){
                    Pokemons pokemonAgua = pokeAgua.cadastroPokemonAgua(sc); // Aqui eu guardo em uma variavel para utilizar logo a frente
                    }else if(opcaoPokemon == 2){
                        Pokemons pokemonFogo = pokeFogo.cadastroPokemonFogo(sc); // Dentro do () passamos o parametro
                    }
                    break;

                default:
                    System.out.println("Digite uma alternativa correta ! ");
                    break;
            }
        }while(opcao != 5);

    }
}
