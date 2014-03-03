
/*Using JDBC for interaction of*/ 

package com.rms.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class Login  {

	private String uString;	
	private String pString;
	
	public Login(String username, String password) {
		
		this.pString = password;
		this.uString = username;
	}

	public String validate()  {
		
		int a [][][];
		a = new int [1][][];
		a[0] = new int [1][];
		a[0][0] = new int [0];
		
		try {
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection("jdbc:odbc:Rent");
			
			if(conn != null) System.out.println("database created by jdbc ");
			
			PreparedStatement ps = conn.prepareStatement("select ID from credentials where username = ? and password = ? ");
			
			ps.setString(1, uString);
			ps.setString(2, pString);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
				return rs.getString(1);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "error";
	}

}