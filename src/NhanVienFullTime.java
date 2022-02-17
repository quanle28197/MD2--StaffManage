public class NhanVienFullTime extends NhanVien {
    private int Bonus;
    private int Fine;
    private int Salary;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String codeNV, String name, int phone, String email, int bonus, int fine, int salary) {
        super(codeNV, name, phone, email);
        this.Bonus = Bonus;
        Fine = fine;
        Salary = salary;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        this.Bonus = bonus;
    }

    public int getFine() {
        return Fine;
    }

    public void setFine(int fine) {
        Fine = fine;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "Bonus = " + Bonus +
                ", Fine =" + Fine +
                ", Salary =" + Salary +
                "} " + super.toString();
    }
    public int luongFullTime() {
        return Salary + (Bonus - Fine);
    }


}
