package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Fornecedor;

public class FSelecionar{
    
   Connection connection = null;

    public String id;
    public String nome;
    public String endereco;
    public String tel1;
    public String tel2;

    public ArrayList<Fornecedor> fornLista(){
        ArrayList<Fornecedor> flista = new ArrayList<>();
        
        connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;

    
        try{
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM fornecedor");
            
            Fornecedor forn;
            
            while(res.next()){
                forn = new Fornecedor(
                String.valueOf(res.getInt("id_forn")),
                res.getString("nome"),
                res.getString("endereco"),
                res.getString("tel_prin"),
                res.getString("tel_sec"));
                flista.add(forn);
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
    	
        return flista;
    }  
}