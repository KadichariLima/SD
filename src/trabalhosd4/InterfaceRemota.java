/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhosd4;

import java.rmi.Remote;

/**
 *
 * @author Kadichari
 */
public interface InterfaceRemota extends Remote{
 public int soma(int a,int b)throws Exception;   
 public int subtracao(int a,int b)throws Exception;   
 public int divisao(int a,int b)throws Exception;   
 public int multiplcacao(int a,int b)throws Exception;   

}
