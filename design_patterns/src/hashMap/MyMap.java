package hashMap;

public class MyMap {

	public static void main(String[] args) {
		OurMap<Integer,String> m=new OurMap<>();
		m.put(1,"Likki");
		m.put(2,"Bharath");
		m.put(3,"Jyo");
		m.put(4,"Seetha");
		m.remove(2);
		System.out.println(m.get(2));
	}

}

