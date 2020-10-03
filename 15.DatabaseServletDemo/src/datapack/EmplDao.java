package datapack;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;

public class EmplDao 
{
	static List<Employee> list;
	static Connection con;
	
	public static Connection getConnection() 
	{
		
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");//loading the driver class
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empbd1","root","root");
		   }
		catch(ClassNotFoundException e )
		{
			System.out.println(e);;
		}
		catch(SQLException| NullPointerException e )
		{
			e.printStackTrace();
	    }
		return con;
	}
	public static int save(Employee e1)
	{
		int status=0;	
		
		Connection con=EmplDao.getConnection();
		try 
		{
			PreparedStatement ps=con.prepareStatement("insert into empreg(ename,epassword,email,ecountry)values(?,?,?,?)");
			ps.setString(1,e1.getEname());
			ps.setString(2,e1.getEpassword());
			ps.setString(3,e1.getEmail());
			ps.setString(4,e1.getEcountry());
			
			status=ps.executeUpdate();
			con.close();
		} 
		catch (SQLException|NullPointerException e2) 
		{
			e2.printStackTrace();
		}
		return status;
	    }
	
	    public static List<Employee> getAllEmployees()
	    {
	    	list = new ArrayList<Employee>();
	    
	    	con=EmplDao.getConnection();
	    	
	    	try{
	    		PreparedStatement ps=con.prepareStatement("select * from empreg");
	    		java.sql.ResultSet rs=ps.executeQuery();
	    		
	    		while(rs.next()){
	    			Employee e=new Employee();
	    			e.setId(rs.getInt(1));
	    			e.setEname(rs.getString(2));
	    			e.setEpassword(rs.getString(3));
	    			e.setEcountry(rs.getString(4));
	    			list.add(e);
	    		}
	    	}
	    	catch(SQLException e)
	    	{
	    			e.printStackTrace();
	        }
	    	return list;
	    }
	    public static Employee getOneEmployee(int id) throws ClassNotFoundException
	    {
	    	Employee eone=new Employee();
	    	
	    	Connection con=null;
	    	
	    	con=EmplDao.getConnection();
	    	
	    	try {
				PreparedStatement ps3=con.prepareStatement("select * from empreg where id= ? ");
				
				ps3.setInt(1,id);
				
				java.sql.ResultSet rs=ps3.executeQuery();
				
				while(rs.next()){
					eone.setId(rs.getInt(1));
					eone.setEname(rs.getString("ename"));
					eone.setEpassword(rs.getString("epassword"));
					eone.setEmail(rs.getString("email"));
					eone.setEcountry(rs.getString("ecountry"));
				}
			} 
	    	catch (SQLException e)
	    	{
				
				e.printStackTrace();
			}
			return eone;
	    }
	    
	    public static int updateEmployee(Employee em) throws ClassNotFoundException
	    {
	    	int status=0;
	    	con=EmplDao.getConnection();
	    	try{
	    		PreparedStatement pu=con.prepareStatement("update empreg set ename=?,epassword=? email=? ecountry=? where id=?");
	    		pu.setString(1, em.getEname());
	    		pu.setString(2, em.getEpassword());
	    		pu.setString(3, em.getEmail());
	    		pu.setString(3, em.getEcountry());
	    		pu.setInt(5, em.getId());
	    		status=pu.executeUpdate();
	    		con.close();
	    		}
	    	   catch(SQLException e)
	    	{
	    		   e.printStackTrace();
	    	}
			return status;
	    	
	     }
	    public static int DeleteEmployee(int id)throws ClassNotFoundException
	    {
	    	int status=0;
	    	con=EmplDao.getConnection();
	    	try{
	    		PreparedStatement pd=con.prepareStatement("delete from empreg where id=?");
	    		pd.setInt(1, id);
	    		status=pd.executeUpdate();
	    	}
	    	catch(SQLException e){
	    		e.printStackTrace();
	    	}
	    	return status;
	    }
    }
	
