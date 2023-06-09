package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Compra;

public class RCodSelecionar{
    
   Connection connection = null;

    public String id;
    public String cod;
    public String quant;
    public String data;
    public String hora;
    public String proid;

    public ArrayList<Compra> compraLista(){
        ArrayList<Compra> clista = new ArrayList<>();
        
        connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;

        try{
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM compra");
            
            Compra co;
            
            while(res.next()){
                co = new Compra(
                String.valueOf(res.getInt("id_compra")),
                res.getString("codigo"),
                res.getString("quantidade"),
                res.getString("data_compra"),
                res.getString("hora_compra"),
                res.getString("id_prod"));
                clista.add(co);
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