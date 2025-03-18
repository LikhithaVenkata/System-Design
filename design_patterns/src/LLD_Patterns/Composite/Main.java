package LLD_Patterns.Composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directory d=new Directory(" Top Management");;
		FileSystem f1=new File("Architecht");
		Directory d1=new Directory("Sub Management");
		FileSystem f2=new File("Team Leader");
		FileSystem f3=new File("Team member");
		d1.fileSystemList.add(f2);
		d1.fileSystemList.add(f3);
		d.fileSystemList.add(f1);
		d.fileSystemList.add(d1);
		d.printName();
	}

}
