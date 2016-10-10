public class Executive extends Manager
{
	 public Executive(String eName, String id, int eAge, double eSalary, String eTitle, String eDept, double eBonusRate)
	 {
	 super(eName, id, eAge, eSalary, eTitle, eDept);
	 bonusRate = eBonusRate;
	 }
	 
	 public String toString()
	 {
	 return super.toString() + "\nBonus Rate: " + bonusRate;
	 }
	 
	 public double getSalary()
	 {
	 return super.getSalary()*(1+bonusRate);
	 }
	 
	 public void setBonus(double newBonusRate)
	 {
	 bonusRate = newBonusRate;
	 }
	 
	private double bonusRate;
}