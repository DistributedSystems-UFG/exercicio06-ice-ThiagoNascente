import com.zeroc.Ice.*;
// Implementação do Servant (Equivalente ao FunctionsI do seu código Python)


public class Server {
    public static void main(String[] args) {
        // 1. Inicializa o comunicador Ice
        try (Communicator communicator = Util.initialize(args)) {

            // 2. Cria o adaptador com os endpoints (0.0.0.0 permite conexões externas)
            ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints(
                    "SimpleAdapter", "default -h 0.0.0.0 -p 5678");

            // 3. Instancia o servant passando o nome 'objeto' como no Python
            FunctionsI servant = new FunctionsI("objeto");

            // 4. Adiciona o objeto ao adaptador com a identidade "SimpleFunctions"
            adapter.add(servant, Util.stringToIdentity("SimpleFunctions"));

            // 5. Ativa o adaptador e aguarda
            adapter.activate();
            System.out.println("Servidor Java rodando na porta 5678...");

            // 6. Mantém o servidor em execução
            communicator.waitForShutdown();

        } catch (LocalException e) {
            e.printStackTrace();
        }
    }
}