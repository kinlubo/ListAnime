package Mundo.facade;

import java.sql.SQLException;
import java.util.ArrayList;

import Mundo.Contenedora.Mensaje;
import Mundo.Contenedora.Nodo;
import Mundo.dao.AnimeDAO;
import Mundo.db.Conexion;
import Mundo.dto.AnimeIDTO;
import Mundo.Contenedora.Tabla;

public class Facade implements IFacade{

	private AnimeDAO animeDAO;
	@Override
	public void insert(Conexion con, Mensaje messa) {
		if(messa.getTabla().equals(Tabla.ANIMES))
		{
			animeDAO.insert(con, messa);
		}
	}

	@Override
	public void delete(Conexion con, Mensaje messa) {
		if(messa.getTabla().equals(Tabla.ANIMES))
		{
			animeDAO.delete(con, messa);
		}
	}

	@Override
	public void update(Conexion con, Mensaje message) {
		if(message.getTabla().equals(Tabla.ANIMES))
		{
			animeDAO.update(con, message);
		}
	}

	@Override
	public ArrayList consultAll(Conexion con, Mensaje message) throws SQLException {
		ArrayList nvo = new ArrayList<>();
		{
			if(message.getTabla().equals(Tabla.ANIMES))
			{
				nvo = animeDAO.consultAll(con, message);
			}
		}
		return nvo;
	}

	@Override
	public Object consult(Conexion con, Mensaje message) throws SQLException {
		AnimeIDTO nvo = new AnimeIDTO();
		{
			if(message.getTabla().equals(Tabla.ANIMES))
			{
				nvo = animeDAO.consult(con, message);
			}
		}
		return nvo;
	}

}
