package java3_11;

import java.util.Scanner;

public class Key_HanNuoTa {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("������Բ������");
			int n=sc.nextInt();
			keyHnt('a','b','c',n);
		}
		public static void keyHnt(char a,char b,char c,int n){
			if(n==1){
				System.out.println(a+"---------->"+c);
			}else{
				//��n-1��Բ�̴�a�ƶ���b������c
				keyHnt(a,c,b,n-1);
				
				//�ѵ�n��Բ�̴�a�ƶ���c��
				System.out.println(a+"---------->"+c);
				//��n-1��Բ�̴�b�ƶ���c������a
				keyHnt(b,a,c,n-1);
			}
			
		}
}
