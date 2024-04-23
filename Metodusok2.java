public class Metodusok2 {
    public static double negyzetTerulet(double a, double b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        else if (a < 0 || b < 0) {
            return -1;
        }
        else {
            return a * b;
        }
    }

    public static int harmadikSzog(int a, int b) {
        if (a == 0 || b == 0 || a < 0 || b < 0 || a + b >= 180) {
            return -1;
        }
        else {
            return 180 - (a+b);
        }
    }

    public static boolean vanNagybetu(String sz) {
        for (int i = 0; i < sz.length(); i++) {
            if (Character.isUpperCase(sz.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static String fejVagyIras(int szam) {
        if(szam == 0) {
            return "elere esett";
        }
        else if (szam > 0) {
            return "fej";
        }
        else {
            return "iras";
        }
    }
    public static void main(String[] args) {
        System.out.println(negyzetTerulet(2, 3) == 6);
        System.out.println(negyzetTerulet(0, 3) == 0);
        System.out.println(negyzetTerulet(2, 0) == 0);
        System.out.println(negyzetTerulet(-2, 3) == -1);
        System.out.println(negyzetTerulet(2, -3) == -1);
        System.out.println(negyzetTerulet(-2, -3) == -1);
        System.out.println(harmadikSzog(20, 30) == 130);
        System.out.println(harmadikSzog(30, 40) ==  110);
        System.out.println(harmadikSzog(90, 90) == -1);
        System.out.println(harmadikSzog(80, 120) == -1);
        System.out.println(harmadikSzog(0, 45) == -1);
        System.out.println(harmadikSzog(45, 0) == -1);
        System.out.println(harmadikSzog(-45, 45) == -1);
        System.out.println(harmadikSzog(45, -45) == -1); 
        System.out.println(vanNagybetu("Alma") == true);
        System.out.println(vanNagybetu("alma") == false);
        System.out.println(vanNagybetu("alMa") == true);
        System.out.println(vanNagybetu("123") == false);
        System.out.println(vanNagybetu("") == false);
        System.out.println(fejVagyIras(3).equals("fej"));
        System.out.println(fejVagyIras(10).equals("fej"));
        System.out.println(fejVagyIras(-3).equals("iras"));
        System.out.println(fejVagyIras(-10).equals("iras"));
        System.out.println(fejVagyIras(0).equals("elere esett"));
    }
}
