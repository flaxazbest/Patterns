package structural.adapter2;

class AdapterForExternalLibrary {

    private ExternalLibraryAPI painter = new ExternalLibrary();

    void render(int x, int y) {
        painter.superMethod(x, y, 0, 0);
    }

}
