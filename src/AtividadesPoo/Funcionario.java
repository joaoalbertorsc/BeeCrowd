package AtividadesPoo;
public abstract class Funcionario {
    private String nome;
    private int matricula;
    private double salarioBase;
    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != ""){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido");
        }
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        if (matricula > 0){
            this.matricula = matricula;
        } else {
            System.out.println("Valor invalido para matricula.");
        }

    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0){
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Valor de salario invalido.");
        }

    }
}

class Secretario extends Funcionario {
    public Secretario(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}

class Professor extends Funcionario{
    int totalAulas;
    public Professor(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * (totalAulas * 0.01));
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(int totalAulas) {
        if (totalAulas > 0){
            this.totalAulas = totalAulas;
        } else {
            System.out.println("Numero invalido para total de aulas.");
        }

    }
}

class Coordenador extends Professor{
    public Coordenador(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() * 2;
    }
}