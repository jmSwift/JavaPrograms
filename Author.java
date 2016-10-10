public class Author
{
	private static String name;
	private String email;
	private static char gender;
	
	public Author(String name, String email, char gender)
	{
	this.name = name;
	this.email = email;
	this.gender = gender;
	}
	
	public static String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public static char getGender()
	{
		return gender;
	}
	
	public String toString()
	{
		return name + " " + email + " " + gender;
        }
        
	public static void main(String[] args)
	{
	
		Author jose = new Author("jose", "beastie805@yahoo.com",'m');
		
		jose.setEmail("jmeza63@toromail.csudh.edu");
		
		String info = jose.toString();
		
		System.out.println(info);
		
		
		
	
	}
}