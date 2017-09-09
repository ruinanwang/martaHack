import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class Reader {
    ArrayList<Location> marta;

    public Reader() {
        marta = new ArrayList<>();
    }

    public ArrayList<Location> readInputText() {
        try (BufferedReader br = new BufferedReader(new FileReader("station.txt"))) {

            String line = "";
            String station = "";
            int i = 0;

            while ((line = br.readLine()) != null) {
                if ((line.length() >= 13) && line.substring(0,13).equals("/Information:")) {
                    while ((station = br.readLine()) != null) {
                        String[] split = station.split("-");
                        String[] zuobiao = split[1].split(",");
                        int x = Integer.parseInt(zuobiao[0]);
                        int y = Integer.parseInt(zuobiao[1]);
                        String[] parts = split[0].split(":");
                        int ppl = Integer.parseInt(parts[1]);
//                        System.out.println(parts[0] + "+" + x + "+" + y);
                        Location info = new Location(x,y,parts[0],ppl);
                        marta.add(info);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return marta;
    }
//    public static void main(String[] args) {
//        Reader myReader = new Reader();
//        myReader.readInputText();
//    }

}
