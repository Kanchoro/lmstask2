
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setPI(3);
        circle.setRadius(7);
        System.out.println(circle.toString());
        Circle.circumference(circle, circle.getPI(), circle.getRadius());
        Circle.area(circle, circle.getPI(), circle.getRadius());


    }
}

//        Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
//        жана circumference деген статик методдору болсун.
//        areaны табуу учун: PI * (radius * radius)
//        circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат