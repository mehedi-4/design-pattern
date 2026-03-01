class Address{
    String add = "Dhaka";
}

class Employee implements Cloneable{
    public String name;
    public String dept;
    public Address add;

    public Employee(String name, String dept, Address add){
        this.name = name;
        this.dept = dept;
        this.add = add;
    }

    public void info(){
        System.out.println(name);
        System.out.println(dept);
        System.out.println(add.add);
    }

    // protected Object clone() throws CloneNotSupportedException{
    //      return super.clone(); 
    // }

    protected Object clone() throws CloneNotSupportedException{
        Employee clone = (Employee) super.clone();
        Address addr = new Address();
        clone.add = addr;
        return clone;
    }
}
public class ProtoypeDemo {
   public static void main(String[] args) throws CloneNotSupportedException {
        Address add = new Address();
        Employee e1 = new Employee("gandu", "pasa", add);
        Employee e2 = (Employee) e1.clone();

        e2.name="gand";
        e2.add.add = "sylhet";

        e1.info();
        e2.info();
   }
}
