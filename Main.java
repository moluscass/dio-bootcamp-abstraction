import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso[] curso = new Curso[2];
    for(int i = 0; i < curso.length; i++) { // <- Pra facilitar outras demonstracoes...
      curso[i] = new Curso();
    }
    
    curso[0].setTitulo("Java");
    curso[0].setDescricao("Abstração e encapsulamento");
    curso[0].setCargaHoraria(8);
    
    curso[1].setTitulo("Javascript");
    curso[1].setDescricao("Curso de Javascript");
    curso[1].setCargaHoraria(8);
    
    for(int i = 0; i < curso.length; i++) {
      System.out.println(curso[i]);
    }
    
    Mentoria[] mentoria = new Mentoria[2];
    for(int i = 0; i < mentoria.length; i++) {
      mentoria[i] = new Mentoria();
    }
    
    mentoria[0].setTitulo("Java");
    mentoria[0].setDescricao("Mentoria Java");
    mentoria[0].setData(LocalDate.now());
    
    mentoria[1].setTitulo("Javascript");
    mentoria[1].setDescricao("Mentoria Javascript");
    mentoria[1].setData(LocalDate.now());
    
    for(int i = 0; i < mentoria.length; i++) {
      System.out.println(mentoria[i]);
    }
  }
}