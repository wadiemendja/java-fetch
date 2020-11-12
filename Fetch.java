import java.net.URLConnection;
import java.util.Scanner;
import java.net.URL;

class Fetch {
    public static void main(String [] args) throws Exception {
        String content = null;
        URLConnection connection = null;
        connection =  new URL("http://www.google.com").openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        scanner.useDelimiter("\\Z");
        content = scanner.next();
        scanner.close();
        System.out.print(content);
    }
}
