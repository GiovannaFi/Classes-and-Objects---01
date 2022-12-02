public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer ();
        Programmer programmer2 = new Programmer ();

        programmer1.name="Marco";
        programmer1.age=30;
        programmer1.wearsGlasses=false;

        programmer2.name="Laura";
        programmer2.age=26;
        programmer2.wearsGlasses=true;

        programmer1.printDetails();
        programmer1.drinkCoffe();

        programmer2.printDetails();
        programmer2.hasGlasses();

    }
}
/*VERSIONE PRECEDENTE:public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer ();
        Programmer programmer2 = new Programmer ();

        programmer1.name="Marco";
        programmer1.age=30;
        programmer1.wearsGlasses=false;

        programmer2.name="Laura";
        programmer2.age=26;
        programmer2.wearsGlasses=true;

        programmer1.printDetails();
        programmer1.drinkCoffe();

        programmer2.printDetails();
        programmer2.hasGlasses();
    }*/
