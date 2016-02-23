package cn.lxl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcTest {

	/**
	 * @param args
	 */
	private static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String DB_URL = "jdbc:sqlserver://192.168.42.90:1433;DatabaseName=Test";
	private static String USER_NAME = "sa";
	private static String PASSWORD = "123";
	
	private static Connection connection= null;
	private static Statement statement = null;
	
	public JdbcTest() throws Exception{
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
	    statement = connection.createStatement();
	    System.out.println("ini finished");
	}
	public void select(String sql) throws SQLException{
		ResultSet rs = statement.executeQuery(sql);
        while(rs.next()){
        	System.out.println(rs.getString(1)+"_"+rs.getString(2)+"_"+rs.getString(3));
        }
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      	JdbcTest tester = new JdbcTest();
//		tester.select("select * from user_test");

		statement.execute("update class_test set class_name='cs1202' where teacher_id='t002'");
		
	}

}
