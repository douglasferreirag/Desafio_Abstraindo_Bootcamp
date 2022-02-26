import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

        public static void main (String[] args){

                Curso curso1 = new Curso();

                curso1.setTitulo("curso java");

                curso1.setDescricao("descrição curso java");
                
                curso1.setCargaHoraria(8);


                Curso curso2 = new Curso();

                curso2.setTitulo("curso js");

                curso2.setDescricao("descrição curso js");

                curso2.setCargaHoraria(4);

                //System.out.println(curso1);

                //System.out.println(curso2);

                Mentoria mentoria = new Mentoria();

                mentoria.setTitulo("mentoria de java");

                mentoria.setDescricao("descrição da mentoria de java");

                mentoria.setData(LocalDate.now());

               // System.out.println(mentoria);

                Bootcamp bootcamp = new Bootcamp();

                bootcamp.setNome("Bootcamp Java Developer");

                bootcamp.setDescricao("Descrição Bootcamp Java Developer");

                bootcamp.getConteudos().add(curso1);

                bootcamp.getConteudos().add(curso2);

                bootcamp.getConteudos().add(mentoria);

                System.out.println("---------------------------------------------------------------");

                Dev devCamila = new Dev();

                devCamila.setNome("Camila");

                devCamila.inscreverBootcamp(bootcamp);

                System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());

                devCamila.progredir();

                devCamila.progredir();

                System.out.println("------------------");

                System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());

                System.out.println("Conteúdos concluídos Camila" + devCamila.getConteudosConcluidos());

                System.out.println("XP:" + devCamila.calcularTotalXP());

                System.out.println("---------------------------------------------------------------");

                Dev devJoao = new Dev();

                devJoao.setNome("Joao");

                devJoao.inscreverBootcamp(bootcamp);

                System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());

                devJoao.progredir();

                devJoao.progredir();

                devJoao.progredir();

                System.out.println("------------------");

                System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());

                System.out.println("Conteúdos concluídos João" + devJoao.getConteudosConcluidos());

                System.out.println("XP:" + devJoao.calcularTotalXP());






        }

}
