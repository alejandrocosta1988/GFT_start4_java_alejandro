package dev.alejandrocosta;

public class Veiculo {
	
    private String proprietario;
    private String placa;
    
    Veiculo(String proprietario, String placa)
    {
    	this.proprietario = proprietario;
    	this.placa = placa;
    }
    
    public String getProprietario()
    {
    	return this.proprietario;
    }
    
    public String getPlaca()
    {
    	return this.placa;
    }
    
    public void setProprietario(String nome)
    {
    	this.proprietario = nome;
    }
    
}
