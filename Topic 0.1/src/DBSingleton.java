import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

	private static Connection con = null;
	
		public static Connection getConnection(){
			
			try {
					if ( con == null || con.isClosed() )
					{
						String host = "jdbc:mysql://localhost:3306/Products";
						String user = "root";
						String pass = "root";
					
						con = DriverManager.getConnection( host, user, pass );
					
					}
			}catch ( SQLException e )
				{
					System.out.println( e.getMessage() );
				}
			return con;
			}
			
			public static void main ( String[] args)
			{
				Connection con = DBSingleton.getConnection();
			}
}