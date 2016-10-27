package br.com.java_foundation.controle;

import javax.ws.rs.BadRequestException;

public class ClassForNameFactory<T> {

	//TODO decidir mapeamento da classe pela aplica��o
	private static final String PATH = "br.com.java_foundation.model.";

	public Class<?> getClassForName(String className) {

		Class<?> klass = null;
		
			try {
				klass = Class.forName(PATH + className);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				throw new BadRequestException("Classe n�o encontrada " + e);
			}
		
		return klass;
	}
}
