public class MainCliente {
    public static void main(String[] args) {
        // Cliente 1.
        Cliente cliente1 = new Cliente();
        
        cliente1.setNome("Marta");
        cliente1.setEmail("marta@gmail.com");
        cliente1.setSenha("123");
       
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("E-mail: " + cliente1.getEmail());
        System.out.println("Senha: " + cliente1.getSenha());
        
        // Cliente 2.
        Cliente cliente2 = new Cliente("José", "jose@gmail.com", "321");
        System.out.println(cliente2.toString());   
        
        // Cliente 3.
        Cliente cliente3 = new Cliente("Maria", "mariae@gmail.com", "6545");
        System.out.println(cliente3.toString());   
    }

}
