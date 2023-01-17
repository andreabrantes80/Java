
package entities;

/**
 *
 * @author user
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
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

    @Override
    public int compareTo(Employee other) {
        //odernar os funcionarios por salário
        //return  salary.compareTo(other.getSalary());
        
        //odernar os funcionarios por salário em salarios decrescentes é só colocar o -
        //return - salary.compareTo(other.getSalary());
        
        //ordenar por nome em ordem alfabética
        return  name.compareTo(other.getName());
    }
    
    
}
