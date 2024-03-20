package Herança1;

public class A {

    protected int x, y;
    private int z;

    public A(int a, int b, int c) {

        this.x = a;
        this.y = b;
        this.z = c;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getZ(){
        return this.z;
    }

    public void setX(int a){
        this.x = a;
    }

    public void setY(int b) {
        this.y = b;
    }

    public void setZ(int c) {
        this.z = c;
    }

    public void imprimeValores(){
        System.out.println("X = " + getX());
        System.out.println("Y = " + getY());
        System.out.println("Z = " + getZ());
    }
}
