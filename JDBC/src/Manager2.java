import java.sql.Connection;
import java.sql.Statement;

public class Manager2 {
public static void main(String[] args)
{ 
	try
	{
		Connection con=Util.getConnection();
		Statement stmt=con.createStatement();
		String sql="insert into user values(123,'abc')";
		stmt.executeUpdate(sql);
		stmt.close();
		con.close();
		System.out.println("done");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
