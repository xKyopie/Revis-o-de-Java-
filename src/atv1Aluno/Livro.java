package atv1Aluno;

public class Livro {
    private int ano;
    private String titulo;
    private String autor;

    
    //Contructor
    public Livro(int ano, String titulo, String autor) {
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
    }

    //getters e setters
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    

}
