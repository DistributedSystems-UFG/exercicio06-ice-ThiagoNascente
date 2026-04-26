import com.zeroc.Ice.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String hostRemoto = "54.196.85.80";
        String hostLocal = "localhost";
        String porta = "5678";

        try (Communicator communicator = Util.initialize(args)) {
            Demo.FunctionsPrx obj = null;

            // 1. Tentar conexão no servidor Local
            try {
                System.out.println("Tentando conectar em " + hostRemoto + "...");
                ObjectPrx base = communicator.stringToProxy("SimpleFunctions:tcp -h " + hostRemoto + " -p " + porta);
                obj = Demo.FunctionsPrx.checkedCast(base);
            } catch (ConnectTimeoutException | ConnectionRefusedException e) {
                // 2. Se falhar, tentar no servidor remoto
                try {
                    System.out.println("Falha. Tentando conectar em " + hostLocal + "...");
                    ObjectPrx base = communicator.stringToProxy("SimpleFunctions:tcp -h " + hostLocal + " -p " + porta);
                    obj = Demo.FunctionsPrx.checkedCast(base);
                } catch (ConnectionRefusedException ex) {
                    System.err.println("Erro: Nem o servidor " + hostLocal + " nem o " + hostRemoto + " estão ativos.");
                }
            }

            if (obj != null) {
                executarLogica(obj);
            } else {
                System.out.println("Não foi possível estabelecer conexão com nenhum servidor.");
            }

        } catch (LocalException e) {
            e.printStackTrace();
        }
    }

    private static void executarLogica(Demo.FunctionsPrx obj) {
        Scanner scanner = new Scanner(System.in);

        // Chamada simples
        System.out.println(obj.printString("Hello World! Comunicação feita com sucesso!!!"));

        // Cumprimentar
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println(obj.cumprimentar(nome));

        // Inverter texto
        System.out.print("Entre com um texto para ser invertido: ");
        String texto = scanner.nextLine();
        System.out.println(obj.inverter(texto));
    }
}