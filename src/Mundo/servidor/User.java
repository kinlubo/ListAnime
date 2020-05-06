package Mundo.servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import Mundo.Contenedora.Mensaje;
import Mundo.Contenedora.Nodo;

public class User {
public final static int PUERTO = 1425;
	
	private String host = "192.168.1.83";
	
	private Socket cliente;
	
	public User()
	{
		
	}
	
	public Nodo envioMensaje(Mundo.Contenedora.Mensaje messa) throws UnknownHostException, IOException, ClassNotFoundException 
	{
		
		cliente = new Socket(host, PUERTO);
		System.out.println("Usuario Conectado!!");
		
		ObjectOutputStream oos = new ObjectOutputStream(cliente.getOutputStream());
	
		oos.writeObject(messa);
		
		ObjectInputStream ois = new ObjectInputStream(cliente.getInputStream());
		
		Nodo nodo = (Nodo) ois.readObject();
		
		return nodo;
		
	}
}