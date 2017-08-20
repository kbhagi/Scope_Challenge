package bhargavak;
import java.util.Scanner;

class X {

/*	private  Scanner sc  = new Scanner(System.in);*/
	private  int  x = 0;
	
	public X(Scanner x) {
		System.out.println("Please enter a number: ");
		this.x = x.nextInt();
	}

	public  void x()
	{
/*		int x = 0;
	System.out.println("Enter a no: ");
	 this.x = sc.nextInt();
	 sc.nextLine();
	while(x<=12)
	{
		
			System.out.println(x * this.x);
			x++;
	}*/
	for(int x = 1;x < 13;x++) {
		System.out.println(x + " times " + this.x + " equals "  +  x * this.x);
	}
}
}
	
	

