/* Programmer Name: Asma M Paracha
Course Code: PROG24178 */
package electronics;
import static java.lang.Math.random;

public class TryRemoteControl {
  public static void main(String args[]) {
    RemoteControl remote = null;

    // You will create five objects to operate using our remote
    for(int i = 0 ; i<5 ; i++) {
      // Now create either a TV or a VCR at random
      if(random()<0.5)
        // Random choice of TV make and screen size
        remote = new TV(random()<0.5 ? "Sony" : "Hitachi",
                        random()<0.5 ? 32 : 28);
      else // Random choice of VCR
        remote = new VCR(random()<0.5 ? "Panasonic": "JVC");

      // Now operate it, whatever it is
      remote.powerOnOff();                       // Switch it on
      remote.channelUp();                        // Set the next channel up
      remote.volumeUp(10);                       // Turn up the sound
    }
  }
}



