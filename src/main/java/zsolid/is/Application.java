package zsolid.is;

import zsolid.is.separatedI.Something;

public class Application {

    public static void main(String[] args) {

        GodClass gc = new GodClass();
        gc.doSomethingElse();


        Something sg = new SmallGod();
        sg.doSomething();
        sg.doSomething();
        sg.doSomething();
        //
//        System.out.println(sg.getString().length());


    }

}
