package Mundo.facade;

import java.sql.SQLException;
import java.util.ArrayList;

import Mundo.Contenedora.Mensaje;
import Mundo.Contenedora.Nodo;
import Mundo.db.Conexion;

public interface IFacade 
{
	public void insert(Conexion con, Mensaje messa);
	public void delete(Conexion con, Mensaje messa);
	public void update(Conexion con, Mensaje messa);
	public ArrayList consultAll(Conexion con, Mensaje messa) throws SQLException;
	public Object consult(Conexion con, Mensaje messa) throws SQLException;
}
