package java3_11;

import java.util.Scanner;

public class Age {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double num=0;
			for(int i=1;i<=10;i++){
				System.out.print("�������"+i+"λ�˿͵����䣺");
				double age=sc.nextDouble();
				if(age>=30){
					num++;
				}
				
			}
			
			System.out.println("30�����Ϲ˿�ռ�ı����ǣ�"+num/10*100+"%");
		}
}
