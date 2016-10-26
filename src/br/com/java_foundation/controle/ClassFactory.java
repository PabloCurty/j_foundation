package br.com.java_foundation.controle;

import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.BadRequestException;

public class ClassFactory {

	private static final String PATH = "br.com.java_foundation.model."; 
	
	public Object getInstance(String className, String id){
		
		Object obj = null;
		try {
			obj = Class.forName (PATH + className).getConstructor(String.class).newInstance(id);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new BadRequestException("Classe não encontrada");
		}
		return obj;
	}
}
