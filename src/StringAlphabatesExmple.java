import java.util.Scanner;

public class StringAlphabatesExmple {

	public static void main(String[] args) {

		char ch = 'a';
		while(ch<='z')
		{
			System.out.print(ch + " ");
			ch++ ;
		}
		
	}
	void printAlphabates()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		choice =sc.nextInt();
		
	switch(choice)
	{
	case 1:
		System.out.println("enter the value of character type.");
		 ch = sc.next().charAt(0);
		 if(ch>='a' && ch<='z')
	        {
	            System.out.print(ch + " is an Alphabet");
	        }
	        else
	        {
	            System.out.print("this is not an Alphabet");
	        }
	case 2:
		System.out.println(" ");
		System.out.println(" wrong choice ");
	    }

	}

	public static void main(String[] args) {

		AlphabatsEx ref = new AlphabatsEx();
		ref.printAlphabates();
}

}
