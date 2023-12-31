package br.com.jrodrigues;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.jrodrigues.dao.CursoDao;
import br.com.jrodrigues.dao.ICursoDao;
import br.com.jrodrigues.domain.Curso;

public class CursoTest {
	
	private ICursoDao cursoDAO;

	public CursoTest() {
		cursoDAO = new CursoDao();
	}
	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso Java Backend");
		curso = cursoDAO.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
		
	}

}
