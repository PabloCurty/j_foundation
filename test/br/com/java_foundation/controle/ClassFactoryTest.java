package br.com.java_foundation.controle;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class ClassFactoryTest {
	
	ClassForNameFactory  factory;
	
	@Test
	public void test_executa_classForName_pessoa() {
		factory = new ClassForNameFactory();
		Class<?> klass = factory.getClassForName("Pessoa");
		
		assertEquals("br.com.java_foundation.model.Pessoa", klass.getName());
	}
	
	@Test
	public void test_executa_classForName_Chamado() {
		factory = new ClassForNameFactory();
		Class<?> klass = factory.getClassForName("Chamado");
		
		assertEquals("br.com.java_foundation.model.Chamado", klass.getName());
	}
	
	@Test
	public void test_executa_instancia_classe_nome_classe_errado() {
		
	}
}
