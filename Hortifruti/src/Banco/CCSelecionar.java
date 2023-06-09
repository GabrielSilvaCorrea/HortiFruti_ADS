package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Dados.Compra;

public class CCSelecionar{
    
   Connection connection = null;

    public String cod;

    public void Codigo(Compra select){
        connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
    
        try{
            Compra c = new Compra();
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM `compra`;");
            
            while(res.next()){
                cod = res.getString("codigo");
                status = true;
                select.setCod(cod);
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
    }  
}