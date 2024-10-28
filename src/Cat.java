public class Cat{

    static String species = "All cats are of species: Feline";

    public String name;
    public String color;
    protected int age;
    public static int catNum = 1;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat() {
        name = "Unknown";
        color = "Unknown";
        age= 0;
    }

    public String getColor(){
        return color;
    }

    protected void displayAnimalInfo(){
        System.out.println("Dog " + catNum + " Name: " + name + ", Color: " + color + ", Age: " + age);
        catNum += 1;
    }

    static void displaySpecies(){
        System.out.println(species);
    }

}
