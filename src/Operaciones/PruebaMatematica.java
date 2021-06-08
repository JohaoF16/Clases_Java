
package Operaciones;

public class PruebaMatematica{
    
    public static void main(String[] args) {
        Matematica1 ob1;
        ob1= new Matematica1();
        ob1.a = 35;
        ob1.b = 25;
        ob1.suma();   
        //Crear metodos con parametros
        int res = ob1.sumar();
        System.out.println("res = " + res);
        System.out.println("El resultado de la suma es: "+ob1.sumar());
        ob1.sumar1(10,15);
    }

}
