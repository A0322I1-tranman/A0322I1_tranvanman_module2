package BT.QuadracticEquation;
import  java.util.Scanner;
public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){};
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiccriminant(){
        return (Math.pow(this.getB(),2) - (4*this.getA()*this.getC()));
    }
    public double getRoot1(){
        return (-this.getB()  + Math.sqrt((Math.pow(this.getB(),2))-(4*this.getA()*this.getC())))/2*this.getA();
    }public double getRoot2(){
        return  (-this.getB()  - Math.sqrt((Math.pow(this.getB(),2))-(4*this.getA()*this.getC())))/2*this.getA();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiccriminant();
        double e = quadraticEquation.getRoot1();
        double f = quadraticEquation.getRoot2();
        if (delta>0){
            System.out.println("The Root1: "+e);
            System.out.println("The Root2: "+f);
        }else  if (delta == 0){
            System.out.println(e);;
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
