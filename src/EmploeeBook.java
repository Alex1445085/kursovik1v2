import java.util.Objects;

public class EmploeeBook {

    private String emploee;
    private String department;
    private double salary;
    private static int count = 0;
    private int id = 0;


    public EmploeeBook(String emploee, String department, int salary) {
        this.emploee = emploee;
        this.department = department;
        this.salary = salary;
        this.id = count;
        this.count++;
    }

    public String getEmploee() {
        return emploee;
    }
    public String getDepartment() {
        return this.department;
    }
    public double getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
    public void setDepartment(String departmentNumber) {
        this.department = departmentNumber;
    }
    public void setSalary(int salaryNew) {
        this.salary = salaryNew;
    }

    @Override
    public String toString() {
        return "Сотрудник - " + this.emploee + "' отдел - " + this.department + ", зарплата - "+ this.salary;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return (this.emploee.equals(((EmploeeBook) obj).getEmploee()) &&
                this.department.equals(((EmploeeBook) obj).getDepartment()) &&
                this.salary == ((EmploeeBook) obj).getSalary());

    }
    @Override
    public int hashCode() {
        return Objects.hash(emploee, department, salary);
    }
}