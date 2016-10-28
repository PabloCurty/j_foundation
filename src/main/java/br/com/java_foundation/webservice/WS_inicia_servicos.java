package br.com.java_foundation.webservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
 
@ApplicationPath("/rs")
public class WS_inicia_servicos extends Application {
 
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
 
	public WS_inicia_servicos() {
		singletons.add(new StatusService());
		singletons.add(new EntidadeServiceImpl());
	}
 
	public Set<Class<?>> getClasses() {
		return empty;
	}
 
	public Set<Object> getSingletons() {
		return singletons;
	}
}