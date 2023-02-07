package com.techpalle;

import java.sql.*;

public class A 
{

	public void creating()
	{
		Connection con=null;
		Statement s=null;
		try
		{

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","MithunKichu");
		
		s=con.createStatement();
		
		s.executeUpdate("create table emp(ename varchar(30),esal int)");
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void inserting(String name ,int salary)
	{
		try
		{
		Connection con=null;
		
		PreparedStatement ps=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","MithunKichu");
		
		ps=con.prepareStatement("insert into emp values(?,?)");
		ps.setString(1, name);
		ps.setInt(2, salary);
		ps.executeUpdate();
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
