package java3_11;

public class Continue_1 {
		public static void main(String[] args) {
			for(int i=1;i<=50;i++){
				System.out.println("������"+i+"��");
				if(i==30){
					System.out.println("��һ��������");
					continue;
				}
				
			}
			System.out.println("��������");
		}
}
