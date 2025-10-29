import java.util.Scanner;

public class primeNumberTest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
		primeNumber pN1 = new primeNumber(p);
		pN1.print();
	}
}



class primeNumber{
	private int p;
	primeNumber(int p){
		this.p = p;
	}
	
	void print(){
        boolean number = true;
        for (int i = 2;i<=Math.sqrt(p);i++){
            if (p%i==0){
                number = false;
                break;
            }
        }
        if (p == 1){
            System.out.println("不是質數");
        }
        else if (number){
            System.out.println("是質數");
        }
        else {
            System.out.println("不是質數");
        }
    }

}
