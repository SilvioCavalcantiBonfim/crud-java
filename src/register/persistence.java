package register;

import java.util.ArrayList;
import java.util.List;

public class persistence extends connection{
	
	public void Include(people p) throws Exception{
		open();
		stmt = con.prepareStatement("insert into people values(?,?,?)");
		stmt.setInt(1, p.getID());
		stmt.setString(2, p.getNAME());
		stmt.setString(3, p.getEMAIL());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public void Update(people p) throws Exception{
		open();
		stmt = con.prepareStatement("update people set NAME=?, EMAIL=? where ID=?");
		stmt.setInt(3, p.getID());
		stmt.setString(1, p.getNAME());
		stmt.setString(2, p.getEMAIL());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public void Delete(people P) throws Exception{
		open();
		stmt = con.prepareStatement("delete from people where ID=?");
		stmt.setInt(1, P.getID());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public people Get(int ID) throws Exception{
		open();
		stmt = con.prepareStatement("Select * from people where ID=?");
		stmt.setInt(1, ID);
		rs = stmt.executeQuery();
		people P = null;
		if(rs.next()) {
			P = new people(rs.getInt("ID"), rs.getString("NAME"), rs.getString("EMAIL"));
		}
		close();
		return P;
	}
	public List<people> GetAll() throws Exception{
		open();
		stmt = con.prepareStatement("select * from people");
		rs = stmt.executeQuery();
		List<people> _temp = new ArrayList<>();
		while(rs.next()) {
			people P = new people(rs.getInt("ID"),rs.getString("NAME"),rs.getString("EMAIL"));
			_temp.add(P);
		}
		close();
		return _temp;
	}
}
