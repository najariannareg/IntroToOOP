public class B extends A
{
	public String generateInfo()
	{
		String ret = "This is class B.";
		System.out.println(ret);
		return ret;
	}
	public static void printAbout()
	{
		System.out.println("Class is B");
	}
}
