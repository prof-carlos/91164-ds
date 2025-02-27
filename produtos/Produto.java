package produtos;

public abstract class Produto {
    protected String marca;
    protected String tamanho;
    protected String cor;
    protected double preco;

    public Produto(String marca, String tamanho, String cor, double preco) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [marca=" + marca + ", tamanho=" + tamanho + ", cor=" + cor + ", preco=" + preco + "]";
    }
    
}
