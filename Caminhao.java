package EstacionamentoVeiculo;

public class Caminhao extends Veiculo{
    private int cargasuporta;
    private int comprimento;
    
    public Caminhao(int velocidade, String descricao, int ano, int placa, int valor, int cargasuportada, int comprimento, int cargasuporta){
        super(velocidade, descricao, ano, placa, valor);
        this.cargasuporta = cargasuporta;
        this.comprimento = comprimento;     
    }

    public int getCargasuporta() {
        return cargasuporta;
    }

    public void setCargasuporta(int cargasuporta) {
        this.cargasuporta = cargasuporta;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
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