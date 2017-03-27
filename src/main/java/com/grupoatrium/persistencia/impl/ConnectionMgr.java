/**
 * 
 */
package com.grupoatrium.persistencia.impl;

/**
 * Clase de definición de propiedades de Conexion a BBDD
 * @author elena
 *
 */
public class ConnectionMgr {

	// Propiedades de clase
	private String driver;
	private String url;
	private String usuario;
	private String password;
 

	//--------------Métodos de acceso y modificación-------------

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Método de prueba de inyecciones
	@Override
	public String toString() {
		return "Driver: " + driver + ", URL: " + url + ", Usuario: " + usuario + ", Password: " + password;
	}

}
