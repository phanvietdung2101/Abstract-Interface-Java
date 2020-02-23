public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(3.5),
                new Rectangle(4,3),
                new Square(5)
        };

        for(Shape element : shapes){
            System.out.println(((Rectangle) element).getArea());
            if(element instanceof Square)
                ((Square) element).howToColor();
        }
    }
}
