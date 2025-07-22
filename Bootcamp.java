import java.util.*;
import java.time.*;

public class Bootcamp {
  private String name;
  private String descricao;
  private final LocalDate dataInicio = LocalDate.now();
  private final LocalDate dataFim = dataInicio.plusDays(45);
  private Set<Dev> devsInscritos = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();
  
  // Boilerplate...
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getDescricao() {
    return this.descricao;
  }
  
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
  public Set<Dev> getDev() {
    return this.devsInscritos;
  }
  
  public void setDev(Set<Dev> devsInscritos) {
    this.devsInscritos = devsInscritos;
  }
  
  public Set<Conteudo> getConteudos() {
    return this.conteudos;
  }
  
  public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
  }
  
  @Override
  public String toString() {
    return "Bootcamp {" +
      this.name + ", " +
      this.descricao + ", " +
      this.dataInicio + ", " +
      this.dataFim + ", " +
      this.devsInscritos + ", " +
      this.conteudos + "}\n";
  }
  
    @Override
    public boolean equals(Object o) {
      if(this == o) return true;
      if(o == null || getClass() != o.getClass()) return false;
      // Trocar "nameClass" pelo nome da classe em lowercase:
      Bootcamp bootcamp = (Bootcamp) o;
      // Retornar cada var. de intancia dentro de um Object.equals():
      return 
        Objects.equals(name, bootcamp.name) &&
        Objects.equals(descricao, bootcamp.descricao) &&
        Objects.equals(dataInicio, bootcamp.dataInicio) &&
        Objects.equals(dataFim, bootcamp.dataFim) &&
        Objects.equals(devsInscritos, bootcamp.devsInscritos) &&
        Objects.equals(conteudos, bootcamp.conteudos);
    }
    
    @Override
    public int hashCode() {
      // Passar var. de instancia como argumentos
      return Objects.hash(name, descricao, dataInicio, dataFim, devsInscritos, conteudos);
    }
}