package zsolid.is;

import zsolid.is.separatedI.Something;
import zsolid.is.separatedI.SomethingElse;
import zsolid.is.separatedI.StringReturner;

public class GodClass implements Something, SomethingElse, StringReturner {
    @Override
    public void doSomething() {
        System.out.println("Real 1");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Real 2");
    }

    @Override
    public void doSomethingMore() {
        System.out.println("Real 3");
    }

    @Override
    public String getString() {
        return "Real String";
    }
}
