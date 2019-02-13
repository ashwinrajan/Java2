/* Programmer Name: Asma M Paracha
Course Code: PROG24178 */
package electronics;

public class VCR implements RemoteControl {
  private String make = null;
  private boolean power = false;

  private int MIN_VOLUME = 0;
  private int MAX_VOLUME = 100;
  private int volume = MIN_VOLUME;

  private int MIN_CHANNEL = 0;
  private int MAX_CHANNEL = 99;
  private int channel = 0;

    public VCR(String make) {
    this.make = make;
  }

  public boolean powerOnOff() {
    power = !power;
    System.out.println(make + " VCR power "+ (power ? "on.":"off."));
    return power;
  }

  public int volumeUp(int increment) {
     if(!power) {                      // If the power is off
       return 0;                       // Nothing works
  }

    // Set volume - must not be greater than the maximum
    volume += increment;
    volume = Math.min(volume, MAX_VOLUME);
    System.out.println(make + " VCR volume level: "+ volume);
    return volume;
  }

  public int volumeDown(int decrement) {
    if(!power) {                       // If the power is off
      return 0;                        // Nothing works
    }

    // Set volume - must not be less than the minimum
    volume -= decrement;
    volume = Math.max(volume, MIN_VOLUME);
    System.out.println(make + " VCR volume level: "+ volume);
    return volume;
  }

  public void mute() {
    if(!power) {                       // If the power is off
       return;                         // Nothing works
    }

    volume = MIN_VOLUME;
    System.out.println(make + " VCR volume level: "+ volume);
  }

  public int setChannel(int newChannel) {
    if(!power) {                       // If the power is off
      return 0;                        // Nothing works
    }

    // Channel must be from MIN_CHANNEL to MAX_CHANNEL
    if(newChannel>=MIN_CHANNEL && newChannel<=MAX_CHANNEL) {
      channel = newChannel;
    }
    System.out.println(make + " VCR tuned to channel: "+ channel);
    return channel;
  }

  public int channelUp() {
    if(!power) {                       // If the power is off
      return 0;                        // Nothing works
    }

    // Wrap channel round to MIN_CHANNEL when MAX_CHANNEL is reached
    channel = channel<MAX_CHANNEL ? ++channel : MIN_CHANNEL;
    System.out.println(make + " VCR tuned to channel: "+ channel);
    return channel;
  }

  public int channelDown() {
    if(!power) {                       // If the power is off
      return 0;                        // Nothing works
    }

    // Wrap channel round to MAX_CHANNEL when Min_CHANNEL is reached
    channel = channel>MIN_CHANNEL ? --channel : MAX_CHANNEL;
    System.out.println(make + " VCR tuned to channel: "+ channel);
    return channel;
  }

 
}
