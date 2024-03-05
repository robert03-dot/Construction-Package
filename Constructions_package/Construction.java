package Constructions_package;

public class Construction extends Engineer {
    private int surface;
    private int perimeter;

    public Construction(int surface,int perimeter){
        this.surface = surface;
        this.perimeter = perimeter;
    }

    public Construction(int age, double height, int perimeter) {
        super(age, height);
        this.perimeter = perimeter;
    }
    public void displayConstruction(){
        System.out.println("The surface is: " + surface);
        System.out.println("The perimeter is: " + perimeter);
    }
    public double getSize(){
        double division_between_surface_and_perimeter;
        division_between_surface_and_perimeter = surface/(double)perimeter;
        return division_between_surface_and_perimeter;
    }

    @Override
    public String toString() {
        return "The surface is: " + surface + ".The perimeter is: " + perimeter;
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
        Construction construction = (Construction) obj;
        if(super.equals(construction) && this.surface == construction.surface && this.perimeter == construction.surface){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        double prime_number = 19.0;
        double hash_result = super.hashCode();
        hash_result = prime_number * hash_result + surface;
        hash_result = prime_number * hash_result + perimeter;
        return (int) hash_result;
    }

}
