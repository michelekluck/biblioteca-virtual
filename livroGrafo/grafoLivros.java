package livroGrafo;

import java.util.ArrayList;
import java.util.LinkedList;

public class grafoLivros {
    private ArrayList<String> livros;
    private ArrayList<LinkedList<String>> relacoes;

    public grafoLivros() {
        livros = new ArrayList<>();
        relacoes = new ArrayList<>();
    }

    public void adicionaLivro(String nomeDoLivro) {
        livros.add(nomeDoLivro);
        relacoes.add(new LinkedList<>());
    }

    public void adicionarRelacao(String livroAdicionado, String livroRelacionado) {
        int indiceLivroAdicionado = livros.indexOf(livroAdicionado);
        int indiceLivroRelacionado = livros.indexOf(livroRelacionado);

        if (indiceLivroAdicionado != -1 && indiceLivroRelacionado != -1)  {
            relacoes.get(indiceLivroAdicionado).add(livroRelacionado);
            relacoes.get(indiceLivroRelacionado).add(livroAdicionado);
        }
    }

    public void mostrarRelacoesDosLivros() {
        for (int i = 0; i < livros.size(); i++) {
            System.out.print("Livros parecidos com " + livros.get(i) + ": ");

            LinkedList<String> relacoesDoLivroAtual = relacoes.get(i);

            for (int j = 0; j < relacoesDoLivroAtual.size(); j++) {
                System.out.print(relacoesDoLivroAtual.get(j));

                if (j < relacoesDoLivroAtual.size() -1 ) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}

