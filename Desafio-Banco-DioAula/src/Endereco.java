import java.util.Random;

public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private String cep;

    // Construtor
    public Endereco(String rua, int numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Métodos getters e setters (ou pode usar Lombok para gerar automaticamente)

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // Método estático para gerar um endereço aleatório
    public static Endereco gerarEnderecoAleatorio() {
        String[] ruas = {"Rua A", "Rua B", "Rua C", "Rua D", "Rua E"};
        String[] cidades = {"Cidade A", "Cidade B", "Cidade C", "Cidade D", "Cidade E"};
        String[] estados = {"Estado A", "Estado B", "Estado C", "Estado D", "Estado E"};

        Random random = new Random();

        String ruaAleatoria = ruas[random.nextInt(ruas.length)];
        int numeroAleatorio = random.nextInt(100) + 1; // Número de 1 a 100
        String cidadeAleatoria = cidades[random.nextInt(cidades.length)];
        String estadoAleatorio = estados[random.nextInt(estados.length)];
        String cepAleatorio = String.format("%05d-%03d", random.nextInt(100000), random.nextInt(1000));

        return new Endereco(ruaAleatoria, numeroAleatorio, cidadeAleatoria, estadoAleatorio, cepAleatorio);
    }

    // Método main para teste
    public static void main(String[] args) {
        Endereco enderecoAleatorio = Endereco.gerarEnderecoAleatorio();
        System.out.println("Endereço Aleatório Gerado:");
        System.out.println("Rua: " + enderecoAleatorio.getRua());
        System.out.println("Número: " + enderecoAleatorio.getNumero());
        System.out.println("Cidade: " + enderecoAleatorio.getCidade());
        System.out.println("Estado: " + enderecoAleatorio.getEstado());
        System.out.println("CEP: " + enderecoAleatorio.getCep());
    }
}
