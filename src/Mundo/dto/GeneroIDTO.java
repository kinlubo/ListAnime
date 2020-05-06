package Mundo.dto;

import java.io.Serializable;

public class GeneroIDTO implements IDTO, Serializable{

	@Override
	public String toString() {
		return "id=" + id + ", nombreGenero=" + nombreGenero;
	}

	private int id;
	private String nombreGenero;
	
	public GeneroIDTO(int id, String nombreGenero) {
		super();
		this.id = id;
		this.nombreGenero = nombreGenero;
	}

	public GeneroIDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}

	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return "insert into generos(nombre) values('"+nombreGenero+"');";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "delete from generos_animes where generos_id="+id+";delete from generos where id="+id;
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "UPDATE generos" + 
				"	SET nombre="+ nombreGenero + 
				"	WHERE id="+id+";";
	}

	@Override
	public String consult() {
		// TODO Auto-generated method stub
		return "select * from generos where id="+id+";";
	}

	@Override
	public String consultAll() {
		// TODO Auto-generated method stub
		return "select * from generos";
	}

	public String consultid() {
		// TODO Auto-generated method stub
		return "select * from generos where nombre='"+nombreGenero+"';";
	}
	public String manytomany(int id_anime) {
		return "insert into generos_animes(generos_id, animes_id) values("+id+","+id_anime+");";
	}

}
