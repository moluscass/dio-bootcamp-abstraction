import java.time.*;

public class Mentoria extends Conteudo {
  private LocalDate data;
  
  public Mentoria() {
    // ...
  }
  
  @Override
  public double calcularXp() {
    return XP_PADRAO + 20D;
  }
  
  public LocalDate getData() {
    return this.data;
  }
  
  public void setData(LocalDate data) {
    this.data = data;
  }
  
  @Override
  public String toString() {
    return "Mentoria: {" + // <- ALTERACAO1 
      "Titulo: " + getTitulo() + ", " +
      "Descrição: " + getDescricao() + ", " +
      "Data: " + getData() + "}\n";
  }
}