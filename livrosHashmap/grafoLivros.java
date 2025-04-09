package livrosHashmap;

import java.util.*;

public class grafoLivros {
    private Map<Livro, Set<Livro>> grafo; // criação de uma variavel de instancia chamada grafo, do tipo Map<Livro, Set<Livro>>

    public grafoLivros() {
        grafo = new HashMap<>(); // quando o objeto for criado, o grafo sera inicializada com um novo hashmap
    }

    public void adicionarLivro(Livro livro)  {
        grafo.putIfAbsent(livro, new HashSet<>());
        // verifica se o livro ja esta presente no Map chamado grafo, se nao estiver, ele adiciona esse livro como chave no mapa e associa a ele um novo HashSet vazio (sem relações ainda)
    }

    public void adicionarRelacao(Livro livro1, Livro livro2){
        grafo.get(livro1).add(livro2); // retorna o livro 1 e adiciona um livro para relacionar a ele
        grafo.get(livro2).add(livro1);
    }

    public void mostrarRelacoes() {
        for (Livro livro : grafo.keySet()) { // percorre todos os livros adicionados ao grafo
            System.out.print("Livros parecidos com " + livro.getTitulo() + ": ");

            Set<Livro> relacionados = grafo.get(livro); // cria uma variavel chamada relacionados e armazena nela o conjunto de livros relacionados àquele livro atual
            int i = 0;
            for (Livro rel : relacionados) { // percorre cada livro relacionado
                System.out.print(rel.getTitulo());
                if (i < relacionados.size() - 1) System.out.print(", ");
                i++;
            }
            System.out.println();
        }
    }
}

