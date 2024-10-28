public class Dog {

    static  String species = "All dogs are of species: Canine";

    public String name;
    private String breed;
    protected int age;
    public static int dogNum = 1;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog() {
        name = "Unknown";
        breed = "Unknown";
        age= 0;
    }

    public String getBreed(){
        return breed;
    }

    protected void displayAnimalInfo(){
        System.out.println("Dog " + dogNum + " Name: " + name + ", Breed: " + breed + ", Age: " + age);
        dogNum += 1;
    }

    static void displaySpecies(){
        System.out.println(species);
    }

}
