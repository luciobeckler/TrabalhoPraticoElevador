//!Questão 3

public class Elevador {
  private boolean estadoPorta; // true -> aberta false -> fechado
  private boolean direcao;
  private Predio predio;
  private int pisoAtual;
  private Piso[] pisos;

  // Construtor
  // !Questão 3
  public Elevador(Predio predio) {
    this.setPisoAtual(0);
    this.fecharPorta();
    this.direcao = true;
    this.predio = predio;
  }

  // Setter
  public void setPisoAtual(int pisoAtual) {
    this.pisoAtual = pisoAtual;
  }

  // Getters
  public boolean isPortaAberta() {
    return estadoPorta;
  }

  public boolean getDirecao() {
    return direcao;
  }

  public boolean isSubindo() {
    direcao = true;
    return direcao;
  }

  public boolean isDesendo() {
    direcao = false;
    return direcao;
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

  // !Questão 4
  public void pararNoPiso(Piso piso) {
    piso.solicitarParada();
  }

  // !Questão 5
  public void mostrarPainel() {
    pisos = predio.pisos;
    // * Alterar estes métodos para alterar saida.
    this.pararNoPiso(predio.pisos[2]);
    this.pararNoPiso(predio.pisos[4]);
    // !Continuar daqui, gerar o log do Painel
    System.out.println("** Painel do Elevador **");
    for (int i = 0; i < pisos.length; i++) {
      if (pisos[i].isParadaSolicitada()) {
        System.out.print("*" + i + "*");
      } else {
        System.out.print(" " + i + " ");
      }
    }
    System.out.println("");

    for (int i = 0; i < pisos.length; i++) {

      if (this.getPisoAtual() == i) {
        System.out.print(" ^ ");
      } else
        System.out.print("   ");
    }
    System.out.println("\n");
  }
}
