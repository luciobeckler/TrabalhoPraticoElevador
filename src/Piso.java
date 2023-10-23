public class Piso {
  // *Variáveis globais
  private int andar;
  private String painelExterno = "";

  // *Construtor
  public Piso(int andar) {
    this.andar = andar;
  }

  // *Getters
  public int getAndar() {
    return andar;
  }

  public String getPainelExterno() {
    return painelExterno;
  }

  // *Setters
  public void setAndar(int andar) {
    this.andar = andar;
  }

  public void setPainelExterno(String painelExterno) {
    this.painelExterno = painelExterno;
  }

}
