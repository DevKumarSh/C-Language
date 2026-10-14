Q1

  class Demo {

    // Method 1: Display vowels first, then consonants
    void Test(String s1, String s2) {
        String s = s1 + s2;
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);

                if (lower == 'a' || lower == 'e' || lower == 'i'
                        || lower == 'o' || lower == 'u') {
                    vowels = vowels + ch;
                } else {
                    consonants = consonants + ch;
                }
            }
        }

        System.out.println("Then output will be : "
                + vowels + " " + consonants);
    }

    // Method 2: Return the sum of digits
    int Test(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        System.out.println("The passing string is : Graphic, Era");
        d.Test("Graphic", "Era");

        System.out.println();

        System.out.println("Passing string is : h12e2110 w30xgid");
        System.out.println("Output will be : " + d.Test("h12e2110 w30xgid"));
    }
}



Q3

  import java.util.Scanner;

interface PrintInfo {
    void printInfo();
}

interface PrintTax {
    void printTax();
}

class Employee {
    String name;
    int age, eid;
    double salary;

    void readonly() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Employee ID: ");
        eid = sc.nextInt();

        System.out.print("Enter Monthly Salary: ");
        salary = sc.nextDouble();
    }
}

class Result extends Employee implements PrintInfo, PrintTax {

    public void printInfo() {
        System.out.println("\nEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + eid);
        System.out.println("Monthly Salary: Rs. " + salary);
    }

    public void printTax() {
        double annualSalary = salary * 12;
        double tax = 0;

        if (annualSalary > 500000) {
            tax += (Math.min(annualSalary, 800000) - 300000) * 0.05;
        }

        if (annualSalary > 800000) {
            tax += (Math.min(annualSalary, 1200000) - 800000) * 0.08;
        }

        if (annualSalary > 1200000) {
            tax += (Math.min(annualSalary, 1500000) - 1200000) * 0.12;
        }

        if (annualSalary > 1500000) {
            tax += (annualSalary - 1500000) * 0.20;
        }

        System.out.println("Annual Salary: Rs. " + annualSalary);
        System.out.println("Annual Tax: Rs. " + tax);
    }

    public static void main(String args[]) {
        Result r = new Result();

        r.readonly();
        r.printInfo();
        r.printTax();
    }
}




