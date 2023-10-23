public class Piso {
  // *Variáveis globais
  private int andar;
  private boolean subir;
  private boolean descer; // True: subir False: descer

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

}
