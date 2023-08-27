package AtividadesPoo;

public class Trapezio {
    private float baseMenor;
    private float baseMaior;
    private float altura;
    private float lado1;
    private float lado2;
    public Trapezio() {}
    public Trapezio(float baseMaior, float baseMenor, float altura, float lado1, float lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public float calcularPerimetro() {
        float perimetro = 0;
        if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0 || lado1 <= 0 || lado2 <= 0) {
            perimetro = 0;
        } else {
            perimetro = (baseMaior + baseMenor + lado1 + lado2);
        }
        return perimetro;
    }
    public float calcularArea() {
        float area = 0;
        if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0 || lado1 <= 0 || lado2 <= 0) {
            area = 0;
        } else {
            area = ((baseMaior + baseMenor) * altura) / 2;
        }
        return area;
    }
    public float getBaseMaior() {
        if (this.baseMaior < this.baseMenor) {
            return 0;
        }
        if (this.baseMaior > 0) {
            return this.baseMaior;
        }
        return 0;
    }
    public void setBaseMaior(float baseMaior) {
        this.baseMaior = baseMaior;
    }
    public float getBaseMenor() {
        if (this.baseMenor > this.baseMaior && this.baseMenor > 0){
            return this.baseMenor;
        }
        return 0;
    }
    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }
    public float getAltura() {
        if (this.altura > 0) {
            return this.altura;
        }
        return 0;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getLado1() {
        if (this.lado1 > 0) {
            return this.lado1;
        }
        return 0;
    }
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    public float getLado2() {
        if (this.lado2 > 0) {
            return this.lado2;
        }
        return 0;
    }
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
}