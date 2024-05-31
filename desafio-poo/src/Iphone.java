
import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu() {
        Iphone iphone = new Iphone();

        boolean mostrarMenu = true;
        Integer opcao = 0;
        Integer funcao = 0;

        while (mostrarMenu) {
            System.out.println("\nMenu Principal\n1 - Reprodutor musical\n2 - Aparelho telefônico\n3 - Navegador\nInforme outro número se quiser sair do menu");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("\n1 - Tocar música \n2 - Pausar música\n3 - Selecionar música");
                    funcao = Integer.parseInt(scanner.nextLine());
                    switch (funcao) {
                        case 1:
                            iphone.tocar();
                            break;
                        case 2:
                            iphone.pausar();
                            break;
                        case 3:
                            iphone.selecionarMusica();
                            break;
                        default:
                            System.out.println("Finalizando...");
                            mostrarMenu = false;
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\n4 - Ligar para alguém\n5 - Atender Ligação\n6 - Iniciar correio de voz");
                    funcao = Integer.parseInt(scanner.nextLine());
                    switch (funcao) {
                        case 4:
                            iphone.ligar();
                            break;
                        case 5:
                            iphone.atender();
                            break;
                        case 6:
                            iphone.iniciarCorreioVoz();
                            break;
                        default:
                            System.out.println("Finalizando...");
                            mostrarMenu = false;
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\n7 - Exibir Página\n8 - Adicionar nova aba\n9 - Atualizar a página");
                    funcao = Integer.parseInt(scanner.nextLine());
                    switch (funcao) {
                        case 7:
                            iphone.exibirPagina();
                            break;
                        case 8:
                            iphone.adicionarNovaAba();
                            break;
                        case 9:
                            iphone.atualizarPagina();
                            break;
                        default:
                            System.out.println("Finalizando...");
                            mostrarMenu = false;
                            break;
                    }
                    break;

                default:
                    System.out.println("Finalizando...");
                    mostrarMenu = false;
                    break;
            }

        }
    }

    @Override
    public void tocar() {
        System.out.println("\nTocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("\nPausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("\nInforme o nome da música:");
        String musica = scanner.nextLine();
        System.out.println("\nTocando música " + musica + "...");
    }

    @Override
    public void ligar() {
        System.out.println("\nInforme o número para o qual você deseja ligar:");
        String numero = scanner.nextLine();
        System.out.println("\nLigando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("\nAtendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("\nLigando para o Correio de Voz...");
        System.out.println("\nVocê não tem correio de voz no momento.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("\nInforme a URL:");
        String site = scanner.nextLine();
        System.out.println("\nCarregando o site " + site);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("\nAbrir site em nova aba");
        System.out.println("\nInforme a URL:");
        String site = scanner.nextLine();
        System.out.println("\nCarregando o site " + site);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("\nAtualizando...");
    }

    public static void main(String[] args) {
        mostrarMenu();

    }
}
