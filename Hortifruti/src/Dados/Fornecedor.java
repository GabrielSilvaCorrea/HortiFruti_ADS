package Dados;

public class Fornecedor{
    public String id;
    public String nome;
    public String endereco;
    public String tel1;
    public String tel2;
   

    public Fornecedor(){
        
    }

    public Fornecedor(String id, String nome, String endereco, String tel1, String tel2){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.tel1 = tel1;
        this.tel2 = tel2;     
    }
    
    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getTelp(){
        return tel1;
    }

    public void setTelp(String tel1){
        this.tel1 = tel1;
    }
    
    public String getTels(){
        return tel2;
    }

    public void setTels(String tel2){
        this.tel2 = tel2;
    }
}