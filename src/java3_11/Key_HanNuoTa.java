package java3_11;

import java.util.Scanner;

public class Key_HanNuoTa {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入圆盘数：");
			int n=sc.nextInt();
			keyHnt('a','b','c',n);
		}
		public static void keyHnt(char a,char b,char c,int n){
			if(n==1){
				System.out.println(a+"---------->"+c);
			}else{
				//把n-1个圆盘从a移动到b，借助c
				keyHnt(a,c,b,n-1);
				
				//把第n个圆盘从a移动到c。
				System.out.println(a+"---------->"+c);
				//把n-1个圆盘从b移动到c，借助a
				keyHnt(b,a,c,n-1);
			}
			
		}
}
