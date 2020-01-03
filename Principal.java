package EstacionamentoVeiculo;

public class Principal{
	public static void main(String[] args) {
		Estacionamento es = new Estacionamento();
		Veiculo mt = new Moto(20, "MOTO", 2001, 111111, /**/100, 10);
		Veiculo mt2 = new Moto(22, "MOTO", 2012, 222212, /**/210, 20);
		Veiculo cr = new Carro(30, "CARRO", 2003, 33333, /**/310000, 300, 30);
		Veiculo cm = new Caminhao(20, "CAMINHÃO", 2004, 4444444, /**/400000, 4000, 400, 40);
		Veiculo on = new Onibus(30, "ÔNIBUS", 2005, 555555, /**/50000, 500000, 5000, 500, 50);
		
		es.adcn(mt);
		es.adcn(mt2);
		es.adcn(cr);
		es.adcn(cm);
		es.adcn(on);
		
		
		System.out.println("Dados do estacionamento " +es.estacionado());   
		System.out.println("=============================");
		es.estacionadotipo(); // Obter a quantidade de veículos, de acordo com o tipo;
		System.out.println("=============================");
		es.menorv();  //Exibir o veículo que possui o menor valor 
		System.out.println("=============================");
		System.out.println("Valor total da frota " +es.valor());  // Apresentar o valor total da frota;
		System.out.println("=============================");
		es.acelerando();
		es.acelerando();
		es.frearv();
		System.out.println("Moto" +mt.getVelocidade()); //Mostrando a acelerada e freiada na moto
		
		//Listar todos os veículos cadastrados (apenas a velocidade, a descrição e o ano);
		System.out.println("============ Moto ===========");
		System.out.println("Velocidade " +mt.getVelocidade());
		System.out.println("Descricao " +mt.getDescricao());
		System.out.println("Ano " +mt.getAno());
		System.out.println("============ Carro ===========");
		System.out.println("Velocidade " +cr.getVelocidade());
		System.out.println("Descricao " +cr.getDescricao());
		System.out.println("Ano " +cr.getAno()); 
		System.out.println("=========== Caminhão ==========");
		System.out.println("Velocidade " +cm.getVelocidade());
		System.out.println("Descricao " +cm.getDescricao());
		System.out.println("Ano " +cm.getAno());
		System.out.println("============ Onibus ===========");
		System.out.println("Velocidade " +on.getVelocidade());
		System.out.println("Descricao " +on.getDescricao());
		System.out.println("Ano " +on.getAno());
	}
}
