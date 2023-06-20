import java.util.Objects;

public class Employee implements Comparable<Employee>{


    private Double salary;
    private String name ;
    private boolean isFullTime;

    public Employee(double salary, String name, boolean isFullTime) {
        this.salary = salary;
        this.name = name;
        this.isFullTime = isFullTime;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    @Override
    public String toString() {
        return
                "salary=" + salary +
                ", name='" + name ;
    }

    @Override
    public int compareTo(Employee o) {
      return this.getName().length() - o.getName().length();

       }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return isFullTime == employee.isFullTime && Objects.equals(salary, employee.salary) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name, isFullTime);
    }
}
