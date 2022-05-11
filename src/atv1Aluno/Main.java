package atv1Aluno;

public class Main {
    /**
     * declare uma variável do tipo da classe e crie uma 
     * instância da mesma (ou seja, um objeto). 
     * Insira valores em cada um dos campos do objeto e
     *  os imprima em seguida.
     */

    public static void main(String[] args) {
        Livro livro = new Livro(2013, "O Inferno de Dante", "Dan Brown");
        System.out.println("Título: " + livro .getTitulo());
        System.out.println("Ano: " + livro .getAno());
        System.out.println("Autor: " + livro .getAutor());
    }
    
    
     




}
