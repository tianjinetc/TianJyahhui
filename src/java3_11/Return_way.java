package java3_11;

import java.util.Scanner;

public class Return_way {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入三个数：");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			answer(a,b,c);
		}
		public static void answer(double a,double b,double c){
			if((b*b-4*a*c)>0){
				double x_1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
				double x_2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
				System.out.println("解是"+x_1+","+x_2);;
			}else{
				System.out.println("该函数没有解");
			}
		}
		
}
