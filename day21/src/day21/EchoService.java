package day21;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * An implementation of the echo service.
 * @author joel
 *
 */

interface EchoService extends Remote {
	/**
	 * Returns the same string passed as parameter
	 * @param s a string
	 * @return the same string passed as parameter
	 */
	public String echo(String s) throws RemoteException;

}
