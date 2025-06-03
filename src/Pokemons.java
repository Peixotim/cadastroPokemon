import java.util.Scanner;
public class Pokemons {
    String nome;
    String tipoPokemon;
    String generoPokemon;
    String habilidadeEspecial;
    String fraquezas;
    String treinador;
    String natureza;
    String recebeBoolean;
    int nivel;
    int defesa;
    double altura;
    double vida;
    boolean estaVivo;
    boolean lendario;
    public void informacoesPokemon(){
        System.out.println("Nome do treinador atual : " + treinador);
        System.out.println("Nome do Pokemon :  " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Natureza: " + natureza);
        System.out.println("Defesa: " + defesa);
        System.out.println("Vivo: " + estaVivo);
        System.out.println("Altura: " + altura);
        System.out.println("Gênero: " + generoPokemon);
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
        System.out.println("Fraquezas: " + fraquezas);
        System.out.println("Lendario: " + lendario);
        System.out.println("Tipo : " + tipoPokemon);
    }



}
