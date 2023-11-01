public class Predio {
    // !Questão 2
    public Piso[] pisos; // Pisos conectados através de ums lista de pisos
    public Elevador elevador;

    public Predio(int quantPisos) {
        pisos = new Piso[quantPisos]; // Inicializa o array de pisos com o tamanho especificado
        for (int i = 0; i < quantPisos; i++) {
            pisos[i] = new Piso((i + 1), this); // Cria e inicializa cada piso
        }
        elevador = new Elevador(this);

    }

    // !Questão 1
    public void isqueroSubir(int numeroPiso) {
        if (numeroPiso >= 1 && numeroPiso <= pisos.length) {
            pisos[numeroPiso].setSubir(true);
        }
    }

    public void isqueroDescer(int numeroPiso) {
        if (numeroPiso >= 1 && numeroPiso <= pisos.length) {
            pisos[numeroPiso].setDescer(true);
        }
    }

    // !Questão 6
    public void mover(Predio predio) {
        if (elevador.getDirecao()) {
            if (elevador.getPisoAtual() < pisos.length - 1 && !elevador.isPortaAberta()) { // Elevador chegou no último
                                                                                           // andar e está com a porta
                                                                                           // fechada?
                elevador.setPisoAtual(elevador.getPisoAtual() + 1);
                pisos[elevador.getPisoAtual()].receberElevador(elevador);
                /*
                 * if(pisos[elevador.getPisoAtual()].isparadaSolicitada()){
                 * }
                 */
            } else {
                System.out.println("** Elevador chegou no último piso **");
                elevador.isDesendo();
                elevador.setPisoAtual(elevador.getPisoAtual() + 1);
            }
        } else {
            if (elevador.getPisoAtual() > 0 && !elevador.isPortaAberta()) {// Elevador chegou no último andar e está com
                                                                           // a porta fechada?
                elevador.setPisoAtual(elevador.getPisoAtual() - 1);
                pisos[elevador.getPisoAtual()].receberElevador(elevador);
            } else {
                System.out.println("** Elevador chegou no primeiro piso **");
                elevador.isSubindo();
                elevador.setPisoAtual(elevador.getPisoAtual() + 1);
            }
        }
    }

    // !Questão 1
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

        }
    }

    public static void main(String[] args) throws Exception {
        Predio predio = new Predio(5); // Cria um prédio que contém 5 pisos
        predio.isqueroSubir(3); // Indica que quer subir para o terceiro piso
        predio.mostrarPainel(1); // Imprime o painel do terceiro piso
        predio.isqueroDescer(2); // Indica que quer descer do segundo piso
        predio.mostrarPainel(2); // Imprime o painel do segundo piso
        predio.elevador.mostrarPainel();
        predio.mover(predio);
        predio.mover(predio);
        predio.mover(predio);
        predio.elevador.mostrarPainel();

    }
}