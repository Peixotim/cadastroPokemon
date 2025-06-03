import java.util.Scanner;

public class pokeAgua extends Pokemons{

    public static pokeAgua cadastroPokemonAgua(Scanner sc){
        pokeAgua pokemonAgua = new pokeAgua();
        pokemonAgua.tipoPokemon = "Agua";
        sc.nextLine(); // Limpa o Buff do enter pressionado no opcaoPokemon

        System.out.print("Digite o nome do Treinador : ");
        pokemonAgua.treinador = sc.nextLine();

        System.out.print("Digite o nome do Pokemon : ");
        pokemonAgua.nome = sc.nextLine();

        System.out.print("Digite a altura do Pokemon : ");
        pokemonAgua.altura = sc.nextDouble();

        System.out.print("Digite a defesa do Pokemon : ");
        pokemonAgua.defesa = sc.nextInt();
        sc.nextLine(); //Limpando o buff do enter

        System.out.print("Digite a natureza do Pokemon : ");
        pokemonAgua.natureza = sc.nextLine();

        System.out.print("Digite o gênero do Pokemon : ");
        pokemonAgua.generoPokemon = sc.nextLine();

        System.out.print("Pokemon Lendario : ");
        pokemonAgua.recebeBoolean = sc.nextLine();
        // "tradutor" para pt-br / en do verificador do pokemon
        if("sim".equalsIgnoreCase(pokemonAgua.recebeBoolean) || "true".equalsIgnoreCase(pokemonAgua.recebeBoolean) || "yes".equalsIgnoreCase(pokemonAgua.recebeBoolean)){
            pokemonAgua.lendario = true;
        }else if("nao".equalsIgnoreCase(pokemonAgua.recebeBoolean)){
            pokemonAgua.lendario = false;
        }else{
            pokemonAgua.lendario = Boolean.parseBoolean(null);
        }

        System.out.print("Digite a habilidade especial do Pokemon : ");
        pokemonAgua.habilidadeEspecial = sc.nextLine();

        System.out.print("Digite as fraquzas do Pokemon : ");
        pokemonAgua.fraquezas = sc.nextLine();

        return pokemonAgua; // Retorna o nome do objeto iniciadoP
    }

}
