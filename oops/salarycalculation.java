public class salarycalculation {
    String name;
    int baseSalary;
    int bonus;

    int calculateNetSalary(){
        return baseSalary+bonus;
    }

    void displayDetails(){
        System.out.println("Name is: "+name);
        System.out.println("Base Salary is: "+baseSalary);
        System.out.println("Bonus is: "+bonus);
    }

    public static void main(String[] args) {
        salarycalculation s1 = new salarycalculation();
        s1.name = "ansh";
        s1.baseSalary = 25000;
        s1.bonus = 2000;
        int total = s1.calculateNetSalary();
        System.out.println("Total Salary is: "+ total);
        s1.displayDetails();
    }
}
