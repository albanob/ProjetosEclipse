
public class LivroCore {
	public static void main (String args[]) {
		Livro l1,l2,l3,l4,l5;
		
		l1 = new Livro("Hello Java", "Bruno", 2020,"Drama", 1,1,true); // "INSTANCIAÇÃO"
		l2 = new Livro("Hello World", "Rafael", 2020,"Acao", 2,2,false);
		l3 = new Livro("Hello Mundo", "Lucas", 2020,"Ficcao", 3,3,true);
		l4 = new Livro("Hello Eclipse", "Vinicius", 2020,"Terror", 4,4,false);
		l5 = new Livro("Hello Bruno", "Agnelo", 2020,"Drama", 5,5,false);
	/*	
		l1.settitulo		("Hello Java");
		l1.setautor			("Bruno");
		l1.setano			(2020);
		l1.setcategoria		("Drama");
		l1.setestante		(1);
		l1.setprateleira	(1);
		l1.setemprestado	(true);
		
		l2.settitulo		("Hello World");
		l2.setautor			("Rafael");
		l2.setano			(2021);
		l2.setcategoria		("Terror");
		l2.setestante		(2);
		l2.setprateleira	(2);
		l2.setemprestado	(false);
		
		l3.settitulo		("Hello Mundo");
		l3.setautor			("Lucas");
		l3.setano			(2022);
		l3.setcategoria		("Comedia");
		l3.setestante		(3);
		l3.setprateleira	(3);
		l3.setemprestado	(true);
		
		l4.settitulo		("Hello Eclipse");
		l4.setautor			("Ficcao");
		l4.setano			(2023);
		l4.setcategoria		("Ficcao");
		l4.setestante		(4);
		l4.setprateleira	(4);
		l4.setemprestado	(false);
		
		l5.settitulo		("Hello");
		l5.setautor			("Bruno");
		l5.setano			(2024);
		l5.setcategoria		("Acao");
		l5.setestante		(5);
		l5.setprateleira	(5);
		l5.setemprestado	(true);
		*/
		
		
		System.out.println("Situação dos Livros: ");
		l1.imprimir();
		l2.imprimir();
		l3.imprimir();
		l4.imprimir();
		l5.imprimir();
		

}
}
