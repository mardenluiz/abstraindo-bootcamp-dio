import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Curso de Java");
        curso.setDescricao("Descrição curso de Java");
        curso.setCargaHoraria(8);

        System.out.println(curso);
    }
}
