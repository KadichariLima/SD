/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhosd4;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Kadichari
 */
public class ServerImplements extends UnicastRemoteObject implements InterfaceRemota{

    public ServerImplements() throws Exception {
        super();
    }
    
    
    public int soma(int a, int b) {
        return (a+b);
    }

    
    public int subtracao(int a, int b) throws Exception {
        return (a-b);
    }

    
    public int divisao(int a, int b) throws Exception {
        return (a/b);
    }

    
    public int multiplcacao(int a, int b) throws Exception {
        return (a*b);
    }
    
}
