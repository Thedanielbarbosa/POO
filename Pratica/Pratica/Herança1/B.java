package Herança1;

import Herança1.A;

public class B extends A {

    private int k;

    public B(int a, int b, int c, int d) {

        super(a, b, c);
        this.k = d;

    }

    public void imprimeValor(){
        System.out.println("X = " + this.x);
        System.out.println("Y = " + this.y);
        System.out.println("Z = " + getZ());
        System.out.println("K = " + this.k);
        System.out.println("Z = NÃO VISÍVEL.Utilize o get");

    }

}
