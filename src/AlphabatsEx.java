import java.util.Scanner;

public class AlphabatsEx {
	
	void printAlphabates(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of string type.");
		String str = sc.nextLine();
	int count = 0;
	for(int i=0;i<str.length();i++)
	{
	char strchr = str.charAt(i);
	if(!((strchr >= 'A' && strchr <= 'Z')|| (strchr >= 'a' && strchr <= 'z')))
	{
     count = 1;
	}
	}
	if(count==0) {	
		System.out.println("this is a character type");
	}else {
		System.out.println("this is not a character type");
	}
	}
     
	public static void main(String[] args) {

		AlphabatsEx ref = new AlphabatsEx();
		ref.printAlphabates();
}
}