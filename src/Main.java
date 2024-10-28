public class Main {
    public static void main(String[] args) {
        Dog snoopy = new Dog("Snoopy", "Beagle", 72);
        Dog spike = new Dog("Spike", "Beagle", 10);

        Cat garfield = new Cat("Garfield", "Orange Tabby Persian", 43);
        Cat tardar = new Cat("Tardar", "Domestic Shorthaired", 7);

        snoopy.displayAnimalInfo();
        spike.displayAnimalInfo();
        Dog.displaySpecies();

        System.out.println(" ");

        garfield.displayAnimalInfo();
        tardar.displayAnimalInfo();
        Cat.displaySpecies();
        }

    }

