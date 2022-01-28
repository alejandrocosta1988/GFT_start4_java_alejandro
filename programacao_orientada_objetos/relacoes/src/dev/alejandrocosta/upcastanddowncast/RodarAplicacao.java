package dev.alejandrocosta.upcastanddowncast;

public class RodarAplicacao {

	public static void main(String[] args)
	{
		
        Funcionario funcionarioUm = new Funcionario("Alejandro Costa", 84000);
        System.out.println(funcionarioUm.getNome());
        System.out.println("Salário: " + funcionarioUm.getSalario());
        
        //Upcasting
        Funcionario funcionarioDois = new Vendedor("Jana R de Santana", 96000);
        System.out.println(funcionarioDois.getNome());
        
        //Downcasting: se executar dá erro. Existem informações em Vendedor que não existem em Funcionario. O compilador não aceita a operação. Downcast devem ser evitados.
        //Vendedor umVendedor = (Vendedor) new Funcionario("Marcelo Ribeiro");
        //System.out.println(umVendedor.getNome());
        //umVendedor.setComissao(4000);
        //System.out.println("Comissão: " + umVendedor.getComissao());
        
        //Teste do polimorfismo
        Vendedor funcionarioTres = new Vendedor("Marcelo R de Santana", 96000);
        funcionarioTres.setComissao(17579.58);
        System.out.println(funcionarioTres.getNome());
        System.out.println(funcionarioTres.getSalario());
	}

}
