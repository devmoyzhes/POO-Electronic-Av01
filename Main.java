import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] nullArgs) {
        List<Cliente> clientesValidos = new ArrayList<>();
        Endereco endPadrao = new Endereco("Av. Belém", "30", "Belém", "PA");

        System.out.println("\n-----------=====Cadastro de Clientes da Electronic=====----------\n");

        // Caso 1: Pessoa Física Válida (com formatação no CPF)
        try {
            PessoaFisica pf1 = new PessoaFisica("Ana Castela", endPadrao, "123.123.123-10", LocalDate.of(2003, 11, 16));
            clientesValidos.add(pf1);
            System.out.println("SUCESSO: A Boiadeira foi cadastrada.");
        } catch (IllegalArgumentException e) {
            System.out.println("ALERTA!!!: " + e.getMessage());
        }

        // Caso 2: Pessoa Física Inválida (Data de Nascimento no Futuro)
        try {
            PessoaFisica pf2 = new PessoaFisica("Thiago André Barbosa", endPadrao, "98765432100", LocalDate.of(2083, 03, 11));
            clientesValidos.add(pf2);
            System.out.println("SUCESSO: Thiaguinho foi cadastrado.");
        } catch (IllegalArgumentException e) {
            System.out.println("[ERRO]: Falha ao cadastrar Thiaguinho => " + e.getMessage());
        }

        // Caso 3: Pessoa Jurídica Válida (com formatação no CNPJ)
        try {
            PessoaJuridica pj1 = new PessoaJuridica("Electronic Store", endPadrao, "12.111.111/2222-33",
                    "Tech Eletronicos LTDA");
            clientesValidos.add(pj1);
            System.out.println("SUCESSO: Electronic Store foi cadastrada.");
        } catch (IllegalArgumentException e) {
            System.out.println("ALERTA!!!: " + e.getMessage());
        }
        // Caso 4: Pessoa Jurídica Inválida (Razão Social É OBRIGATÓRIA, MAS ESTÁ vazia)
        try {
            PessoaJuridica pj2 = new PessoaJuridica("Eletro Norte", endPadrao, "11222333000144", "   ");
            clientesValidos.add(pj2);
            System.out.println("SUCESSO: Eletro Norte foi cadastrada.");
        } catch (IllegalArgumentException e) {
            System.out.println("[ERRO]: Falha ao cadastrar Eletro Norte => " + e.getMessage());
        }

        // Caso 5: Nome muito curto (Menos de 3 letras)
        try {
            PessoaFisica pf3 = new PessoaFisica("PH", endPadrao, "11122233344", LocalDate.of(1999, 11, 17));
            clientesValidos.add(pf3);
            System.out.println("SUCESSO: PH foi cadastrado.");
        } catch (IllegalArgumentException e) {
            System.out.println("[ERRO]: Falha ao cadastrar PH => " + e.getMessage());
        }
       
        // EXIBIÇÃO DOS RESULTADOS VÁLIDOS
       
        System.out.println("\n----------=====RELATÓRIO DE CADASTROS VÁLIDOS=====----------\n");
        for (Cliente c : clientesValidos) {
            System.out.println(c);
        }

        System.out.println("\n\n----------==========     FIM DE PROGRAMA     ==========----------\n\n");
    }
}