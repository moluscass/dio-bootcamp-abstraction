import java.time.LocalDate;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Curso c1 = new Curso();
    Curso c2 = new Curso();
    
    c1.setTitulo("Java");
    c1.setDescricao("Abstração e encapsulamento");
    c1.setCargaHoraria(8);
    
    c2.setTitulo("Javascript");
    c2.setDescricao("Curso de Javascript");
    c2.setCargaHoraria(8);
    
    Mentoria m1 = new Mentoria();
    
    m1.setTitulo("Java");
    m1.setDescricao("Mentoria Java");
    m1.setData(LocalDate.now());

    Bootcamp bc1 = new Bootcamp();
    bc1.setName("Java Developer");
    bc1.setDescricao("Bootcamp Desenvolvimento Java");
    bc1.getConteudos().add(c1);
    bc1.getConteudos().add(c2);
    bc1.getConteudos().add(m1);
    
    Dev marcio = new Dev();
    marcio.setName("Marcio");
    marcio.inscreverBootcamp(bc1);
    System.out.println("Conteudos inscritos: " + marcio.getConteudosInscritos());
    marcio.progredir();
    marcio.progredir();
    System.out.println("XP Marcio: " + marcio.calcularTotalXp());
    marcio.calcularTotalXp();
    System.out.println("Conteudos concluido de " + marcio.getName() + ": " + marcio.getConteudosConcluidos());
    
    Dev marta = new Dev();
    marta.setName("Marta");
    marta.inscreverBootcamp(bc1);
    System.out.println("Conteudos inscritos: " + marta.getConteudosInscritos());
    marta.progredir();
    marta.progredir();
    System.out.println("XP Marta: " + marta.calcularTotalXp());
    System.out.println("Conteudos concluido de " + marta.getName() + ": " + marta.getConteudosConcluidos());
  }
}