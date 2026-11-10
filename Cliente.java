abstract class Cliente {
    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco) {
        setNome(nome); // Usa o setter para garantir a validação no construtor
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // Regra: nome deve ter ao menos 3 caracteres
        if (nome == null || nome.trim().length() < 3) {
            throw new IllegalArgumentException("Erro de Validação: O nome deve ter ao menos 3 caracteres.");
        }
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
