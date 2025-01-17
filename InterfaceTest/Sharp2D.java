package InterfaceTest;

public interface Sharp2D extends Printable, Destroyable {
    int ORIGINAL_X = 0;
    int ORIGINAL_Y = 0;

    void moveTo(int x, int y);

}
