package Mundo.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import Mundo.Contenedora.Mensaje;
import Mundo.Contenedora.Nodo;
import Mundo.db.Conexion;
import Mundo.dto.AnimeIDTO;
import Mundo.dto.EstudioIDTO;

public interface IDAO 
{
	public void insert(Conexion con, Mensaje message);
	public void delete(Conexion con, Mensaje message);
	public void update(Conexion con, Mensaje message);
	public ArrayList consultAll(Conexion con, Mensaje message) throws SQLException;
	public Object consult(Conexion con, Mensaje message) throws SQLException;
}
