class Endereco {
    private String logradouro;
    private String numero;
    private String cidade;
    private String uf;

    public Endereco(String logradouro, String numero, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return logradouro + ", Nº " + numero + " - " + cidade + "/" + uf;
    }
}