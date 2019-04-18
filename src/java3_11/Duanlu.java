package java3_11;

public class Duanlu {
		public static void main(String[] args) {
			//&&  ||   &   |  的区别
			int a=10,b=20;
			if(a++>=10 & b++<=20){
				System.out.println("执行了if循环");
				System.out.println(a+"-----"+b);
			}
			
		}
}
