


import java.rmi.*;

public interface InterfaceRmiCommunication extends Remote 
{
    Integer getSuma(int num1, int num2) throws RemoteException; 
}
