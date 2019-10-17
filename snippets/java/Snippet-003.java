import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Snippet {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter écrivain = new PrintWriter("customer-01");
        écrire(écrivain, "firstname", "Olivier");
        écrire(écrivain, "lastname", "PEREZ");
        écrivain.close();
    }

    private static void écrire(PrintWriter output, String key, Object value) {
        output.write(key + "(" + value.getClass() + ")=" + value);
    }
}