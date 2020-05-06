package Mundo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Mundo.Contenedora.Contenedora;
import Mundo.Contenedora.Mensaje;
import Mundo.Contenedora.Nodo;
import Mundo.db.Conexion;
import Mundo.dto.AnimeIDTO;
import Mundo.dto.EstudioIDTO;
import Mundo.dto.GeneroIDTO;

public class EstudioDAO implements IDAO {

	@Override
	public void insert(Conexion con, Mensaje message) {
		int idAnime = message.getIdEstudio();
		String nombreAnime = message.getEstudio();
		
		EstudioIDTO an = new EstudioIDTO(idAnime, nombreAnime);
		con.ejecutaActualizacion(an.insert());
	}

	@Override
	public void delete(Conexion con, Mensaje message) {
		EstudioIDTO anime = new EstudioIDTO();
		anime.setId(message.getIdEstudio());
		
		con.ejecutaActualizacion(anime.delete());
	}

	@Override
	public void update(Conexion con, Mensaje message) {
		int idAnime = message.getIdEstudio();
		String nombreEstudio = message.getEstudio();
		
		EstudioIDTO an = new EstudioIDTO(idAnime, nombreEstudio);
		con.ejecutaActualizacion(an.update());
	}

	@Override
	public ArrayList consultAll(Conexion con, Mensaje message) throws SQLException {
		EstudioIDTO an = new EstudioIDTO();
		
		ResultSet rs = con.ejecutaConsulta(an.consultAll());
		
		ArrayList<EstudioIDTO> consult = new ArrayList<EstudioIDTO>();
		while (rs.next()) {
			
			int id =rs.getInt(1);
			String nombre =rs.getString(2);
			EstudioIDTO an2 = new EstudioIDTO();
			an2.setId(id);
			an2.setNombreEstudio(nombre);
			consult.add(an2);
		}
		return consult;
	}

	@Override
	public EstudioIDTO consult(Conexion con, Mensaje message) {
		EstudioIDTO anime = new EstudioIDTO();
		anime.setId(message.getIdEstudio());
		
		ResultSet rs = con.ejecutaConsulta(anime.consult());
		try {
			if(rs.next()) {
			anime.setNombreEstudio(rs.getString(2));
			System.out.println(anime.getNombreEstudio());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return anime;
	}
	
	public EstudioIDTO consultID(Conexion con, Mensaje message) {
		EstudioIDTO anime = new EstudioIDTO();
		anime.setNombreEstudio(message.getEstudio());
		EstudioIDTO anime2 = new EstudioIDTO();
		ResultSet rs = con.ejecutaConsulta(anime.consultid());
		try {
			if(rs.next()) {
				anime2.setId(rs.getInt(1));
				anime2.setNombreEstudio(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return anime2;
	}

}
