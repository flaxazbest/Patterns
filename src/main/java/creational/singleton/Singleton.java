package creational.singleton;

class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }

    private Singleton() {}

    void printObj() {
        System.out.println("Unique Id of the obj: " + System.identityHashCode(this));
    }
}