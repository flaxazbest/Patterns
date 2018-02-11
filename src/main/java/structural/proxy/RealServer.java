package structural.proxy;

public class RealServer implements Server {
    @Override
    public void authenticate() {
        System.out.println("Logged into the Real Server");
    }

    @Override
    public void get() {
        System.out.println("GET command executed");
    }

    @Override
    public void post() {
        System.out.println("POST command executed");
    }

    @Override
    public void put() {
        System.out.println("PUT command executed");
    }

    @Override
    public void delete() {
        System.out.println("DELETE command executed");
    }

    @Override
    public void logout() {
        System.out.println("Logged out the Real Server");
    }
}
