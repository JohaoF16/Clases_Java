
package Operaciones;

public class Matematica1 {
    int a;
    int b; 
    public void suma() {
    int resultado = a+b;
    System.out.println("El resultado es: " + resultado);
    }
    public int sumar(){
        int resultado = a + b;
        return resultado;
    }
    public void sumar1(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        System.out.println("El resultado del metodo con parametros es: "+(this.a+this.b));
    }
}
