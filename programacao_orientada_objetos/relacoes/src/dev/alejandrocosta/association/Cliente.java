package dev.alejandrocosta.association;

public class Cliente extends Pessoa
{
    private int numeroDeCompras;
    
    Cliente(String nome, String rua, String cidade, String estado)
    {
        super(nome, rua, cidade, estado);
        this.numeroDeCompras = 0;
    }
    
    
}
