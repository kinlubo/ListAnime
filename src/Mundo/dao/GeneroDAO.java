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

public class GeneroDAO implements IDAO {

	@Override
	public void insert(Conexion con, Mensaje message) {
		int idAnime = 0;
		String nombreAnime = message.getGenero();
		
		GeneroIDTO an = new GeneroIDTO(idAnime, nombreAnime);
		con.ejecutaActualizacion(an.insert());
	}

	@Override
	public void delete(Conexion con, Mensaje message) {
		GeneroIDTO anime = new GeneroIDTO();
		anime.setId(message.getIdGenero());
		
		con.ejecutaActualizacion(anime.delete());
	}

	@Override
	public void update(Conexion con, Mensaje message) {
		int idAnime = message.getIdGenero();
		String nombreEstudio = message.getGenero();
		
		GeneroIDTO an = new GeneroIDTO(idAnime, nombreEstudio);
		con.ejecutaActualizacion(an.update());
	}

	@Override
	public ArrayList consultAll(Conexion con, Mensaje message) throws SQLException {
		GeneroIDTO an = new GeneroIDTO();
		
		ResultSet rs = con.ejecutaConsulta(an.consultAll());
		
		ArrayList<GeneroIDTO> consult = new ArrayList<GeneroIDTO>();
		while (rs.next()) {
			
			int id =rs.getInt(1);
			String nombre =rs.getString(2);
			GeneroIDTO an2 = new GeneroIDTO();
			an2.setId(id);
			an2.setNombreGenero(nombre);
			consult.add(an2);
		}
		return consult;
	}

	@Override
	public GeneroIDTO consult(Conexion con, Mensaje message) {
		GeneroIDTO song = new GeneroIDTO();
		song.setId(message.getIdGenero());
		
		ResultSet rs = con.ejecutaConsulta(song.consult());
		try {
			if(rs.next()) {
			song.setNombreGenero(rs.getString("nombre"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return song;
	}

	public GeneroIDTO consultID(Conexion con, Mensaje msj) {
		GeneroIDTO song = new GeneroIDTO();
		song.setNombreGenero(msj.getGenero());
		GeneroIDTO song2 = new GeneroIDTO();
		ResultSet rs = con.ejecutaConsulta(song.consultid());
		try {
			if(rs.next()) {
				song2.setId(rs.getInt(1));
				song2.setNombreGenero(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return song2;
	}

	public ArrayList<Integer> consultPivot(Conexion con, int idAnime) throws SQLException {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr	= new ArrayList<Integer>();
		ResultSet rs = con.ejecutaConsulta("Select * from generos_animes where animes_id= "+idAnime+";");
		while (rs.next()) {
			int a =rs.getInt("generos_id");
			arr.add(a);
		}
		return arr;
	}

}
