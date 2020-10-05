package structural.adapter3;

public class ImageClass implements ImageInterface {
    @Override
    public String getSuperImage(int w, int h, int depth, String name) {
        return name + "Picture " + w + "x" + h + ": " + depth;
    }
}
