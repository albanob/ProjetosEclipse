
public class FolhaPagamentoPlus {
		public static void main(String[] args) {
			
			EmpregadoPlus lista[];
			
			lista = new EmpregadoPlus[10];
			
			lista[0] = new EmpregadoPlus("Isidro", "Professor", 2000);
			lista[1] = new EmpregadoPlus("Jose", "Vendedor", 1500);
			lista[2] = new EmpregadoPlus("Pedro", "Coordenador", 2500);
			lista[3] = new EmpregadoPlus("Vera", "Diretora", 3000);
			lista[4] = new EmpregadoPlus("Claudete", "Inspetora", 1800);
			lista[5] = new EmpregadoPlus("Vicente", "Motorista", 2000);
			lista[6] = new EmpregadoPlus("Paulo", "Contador", 2300);
			lista[7] = new EmpregadoPlus("Ana", "Advogada", 3500);
			lista[8] = new EmpregadoPlus("Caique", "Programador", 2700);
			lista[9] = new EmpregadoPlus("Priscilla", "Designer", 2000);
	
			for (int posicao = 0; posicao < 10; posicao++) {
				System.out.println(lista[posicao].getNome()+"/"+lista[posicao].getCargo()+"  R$ "+lista[posicao].getSalario()+"/"+lista[posicao].calcularImposto()+"/"+lista[posicao].salarioLiquido());
			}
			
		}
}

	