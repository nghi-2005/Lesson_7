package TestLesson;

public abstract class Sharp {
    private int x,y;

    public void moveTo(int x,int y){
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}
