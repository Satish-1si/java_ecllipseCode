package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class db_connection {
	 static int a=10;
         void pass() {
        	System.out.println(a);  
          }

	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		//choose the driver software
		String choose_connection="com.mysql.cj.jdbc.Driver";
		Class.forName(choose_connection);

		//select the connection
		String url="jdbc:mysql://localhost:3306/msys";
		String password="master#123";
		String username="root";
		Connection con=DriverManager.getConnection(url, username, password);
		
		//choose the insert data
		String str="insert into reg (sno_,name_,id_,salart_)  values (?,?,?,?)";
		//create the preparestatement using:-//add the 
		PreparedStatement  pre_st=con.prepareStatement(str);
		//using scanner class ===>dynamically add the data 
    	Scanner sc=new Scanner(System.in);
    	String close="yes";
    	while (true) {
    		System.out.println("please enter the data:[yes/No]");
     		close=sc.next();
    		if(close.equalsIgnoreCase("no")) {
    			  System.out.println("************thank you close the window************".toUpperCase());
    			   break;
    		}
    		else {
        		System.out.println("please enter the sno");
    			int sno=sc.nextInt();
    			pre_st.setInt(1,sno);
        		System.out.println("please enter the name");
        		String name=sc.next(); 
        		pre_st.setString(2, name);
        		System.out.println("please enter the employee_id");
        		int emp=sc.nextInt();
        		pre_st.setInt(3,emp );
        		System.out.println("please enter the salary");
        		int salary=sc.nextInt();
        		pre_st.setLong(4,salary);
        		pre_st.executeUpdate();
        		System.out.println("========================================================");
        		System.out.println(String.format("sno:%d\nname:%s\nemp:%d\nsalary:%d", sno,name,emp,salary));
          		System.out.println("=========================================================");
       
    		}
    		int r1=pre_st.executeUpdate("delete from reg where salart_<'400000' ");
    		ResultSet r=pre_st.executeQuery("select * from reg  ");
    		while (r.next()) {
    			System.out.println(String.format("sno:%d\nname :%s\nregister-no:%d\nsalary:%d\n=========================", r.getInt("sno_"),r.getString(2),r.getInt(1),r.getLong("salart_")));
    		}
    	}
    	
		
		
	
		
	}




}
