public class Employee
{
	 public Employee(String eName, String id, int eAge, double eSalary, String eTitle, String eDept)
	 {
	 name = eName;
	 eID = id; // Poor example of naming convention
	 age = eAge;
	 salary = eSalary;
	 title = eTitle;
	 department = eDept;
	 }
	 
	 public String toString()
	 {
	 return name + ", " + eID + ", " + age + '\n' + salary + ", " + title + ", " + department;
	 }
	 
	 public void changeSalary(double newSalary)
	 {
	 salary = newSalary;
	 }
	 
	 public double getSalary()
	 {
	 return salary;
	 }
	 
	 public String getID()
	 {
	 return eID;
	 }
	 
	 public Employee getEmployee(String e_id, Employee[] e)
	 {
	 for (int i = 0; i < e.length; i++)
	 if (e_id == e[i].eID)
	 return e[i];
	 return null;
	 }
	 
	protected String name;
	protected String eID;
	protected int age;
	protected double salary;
	protected String title;
	protected String department;
}



/*
public void changeSalary(double amount)
	{
		// if its double it has to be times by percentage increased
		if(amount instanceof Integer)
			salary += amount;
		else
			salary *= (amount + 1);
			
	}
*/

















