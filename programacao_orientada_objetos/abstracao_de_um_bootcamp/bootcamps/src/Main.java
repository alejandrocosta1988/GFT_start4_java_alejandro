import java.time.LocalDate;

import dev.alejandrocosta.bootcamps.dominio.Curso;
import dev.alejandrocosta.bootcamps.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JUnit");
		curso2.setDescricao("Descrição do Curso JUnit");
		curso2.setCargaHoraria(12);
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição da mentoria de Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria1);

	}

}
