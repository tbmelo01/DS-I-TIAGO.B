/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;
import java.sql.*;
import java.util.*;

public class teste {
    public static void main(String[] args) {
        
        Connection con = conexao.abrirConexao();
        
        CarroBean cb = new CarroBean(); 
        CarroDAO cd = new CarroDAO(con);
        
        cb.setPlaca("Jkk1900");
        cb.setCor("Azul");
        cb.setDescricao("Carro 1");
        System.out.println(cd.inserir(cb));
        
    }
    
}
