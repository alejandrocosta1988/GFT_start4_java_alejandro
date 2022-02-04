package dev.alejandrocosta.association;

public class Cliente extends Pessoa
{
    private int numeroDeCompras;
    
    Cliente(String nome, String rua, String cidade, String estado)
    {
        super(nome, rua, cidade, estado);
        this.numeroDeCompras = 0;
    }
    
    @Override
    public String toString()
    {
    	return "Cliente [nome=" + nome + ", endereco=" + endereco.getEndereco() + "Número de compras na loja: " + this.numeroDeCompras + "]";
    }
}
