package Mundo.facade;

import java.sql.SQLException;
import java.util.ArrayList;

import Mundo.Contenedora.Mensaje;
import Mundo.Contenedora.Nodo;
import Mundo.Contenedora.Tabla;
import Mundo.dao.EstudioDAO;
import Mundo.db.Conexion;
import Mundo.dto.EstudioIDTO;

public class FacadeEstudio implements IFacade {
	private EstudioDAO estudioDAO;
	@Override
	public void insert(Conexion con, Mensaje messa) {
		if(messa.getTabla().equals(Tabla.ESTUDIOS))
		{
			estudioDAO.insert(con, messa);
		}
	}

	@Override
	public void delete(Conexion con, Mensaje messa) {
		if(messa.getTabla().equals(Tabla.ESTUDIOS))
		{
			estudioDAO.delete(con, messa);
		}
	}

	@Override
	public void update(Conexion con, Mensaje message) {
		if(message.getTabla().equals(Tabla.ESTUDIOS))
		{
			estudioDAO.update(con, message);
		}
	}

	@Override
	public ArrayList consultAll(Conexion con, Mensaje message) throws SQLException {
		ArrayList nvo = new ArrayList();
		{
			if(message.getTabla().equals(Tabla.ESTUDIOS))
			{
				nvo = estudioDAO.consultAll(con, message);
			}
		}
		return nvo;
	}

	@Override
	public Object consult(Conexion con, Mensaje message) {
		EstudioIDTO nvo = new EstudioIDTO();
		{
			if(message.getTabla().equals(Tabla.ESTUDIOS))
			{
				nvo = estudioDAO.consult(con, message);
			}
		}
		return nvo;
	}

}