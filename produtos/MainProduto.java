package produtos;

public class MainProduto {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa(null, null, null, 0);
        Calca calca1 = new Calca(null, null, null, 0);
        Sapato sapato1 = new Sapato(null, null, null, 0);

        System.out.println(camisa1.toString());
        System.out.println(calca1.toString());
        System.out.println(sapato1.toString());
    }
}
