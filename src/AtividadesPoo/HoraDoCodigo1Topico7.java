//
//public class HoraDoCodigo1Topico7_v2{
//
//    public static void main(String[] args) {
//
//        System.out.println();
//        // Teste quadrado:
//        Quadrado quadrado = new Quadrado();
//        quadrado.setLado(6);
//        System.out.println(quadrado.perimetro());
//        System.out.println(quadrado.area());
//
//        System.out.println();
//        // Teste circulo:
//        Circulo circulo = new Circulo();
//        circulo.setRaio(5);
//        System.out.println(circulo.area());
//        System.out.println(circulo.perimetro());
//
//    }
//
//}
//
//class FormaGeometrica{
//
//    public float area(){
//        return 0;
//    }
//    public float perimetro(){
//        return 0;
//    }
//    // Triangulo:
//    public float area(float lado1,float lado2, float lado3){
//        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
//            float semiPerimetro = (lado1 + lado2 + lado3) / 2;
//            float area = (float) Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
//            return area;
//        } else {
//            return 0;
//        }
//    }
//    public float perimetro(float lado1,float lado2, float lado3){
//        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
//            float perimetro = lado1 + lado2 + lado3;
//            return perimetro;
//        } else {
//            return 0;
//        }
//    }
//
//    // Quadrado
//    public float area(float lado){
//        float area = lado * lado;
//        return area;
//    }
//    public float perimetro(float lado){
//        float perimetro = lado * 4;
//        return perimetro;
//    }
//
//    // Circulo
//    public float area(float raio, float pi){
//        float area = pi * (raio * raio);
//        return area;
//    }
//
//    public float perimetro(float raio, float pi){
//        float perimetro = 2 * pi * raio;
//        return perimetro;
//    }
//
//}
//
//class Triangulo extends FormaGeometrica{
//
//    private float lado1;
//    private float lado2;
//    private float lado3;
//
//    @Override
//    public float area() {
//        return super.area(lado1, lado2, lado3);
//    }
//
//    @Override
//    public float perimetro() {
//        return super.perimetro(lado1, lado2, lado3);
//    }
//
//    public float getLado1() {
//        return lado1;
//    }
//
//    public void setLado1(float lado1) {
//        this.lado1 = lado1;
//    }
//
//    public float getLado2() {
//        return lado2;
//    }
//
//    public void setLado2(float lado2) {
//        this.lado2 = lado2;
//    }
//
//    public float getLado3() {
//        return lado3;
//    }
//
//    public void setLado3(float lado3) {
//        this.lado3 = lado3;
//    }
//}
//
//class Quadrado extends FormaGeometrica{
//
//    private float lado;
//
//
//    @Override
//    public float area() {
//        return super.area(lado);
//    }
//
//    @Override
//    public float perimetro() {
//        return super.perimetro(lado);
//    }
//
//    public float getLado() {
//        return lado;
//    }
//    public void setLado(float lado) {
//        this.lado = lado;
//    }
//}
//
//class Circulo extends  FormaGeometrica{
//
//    float pi = 3.14f;
//    private float raio;
//
//    @Override
//    public float area() {
//        return super.area(raio, pi);
//    }
//
//    @Override
//    public float perimetro() {
//        return super.perimetro(raio, pi);
//    }
//
//    public float getRaio() {
//        return raio;
//    }
//
//    public void setRaio(float raio) {
//        this.raio = raio;
//    }
//
//    public float getPi() {
//        return pi;
//    }
//}