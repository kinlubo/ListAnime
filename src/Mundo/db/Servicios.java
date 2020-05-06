package Mundo.db;

public class Servicios {
	private Conexion con;

	
	public Servicios() {
		con = new Conexion("jdbc:postgresql://127.0.0.1:5432/listaanimedb", "anime", "anime");
	}

	public Conexion getCon() {
		return con;
	}

	public void setCon(Conexion con) {
		this.con = con;
	}

	
}