
import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        System.out.println("================");
        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinícius");
        devVinicius.inscreverBootcamp(bootcamp);
        devVinicius.progredir();

        System.out.println("Conteúdos inscritos Vinícius " + devVinicius.getConteudosInscritos());
        System.out.println("================");
        System.out.println("Conteudos Concluídos Vinícius " + devVinicius.getConteudosConcluidos());
        System.out.println("XP: " + devVinicius.calcularTotalXp());


        Dev devNatalia = new Dev();
        devNatalia.setNome("Natalia");
        devNatalia.inscreverBootcamp(bootcamp);
        System.out.println("================");
        System.out.println("Conteúdos inscritos Natalia" + devNatalia.getConteudosInscritos());
        System.out.println("================");
        System.out.println("Conteúdos concluídos Natalia" + devNatalia.getConteudosConcluidos());
        System.out.println("XP: " + devNatalia.calcularTotalXp());
        System.out.println("================");


    }
}