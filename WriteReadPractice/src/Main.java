import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Mokinys mokinys = new Mokinys("Ernestas", "Kriskus", "Panevezys");
        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            lines.add(mokinys.getVardas());
            lines.add(mokinys.getPavarde());
            lines.add(mokinys.getMiestas());
        }
        System.out.println(readLines());
        writeLines(lines);

    }


    public static List<String> readLines() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("failasIsKurioSkaitom.txt"));
            return reader.lines().collect(Collectors.toList());
        } catch (IOException ioException) {
            throw new RuntimeException();
        }
    }

    public static void writeLines(List<String> lines) throws IOException {
        var writer = new BufferedWriter(new FileWriter("failas.txt"));
        for (String line : lines) {
            writer.write(line + "\n");
        }
        writer.flush();
        writer.close();
    }
}