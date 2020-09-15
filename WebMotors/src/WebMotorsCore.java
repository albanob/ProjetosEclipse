
public class WebMotorsCore {
	public static void main (String args[]) {
		Carro c1,c2,c3;
		
		//ainda não tenho o espaço de memória reservado, portando
		//preciso solicitar para a JVM uma área para armazenar todas as infos
		
		c1 = new Carro(); // "INSTANCIAÇÃO"
		c2 = new Carro();
		c3 = new Carro();
		
		c1.marca = "Fiote";
		c1.modelo = "147 Turbo Abarth";
		c1.ano = 1982;
		c1.combustivel = "Gasolina Podium";
		c1.finalPlaca = 1;
		c1.cor = "Azul";
		c1.preco = 82350;
		
		c2.marca = "Voks";
		c2.modelo = "Fuscao";
		c2.ano = 1975;
		c2.combustivel = "Alcool";
		c2.finalPlaca = 4;
		c2.cor = "Beginho";
		c2.preco = 93725;
		
		c3.marca = "Forde";
		c3.modelo = "DEL Rey Ghia S";
		c3.ano = 1985;
		c3.combustivel = "Gas de cozinha";
		c3.finalPlaca = 7;
		c3.cor = "Bordo metalizado";
		c3.preco = 93725;
		
		c1.exibirAnuncio();
		float impostoC1 = c1.calcularIPVA();
		System.out.println("Valor do IPVA = "+impostoC1);
		System.out.println("----------------------");
		c2.exibirAnuncio();
		float impostoC2 = c2.calcularIPVA();
		System.out.println("Valor do IPVA = "+impostoC2);
		System.out.println("----------------------");
		c3.exibirAnuncio();
		System.out.println("Valor do IPVA = "+c3.calcularIPVA());
		System.out.println("----------------------");
		
	}

}
