package register;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persistence db = new persistence();
		people P1 = new people(0,"pessoa 1", "email@email.com");
		people P2 = new people(1,"pessoa 2", "email2@email.com");
		try {
//			db.Include(P1);
//			db.Include(P2);
//			P2.setNAME("Novo Nome Pessoa");
//			db.Update(P2);
			System.out.println(db.GetAll());
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			
		}
	}

}
