public class App {

    // Criar uma instância da classe Piso
    Piso piso1 = new Piso(2);

    public static void main(String[] args) throws Exception {
        piso1.queroSubir("Subir")
        System.out.println("Hello, World!");
    }

    // Método para indicar que você quer subir no piso
    public void queroSubir() {
        piso1.setPainelExterno("Subir");
    }

    public void imprimirPainelExterno() {
        // A linha a seguir imprime o painel externo do piso
        System.out.println(piso1.getPainelExterno());
    }
}
