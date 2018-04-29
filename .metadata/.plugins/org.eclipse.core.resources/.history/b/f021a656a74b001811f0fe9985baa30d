package MavenProject.First;
import java.sql.*;

public class DropTable 
{
	public static void main(String[] args)throws Exception 
	{
		Connection conn = DriverManager.getConnection("jdbc:ignite:thin://127.0.0.1/");
		try (Statement stmt = conn.createStatement()) 
		{
		    stmt.execute("drop table city");
		    stmt.execute("drop table person");
		}
		System.out.println("tables dropped");
	}
}