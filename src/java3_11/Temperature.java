package java3_11;

public class Temperature {
		public static void main(String[] args) {
			int h=0,s=0,n=0;
			do {
				h=s*9/5+32;
				s=s+20;
				n++;
				System.out.println(n+".���϶�Ϊ"+s+"���϶�Ϊ"+h);
			} while (n<10 && s<=250);
		}
}
