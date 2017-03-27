package com.grupoatrium.persistencia.impl;

/**
 * Clase DAO para Libros
 * @author Elena
 *
 */
public class LibrosDAO {
	
	//Propiedades de clase
	private ConnectionMgr connectionMgr;

	//--------------Métodos de acceso y modificación-------------
	
	public ConnectionMgr getConnectionMgr() {
		return connectionMgr;
	}

	public void setConnectionMgr(ConnectionMgr connectionMgr) {
		this.connectionMgr = connectionMgr;
	}
	
	// Método de prueba de inyecciones
	@Override
	public String toString() {
		return connectionMgr.toString();
	}
	
	

}
