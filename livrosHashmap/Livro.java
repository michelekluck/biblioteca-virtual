package livrosHashmap;

public class Livro {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals (Object o) { // metodo equals serve para comparar objetos, ele é chamado automaticamente quando usamos os métodos putIfAbsent, .get ou .add
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return titulo.equalsIgnoreCase(livro.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.toLowerCase().hashCode();
        // garante que livros com titulos iguais, mas com letras diferentes, gerem o mesmo hashcode
    }
}

