package data;

import java.sql.*;
import java.util.ArrayList;

public class MySql {
	
	
	public static User getAnAdmin()
  {
	 //ArrayList<User> userList= new ArrayList<>();
		User u= new User(null, null);
    try
    {
      // create our mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://192.168.3.5/chats7";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "server");
      
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM user WHERE role_id=2 ORDER BY RAND() LIMIT 1 ";

      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      
      // iterate through the java resultset
      while (rs.next())
      {
    
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String email = rs.getString("email");
        String emailToPass="";
        //String password = rs.getString("password_hash");
        int roleId = rs.getInt("role_id");
        int iend=email.indexOf('@');
        if (iend != -1)
        
        emailToPass = email.substring(0, iend);
        u= new User(email, emailToPass);
        // print the results
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, roleId, email, emailToPass);
      
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
	return u;
  }
	public static User getAnRegularUser()
	  {
		 //ArrayList<User> userList= new ArrayList<>();
			User u= new User(null, null);
	    try
	    {
	      // create our mysql database connection
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://192.168.3.5/chats7";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "server");
	      
	      // our SQL SELECT query. 
	      // if you only need a few columns, specify them by name instead of using "*"
	      String query = "SELECT * FROM user WHERE role_id=1 ORDER BY RAND() LIMIT 1 ";

	      // create the java statement
	      Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(query);
	      
	      // iterate through the java resultset
	      while (rs.next())
	      {
	    
	        int id = rs.getInt("id");
	        String firstName = rs.getString("first_name");
	        String lastName = rs.getString("last_name");
	        String email = rs.getString("email");
	        String emailToPass="";
	        //String password = rs.getString("password_hash");
	        int roleId = rs.getInt("role_id");
	        int iend=email.indexOf('@');
	        if (iend != -1)
	        
	        emailToPass = email.substring(0, iend);
	        u= new User(email, emailToPass);
	        // print the results
	  
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
		return u;
	  }
	
}