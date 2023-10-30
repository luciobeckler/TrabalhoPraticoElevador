public class Elevador {
  private boolean estadoPorta; // true -> abertp false -> fechado
  private boolean subindo;
  private boolean descendo;
  private Predio predio;
  private int pisoAtual;
  private int quantPisos = 0;

  // Construtor
  public Elevador(Predio predio) {
    this.setPisoAtual(0);
    this.fecharPorta();
    this.subindo = true;
    this.predio = predio;
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
    quantPisos = predio.pisos.length;
    // !Continuar daqui, gerar o log do Painel
    System.out.println(quantPisos);
  }

}
