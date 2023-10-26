public class Elevador {
  private boolean estadoPorta; // true -> abertp false -> fechado
  private boolean direcao; // true -> subindo false -> descendo
  private int pisoAtual;

  // Construtor
  public Elevador() {
    this.setPisoAtual(0);
    this.setEstadoPorta(false);
    this.setDirecao(true);
  }

  // Setter
  public boolean isEstadoPorta() {
    return estadoPorta;
  }

  public boolean isDirecao() {
    return direcao;
  }

  public void setPisoAtual(int pisoAtual) {
    this.pisoAtual = pisoAtual;
  }

  // Getters
  public void setEstadoPorta(boolean estadoPorta) {
    this.estadoPorta = estadoPorta;
  }

  public void setDirecao(boolean direcao) {
    this.direcao = direcao;
  }

  public int getPisoAtual() {
    return pisoAtual;
  }

}
