public class Predio {

    // Criar uma instância da classe Piso
    Piso piso1 = new Piso(2);

    public static void main(String[] args) throws Exception {
        Predio predio = new Predio();
        predio.queroSubir();
        predio.imprimirPainelExterno();
        predio.queroDescer();
        predio.imprimirPainelExterno();
        System.out.println("Hello, World!");
    }

    // Método para indicar que você quer subir no piso
    public void queroSubir() {
        piso1.setSubir(true);
    }

    public void queroDescer() {
        piso1.setDescer(true);
    }

    // True: queroSubir False: queroDescer
    public void imprimirPainelExterno() {
        // A linha a seguir imprime o painel externo do piso
        StringBuilder painel = new StringBuilder(); // Usando StringBuilder para concatenar Strings eficientemente
        int andar = piso1.getAndar(); // Convertendo o int para String
        painel.append(Integer.toString(andar));

        // *Formata o input do visor externo
        if (piso1.getSubir())
            painel.append('\u25B2'); // Adicionando o caractere ▲
        else
            painel.append('\u25B3');
        if (piso1.getDescer())
            painel.append('\u25BC'); // Adicionando o caractere ▲
        else
            painel.append('\u25BD');

        System.out.println(painel.toString()); // Imprimindo o painel
    }
}
