package java3_11;

import java.util.Scanner;

public class For_tempt {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("������ѧ����������");
			String name=sc.next();
			double sum=0;
			for(int i=1;i<=5;i++){
				System.out.print("�������"+i+"�ųɼ���");
				double score=sc.nextDouble();
				sum+=score;
			}
			System.out.println(name+"�����ſγ��ܳɼ��ǣ�"+sum+"ƽ�����ǣ�"+sum/5);
		}
}
