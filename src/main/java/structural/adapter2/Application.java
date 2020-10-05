package structural.adapter2;

public class Application {

    public static void main(String[] args) {

        AdapterForExternalLibrary adapter = new AdapterForExternalLibrary();

        adapter.render(3,4);
        adapter.render(4,4);
        adapter.render(2,4);
        adapter.render(3,5);
        adapter.render(1,0);

    }

}
