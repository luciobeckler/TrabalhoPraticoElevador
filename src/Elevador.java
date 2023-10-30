public class Elevador {
  private boolean estadoPorta; // true -> abertp false -> fechado
  private boolean subindo;
  private boolean descendo;
  private int pisoAtual;

  // Construtor
  public Elevador() {
    this.setPisoAtual(0);
    this.fecharPorta();
    this.subindo = true;
    // !CONTINUAR DAQUI
  }

  // Setter
  public void setPisoAtual(int pisoAtual) {
    this.pisoAtual = pisoAtual;
  }

  // Getters
  public boolean isPortaAberta() {
    return estadoPorta;
  }

  public boolean isSubindo() {
    return subindo;
  }

  public boolean isDesendo() {
    return descendo;
  }

  public int getPisoAtual() {
    return pisoAtual;
  }

  // Demais métodos
  public void abrirPorta() {
    this.estadoPorta = true;
  }

  public void fecharPorta() {
    this.estadoPorta = false;
  }

  public void pararNoPiso(Piso piso) {
    piso.solicitarParada();
  }

  public void mostrarPainel() {
    System.out.println("** Painel do Elevador ** /n teste");
  }

}
