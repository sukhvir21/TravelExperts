import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class Database {
	
	//private static int Agentid;
		private static Connection conn; //connection variable
		private static Statement stmt; //statement variavle
		//private static ResultSet rs;  //resultset
		private static Statement st;
		
		//Function to get the connection
		public static void connect()
		{
	        try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
		        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ictoosd","ictoosd");
		        conn.setAutoCommit(false);
		       
		     stmt = conn.createStatement();
		     
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public Boolean Update(Agent a1)
	{
		
		//Update SQL
		String sql = "UPDATE AGENTS set "
	        	+ "AGTFIRSTNAME='" + a1.getFirstName()
	        	+ "', AGTLASTNAME='" + a1.getLastName() 
	        	+ "', AGTMIDDLEINITIAL='" + a1.getMiddleInitials() 
	        	+ "', AGTBUSPHONE='" + a1.getAgtBusiness() 
	        	+ "', AGTEMAIL='" + a1.getEmail()
	        	+ "', AGTPOSITION='" + a1.getAgentPosition() 
	        	+ "', AGENCYID='" + a1.getAgencyId()
	        	+ "' WHERE AGENTID=" + a1.getAgentid();
		
		int numRows; //variable to get the updated rows
		
		try {
			connect();
			//System.out.print(sql);
			numRows = st.executeUpdate(sql); //executeupdate return the number of updated rows
			//conn.close();
			if (numRows == 0) //if nothing is updated
			{
				System.out.println("update failed");
				return false;
			}
			else
			{
				//If updated Successfull
				
				//System.out.println("updated " + numRows + " row(s)");
				JOptionPane.showMessageDialog(null, "Updated"); 
				return true;
				//JOptionPane.showMessageDialog(null, "Agent of Id " + a1.getAgentid()+" is Updated"); // Display message
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	public Boolean Update(Package p1)
	{
		
		//Update SQL
		String sql = "UPDATE PACKAGES SET "
	        	+ "PKGNAME='" + p1.getPackage_name()
	        	+ "', PKGSTARTDATE='" + p1.getPkgStartDate() 
	        	+ "', PKGENDDATE='" + p1.getPkgEndDate() 
	        	+ "', PKGDESC='" + p1.getPkgDesc() 
	        	+ "', PKGBASEPRICE='" + p1.getPkgBasePrice()
	        	+ "', PKGAGENCYCOMMISSION='"+p1.getPkgAgencyComm() 
	        	+ "' WHERE PACKAGEID=" + p1.getPackage_id();
		
		int numRows; //variable to get the updated rows
		
		try {
			connect();
			//System.out.print(sql);
			numRows = st.executeUpdate(sql); //executeupdate return the number of updated rows
			//conn.close();
			if (numRows == 0) //if nothing is updated
			{
				System.out.println("update failed");
				return false;
			}
			else
			{
				//If updated Successfull
				
				//System.out.println("updated " + numRows + " row(s)");
				JOptionPane.showMessageDialog(null, "Updated"); 
				return true;
				//JOptionPane.showMessageDialog(null, "Agent of Id " + a1.getAgentid()+" is Updated"); // Display message
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}

}
