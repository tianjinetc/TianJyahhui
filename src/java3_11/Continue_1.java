package java3_11;

public class Continue_1 {
		public static void main(String[] args) {
			for(int i=1;i<=50;i++){
				System.out.println("我跑了"+i+"米");
				if(i==30){
					System.out.println("第一名累死了");
					continue;
				}
				
			}
			System.out.println("后来居上");
		}
}
