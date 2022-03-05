import dev.alejandrocosta.gof.facade.Facade;
import dev.alejandrocosta.gof.singleton.SingletonEager;
import dev.alejandrocosta.gof.singleton.SingletonLazy;
import dev.alejandrocosta.gof.singleton.SingletonLazyHolder;
import dev.alejandrocosta.gof.strategy.Comportamento;
import dev.alejandrocosta.gof.strategy.ComportamentoAgressivo;
import dev.alejandrocosta.gof.strategy.ComportamentoDefensivo;
import dev.alejandrocosta.gof.strategy.ComportamentoNormal;
import dev.alejandrocosta.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Testes do Design Pattern Singleton
		System.out.println("--".repeat(10) + "Testes do padrão Singleton" + "--".repeat(10));
		System.out.println();
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		// A instância retornada deverá ser a mesma
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		System.out.println();
		System.out.println("--".repeat(10) + "Testes do padrão Strategy" + "--".repeat(10));
		System.out.println();
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();

		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		System.out.println();
		System.out.println("--".repeat(10) + "Testes do padrão Facade" + "--".repeat(10));
		System.out.println();
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "40512378523");
		
	}

}
