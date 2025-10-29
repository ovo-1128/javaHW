import java.util.Scanner;

public class LcmTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入第一個正整數");
        int m = sc.nextInt();
        System.out.println("請輸入的二個正整數");
        int n = sc.nextInt();
		Lcm L1 = new Lcm(m,n);
		L1.print();
	}
}




class Lcm{
	private int m,n;
	Lcm(int m , int n){
		this.m = m;
		this.n = n;
	}
	
	void print(){
		int max =1;
        for (int i =2;i <=m; i++){
            if (m%i == 0 && n%i==0)
                max = i;
        }
        System.out.println("最小公倍數是：" + m*n/max);
	}
}
