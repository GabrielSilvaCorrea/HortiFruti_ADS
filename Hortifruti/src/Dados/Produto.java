package Dados;

public class Produto{
    public String id;
    public String nome;
    public String preco;
    public String quant;
    public String forid;
   

    public Produto(){
        
    }

    public Produto(String id, String nome, String preco, String quant, String forid){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;     
        this.forid = forid;     
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

    public String getPreco(){
        return preco;
    }
    
    public void setPreco(String preco){
        this.preco = preco;
    }
    
    public String getQuant(){
        return quant;
    }

    public void setQuant(String quant){
        this.quant = quant;
    }
    
    public String getForID(){
        return forid;
    }

    public void setForID(String forid){
        this.forid = forid;
    }
}