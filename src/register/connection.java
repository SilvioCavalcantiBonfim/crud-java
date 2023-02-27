package register;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connection {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	CallableStatement call;
	public void open() throws Exception{
		String url = "jdbc:postgresql://localhost:5432/registers";
		String usr = "postgres";
		String pwd = "";
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,usr,pwd);
		} catch (SQLException | ClassNotFoundException ex) {
			// TODO: handle exception
			System.out.println("Erro ao conectar com o banco de dados.");
		}
	}
	public void close() throws Exception{
		con.close();
	}
}
