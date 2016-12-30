import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
	
		static
		{
			try
			{
			Class.forName("org.h2.Driver");
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			}
		
	

public static Connection getConnection()throws Exception
{
	Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
	return con;
}
}