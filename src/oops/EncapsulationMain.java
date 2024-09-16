package oops;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setAccountno(101);
		ed.setName("Utk");
		ed.setAmount(202.23);
		
		System.out.println(ed.getAccountno());
		System.out.println(ed.getName());
		System.out.println(ed.getAmount());

	}
 
}
