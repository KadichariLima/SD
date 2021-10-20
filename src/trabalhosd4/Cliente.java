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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Registry meuRegistro;
            meuRegistro = LocateRegistry.getRegistry("127.0.0.1",3456);
            InterfaceRemota i = (InterfaceRemota) meuRegistro.lookup("Calculos");
            System.out.println("Soma: "+i.soma(5,3));
            System.out.println("Subtração: "+i.subtracao(5,3));
            System.out.println("Divisão: "+i.divisao(9,3));
            System.out.println("Multiplicação: "+i.multiplcacao(5,3));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }   
        
    }
    
}
