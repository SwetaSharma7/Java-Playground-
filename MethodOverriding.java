class calc {
        public int add(int a, int b) {
            return a+b;
        }
    }

    class advCalc extends calc{
        public int add(int a, int b) {
            return a+b;
        }
    }

public class MethodOverriding {
    public static void main(String args[]) {
        advCalc obj = new advCalc();
        int res = obj.add(5,5);
        System.out.println(res);
        
    }
}