import com.zeroc.Ice.Current;

class FunctionsI implements Demo.Functions {
    private String name;

    // O construtor recebe o nome 'objeto' como no seu código Python
    public FunctionsI(String name) {
        this.name = name;
    }

    @Override
    public String printString(String s, Current current) {
        System.out.println("[" + name + "] Recebido: " + s);
        return "Java Server: " + s;
    }

    @Override
    public String cumprimentar(String nome, Current current) {
        return "Olá " + nome + ", aqui é o servidor Java!";
    }

    @Override
    public String inverter(String texto, Current current) {
        return new StringBuilder(texto).reverse().toString();
    }
}