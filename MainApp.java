/* 
 * Program To Calculate The Employee Bonus
 * Author: Thuku Josphat Wamwago
 * Reg No: CT101/G/19448/23
 * Date: 3/2/2025
 * Version: 1
 */

//importing the scanner input class
import java.util.Scanner;

//Declaring Employee class
class Employee {
    String name;
    double salary;

    Employee (String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    //method to display  Employee details
    void displayDetails(){
        System.out.println("Employee: " + this.name );
        System.out.println("Salary: " + this.salary );

    }
    }
    //start of the salary calculator class
    class SalaryCalculator{
        double salary;

        //salary constructor
        SalaryCalculator(double salary){
            this.salary = salary;
        }
        // bonus calculation
        double calculateBonus(){
            return this.salary  * 0.1;
        }

    }
public class MainApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //input of name from user
        System.out.print("Enter Employee's Name: ");
        String name = scanner.nextLine();

        //input of salary from user
        System.out.print("Enter The Salary: ");
        double salary = scanner.nextDouble();

        //Employee object
        Employee employee = new Employee(name, salary);
        //SalaryCalculator object
        SalaryCalculator calc = new SalaryCalculator(salary);

        //calling of the method that will output the employee details
        employee.displayDetails();

        //the variable bonus takes the return ftom the bonus calculations
        double bonus = calc.calculateBonus();

        //output of the bonus
        System.out.println("Bonus: " + bonus);


    }
}
