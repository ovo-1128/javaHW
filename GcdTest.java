import java.util.Scanner;

public class GcdTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入第一個正整數");
        int x = sc.nextInt();
        System.out.println("請輸入的二個正整數");
        int y = sc.nextInt();
		Gcd G1 = new Gcd(x,y);
		G1.print();
	}
}


class Gcd {
	private int x,y;
	Gcd(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void print(){
        int Gcd = 1;
        int i =2;
        while (i <= x && i <= y) {
            if (x % i == 0 && y % i == 0)
            Gcd = i;
            i++;
        }
        System.out.println("最大公因數是：" + Gcd);
    }
}