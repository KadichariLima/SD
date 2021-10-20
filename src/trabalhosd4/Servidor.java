/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhosd4;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kadichari
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            Registry registry;
            registry = LocateRegistry.createRegistry(3456);
            registry.rebind("Calculos", new ServerImplements());
            System.out.println("Servidor Iniciado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
