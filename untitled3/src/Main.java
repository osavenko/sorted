
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/п.csv");
        ArrayList<String> list = (ArrayList<String>) Files.readAllLines(path);
        List<Recorder> listclass = new ArrayList<>();
        for (String f : list) {
            if (f.startsWith("Ошибка")) {
                String[] buffer = f.split(",");
                listclass.add(new Recorder(buffer[1], buffer[3], buffer[2], buffer[5], buffer[0]));
            }
        }
        FileWriter fileWriter = new FileWriter("D:/log.txt");
        for (Recorder d : listclass) {
           fileWriter.write(" level: " + d.getLevel() + " " + " data and time: " + d.getDataTime() + " " + " infocode: " + d.getInfocode() + "  " + " surce: " + d.getSurce() + " " + " task: " + d.getTask()+(char)13+(char)10);
           fileWriter.append("\n");
        }

    }
}
