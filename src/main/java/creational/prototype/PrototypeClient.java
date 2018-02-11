package creational.prototype;

public class PrototypeClient {

    public static void main(String[] args)
    throws CloneNotSupportedException {

        /* Create base Machine Images */
        MachineImage linuxVM = new MachineImage("Linux", "Symantec");
        MachineImage windowsVM = new MachineImage("Windows", "MacAfee");

        /* Clone LinuxVM and Install Web Server */
        MachineImage webServer = linuxVM.clone();
        webServer.install("Web Server S/W");

        /* Clone Web Server and install Application server on top of it */
        MachineImage webAppServer = webServer.clone();
        webAppServer.install("App Server S/W");

        /* Clone LinuxVM and Install Database Server */
        MachineImage dbServer = linuxVM.clone();
        dbServer.install("Database Server S/W");

        /* Create test machine from Windows Image */
        MachineImage testMachine = windowsVM.clone();

        System.out.println("Web Server Configuration: ");
        webServer.printSW();
        System.out.println("App Server Configuration: ");
        webAppServer.printSW();
        System.out.println("DB Server Configuration: ");
        dbServer.printSW();
        System.out.println("Test Machine Configuration: ");
        testMachine.printSW();

    }

}
