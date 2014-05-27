import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21/03/2014
 * Time: 9:55 AM
 * To change this template use File | Settings | File Templates.
 */


public class GetAudio {

Random rd;

    public void getAudio(String fileName){
            // open the sound file as a Java input stream
            String numberFile = "/Users/user/Desktop/audio/" + fileName + ".au";
            try {
                InputStream in = new FileInputStream(numberFile);

                //create an audiostream from the inputstream
                AudioStream audioStream = new AudioStream(in);

                // play the audio clip with the audioplayer class
                AudioPlayer.player.start(audioStream);
                System.out.println(fileName);
                Thread.sleep(1000);

            } catch (FileNotFoundException e) {
                assert(true);
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (IOException e) {
                assert (true);
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }    catch (InterruptedException e){

            }



        }

public void getRandomNumberOfPauses(){
    rd = new Random();
    int pauseXtimes = rd.nextInt(6);

    for(int i = 0; i < pauseXtimes; i++){
        getAudio(getPause());
    }

}

public String getPause(){
    return "Pause";
}

}
