package com.dts.dae.dao;
import java.sql.*;
public class DBConnection {
	
		public Connection getConnection()
		{
			
			String driver="jdbc:oracle:thin:@localhost:1521:xe";
			Connection con=null;
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection(driver,"manage","manage");
			}
			catch(Exception ex)
			{
			ex.printStackTrace();
			}
			
			return con;
		}
	

}
