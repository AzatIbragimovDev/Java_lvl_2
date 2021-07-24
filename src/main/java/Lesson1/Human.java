package Lesson1;
public class Human implements Entity {
    final int runDistance;
    final double jumpHeight;
    final String name;

    public Human(int runDistance, double jumpHeight, String name) {
        this.runDistance = runDistance;
        this.name = name;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean run(int getTrackDistance) {
        if(runDistance >= getTrackDistance) {
            System.out.println("The man is runing...");
            return true;
        }
            System.out.println("The man is failed run...");
        return false;
    }

    @Override
    public boolean jump(double getWallHeight) {
        if(jumpHeight >= getWallHeight) {
            System.out.println("The man is jumping...");
            return true;
        }
            System.out.println("The man is failed jump...");
        return false;
    }


}
