package pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta", "23", "30/12/2024", "Crédito");
        Funcionario funcionario1 = new Funcionario("José", "44", "ABC123", "Desenvolvedor", 4560);
        
        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());
    }
}
