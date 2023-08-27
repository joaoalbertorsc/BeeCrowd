class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public Pessoa(){};
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        if (this.nome != "") {
            return this.nome;
        }
        return null;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        if (this.idade > 0) {
            return this.idade;
        }
        return 0;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        if(this.altura > 0) {
            return this.altura;
        }
        return 0;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        if (this.peso > 0) {
            return this.peso;
        }
        return 0;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float calcularIMC() {
        if (peso <= 0 || altura <= 0 || idade <= 0) {
            return 0;
        } else {
            return peso / (altura * altura);
        }
    }
}