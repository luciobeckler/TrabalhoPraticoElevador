public class Predio {
    private Piso[] pisos; // Pisos conectados através de ums lista de pisos

    public Predio(int quantPisos) {
        pisos = new Piso[quantPisos]; // Inicializa o array de pisos com o tamanho especificado
        for (int i = 0; i < quantPisos; i++) {
            pisos[i] = new Piso(i + 1); // Cria e inicializa cada piso
        }
    }

    public void isqueroSubir(int numeroPiso) {
        if (numeroPiso >= 1 && numeroPiso <= pisos.length) {
            pisos[numeroPiso - 1].setSubir(true);
        }
    }

    public void isqueroDescer(int numeroPiso) {
        if (numeroPiso >= 1 && numeroPiso <= pisos.length) {
            pisos[numeroPiso - 1].setDescer(true);
        }
    }

    // True: queroSubir False: queroDescer
    public void mostrarPainel(int numeroPiso) {
        if (numeroPiso >= 1 && numeroPiso <= pisos.length) {
            Piso piso = pisos[numeroPiso - 1];
            // A linha a seguir imprime o painel externo do piso
            StringBuilder painel = new StringBuilder();
            int andar = piso.getAndar();
            painel.append(Integer.toString(andar));

            // Formata o input do visor externo
            if (piso.getSubir())
                painel.append('\u25B2'); // Adicionando o caractere ▲
            else
                painel.append('\u25B3');
            if (piso.getDescer())
                painel.append('\u25BC'); // Adicionando o caractere ▲
            else
                painel.append('\u25BD');

            System.out.println(painel.toString()); // Imprimindo o painel
        }
    }

    public static void main(String[] args) throws Exception {
        Predio predio = new Predio(5);
        predio.isqueroSubir(3); // Indica que quer subir para o terceiro piso
        predio.mostrarPainel(1); // Imprime o painel do terceiro piso
        predio.isqueroDescer(2); // Indica que quer descer do segundo piso
        predio.mostrarPainel(2); // Imprime o painel do segundo piso
    }
}