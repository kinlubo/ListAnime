package Mundo.dto;

import java.io.Serializable;

public class EstudioIDTO implements IDTO, Serializable{

	private int id;
	private String nombreEstudio;
	
	public EstudioIDTO(int id, String nombreGenero) {
		super();
		this.id = id;
		this.nombreEstudio = nombreGenero;
	}

	public EstudioIDTO() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreEstudio() {
		return nombreEstudio;
	}

	public void setNombreEstudio(String nombreGenero) {
		this.nombreEstudio = nombreGenero;
	}

	@Override
	public String insert() {
		// TODO Auto-generated method stub
		return "insert into estudios(nombre) values('"+nombreEstudio+"');";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "delete from estudios where id="+id;
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return "UPDATE estudios" + 
				"	SET nombre="+ nombreEstudio + 
				"	WHERE id="+id+";";
	}

	@Override
	public String consult() {
		// TODO Auto-generated method stub
		return "select * from estudios where id="+id+";";
	}
	public String consultid() {
		// TODO Auto-generated method stub
		return "select * from estudios where nombre='"+nombreEstudio+"';";
	}

	@Override
	public String consultAll() {
		// TODO Auto-generated method stub
		return "select * from estudios";
	}

	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombreEstudio;
	}

}
