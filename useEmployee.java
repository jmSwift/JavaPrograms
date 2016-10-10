public class useEmployee
{
 public static void main(String[] args)
 {
	 Employee[] acmeEmployees = new Employee[100];

	 acmeEmployees[0] = new Executive("Steve", "00001", 29, 150000.00, "Chairman", "acmeCorp", 0.15);
	 acmeEmployees[1] = new Executive("Amanda", "00002", 31, 150000.00, "President", "acmeCorp", 0.10);

	 acmeEmployees[2] = new Employee("Christy", "00003", 19, 45000.00, "Executive Admin", "acmeCorp");
	 acmeEmployees[3] = new Manager("Kavita", "00004", 42, 45000.00, "Senior Manager", "acmeCorp");
	 acmeEmployees[4] = new Employee("Megan", "00005", 26, 65000.00, "Engineer II", "acmeCorp");
	 acmeEmployees[5] = new Employee("Mark", "00006", 24, 65000.00, "Engineer I", "acmeCorp");
	 ((Manager)acmeEmployees[0]).addEmployee("00003"); // why is the cast necessary?
	 ((Manager)acmeEmployees[3]).addEmployee("00005"); // why is the cast necessary?
	 ((Manager)acmeEmployees[3]).addEmployee("00006"); // why is the cast necessary?
	 // There has to be a better way! How?
	 System.out.println("\n\n" + acmeEmployees[0]);
	 System.out.println("\n\n" + acmeEmployees[1]);
	 System.out.println("\n\n" + acmeEmployees[2]);
	 System.out.println("\n\n" + acmeEmployees[3]);
	 System.out.println("\n\n" + acmeEmployees[4]);
	 System.out.println("\n\n" + acmeEmployees[5]);
 }
}