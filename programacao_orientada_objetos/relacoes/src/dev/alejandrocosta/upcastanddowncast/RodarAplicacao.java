package dev.alejandrocosta.upcastanddowncast;

public class RodarAplicacao {

	public static void main(String[] args)
	{
		
        Funcionario funcionarioUm = new Funcionario("Alejandro Costa");
        System.out.println(funcionarioUm.getNome());
        
        //Upcasting
        Funcionario funcionarioDois = new Vendedor("Jana R de Santana");
        System.out.println(funcionarioDois.getNome());
        
        //Downcasting: se executar dá erro. Existem informações em Vendedor que não existem em Funcionario. O compilador não aceita a operação. Downcast devem ser evitados.
        //Vendedor umVendedor = (Vendedor) new Funcionario("Marcelo Ribeiro");
        //System.out.println(umVendedor.getNome());
        //umVendedor.setComissao(4000);
        //System.out.println("Comissão: " + umVendedor.getComissao());
	}

}
