package EstacionamentoVeiculo;

import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Veiculo> veiculo = new ArrayList<>(10);

    
    //Adicionando Veiculos no estacionamento
    public void adcn(Veiculo v){
        if(veiculo.size() < 10){
            veiculo.add(v);
        }
        else{
            System.out.println("PASSOU DOS LIMITES DO ESTACIONAMENTO");
        }
    }
    
    //Valor total da frota
    public int valor() {
    	int valor = 0;
    	for(int i = 0; i < veiculo.size(); i++) {
    		valor += veiculo.get(i).getValor();
			}
    	return valor;
    }
  
    
    //Total da frotas no estacionamento 
    public int estacionado(){
        int total = 0;
        for(int i = 0; i < veiculo.size(); i++){
            if(veiculo.size() < 10) {
            	total ++;
            }
        } 
        return total; 
    }
    
    //Valor total de cada automovel no estacionamento
    public void estacionadotipo(){
        int totalmoto = 0, totalcarro = 0, totalcaminhao = 0, totalonibus = 0;
        for(int i = 0; i < veiculo.size(); i++){
            //Vendo o tipo do automovel que está alocado no espaço
            if(veiculo.get(i) instanceof Moto){ 
               totalmoto ++;  
            }
            else if(veiculo.get(i) instanceof Carro){
                totalcarro ++;
            }
            else if(veiculo.get(i) instanceof Caminhao){
                totalcaminhao ++;
            } 
            else if(veiculo.get(i) instanceof Onibus){
                totalonibus ++;
            }   
            
            //Apresentar o tipo de veículo que possui maior quantidade;
           
            if(totalmoto > totalcarro || totalmoto > totalcaminhao || totalmoto > totalonibus) {
            	System.out.println("Possui maior quantidade de moto estacionado");
            }
            else if(totalcarro > totalmoto ||  totalcarro > totalcaminhao || totalcarro > totalonibus) {
            	System.out.println("Possui maior quantidade de carro estacionado");
            }
            
            else if(totalcaminhao > totalmoto ||  totalcaminhao > totalcarro || totalcaminhao > totalonibus) {
            	System.out.println("Possui maior quantidade de caminhão estacionado");
            }
            else {
            	System.out.println("Possui maior quantidade de caminhão estacionado");
            }
           
            
         
    }
        System.out.println("=============================");
        System.out.println("Total de moto adicionada " +totalmoto);
        System.out.println("Total de carro adicionado " +totalcarro);
        System.out.println("Total de carro adicionado " +totalcaminhao);
        System.out.println("Total de carro adicionado " +totalonibus);
         
    }
    
    //Veiculo que possui menor valor
    public void menorv() {
    	int menor = veiculo.get(0).getValor();
    	int posicao = 0;
    	for(int i = 0; i < veiculo.size(); i++) {
    		if(veiculo.get(i).getValor() < menor) {
    			menor = veiculo.get(i).getValor();
    			posicao = i;
    		}    		
    	}  	
    	System.out.println("Veiculo com menor valor " + menor);
    }
    
    
    
    //Acelerando todos os veiculos
    public void acelerando(){
        for(int i = 0; i < veiculo.size(); i++){
            //Acelerando todos os veiculos no estacionamento
            veiculo.get(i).acelerar();           
    }
        System.out.println("Veiculos acelerados" );
    }
        
        
    //Freiando todos os automoveis
    public void frearv(){
        for(int i = 0; i < veiculo.size(); i++){
            //Freando todos os veiculos no estacionamento
            veiculo.get(i).frear();
        }
        System.out.println("Veiculos freados");
    }
    
    
   
   
    
    

    
}



/* Usando o getClass() 
for (musica m : musica){
if(m.getClass().equals(MusicaSertanejaClass)){}}
*/
