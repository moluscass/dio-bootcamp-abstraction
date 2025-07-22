public class Curso extends Conteudo {
  private int cargaHoraria;
  
  public Curso() {
    // ...
  }
  
  @Override
  public double calcularXp() {
    return XP_PADRAO * getCargaHoraria();
  }
  
  public int getCargaHoraria() {
    return this.cargaHoraria;
  }
  
  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }
  
  @Override
  public String toString() {
    return "Curso: {" + // <- ALTERACAO1 
      "Titulo: " + getTitulo() + ", " +
      "Descrição: " + getDescricao() + ", " +
      "Carga horária: " + getCargaHoraria() + "}\n";
  }
}

/*
ALTERACAO1 {
  usando os getters em vez das referencias diretas das
  variaveis de instancia.
}
*/