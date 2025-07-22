public abstract class Conteudo {
  protected final static double XP_PADRAO = 10D;
  private String titulo;
  private String descricao;
  
  public Conteudo() {
    // ...
  }
  
  public abstract double calcularXp();
  
  public String getTitulo() {
    return this.titulo;
  }
  
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  
  public String getDescricao() {
    return this.descricao;
  }
  
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}