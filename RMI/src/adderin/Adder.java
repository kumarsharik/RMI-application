package adderin;

import java.rmi.*;

public interface Adder extends Remote{

	public int add(int n1,int n2) throws RemoteException;
}
