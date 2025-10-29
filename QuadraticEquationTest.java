import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number a for a in ax^2+bx+c : " );
        double a = input.nextDouble();
        System.out.println("Enter the number b for a in ax^2+bx+c : " );
        double b = input.nextDouble();
        System.out.println("Enter the number c for a in ax^2+bx+c : " );
        double c = input.nextDouble();

        QuadraticEquation QE1 = new QuadraticEquation(a,b,c);
        QE1.print();

    }

}


class QuadraticEquation {

    private double a,b,c;

    QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getroot1(){
        double r1 = ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
        return r1;
    }
    public double getroot2(){
        double r2 = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
        return r2;
    }
    public double getDiscriminant(){
        double d = b*b-4*a*c;
        return d;
    }
    void print(){
        if(getDiscriminant()>0){
            System.out.println("the root1 is"+getroot1()+" , and root2 is"+getroot2());
        }
        else if (getDiscriminant()==0){
            System.out.println("the root is"+getroot1());
        }
        else if(getDiscriminant()<0){
            System.out.println("The equation has no roots");
        }

    }
}
