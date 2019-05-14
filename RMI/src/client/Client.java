package client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import adderin.Adder;

public class Client {
public static void main(String[] args) throws RemoteException, NotBoundException {
	Client cl= new Client();
	cl.connectRemote();
}

public void connectRemote() throws RemoteException, NotBoundException {
	Scanner sc= new Scanner(System.in);
	Registry reg=LocateRegistry.getRegistry("localhost", 9999);
	Adder ad=(Adder) reg.lookup("hi hello");
	System.out.println("Enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println("The sum is "+ad.add(a, b));
	
	
}
}
