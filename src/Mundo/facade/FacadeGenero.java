package Mundo.facade;

import java.sql.SQLException;
import java.util.ArrayList;

import Mundo.Contenedora.Mensaje;
import Mundo.Contenedora.Nodo;
import Mundo.Contenedora.Tabla;
import Mundo.dao.EstudioDAO;
import Mundo.dao.GeneroDAO;
import Mundo.db.Conexion;
import Mundo.dto.GeneroIDTO;

public class FacadeGenero implements IFacade{
	private GeneroDAO generoDAO;
	@Override
	public void insert(Conexion con, Mensaje messa) {
		if(messa.getTabla().equals(Tabla.ESTUDIOS))
		{
			generoDAO.insert(con, messa);
		}
	}

	@Override
	public void delete(Conexion con, Mensaje messa) {
		if(messa.getTabla().equals(Tabla.ESTUDIOS))
		{
			generoDAO.delete(con, messa);
		}
	}

	@Override
	public void update(Conexion con, Mensaje message) {
		if(message.getTabla().equals(Tabla.ESTUDIOS))
		{
			generoDAO.update(con, message);
		}
	}

	@Override
	public ArrayList consultAll(Conexion con, Mensaje message) throws SQLException {
		ArrayList nvo = new ArrayList();
		{
			if(message.getTabla().equals(Tabla.ESTUDIOS))
			{
				nvo = generoDAO.consultAll(con, message);
			}
		}
		return nvo;
	}

	@Override
	public Object consult(Conexion con, Mensaje message) {
		GeneroIDTO nvo = new GeneroIDTO();
		{
			if(message.getTabla().equals(Tabla.ESTUDIOS))
			{
				nvo = generoDAO.consult(con, message);
			}
		}
		return nvo;
	}

}