class Person {
    // A member variable. Every Person object gets its own copy.
    String name;

    // The constructor runs when you write "new Person(...)".
    Person(String name) { this.name = name; }

    void printName() { System.out.println("Hello, my name is " + name); }



    public static void main(String[] args) {
        // "new" creates an object (an "instance") from the Person class.
        // Create two Person objects with weird names.
        Person dude = new Person("Dude");
        Person sweet = new Person("Sweet");

        // Each object has its own name.
        dude.printName();
        sweet.printName();

        // Now we're creating an array (like a list) of 3 Person
        Person[] peeps = new Person[3];

        // To access each Person slot in peeps, we use [<number>] format.
        peeps[0] = new Person("LeBron");
        peeps[1] = new Person("Messi");
        peeps[2] = new Person("The Goat");

        // Now we will call printName() for all the Persons in peeps
        for (Person peep: peeps) {
            peep.printName();
        }
    }
}