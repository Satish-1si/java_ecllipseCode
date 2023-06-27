package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class callable_statement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//choose the software
		Class.forName("com.mysql.cj.jdbc.Driver");
		//choose the connection using driverManager
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/msys","root","master#123");
		//conncetion pipe add
		String str="{call run(?,?)}";
       java.sql.CallableStatement st= con.prepareCall(str);
	  //after pass the query ==>to set the data;
       st.setInt(2, 75);st.setString(1, "satish");
      ResultSet r=st.executeQuery();
      while(r.next()) {
    	  System.out.println(r.getInt(1)+" "+r.getString(2));
      }
     
	

}
}
