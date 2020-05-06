package Mundo.servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;

import Mundo.Contenedora.Funcion;
import Mundo.Contenedora.Mensaje;
import Mundo.Contenedora.Nodo;
import Mundo.db.Conexion;
import Mundo.facade.Facade;

public class HiloServidor extends Thread {
	/**
	 * atributo que representa la conexion
	 */
	private Conexion con;
	
	/**
	 * atributo que representa el flujo de entrada
	 */
	private ObjectInputStream ois;
	
	/**
	 * atributo que representa el flujo de salida
	 */
	private ObjectOutputStream oos;
	
	/**
	 * atributo que representa el facade
	 */
	private Facade facade;
	
	
	public HiloServidor(Conexion pConexion, ObjectInputStream pOis, ObjectOutputStream pOos )
	{
		con = pConexion;
		ois = pOis;
		oos = pOos;
		facade = new Facade();
	}
	
	private void procesaInstrucciones() throws ClassNotFoundException, IOException, SQLException
	{
		System.out.println("Esperando..."); 

		while(true)
		{
			System.out.println("Se ha conectado un nuevo usuario.");
			
			Mensaje messa = (Mensaje) ois.readObject();
			ArrayList nodo = new ArrayList<>();
			
			if(messa.getFuncion().equals(Funcion.INSERT))
			{
				facade.insert(con, messa);
				nodo = null;
			}
			else if(messa.getFuncion().equals(Funcion.DELETE))
			{
				facade.delete(con, messa);
				nodo = null;
			}
			else if(messa.getFuncion().equals(Funcion.UPDATE))
			{
				facade.update(con, messa);
				nodo = null;
			}
			else if(messa.getFuncion().equals(Funcion.SELECT))
			{
				nodo = facade.consultAll(con, messa);
			}
			else if(messa.getFuncion().equals(Funcion.SELECT_ID))
			{
				nodo = (ArrayList) facade.consult(con, messa);
			}
			
			oos.writeObject(nodo);

		}
		
	}
	
	
	public void run()
	{
		try
		{
			procesaInstrucciones();
		}
		catch(Exception e )
		{
			
		}
		
	}
	
	
	

}
