public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, Endereco endereco, String cnpj, String razaoSocial) {
        super(nome, endereco);
        setCnpj(cnpj);
        setRazaoSocial(razaoSocial);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        // Remove pontos, barras, traços ou espaços
        String cnpjLimpo = cnpj.replaceAll("[^0-9]", "");

        // Regra: o CNPJ deve ter exatamente 14 dígitos
        if (cnpjLimpo.length() != 14) {
            throw new IllegalArgumentException(
                    "Erro de Validação: O CNPJ deve conter exatamente 14 dígitos numéricos.");
        }
        this.cnpj = cnpjLimpo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        // Regra: a razão social é obrigatória (não pode ser vazia)
        if (razaoSocial == null || razaoSocial.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro de Validação: A razão social é obrigatória.");
        }
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "[Pessoa Jurídica] Nome Fantasia: " + getNome() + " | Razão Social: " + razaoSocial +
                " | CNPJ: " + cnpj + " | Endereço: " + getEndereco();
    }
}
