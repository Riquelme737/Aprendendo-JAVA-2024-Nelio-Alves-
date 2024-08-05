package Listas.Exercicio;

public class Employee_Ex01 {
    private Integer id;
    private String name;
    private Double salary;

    public Employee_Ex01() {
    }

    ;

    public Employee_Ex01(Integer Id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percetage) {
        salary += salary * percetage / 100.0;

    }
}
