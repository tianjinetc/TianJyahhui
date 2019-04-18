package java3_11;

public class BreakL {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++){
			sum=i+sum;
			System.out.print(i+"+");
			if(sum>20){
				System.out.println("="+sum);
				break;
			}
		}

	}

}
