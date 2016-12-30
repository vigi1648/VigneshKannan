
import java.sql.Connection;
import java.sql.Statement;

public class Manager1 {
public static void main(String[]args)throws Exception
{

	Connection con=Util.getConnection();
    Statement stmt=  con.createStatement();
	String sql="create table User(id int,name varchar(20))";
	stmt.execute(sql);
	stmt.close();
	con.close();
	System.out.println("done");
	
}
}
