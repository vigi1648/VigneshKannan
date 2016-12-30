import java.sql.Connection;
import java.util.Scanner;

public class Manager3 {
	public static void main(String[]args ) throws Exception
	{
Connection con=Util.getConnection();
Statement stmt=con.createStatement();
String ch="";
Scanner sc=new Scanner(System.in);
do{
	System.out.println("Enter The id value");
	
	System.out.println("Enter the name");
	String name=sc.next();
	String sql="insert "
			
}while(condition);
}
}
