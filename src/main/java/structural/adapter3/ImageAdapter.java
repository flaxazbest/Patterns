package structural.adapter3;

public class ImageAdapter{

    public String getRender(int w, int h) {
        ImageClass ic = new ImageClass();
        return ic.getSuperImage(w, h, 32, "Noname");
    }
}
