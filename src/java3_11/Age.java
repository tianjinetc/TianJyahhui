package java3_11;

import java.util.Scanner;

public class Age {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double num=0;
			for(int i=1;i<=10;i++){
				System.out.print("请输入第"+i+"位顾客的年龄：");
				double age=sc.nextDouble();
				if(age>=30){
					num++;
				}
				
			}
			
			System.out.println("30岁以上顾客占的比例是："+num/10*100+"%");
		}
}
