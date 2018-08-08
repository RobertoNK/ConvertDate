import java.util.Scanner;

public class ConvertDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter date to be converted: ");
		String date = input.nextLine().trim();
		String month = date.substring(0, date.indexOf(" ")).trim().toLowerCase();
		month = month.substring(0,1).toUpperCase()+month.substring(1,month.lastIndexOf(""));
		String day = date.substring(date.indexOf(" ")+1, date.indexOf(",")).trim();
		String year = date.substring(date.indexOf(",")+1).trim();
		System.out.println("Converted date: "+ day+" "+month+" "+year);
	}

}
