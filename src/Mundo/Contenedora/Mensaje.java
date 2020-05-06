package Mundo.Contenedora;

import java.io.Serializable;
import java.sql.Date;

import Mundo.Contenedora.Funcion;
import Mundo.Contenedora.Tabla;

public class Mensaje implements Serializable
{
	public final static long serialVersionUID = 518405140372484957L;
	private Funcion funcion;
	private Tabla tabla;
	
	
	private int idAnime;
	private int idGenero;
	private String nombreAnime;
	private String descripcion;
	private Date fechaPublicacion;
	private String urlVisualizar;
	private String urlMusica;
	private String estudio;
	private String genero;
	private int idEstudio;
	
	public Mensaje()
	{
		
	}
	
	public void funcionAnimes(Funcion pFuncion, int idAnime, String nombreAnime, String descripcion, Date fechaPublicacion, String urlVisualizar,
			String urlMusica, String estudio, String genero)
	{
		tabla = Tabla.ANIMES;
		funcion = pFuncion;
		this.idAnime = idAnime;
		this.nombreAnime = nombreAnime;
		this.fechaPublicacion = fechaPublicacion;
		this.urlVisualizar = urlVisualizar;
		this.urlMusica = urlMusica;
		this.estudio = estudio;
		this.genero = genero;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

	public Tabla getTabla() {
		return tabla;
	}

	public void setTabla(Tabla tabla) {
		this.tabla = tabla;
	}

	public int getIdAnime() {
		return idAnime;
	}

	public void setIdAnime(int idAnime) {
		this.idAnime = idAnime;
	}

	public String getNombreAnime() {
		return nombreAnime;
	}

	public void setNombreAnime(String nombreAnime) {
		this.nombreAnime = nombreAnime;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getUrlVisualizar() {
		return urlVisualizar;
	}

	public void setUrlVisualizar(String urlVisualizar) {
		this.urlVisualizar = urlVisualizar;
	}

	public String getUrlMusica() {
		return urlMusica;
	}

	public void setUrlMusica(String urlMusica) {
		this.urlMusica = urlMusica;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdGenero() {
		// TODO Auto-generated method stub
		return idGenero;
	}
	public void setIdGenero(int genero) {
		this.idGenero = genero;
	}

	public int getIdEstudio() {
		// TODO Auto-generated method stub
		return idEstudio;
	}

	public void setIdEstudio(int idEstudio) {
		this.idEstudio = idEstudio;
	}
	

}
