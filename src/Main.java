import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de PHP");
        curso2.setDescricao("Descrição curso de PHP");
        curso2.setCargaHoraria(5);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.getCounteudo().add(curso1);
        bootcamp.getCounteudo().add(curso2);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("coneudos inscritos Camila: " + devCamila.getConteudoInscrito());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");

        System.out.println("coneudos inscritos Camila: " + devCamila.getConteudoInscrito());
        System.out.println("coneudos Concluidos Camila: " + devCamila.getConteudoConcluido());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("--------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("coneudos inscritos João: " + devJoao.getConteudoInscrito());
    }
}
