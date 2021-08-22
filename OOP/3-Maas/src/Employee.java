public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        double tax;
        if (salary < 1000){
            tax = 0;
            return tax;
        }else {
            tax = salary * 0.03;
            salary -= tax;
            return tax;
        }
    }

    public double bonus(int workHours){
        if (workHours > 40){
            return (workHours-40)*30;
        }else{
            return 0;
        }
    }

    public double raiseSalary(int hireYear){
        double zam;
        int year = 2021 -hireYear;
        if(year<10){
            zam = salary * 0.5;
            return zam;
        }else if (year>=10 && year<20){
            zam = salary * 0.10;
            return zam;
        }
        else {
            zam = salary * 0.15;
            return zam;
        }
    }

    public void printDetail(){
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " +salary);
        System.out.println("Çalışma saati : " + workHours);
        System.out.println("Başlangıç yılı : " + hireYear);
        System.out.println("Vergi : " + tax(salary));
        System.out.println("Bonus : " +bonus(workHours));
        System.out.println("Maaş artışı : " + raiseSalary(hireYear));
        System.out.println("Vergi ve bonuslar ile maaş : " +(salary-tax(salary)+bonus(workHours)));
        System.out.println("Toplam maaş : " + (salary-tax(salary)+bonus(workHours)+raiseSalary(hireYear)));
    }
}
