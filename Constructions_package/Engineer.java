package Constructions_package;

public class Engineer {
    private int age;
    private double height;
    public Engineer(){
        age = 0;
        height = 0.00;
    }
    public Engineer(int age,double height){
        this.age = age;
        this.height = height;
    }
    public double getSize(){
        return -1;
    }
    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return "The age is: " + age + " and the height is: " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() == obj.getClass()){
            return false;
        }
        Engineer engineer = (Engineer) obj;
        if(super.equals(engineer) && this.age == engineer.age && this.height == engineer.height){
            return true;
        }
        return false;
    }
    public int hashCode() {
        int prime_number = 7;
        int hash_result = 1;
        hash_result = prime_number * hash_result + age;
        hash_result = prime_number * hash_result + (int)height;
        return hash_result;
    }
}
