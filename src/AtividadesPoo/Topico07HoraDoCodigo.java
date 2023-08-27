package AtividadesPoo;

public class Topico07HoraDoCodigo {

    public static void main(String[] args) {
        CPF cpf = new CPF();
        cpf.setCpf("1234567891011");
        cpf.setNome("Alfred");
        cpf.setData("1/12/1999");
        String cpfValido = (cpf.validarCpf(cpf.getCpf()))? "verdadeiro":"falso";

        System.out.printf("O cpf: %s, tem o nome: %s, e eh um CPF %s", cpf.getCpf(), cpf.getNome(), cpfValido);
        System.out.println();
        System.out.println(cpf.getData());
    }
}

class CPF {
    private String cpf;
    private String nome;
    private String dataNascimento;
    public boolean validarCpf(String numeroCpf) {

        if (numeroCpf.length() != 11)
            return false;

        int soma1 = 0;
        int soma2 = 0;

        for (int i = 0; i < 9; i++) {
            char c = numeroCpf.charAt(i);
            if (!Character.isDigit(c))
                return false;

            int digito = Character.getNumericValue(c);
            soma1 += digito * (10 - i);
            soma2 += digito * (11 - i);
        }

        int resto1 = soma1 % 11;
        int j = (resto1 <= 1) ? 0 : 11 - resto1;

        soma2 += j * 2;
        int resto2 = soma2 % 11;
        int k = (resto2 <= 1) ? 0 : 11 - resto2;

        int digitoVerificador1 = Character.getNumericValue(numeroCpf.charAt(9));
        int digitoVerificador2 = Character.getNumericValue(numeroCpf.charAt(10));

        return j == digitoVerificador1 && k == digitoVerificador2;
    }
    public String getCpf() {
        if (cpf.matches("\\d{11}")) {
            return cpf;
        } else {
            return null;
            }
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    public String getData() {
        if (dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}")
                || dataNascimento.matches("\\d{1}/\\d{1}/\\d{4}")
                || dataNascimento.matches("\\d{2}/\\d{1}/\\d{4}")
                || dataNascimento.matches("\\d{1}/\\d{2}/\\d{4}")) {
            return dataNascimento;
        } else {
            return null;
        }
    }
    public void setData(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}