public class PasswordGenerator {

    private int numDigs;
    private String prefix;
    private static int countPasswords = 0;

    public PasswordGenerator(int n, String s) {
        numDigs = n;
        prefix = s;
    }

    public PasswordGenerator(int n) {
        numDigs = n;
        prefix = "A";
    }

    public String pwGen() {
        countPasswords++;
        String password = prefix + ".";
        for(int a = 0; a< numDigs; a++) {
            int z = (int)(Math.random()*10);
            password+=z;
        }
        return password;
    }

    public int pwCount() {
        return countPasswords;
    }

    public static void main(String[] args) {

        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        for(int a = 0; a<=5; a++) {
            System.out.println(pw1.pwGen());
        }
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        for(int a = 0; a<=3; a++) {
            System.out.println(pw2.pwGen());
        }
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwCount());
        PasswordGenerator pw3 = new PasswordGenerator(10, "yikes");
        for(int a = 0; a<=4; a++) {
            System.out.println(pw3.pwGen());
        }
        System.out.println(pw3.pwCount());
    }
}

/* OUTPUT:

chs.4755
chs.9897
chs.2691
chs.8275
chs.9315
chs.1449
6
A.778777
A.410773
A.542916
A.337022
10
10
yikes.5042712814
yikes.6150501390
yikes.2289372350
yikes.5603793896
yikes.5194877779
15

 */