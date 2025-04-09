package livroGrafo;

import livroGrafo.grafoLivros;

public class mainGrafoLivros {
    public static void main(String[] args) {
        grafoLivros grafoDeLivros = new grafoLivros();

        grafoDeLivros.adicionaLivro("Dom Casmurro");
        grafoDeLivros.adicionaLivro("Memorias Postumas de Bras Cubas");
        grafoDeLivros.adicionaLivro("O Cortiço");
        grafoDeLivros.adicionaLivro("A Metamorfose");
        grafoDeLivros.adicionaLivro("A Vegetariana");
        grafoDeLivros.adicionaLivro("O Processo");
        grafoDeLivros.adicionaLivro("O Principe");
        grafoDeLivros.adicionaLivro("O Capital");
        grafoDeLivros.adicionaLivro("Manifesto do Partido Comunista");
        grafoDeLivros.adicionaLivro("O Contrato Social");

        grafoDeLivros.adicionarRelacao("Dom Casmurro", "Memorias Postumas de Bras Cubas");
        grafoDeLivros.adicionarRelacao("Dom Casmurro", "O Cortiço");
        grafoDeLivros.adicionarRelacao("O Cortiço", "A Metamorfose");
        grafoDeLivros.adicionarRelacao("O Cortiço", "Memorias Postumas de Bras Cubas");
        grafoDeLivros.adicionarRelacao("A Metamorfose", "O Processo");
        grafoDeLivros.adicionarRelacao("A Metamorfose", "A Vegetariana");
        grafoDeLivros.adicionarRelacao("O Processo", "O Capital");
        grafoDeLivros.adicionarRelacao("O Processo", "A Vegetariana");
        grafoDeLivros.adicionarRelacao("O Principe", "O Capital");
        grafoDeLivros.adicionarRelacao("O Principe", "O Processo");
        grafoDeLivros.adicionarRelacao("O Capital", "O Contrato Sociaçl");
        grafoDeLivros.adicionarRelacao("O Capital", "Manifesto do Partido Comunista");
        grafoDeLivros.adicionarRelacao("Manifesto do Partido Comunista", "O Processo");
        grafoDeLivros.adicionarRelacao("Manifesto do Partido Comunista", "O Contrato Social");
        grafoDeLivros.adicionarRelacao("O Contrato Social", "O Principe");
        grafoDeLivros.adicionarRelacao("O Contrato Social", "O Processo");

        grafoDeLivros.mostrarRelacoesDosLivros();
    }
}
