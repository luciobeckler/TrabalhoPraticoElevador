public class Elevador {
  private boolean estadoPorta; // true -> abertp false -> fechado
  private boolean subindo;
  private boolean descendo;
  private Predio predio;
  private int pisoAtual;
  private Piso[] pisos;

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
    pisos = predio.pisos;
    // * Alterar estes métodos para alterar saida.
    this.pararNoPiso(predio.pisos[2]);
    this.pararNoPiso(predio.pisos[4]);
    // !Continuar daqui, gerar o log do Painel
    System.out.println("** Painel do Elevador **");
    for (int i = 0; i < pisos.length; i++) {
      if (pisos[i].isparadaSolicitada()) {
        System.out.print(" *" + i + "* ");
      } else {
        System.out.print(" " + i + " ");
      }
    }
    System.out.println("");

    for (int i = 0; i < pisos.length; i++) {

      if (this.getPisoAtual() == i) {
        System.out.print(" ^ ");
      } else
        System.out.print("    ");
    }
  }
}
