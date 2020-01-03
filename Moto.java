package EstacionamentoVeiculo;

public class Moto extends Veiculo{
    private int potencia;
    
    public Moto(int velocidade, String descricao, int ano, int placa, int valor, int potencia){
      super(velocidade, descricao, ano, placa, valor);
      this.potencia = potencia;
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