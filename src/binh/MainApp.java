package binh;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		Person p = new Person();
		p.name = "Person 1";
		System.out.println(p.name);
		
		p.nameSchool = "HaNoi UIN";
		
		Person p2 = new Person();
		p2.name = "Person 2";
		
		p2.nameSchool = "DaNang UIN";
		
		System.out.println(p.name);
		System.out.println(p.nameSchool);
		
		System.out.println(p2.name);
		System.out.println(p2.nameSchool);
	}

}
