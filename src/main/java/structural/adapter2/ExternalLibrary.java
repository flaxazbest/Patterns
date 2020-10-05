package structural.adapter2;

public class ExternalLibrary implements ExternalLibraryAPI {

    @Override
    public void superMethod(int x , int y, int z, int t) {
        System.out.println("x: " + x + " y: " + y + " z: " + z + " time:" + t);
    }

}
