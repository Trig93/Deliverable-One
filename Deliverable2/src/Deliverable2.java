import java.util.Scanner;

public class Deliverable2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		String s = "hello world";
	    s = s.replace(" ", "");
	    char[] c = s.toCharArray();

	    for (Character ss : c)
	        System.out.println(ss - 'a' + 1);
	}
		
		

	}


