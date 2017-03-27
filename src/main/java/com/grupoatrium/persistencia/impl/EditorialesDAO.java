package com.grupoatrium.persistencia.impl;

/**
 * Clase DAO para Editoriales
 * @author elena
 *
 */
public class EditorialesDAO {
	
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
