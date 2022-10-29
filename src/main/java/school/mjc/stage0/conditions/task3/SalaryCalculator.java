package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double afterTax;
        if(salary<=0){
            System.out.println("wrong input!");
        }else if(salary<=10000){
            afterTax=salary-salary*15/100;
            System.out.println(afterTax);
        }else if(10000<=salary && salary<=20000){
            afterTax=salary-salary*18/100;
            System.out.println(afterTax);
        }else if(salary>20000){
            afterTax=salary-salary*20/100;
            System.out.println(afterTax);
        }
    }
}
