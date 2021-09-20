package Week3Day2;

public class Desktop implements HardWare,Software {
	
	public void desktopModel()
	{
		System.out.println("desktopModel() Method");
	}
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("softwareResources() Method");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		
		System.out.println("hardwareResources() Method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop obj=new Desktop();
		obj.desktopModel();
		obj.softwareResources();
		obj.hardwareResources();

	}

	

}
