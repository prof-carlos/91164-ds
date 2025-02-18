public class MainClienteEndereco {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "23", "Salvador");
        Clientes cliente1 = new Clientes("Marta", "marta@gmail.com", endereco1);
        System.out.println(cliente1.toString());

        Clientes cliente2 = new Clientes("José", "jose@gmail.com", 
            new Endereco("Rua B", "32", "Rio de Janeiro"));
        System.out.println(cliente2.toString());
    }
}
