package LLD_Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
	
	List<FileSystem> fileSystemList; 
	String directoryName;
	Directory(String name)
	{
		this.directoryName=name;
		fileSystemList=new ArrayList<>();
	}
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("Directory name is "+directoryName);
		for(FileSystem fileSystemObj: fileSystemList)
		{
			fileSystemObj.printName();
		}
	}
	
}
