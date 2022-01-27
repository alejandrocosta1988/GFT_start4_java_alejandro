package dev.alejandrocosta.upcastanddowncast;

public class RodarAplicacao {

	public static void main(String[] args)
	{
		
        Funcionario funcionarioUm = new Funcionario("Alejandro Costa");
        System.out.println(funcionarioUm.getNome());
        
        //Upcasting
        Funcionario funcionarioDois = new Vendedor("Jana R de Santana");
        System.out.println(funcionarioDois.getNome());
        
        

	}

}
