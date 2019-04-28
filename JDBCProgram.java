import java.sql.*;
class JDBCProgram{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			// We are using mysql Driver to connect with our database.
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			//here mydb is Database name.
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM ids");
			while(rs.next()){
				System.out.println("Id: " + rs.getInt(1));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}