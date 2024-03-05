package Constructions_package;

public class Constructions_testing {
    public static void main(String[] args) {
        Workers workers = new Workers("Pickaxe","Hammer","Rig","John",
                "George","Paul",500,450.00,550.00);
        Construction construction = new Construction(500,900);
        System.out.println(construction);
        System.out.println(workers);
        System.out.println(construction.getSize());
        System.out.println(workers.getSize());
    }
}