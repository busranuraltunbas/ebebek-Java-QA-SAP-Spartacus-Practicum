public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name,double salary,int workHours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours =  workHours;
        this.hireYear = hireYear;

    }

    public String getName(){
        return name;
    }

    public void setName(String empName){
        name = empName;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double empSalary){
        salary = empSalary;
    }
    public int getWorkHours(){
        return workHours;
    }
    public void setWorkHours(int empWorkHours){
        workHours = empWorkHours;
    }

    public int getHireYear(){
        return hireYear;
    }
    public void setHireYear(int empHireYear){
        hireYear = empHireYear;
    }

    //Maasa uygulanan vergiyi hesaplar.
    public double tax(){
        double calTax=0.0;

        if (getSalary() > 1000)
            calTax = getSalary() * 0.03;

        return calTax;
    }

    public double bonus(){
        double calBonus=0.0;
        int constHour = 40;
        if (workHours > 40)
            calBonus = (workHours-constHour) * 30;
        return calBonus;
    }

    public double raiseSalary(){
        double calRaise=0.0;
        int constYear = 2021;
        if (constYear - getHireYear() <=  9)
            calRaise = getSalary() * 0.05 ;
        else if(constYear - getHireYear() > 9 && constYear - getHireYear() < 20)
            calRaise = getSalary() * 0.1 ;
        else if (constYear - getHireYear() > 19)
            calRaise = getSalary() * 0.15 ;
        return  calRaise;
    }

    @Override
    public String toString(){

        return "Adı : " + getName() + "\n" +
                "Maaşı : " + getSalary() + " TL" + "\n" +
                "Çalışma Saati : " + getWorkHours() + " Saat" + "\n" +
                "Başlangıç Yılı : " + getHireYear()  + "\n" +
                "Vergi : " + tax() + " TL" + "\n" +
                "Bonus : " + bonus() + " TL" + "\n" +
                "Maaş Artışı : " + raiseSalary() + " TL" + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " +  (getSalary() + bonus() - tax()) + " TL" + "\n" +
                "Toplam Maaş : " + (getSalary() + bonus() - tax() + raiseSalary()) + " TL";
    }
}
