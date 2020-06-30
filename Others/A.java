public class A
{
	public void printInfo()
	{
		printAbout();
		String info = generateInfo();
		System.out.println("The generated info is: " + info);
	}
	public String generateInfo()
	{
		String ret = "This is class A.";
		System.out.println(ret);
		return ret;
	}
	public static void printAbout()
	{
		System.out.println("Class is A");
	}
}