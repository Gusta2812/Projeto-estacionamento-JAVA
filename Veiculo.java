package EstacionamentoVeiculo;

public abstract class Veiculo {
	private int velocidade;
    private String descricao;
    private int ano;
    private int placa;
    private int valor;
    
    public Veiculo(int velocidade, String descricao, int ano, int placa, int valor){
        this.velocidade = 0;
        this.descricao = descricao;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescicao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    
    
    public abstract void acelerar(); 
    public abstract void frear();  
}
