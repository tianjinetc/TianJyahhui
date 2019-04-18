package java3_11;

import java.util.Scanner;

public class Qiantao {

	public static void main(String[] args) {
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("************欢迎来到英雄联盟************");
			
			System.out.println("1.战士\n2.刺客\n3.法师\n4.射手\n5.辅助");
			System.out.println("请选择你的职业：");
			int select=sc.nextInt();
			if(select==1){
				
				System.out.println("1.蛮王\n2.猴哥\n3.厄加特\n4.剑魔\n5.奥拉夫\n6.返回职业");
				
				System.out.println("请选择你的英雄：");
				int select01=sc.nextInt();
				break;
				
			}
		}

	}

}
