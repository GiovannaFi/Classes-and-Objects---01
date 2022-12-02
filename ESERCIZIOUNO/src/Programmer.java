public class Programmer {
    public String name;
    public int age;
    public boolean wearsGlasses;


    public void drinkCoffe() {
        System.out.println("Espresso is the secret!");
    }

    public void printDetails() {
        System.out.println(name + " is a " + age + "-yo programmer");
    }

    public void hasGlasses() {
        System.out.println("Is " + name + " wearing glasses? " + wearsGlasses);


    }

}

/* VERSIONE PRECEDENTE:

public class Programmer {
    public String name;
    public int age;
    public boolean wearsGlasses;

    Programmer() {
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;

    }

    public void drinkCoffe() {
        System.out.println("Espresso is the secret!");
    }

    public void printDetails() {
        System.out.println(this.name + " is a " + this.age + "-yo programmer");
    }

    public void hasGlasses() {
        System.out.println("Is " + this.name + " wearing glasses? " + this.wearsGlasses);


    }

}
 */