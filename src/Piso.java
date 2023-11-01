public class Piso {
  // *Variáveis globais
  private int andar;
  private boolean subir;
  private boolean descer; // True: subir False: descer
  private boolean paradaSolicitada;
  private Predio predio;

  // *Construtor
  public Piso(int andar, Predio predio) {
    this.predio = predio;
    this.andar = andar;
  }

  // *Getters
  // !Questão 1
  public int getAndar() {
    return andar;
  }

  public boolean getSubir() {
    return subir;
  }

  public boolean getDescer() {
    return descer;
  }

  public boolean isParadaSolicitada() {
    return this.paradaSolicitada;
  }

  public Predio getPredio() {
    return predio;
  }

  // *Setters
  public void setAndar(int andar) {
    this.andar = andar;
  }

  public void setSubir(boolean subir) {
    this.subir = subir;
  }

  public void setDescer(boolean descer) {
    this.descer = descer;
  }

  public void setPredio(Predio predio) {
    this.predio = predio;
  }

  // * Métodos auxiliares:

  public void solicitarParada() {
    this.paradaSolicitada = true;
  }

  // !Questão 7
  public void receberElevador(Elevador elevador) {
    if (elevador.getPisoAtual() == getAndar() && isParadaSolicitada()) {
      elevador.abrirPorta();
    } else if (this.subir && elevador.getDirecao()) {
      elevador.abrirPorta();
    } else if (this.descer && !elevador.getDirecao()) {
      elevador.abrirPorta();
    }
  }

}
