import java.time.LocalDate;

public class PessoaFisica extends Cliente {
    private String cpf;
    private LocalDate dataNascimento;

    public PessoaFisica(String nome, Endereco endereco, String cpf, LocalDate dataNascimento) {
        super(nome, endereco);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Remove pontos, traços ou espaços
        String cpfLimpo = cpf.replaceAll("[^0-9]", "");

        // Regra: o CPF deve ter exatamente 11 dígitos
        if (cpfLimpo.length() != 11) {
            throw new IllegalArgumentException("Erro de Validação: O CPF deve conter exatamente 11 dígitos numéricos.");
        }
        this.cpf = cpfLimpo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        // Regra: a data não pode ser nula e não pode estar no futuro
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Erro de Validação: A data de nascimento não pode ser futura.");
        }
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "[Pessoa Física] Nome: " + getNome() + " | CPF: " + cpf +
                " | Nasc: " + dataNascimento + " | Endereço: " + getEndereco();
    }

}
