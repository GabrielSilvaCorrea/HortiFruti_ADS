package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Compra;


public class RCSelecionar{
    
   Connection connection = null;
   
    public ArrayList<Compra> cLista(Compra s){
        ArrayList<Compra> clista = new ArrayList<>();
        
        connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;

        try{
            String cod = s.getCod();
            
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM `compra` WHERE `codigo` = "+cod+";");
            
            Compra cm;
            
            while(res.next()){
                cm = new Compra(
                String.valueOf(res.getInt("id_compra")),
                res.getString("codigo"),
                res.getString("quantidade"),
                res.getString("data_compra"),
                res.getString("hora_compra"),
                String.valueOf(res.getInt("id_prod")));
                clista.add(cm);
                status = true;        
            }        
        }
        
        catch (SQLException e){
            System.out.println(e.getMessage());
            status = false;
        }
        
        finally{ 
            try{
                stmt.close();
                connection.close();
            }
            
            catch (SQLException e){
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    	
        return clista;
    }  
}