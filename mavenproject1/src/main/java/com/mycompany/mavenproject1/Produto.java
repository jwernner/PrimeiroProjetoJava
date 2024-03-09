public class Produto {
    private String nome;
    private double peso;
    private double preco;

    // Construtor padrão
    public Produto() {
        this.nome = "";
        this.peso = 0.0;
        this.preco = 0.0;
    }

    // Construtor com parâmetros
    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o peso
    public double getPeso() {
        return peso;
    }

    // Setter para o peso
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Getter para o preco
    public double getPreco() {
        return preco;
    }

    // Setter para o preco
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Produto
        Produto produto1 = new Produto();
        produto1.setNome("Celular");
        produto1.setPeso(0.2);
        produto1.setPreco(1500.0);

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Peso: " + produto1.getPeso() + " kg");
        System.out.println("Preço: R$" + produto1.getPreco());
    }
}
