package exception;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(" =>" + (1/0));
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Action faite systematiquement");
		}
	}

}
