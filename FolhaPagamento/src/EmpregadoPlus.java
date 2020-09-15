public class EmpregadoPlus {
		
	// atributos
		private String nome;
		private String cargo;
		private double salario;
		/*private double imposto;
		private double salarioliquido;*/
		
		// vamos criar um método construtor
		// o cabeçalho dele é diferente dos demais
		public EmpregadoPlus(String nome, String cargo, double salario) {
	        this.nome = nome;
	        this.cargo = cargo;
	        this.salario = salario;
		}

	
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getCargo() {
			return cargo;
		}


		public void setCargo(String cargo) {
			this.cargo = cargo;
		}


		public double getSalario() {
			return salario;
		}


		public void setSalario(double salario) {
			this.salario = salario;
		}


		/*public double getImposto() {
			return imposto;
		}


		public void setImposto(double imposto) {
			this.imposto = imposto;
		}


		public double getSalarioliquido() {
			return salarioliquido;
		}


		public void setSalarioliquido(double salarioliquido) {
			this.salarioliquido = salarioliquido;
		}*/

		
		public void imprimir() {
			System.out.println("Nome   : " + nome);
			System.out.println("Cargo  : " + cargo);
			System.out.printf("Salario: R$ %.2f\n", salario);
			System.out.printf("Imposto: R$ %.2f\n", calcularImposto());
		}

	
		public double calcularImposto() {
			double imposto;
			if (salario <= 2000.0) {
				imposto = 0.0;
			} else if (salario <= 4500.0) {
				imposto = salario * 0.1;
			} else {
				imposto = 1200.0;
			}
			return imposto;

		}
		
		public double salarioLiquido() {
			double salarioliquido;
			salarioliquido = salario-calcularImposto();
			return salarioliquido;
		
		}

	}

