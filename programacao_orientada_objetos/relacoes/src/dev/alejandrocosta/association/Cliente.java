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
    	return "Cliente [nome=" + super.getNome() + ", endereco=" + super.getEndereco() + "Número de compras na loja: " + this.getNumeroDeCompras() + "]";
    }
    
    public int getNumeroDeCompras()
    {
    	return this.numeroDeCompras;
    }
    
    public String realizarPagamento()
    {
    	return "Realizando pagamento SEM desconto por cupom.";
    }
    
    // Associação do tipo: Dependência
    public String realizarPagamento(Cupom cupomDeDesconto)
    {
    	return "Realizando pagamento com " + cupomDeDesconto.getDesconto() + "% de desconto.";
    }
    
}
