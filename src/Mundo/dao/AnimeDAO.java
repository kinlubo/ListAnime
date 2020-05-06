package Mundo.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Mundo.Contenedora.Contenedora;
import Mundo.Contenedora.Mensaje;
import Mundo.Contenedora.Nodo;
import Mundo.db.Conexion;
import Mundo.dto.AnimeIDTO;

public class AnimeDAO implements IDAO {
	public void insert(Conexion con, Mensaje message) 
	{
	
		int idAnime = message.getIdAnime();
		String nombreAnime = message.getNombreAnime();
		String descripcion = message.getDescripcion();
		Date fechaPublicacion = message.getFechaPublicacion();
		String ver= message.getUrlVisualizar();
		String urlMusica = message.getUrlMusica();
		int estudio = message.getIdEstudio();
		
		AnimeIDTO an = new AnimeIDTO(idAnime, nombreAnime, descripcion, fechaPublicacion, ver, urlMusica, estudio);
		
		con.ejecutaActualizacion(an.insert());
	}

	public void delete(Conexion con, Mensaje message) 
	{
		AnimeIDTO anime = new AnimeIDTO();
		anime.setIdAnime(message.getIdAnime());
		
		con.ejecutaActualizacion(anime.delete());
	}

	public void update(Conexion con, Mensaje message) 
	{
		int idAnime = message.getIdAnime();
		String nombreAnime = message.getNombreAnime();
		String descripcion = message.getDescripcion();
		Date fechaPublicacion = message.getFechaPublicacion();
		String ver= message.getUrlVisualizar();
		String urlMusica = message.getUrlMusica();
		int estudio = message.getIdEstudio();
		
		AnimeIDTO an = new AnimeIDTO(idAnime, nombreAnime, descripcion, fechaPublicacion, ver, urlMusica, estudio);
		con.ejecutaActualizacion(an.update());
	}

	public ArrayList<AnimeIDTO> consultAll(Conexion con, Mensaje message) throws SQLException 
	{
		AnimeIDTO an = new AnimeIDTO();
		
		ResultSet rs = con.ejecutaConsulta(an.consultAll());
		ArrayList<AnimeIDTO> tmp = new ArrayList<AnimeIDTO>();
		
		while(rs.next()) {
			AnimeIDTO an2 = new AnimeIDTO();
			an2.setNombreAnime(rs.getString(2));
			an2.setDescripcion(rs.getString(3));
			an2.setEstudio(rs.getInt(7));
			an2.setFechaPublicacion(rs.getDate(4));
			an2.setUrlMusica(rs.getString(6));
			an2.setUrlVisualizar(rs.getString(5));
			an2.setIdAnime(rs.getInt(1));
			tmp.add(an2); 
		}
		return tmp;
	}

	public AnimeIDTO consult(Conexion con, Mensaje message) throws SQLException 
	{
		AnimeIDTO anime = new AnimeIDTO();
		anime.setIdAnime(message.getIdAnime());
		
		ResultSet rs = con.ejecutaConsulta(anime.consult());
		AnimeIDTO an2 = new AnimeIDTO();
		if(rs.next()) {
			an2.setNombreAnime(rs.getString(2));
			an2.setDescripcion(rs.getString(3));
			an2.setEstudio(rs.getInt(7));
			an2.setFechaPublicacion(rs.getDate(4));
			an2.setUrlMusica(rs.getString(6));
			an2.setUrlVisualizar(rs.getString(5));
			an2.setIdAnime(rs.getInt(1));
		}
		return an2;
	}

	public int consultID(Conexion con, Mensaje msj) throws SQLException {
		ResultSet rs = con.ejecutaConsulta("select * from animes where nombre ='"+msj.getNombreAnime()+"';");
		if(rs.next()) {
			return rs.getInt(1);
		}
		return 0;
	}
}
