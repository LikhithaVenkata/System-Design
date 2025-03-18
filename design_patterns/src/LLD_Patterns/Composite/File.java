package LLD_Patterns.Composite;

public class File implements FileSystem{
	
	String fileName;
	File(String name)
	{
		this.fileName=name;
	}
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("File name is "+fileName);
	}
	
	 
}
