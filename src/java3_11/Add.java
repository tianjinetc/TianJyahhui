package java3_11;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
			for(int i=0;i<=100;i++){
				if(i%3==0){
					sum+=i;
					System.out.println("100以内能整除3的数是"+i);
				}
				
			}
			
			
			System.out.println("100以内能整除3的数的和是"+sum);
	}

}
