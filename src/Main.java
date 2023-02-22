import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Kotlin");
        curso2.setDescricao("descrição curso Kotlin");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descriação da mentoria de Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();  //Tem que passar um nome, descrição e um set de conteúdo
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição do Bootcam JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFlavia = new Dev();
        devFlavia.setNome("Flavia");
        devFlavia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Flávia" + devFlavia.getConteudosInscritos());
        devFlavia.progredir();
        devFlavia.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Flávia" + devFlavia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Flávia" + devFlavia.getConteudosConcluidos());


        System.out.println("---------------------------------------------");

        Dev devClarice = new Dev();
        devClarice.setNome("Cler");
        devClarice.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Clér" + devClarice.getConteudosInscritos());
        devClarice.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Clér" + devClarice.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Clér" + devClarice.getConteudosConcluidos());

    }
}
