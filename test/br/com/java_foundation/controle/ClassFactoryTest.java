package br.com.java_foundation.controle;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class ClassFactoryTest {
	
	@Test
	public void test_executa_instancia_classe_pessoa() {
		ClassFactory  factory = new ClassFactory();
		Object obj = factory.getInstance("Pessoa", "1");
		
		assertEquals("br.com.java_foundation.model.Pessoa", obj.getClass().getName());
	}

	@Test
	public void test_executa_instancia_classe_chamado() {
		ClassFactory  factory = new ClassFactory();
		Object obj = factory.getInstance("Chamado", "1");
		
		assertEquals("br.com.java_foundation.model.Chamado", obj.getClass().getName());
	}
}
