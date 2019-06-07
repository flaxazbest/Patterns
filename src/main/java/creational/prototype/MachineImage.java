package creational.prototype;

public class    MachineImage implements Cloneable {
    StringBuilder image;

    public MachineImage(String os, String antivirusSW) {
        image = new StringBuilder();
        image.append(os)
             .append(" + " + antivirusSW);
    }

    private MachineImage(String sw) {
        image = new StringBuilder(sw);
    }

    public void install(String sw) {
        image.append(" + " + sw);
    }

    public void printSW() {
        System.out.println("\t" + image);
    }

    @Override
    public MachineImage clone()
    throws CloneNotSupportedException {
        return new MachineImage(this.image.toString());
    }
}
