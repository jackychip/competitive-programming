package CCC2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S3GoodSamples {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int numOfNotes = Integer.parseInt(str.nextToken());
        int maxPitch = Integer.parseInt(str.nextToken());
        int numOfGoodSamples = Integer.parseInt(str.nextToken());

        //calculate number of possible samples
        int numOfPossibleSamples = 0;
        for (int i = numOfNotes; i > 0; i--) {
            numOfPossibleSamples += i;
        }

        //determine obvious impossible cases
        if (numOfNotes > numOfGoodSamples || numOfPossibleSamples < numOfGoodSamples) {
            System.out.println(-1);
            System.exit(0);
        }

        //define array and add first note
        int[] sample = new int[numOfNotes + 1];
        sample[1] = 1;
        numOfGoodSamples -= 1;

        //create list of pitches that can be used
        ArrayList<Integer> pitches = new ArrayList<>();
        for (int i = 1; i <= maxPitch; i++) {
            pitches.add(i);
        }

        int currentPitch = 2;
        int index = 2;

        //note that the index of the note will always indicate
        //how many new good samples are added assuming it is distinct
        while (numOfGoodSamples > 0) {
            if (!pitches.contains(currentPitch)) {
                //determine best num to add
            }
            else {
                sample[index] = currentPitch;
                numOfGoodSamples -= index;
            }
            index++;
            currentPitch++;
        }

        //if the note isn't distinct, than the number of good samples added
        //will depend on the index of the repeating note
        

    }

}
