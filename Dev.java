import java.util.*;

public class Dev {
  private String name;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
  
  public void inscreverBootcamp(Bootcamp bootcamp) {
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDev().add(this);
  }
  
  public void progredir() {
    Optional<Conteudo> conteudo; 
    conteudo = this.conteudosInscritos
               .stream()
               .findFirst();
               
    if(conteudo.isPresent()) {
      this.conteudosConcluidos.add(conteudo.get());
      this.conteudosInscritos.remove(conteudo.get());
    } else {
      System.err.println("Você não está matriculado em nenhum conteúdo!");
    }
  }
  
  public double calcularTotalXp() {
    return
      this.conteudosConcluidos
      .stream()
      .mapToDouble(conteudo -> conteudo.calcularXp())
      .sum();
  }
  
  // Boilerplates...
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Set<Conteudo> getConteudosInscritos() {
    return this.conteudosInscritos;
  }
  
  public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
  }
  
  public Set<Conteudo> getConteudosConcluidos() {
    return this.conteudosConcluidos;
  }
  
  public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
  }
  
  @Override
  public String toString() {
    return "Bootcamp {" +
      this.name + ", " +
      this.conteudosInscritos + ", " +
      this.conteudosConcluidos + "}\n";
  }
  
  @Override
  public boolean equals(Object o) {
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    // Trocar "nameClass" pelo nome da classe em lowercase:
    Dev dev = (Dev) o;
    // Retornar cada var. de intancia dentro de um Object.equals():
    return 
      Objects.equals(name, dev.name) && 
      Objects.equals(conteudosInscritos, dev.conteudosInscritos) && 
      Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
  }
  
  @Override
  public int hashCode() {
    // Passar var. de instancia como argumentos:
    return Objects.hash(name, conteudosInscritos, conteudosConcluidos);
  }
}