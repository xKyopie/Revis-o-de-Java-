package atv2Aluno;

public class Main {

    public static void main(String[] args) {
        
        char genero = 'M';
        Autor autor = new Autor("Dan Brown", "danBronw@email.com.br", genero);
        System.out.println("Nome do autor: " + autor .getNome());
        System.out.println("Email: " + autor .getEmail());
        System.out.println("Genero: " + autor .getGenero());
    }
}
