/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21/03/2014
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class CompileAudioFiles {

    GetAudio ga = new GetAudio();
    String[] numberList = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

   public CompileAudioFiles(){
       playScript();

   }

   public void playScript(){
       for(int x = 0; x< 10; x++){
           ga.getAudio(numberList[x]);
           ga.getRandomNumberOfPauses();
       }
   }
}
