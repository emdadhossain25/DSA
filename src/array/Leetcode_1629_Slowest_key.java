package array;

public class Leetcode_1629_Slowest_key {

    public char slowestKey(int[] releaseTimes, String keyPressed) {
        int currentReleaseTime =0;
        int previousReleaseTime =0;
        int maxReleaseTime=0;
        char c = 'a';
        //iterate over previous time
        for (int i =0;i<releaseTimes.length;i++){

            // get current time difference from current and previous time
            currentReleaseTime=releaseTimes[i]-previousReleaseTime;

            //check if time is maximum if not update max time and character at that index
            if(maxReleaseTime<currentReleaseTime){
                maxReleaseTime=currentReleaseTime;
                c=keyPressed.charAt(i);
            }
//            if max time is equal current time check if character stored is lesser if so update character
            else if(maxReleaseTime==currentReleaseTime){
                if(c<keyPressed.charAt(i)) c = keyPressed.charAt(i);
            }

            // update the previous time
            previousReleaseTime=releaseTimes[i];
        }

        return c;
    }
}
