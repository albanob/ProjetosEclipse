import java.util.Scanner;
public class QuestaoCore {
	public static void main(String[] args) {
		Questao lista[];
		lista = new Questao[3];
		Scanner teclado = new Scanner(System.in);
		String resp;
		
		lista[0] = new Questao("Quanto vale 1+1?","2");
		lista[1] = new Questao("Quanto vale 2+2?","4");
		lista[2] = new Questao("Quanto vale 4+4?","8");
		
		for(Questao q: lista) {
			System.out.println(q.apresentarQuestao());
			//vou ler a resposta do usuario
			
			resp = teclado.nextLine();
			
			if (q.corrigir(resp)){
				System.out.println("Você acertou");
			}
			else {
				System.out.println("Você errou");
			}
		}
	}
}
