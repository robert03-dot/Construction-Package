package Constructions_package;

public class Workers extends Engineer{
    private String tool_1;
    private String tool_2;
    private String tool_3;
    private String name_1;
    private String name_2;
    private String name_3;
    private double salary_1;
    private double salary_2;
    private double salary_3;
    public Workers(String tool_1,String tool_2,String tool_3,String name_1,String name_2,String name_3,double salary_1,
                   double salary_2,double salary_3){
        this.tool_1 = tool_1;
        this.tool_2 = tool_2;
        this.tool_3 = tool_3;
        this.name_1 = name_1;
        this.name_2 = name_2;
        this.name_3 = name_3;
        this.salary_1 = salary_1;
        this.salary_2 = salary_2;
        this.salary_3 = salary_3;
    }

    public Workers(int age, double height, String name_1) {
        super(age, height);
        this.name_1 = name_1;
    }

    public Workers(int age,String name_2) {
        this.name_2 = name_2;
    }

    public Workers(String name_3) {
        this.name_3 = name_3;
    }

    public Workers(int age, double height, double salary_1) {
        super(age, height);
        this.salary_1 = salary_1;
    }

    public Workers(int age,double salary_2) {
        this.salary_2 = salary_2;
    }

    public Workers(double salary_3) {
        this.salary_3 = salary_3;
    }

    public void displayWorkersTools(){
        System.out.println("The first tool is: " + tool_1);
        System.out.println("The second tool is: " + tool_2);
        System.out.println("The third tool is: " + tool_3);
        System.out.println("The first name is: " + name_1);
        System.out.println("The second name is: " + name_2);
        System.out.println("The third name is: " + name_3);
        System.out.println("The first salary is: " + salary_1);
        System.out.println("The second salary is: " + salary_2);
        System.out.println("The third salary is: " + salary_3);
    }
    public double getSize(){
        double average_salary;
        average_salary = (salary_1 + salary_2 + salary_3)/3;
        return average_salary;
    }

    @Override
    public String toString() {
        return "The first worker,his salary and his tool: " + name_1 + salary_1 + tool_1 + ".The second worker,his salary and his tool: " +
                name_2 + salary_2 + tool_2 + ".The third worker,his salary and his tool: " + name_3 + salary_3 + tool_3;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Workers workers = (Workers) obj;
        if(super.equals(workers) && this.salary_1 == workers.salary_1 && this.salary_2 == workers.salary_2 && this.salary_3 == workers.salary_3){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        double prime_number = 13.0;
        double hash_result = super.hashCode();
        hash_result = prime_number * hash_result + salary_1;
        hash_result = prime_number * hash_result + salary_2;
        hash_result = prime_number * hash_result + salary_3;
        return (int) hash_result;
    }
}