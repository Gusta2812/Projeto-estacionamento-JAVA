package EstacionamentoVeiculo;

public class Carro extends Veiculo{
    private int quantidadeporta;
    private int potencia;
    
    public Carro(int velocidade, String descricao, int ano, int placa, int valor, int quantidadeporta, int potencia){
       super(velocidade, descricao, ano, placa, valor); 
       this.quantidadeporta = quantidadeporta;
       this.potencia = potencia;
    }

    public int getQuantidadeporta() {
        return quantidadeporta;
    }

    public void setQuantidadeporta(int quantidadeporta) {
        this.quantidadeporta = quantidadeporta;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
     public void acelerar(){
        super.setVelocidade(getVelocidade() + 10);
    }
          
    public void frear(){
        if(getVelocidade() > 0){
            super.setVelocidade(getVelocidade() -10); 
        }
    }
}