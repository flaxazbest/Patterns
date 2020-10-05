package zsolid.is.demo;

public class Application {

    public static void main(String[] args) {

        SomeClass.y = 8;
        System.out.println(SomeClass.y);
        SomeClass.y = 9;
        System.out.println(SomeClass.y);

        SomeClass sc1 = new SomeClass();
        SomeClass sc2 = new SomeClass();
        sc1.x = 5;
        sc2.x = 23;
        System.out.println(sc1.x);
        System.out.println(sc2.x);
        sc1.y = 10;
        sc2.y = 45;
        System.out.println(sc1.y);
        System.out.println(sc2.y);
        System.out.println(SomeClass.y);

    }

}
