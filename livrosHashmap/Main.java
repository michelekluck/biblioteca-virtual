package livrosHashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        grafoLivros grafo = new grafoLivros(); // novo objeto da classe grafoLivrosHashMap
        Map<String, Livro> livros = new HashMap<>();  // novo objeto da classe hashmap

        String[] titulos = { // criação de um array de string, onde cada string é o titulo de um livro
            "Dom Casmurro",
            "Memórias Póstumas de Brás Cubas",
            "O Cortiço",
            "A Metamorfose",
            "A Vegetariana",
            "O Processo",
            "O Principe",
            "O Capital",
            "Manifesto do Partido Comunista",
            "O Contrato Social"
        };

        for (String titulo : titulos) {
            Livro livro = new Livro(titulo);
            livros.put(titulo, livro);
            grafo.adicionarLivro(livro);
        }

        String[][] relacoes = {
            {"Dom Casmurro", "Memórias Póstumas de Brás Cubas"},
            {"Dom Casmurro", "O Cortiço"},
            {"Memórias Póstumas de Brás Cubas", "O Cortiço"},
            {"Memórias Póstumas de Brás Cubas", "A Metamorfose"},
            {"O Cortiço", "A Metamorfose"},
            {"O Cortiço", "A Vegetariana"},
            {"A Vegetariana", "A Metamorfose"},
            {"A Vegetariana", "Memórias Póstumas de Brás Cubas"},
            {"O Processo", "A Vegetariana"},
            {"O Processo", "Memórias Póstumas de Brás Cubas"},
            {"O Principe", "A Vegetariana"},
            {"O Principe", "Memórias Póstumas de Brás Cubas"},
            {"O Capital", "Manifesto do Partido Comunista"},
            {"O Capital", "O Contrato Social"},
            {"Manifesto do Partido Comunista", "O Processo"},
            {"Manifesto do Partido Comunista", "O Contrato Social"},
            {"O Contrato Social", "O Capital"},
            {"O Contrato Social", "O Principe"}
        };

        for (String[] relacao : relacoes) {
            grafo.adicionarRelacao(livros.get(relacao[0]), livros.get(relacao[1]));
        }

        grafo.mostrarRelacoes();
    }
}
