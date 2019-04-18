package java3_11;

import java.util.Scanner;

public class For_tempt {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("请输入学生的姓名：");
			String name=sc.next();
			double sum=0;
			for(int i=1;i<=5;i++){
				System.out.print("请输入第"+i+"门成绩：");
				double score=sc.nextDouble();
				sum+=score;
			}
			System.out.println(name+"的五门课程总成绩是："+sum+"平均分是："+sum/5);
		}
}
