/*neste arquivo9classe) vou definir as caracteristicas que
 * descrevem um carro, ou seja, 
 * 
 */
public class Carro {
	//defino os atributos (ou seja a estrutura)
	String marca;
	String modelo;
	int ano;
	int finalPlaca;
	String cor;
	String combustivel;
	float preco;
	
	// defino os métodos (ou seja, as funcionalidades da classe = Procedures)
	void exibirAnuncio(){
		System.out.println("***OFERTA IMPERDIVEL***");
		System.out.println(marca+"/"+modelo);
		System.out.println("Ano: "+ano+" Final da Placa:"+finalPlaca);
		System.out.println("Cor: "+cor);
		System.out.println("Combustivel: "+combustivel);
		System.out.println("Valor:"+preco);
		}
		
	//Calcular o IPVA
	/* vamos supor que o IPVA é sempre 3% do valor do carro
	 * 
	 */
	float calcularIPVA(){
		float ipva; 			//variavel local (só existe enquanto este método execute
		ipva  = preco * 0.03f; 	// fiz a continha
		return ipva;			// retorno o valor armazenado nesta variavel, para quem for chama-lo
	}

}
