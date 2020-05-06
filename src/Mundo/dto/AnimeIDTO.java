package Mundo.dto;

import java.io.Serializable;
import java.net.IDN;
import java.sql.Date;

public class AnimeIDTO  implements IDTO, Serializable {
	
	@Override
	public String toString() {
		return "id=" + idAnime + ", nombre=" + nombreAnime + ", descripcion=" + descripcion
				+ ", fechaPublicacion=" + fechaPublicacion + ", urlVisualizar=" + urlVisualizar + ", urlMusica="
				+ urlMusica + ", estudio=";
	}

	private int idAnime;
	private String nombreAnime;
	private String descripcion;
	private Date fechaPublicacion;
	private String urlVisualizar;
	private String urlMusica;
	private int estudio;
	
	
	public AnimeIDTO(int idAnime, String nombreAnime, String descripcion, Date fechaPublicacion2, String urlVisualizar,
			String urlMusica, int estudio) {
		super();
		this.idAnime = idAnime;
		this.nombreAnime = nombreAnime;
		this.descripcion = descripcion;
		this.fechaPublicacion = fechaPublicacion2;
		this.urlVisualizar = urlVisualizar;
		this.urlMusica = urlMusica;
		this.estudio = estudio;

	}

	public AnimeIDTO() {
		// TODO Auto-generated constructor stub
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

	public int getEstudio() {
		return estudio;
	}

	public void setEstudio(int estudio) {
		this.estudio = estudio;
	}

	

	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return "insert into animes (nombre, descripcion, fecha_publicacion, "
    			+ "url_visualizar, url_musica,estudios_id) values ('"+nombreAnime+"','"+descripcion+
    			"','"+fechaPublicacion+"','"+urlVisualizar+"','"+urlMusica+"',"+estudio+");";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "delete from generos_animes where animes_id="+idAnime+"; delete from animes where id ="+idAnime+";";
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		
		return "delete from generos_animes where animes_id="+idAnime+";UPDATE animes" + 
				"	SET nombre='"+nombreAnime+"', descripcion='"+descripcion+"', fecha_publicacion='"+fechaPublicacion+
				"', url_visualizar='"+urlVisualizar+"', url_musica='"+urlMusica+"', estudios_id=" +estudio+ 
				"	WHERE id="+idAnime+";";
	}

	@Override
	public String consult() {
		// TODO Auto-generated method stub
		return "select * from animes where id ="+idAnime+";";
	}

	@Override
	public String consultAll() {
		// TODO Auto-generated method stub
		return "select * from animes;";
	}

}
