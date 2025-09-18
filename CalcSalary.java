// Employee Class
abstract class Employee {
    protected String name;
    //SSN: Social Security Number.
    protected int SSN;

    //Constructors
    public Employee () {
        name = "Ahmed";
        SSN = 123456789;
    }
    public Employee (String name, int SSN) {
        this.name = name;
        this.SSN = SSN;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
    //An abstract class that will be implemented in all subclasses.
    public abstract double Earning();
}


// An interface to prompt the user to make these two methods
interface Displayable {
    String CompanyName = "Amazon";
    String fax = "+20 2 1234 5678";

    public void displayAllDetails();
    public void displayEarning();
}


class SalariedEmployee extends Employee implements Displayable{
    double salary;
    double bonus;
    double deduction;

    public SalariedEmployee() {
        salary = 7000;
        bonus = 1000;
        deduction = 300;
    }
    //A Constructor that inherits this class's initial values  as well as the superclass parameters.
    public SalariedEmployee (String name, int SSN, double salary, double bonus, double deduction) {
        super(name, SSN);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }


    // These are some abstract methods implemented from the (Displayable) interface.
    @Override
    public void displayAllDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("SSN: " + super.SSN);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
    }

    @Override
    public double Earning() {
        return salary + bonus - deduction;
    }

    @Override
    public void displayEarning() {
        System.out.println("Earning: " + Earning());
    }


    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}


class HourlyEmployee extends Employee implements Displayable{

    double hourRate;
    int numberOfHours;

    public HourlyEmployee () {
        hourRate = 90;
        numberOfHours = 30;
    }
    public HourlyEmployee(String name, int SSN, double hourRate, int numberOfHours) {
        super(name, SSN);
        this.hourRate = hourRate;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public void displayAllDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("SSN: "+ super.SSN);
        System.out.println("Hour rate: " + hourRate);
        System.out.println("Number OF Hours: " + numberOfHours);
    }

    @Override
    public double Earning() {
        return hourRate * numberOfHours;
    }

    @Override
    public void displayEarning() {
        System.out.println("Earning: " + Earning());
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }
}


class CommissionEmployee extends Employee implements Displayable {

    double Gross_Sales;
    double commissionRate;

    public CommissionEmployee () {
        Gross_Sales = 4000;
        commissionRate = 0.14;
    }

    public CommissionEmployee (String name, int SSN, double Gross_Sales, double commissionRate) {
        super(name, SSN);
        this.Gross_Sales =Gross_Sales ;
        this.commissionRate = commissionRate;
    }

    public void setGross_Sales(double gross_Sales) {
        Gross_Sales = gross_Sales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    // Earnings=Gross_Sales×CommissionRate
    public double Earning() {
        return Gross_Sales * commissionRate;
    }

    public void displayAllDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("SSN: "+ super.SSN);
        System.out.println("Gross Sales: " + Gross_Sales);
        System.out.println("Commission: " + commissionRate);
    }
    public void displayEarning() {
        System.out.println("Earning: " + Earning());
    }
}

//This class extends the CommissionEmployee class.

class BasePlusCommissionEmployee extends CommissionEmployee {

    double base;

    public BasePlusCommissionEmployee () {
        base = 3000;
    }

    public BasePlusCommissionEmployee (String name, int SSN, double Gross_Sales, double commissionRate, double base) {
        super(name, SSN, Gross_Sales, commissionRate);
        this.base = 3000;
    }

    @Override
    public void displayAllDetails() {
        System.out.println("Name: " + super.name);
        System.out.println("SSN: "+ super.SSN);
        System.out.println("Gross Sales: " + super.Gross_Sales);
        System.out.println("Commission: " + super.commissionRate);
        System.out.println("Base: " + base);
    }

    @Override
    public void displayEarning() {
        System.out.println("Earning: " + Earning() + base);
    }

    public void base(double base) {
        this.base = base;
    }
}

// A demo for how to use the previous classes: 
public class Main {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Abdullah", 2323423, 3242, 0.15);

        System.out.println("CommissionEmployee Info: ");
        commissionEmployee.displayAllDetails();
        commissionEmployee.displayEarning();

        //To print a new line and make the output readable.
        System.out.println();

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Sayed", 2321232, 5000, 0.50, 4000);

        System.out.println("BasePlusCommissionEmployee Info: ");
        basePlusCommissionEmployee.displayAllDetails();
        basePlusCommissionEmployee.displayEarning();

        System.out.println();


        SalariedEmployee salariedEmployee = new SalariedEmployee("Sara", 54646456, 10000,3000,700);

        System.out.println("Salaried Employee Info: ");
        salariedEmployee.displayAllDetails();
        salariedEmployee.displayEarning();

        System.out.println();

        System.out.println("Hourly Employee info: ");
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Rawan", 223242, 100,40);
        hourlyEmployee.displayAllDetails();
        hourlyEmployee.displayEarning();

        System.out.println();

    }
}
