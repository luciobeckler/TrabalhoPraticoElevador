public class Piso {
  // *Variáveis globais
  private int andar;
  private boolean subir;
  private boolean descer; // True: subir False: descer
  private boolean paradaSolicitada;

  // *Construtor
  public Piso(int andar) {
    this.andar = andar;
  }

  // *Getters
  public int getAndar() {
    return andar;
  }

  public boolean getSubir() {
    return subir;
  }

  public boolean getDescer() {
    return descer;
  }

  public boolean isparadaSolicitada() {
    return this.paradaSolicitada;
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

  // * Métodos auxiliares:

  public void solicitarParada() {
    this.paradaSolicitada = true;
  }

}
