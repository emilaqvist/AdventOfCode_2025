import java.io.BufferedReader;
import java.io.FileReader;

public class Day1 {
    public static void main(String[] args) {

        int lastLocation= 50;
        int ticks;
        int nullHits = 0;
        int nullHitsNew = 0;

        String RL;
        try (BufferedReader br = new BufferedReader(new FileReader("src/rotations.txt"))){
            String currentLine;
            while((currentLine = br.readLine()) != null){

                if(currentLine.equals("*")){
                    break;
                }
                   RL = String.valueOf(currentLine.charAt(0));
                   String nbrs = currentLine.substring(1);
                   ticks = Integer.parseInt(nbrs);

                System.out.println(ticks);

                for (int i = 0; i < ticks; i++) {
                    if (RL.equals("R")){
                        lastLocation = (lastLocation+1) %100;
                    } else if (RL.equals("L")) {
                        lastLocation = (lastLocation - 1 +100 )%100;
                    }

                    if(lastLocation == 0){
                        nullHitsNew++;
                    }
                }

                if(lastLocation == 0){
                    nullHits++;
                }

           }
            System.out.println("Done");

            System.out.println("Antal gånger på 0: " + nullHits);
            System.out.println("Antal träffar på 0: " + nullHitsNew);






        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
