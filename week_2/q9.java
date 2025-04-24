class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    void erase() {
        System.out.println("Erasing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }

    void erase() {
        System.out.println("Erasing a circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }

    void erase() {
        System.out.println("Erasing a triangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }

    void erase() {
        System.out.println("Erasing a square");
    }
}

public class q9 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();
        s.erase();

        s = new Triangle();
        s.draw();
        s.erase();

        s = new Square();
        s.draw();
        s.erase();
    }
}
