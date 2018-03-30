import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            ping02("heart.bchunk.com");
        } catch (Exception e) {
            System.out.println("aaaa");
            e.printStackTrace();
        }
//        System.out.println("Hello Wossrld!" + StringUtils.trim(" aaaa "));
    }
    public static void ping02(String ipAddress) throws Exception {
        String line = null;
        try {
            Process pro = Runtime.getRuntime().exec("ping " + ipAddress);
            BufferedReader buf = new BufferedReader(new InputStreamReader(
                    pro.getInputStream()));
            while ((line = buf.readLine()) != null)
                System.out.println(line);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
