import java.io.*;
import java.util.*;

public class Person201Scanner {
    public static Person201[] readFile(String fname) throws FileNotFoundException {
        Scanner s = new Scanner(new File(fname));
        ArrayList<Person201> list = new ArrayList<>();

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] data = line.split(",");
            Person201 p = new Person201(
                    data[0],
                    Double.parseDouble(data[1]),
                    Double.parseDouble(data[2]),
                    data[3]);
            list.add(p);
        }
        return list.toArray(new Person201[0]);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Person201[] list = readFile("data/small.txt");
        for(Person201 p : list) {
            System.out.println(p);
        }
    }
}
