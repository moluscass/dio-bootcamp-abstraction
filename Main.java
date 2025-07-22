import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso[] curso = new Curso[2];
    curso[1] = new Curso();
    curso[0] = new Curso();
    
    curso[0].setTitulo("Java");
    curso[0].setDescricao("Abstração e encapsulamento");
    curso[0].setCargaHoraria(8);
    
    curso[1].setTitulo("Javascript");
    curso[1].setDescricao("Curso de Javascript");
    curso[1].setCargaHoraria(8);
    
    System.out.println(curso[0]);
    System.out.println(curso[1]);
    
    Mentoria[] mentoria = new Mentoria[2];
    mentoria[0] = new Mentoria();
    mentoria[1] = new Mentoria();
    
    mentoria[0].setTitulo("Java");
    mentoria[0].setDescricao("Mentoria Java");
    mentoria[0].setData(LocalDate.now());
    
    mentoria[1].setTitulo("Java");
    mentoria[1].setDescricao("Mentoria Java");
    mentoria[1].setData(LocalDate.now());
    
    System.out.println(mentoria[0]);
    System.out.println(mentoria[1]);
  }
}