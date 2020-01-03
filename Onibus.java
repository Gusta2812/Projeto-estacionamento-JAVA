package EstacionamentoVeiculo;

public class Onibus extends Veiculo{
    private int comprimeito, capacidade, passageiros;
    
    public Onibus(int velocidade, String descricao, int ano, int placa, int valor ,int comprimento, int capacidade, int passageiro, int passageiros){
        super(velocidade, descricao, ano, placa, valor);
        this.comprimeito = comprimento;
        this.capacidade = capacidade;
        this.passageiros = passageiros; 
    }

    public int getComprimeito() {
        return comprimeito;
    }

    public void setComprimeito(int comprimeito) {
        this.comprimeito = comprimeito;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
    
   public void acelerar(){
        super.setVelocidade(getVelocidade() + 8);
    }
          
    public void frear(){       
        if(getVelocidade() > 0){
            super.setVelocidade(getVelocidade() -8); 
        }
    }
}