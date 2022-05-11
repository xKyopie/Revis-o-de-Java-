package atv1;
public class Jogador {
    /*
    *Crie três atributos: pontuacao, tipo double; nome tipo String; ativado tipo boolean. 
    Classe principal main declare uma variável do tipo da classe criada e a instancie com um objeto do tipo. 
    Insira valores em cada um dos campos do objeto e os imprima.
    *
    */

    //declarando as variaveis
    private double pontuacao;
    private String nome; 
    private boolean ativado;

    public Jogador(String nome, int pontuacao, boolean ativado) {
        this.nome= nome;
        this.pontuacao = pontuacao;
        this.ativado = ativado;
    }

    //getters (pegar) e setters (atribuir), apenas para retornar valores
    public double getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isAtivado() {
        return ativado;
    }
    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }

    
    
}
