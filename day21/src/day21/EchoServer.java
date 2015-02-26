package day21;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author joel
 *
 */
public class EchoServer extends UnicastRemoteObject implements EchoService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EchoServer() throws RemoteException {
		//nothing to initialize on this server
	}

	@Override
	public String echo(String s) throws RemoteException {
		System.out.println("Replied to some client saying '" + s + "'");
		return s;
	}

}
