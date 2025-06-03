import java.util.Scanner;

public class pokeFogo extends Pokemons{

    public static pokeFogo cadastroPokemonFogo(Scanner sc){
        pokeFogo pokemonFogo = new pokeFogo();
        pokemonFogo.tipoPokemon = "Agua";
        sc.nextLine(); // Limpa o Buff do enter pressionado no opcaoPokemon

        System.out.print("Digite o nome do Treinador : ");
        pokemonFogo.treinador = sc.nextLine();

        System.out.print("Digite o nome do Pokemon : ");
        pokemonFogo.nome = sc.nextLine();

        System.out.print("Digite a altura do Pokemon : ");
        pokemonFogo.altura = sc.nextDouble();

        System.out.print("Digite a defesa do Pokemon : ");
        pokemonFogo.defesa = sc.nextInt();
        sc.nextLine(); //Limpando o buff do enter

        System.out.print("Digite a natureza do Pokemon : ");
        pokemonFogo.natureza = sc.nextLine();

        System.out.print("Digite o gênero do Pokemon : ");
        pokemonFogo.generoPokemon = sc.nextLine();

        System.out.print("Pokemon Lendario : ");
        pokemonFogo.recebeBoolean = sc.nextLine();
        // "tradutor" para pt-br / en do verificador do pokemon
        if("sim".equalsIgnoreCase(pokemonFogo.recebeBoolean) || "true".equalsIgnoreCase(pokemonFogo.recebeBoolean) || "yes".equalsIgnoreCase(pokemonFogo.recebeBoolean)){
            pokemonFogo.lendario = true;
        }else if("nao".equalsIgnoreCase(pokemonFogo.recebeBoolean)){
            pokemonFogo.lendario = false;
        }else{
            pokemonFogo.lendario = Boolean.parseBoolean(null);
        }

        System.out.print("Digite a habilidade especial do Pokemon : ");
        pokemonFogo.habilidadeEspecial = sc.nextLine();

        System.out.print("Digite as fraquzas do Pokemon : ");
        pokemonFogo.fraquezas = sc.nextLine();

        return pokemonFogo; // Retorna o nome do objeto iniciadoP
    }

}
