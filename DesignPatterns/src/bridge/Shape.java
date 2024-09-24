package bridge;

public abstract class Shape {

    Color color;

    public Shape(Color color){
        this.color = color;
        System.out.format("Creato %s %s \n", this.getClass().getSimpleName().toLowerCase(), this.color.getClass().getSimpleName().toLowerCase());
    }

}
