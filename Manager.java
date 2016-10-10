public class Manager extends Employee
{
	private double bonus;
	private String newAdd;
	private int number = 0;
	
	public Manager(String eName, String id, int eAge, double eSalary, String eTitle, String eDept)
	{
	super(eName, id, eAge, eSalary, eTitle, eDept);
	this.bonus = bonus;
	}
	
	public double getSalary() 
	{
	double baseSalary = super.getSalary();
    
	return (baseSalary+baseSalary*(bonus/100));
    }

   public void addEmployee(String empId)
   {
   newAdd = empId;
   number++;
   }
   
   public String toString() 
   {
   return super.toString()+"\n"+"Number of Direct Reports: "+ number;
   }
	
}

/*
C:\Users\jose\Desktop\JavaPrograms>java useEmployee


Steve, 00001, 29
150000.0, Chairman, acmeCorp
Number of Direct Reports: 1
Bonus Rate: 0.15


Amanda, 00002, 31
150000.0, President, acmeCorp
Number of Direct Reports: 0
Bonus Rate: 0.1


Christy, 00003, 19
45000.0, Executive Admin, acmeCorp


Kavita, 00004, 42
45000.0, Senior Manager, acmeCorp
Number of Direct Reports: 2


Megan, 00005, 26
65000.0, Engineer II, acmeCorp


Mark, 00006, 24
65000.0, Engineer I, acmeCorp
*/