package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import adderin.Adder;

public class Server extends UnicastRemoteObject implements Adder {

	
	protected Server() throws RemoteException {
		super();
		
	}

	@Override
	public int add(int n1, int n2) throws RemoteException {
		
		return n1+n2;
	}
	public static void main(String[] args) throws RemoteException {
		Registry reg= LocateRegistry.createRegistry(9999);
		reg.rebind("hi hello", new Server());
		System.out.println("server is ready to communicate");
	}

}
