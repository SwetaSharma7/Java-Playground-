    class Mobile {
        String brand;
        int price;
        static String type;

        public void show() {
            System.out.println(brand + " " + price + " " + type);
        }
    }

public class StaticKeyword {
    public static void main(String arg[]) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 150000;
        Mobile.type = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 151234;
        Mobile.type = "Smartphone";

        obj1.show();
        obj2.show();
    }
}