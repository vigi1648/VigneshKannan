import java.sql.*;
public class Validate {
	  public static boolean checkUser(String email,String pass) 
	     {
	      boolean st =false;
	      try{

		 //loading drivers for h2
	         Class.forName("org.h2.Driver");

	 	 //creating connection with the database 
	         Connection con=DriverManager.getConnection
	                        ("jdbc:h2:~/test", "sa", "");
	         PreparedStatement ps =con.prepareStatement
	                             ("select * from register where email=? and pass=?");
	         ps.setString(1, email);
	         ps.setString(2, pass);
	         ResultSet rs =ps.executeQuery();
	         st = rs.next();
	        
	      }catch(Exception e)
	      {
	          e.printStackTrace();
	      }
	         return st; 
}

	public static boolean checkUser1(String email, String pass) {
		// TODO Auto-generated method stub
		return false;
	}
}
