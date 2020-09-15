package userinterface;

import core.Pessoa;
import model.Aluno;
import model.Professor;

public class SistemaUni {
	public static void main (String[] args) {
		Pessoa p = new Pessoa();
		Aluno a = new Aluno();
		Professor r = new Professor();
		
		p.setNome ("Nome da Pessoa");
		p.setEmail ("E-mail da Pessoa");
		p.setTelefone ("Telefone da Pessoa");
		
		
		a.setNome ("Nome do Aluno");
		a.setEmail ("E-mail do Aluno");
		a.setTelefone ("Telefone do Aluno");
		a.setNumMatricula (123);
		a.setCurso ("E-mail da Pessoa");
		a.setAnoFormatura (2020);
		
		r.setNome ("Nome do Professor");
		r.setEmail ("E-mail do Professor");
		r.setTelefone ("Telefone do Professor");
		r.setAreaFormacao ("Area do Professor");
		r.setDisciplina  ("Ciencias da Computacao");
		
		p.mostrarInfo();
		a.mostrarInfo();
		r.mostrarInfo();
		
	} 

}
