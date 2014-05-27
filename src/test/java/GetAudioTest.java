import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21/03/2014
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class GetAudioTest {

    GetAudio getAudio;
    @Before
    public  void setUp(){
           getAudio=new GetAudio();

    }

    @Test
    public  void testCompileAudioFile() {
        //CompileAudioFiles ca = new CompileAudioFiles();
        //ca.playScript();

    }

    @Test(expected = FileNotFoundException.class)
    public  void testGetAudioNotFound() {
         //  int i=1/0;
        //getAudio.getAudio();
    }
//    @Test(expected = IOException.class)
//    public void testIOExcetpion(){
//        getAudio.getAudio();
//
//    }



}
