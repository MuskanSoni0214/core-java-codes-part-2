class Phone
{
public void call()
{
System.out.println("Calling...");
}

public void sms()
{
System.out.println("Sending...");
}
}

interface Camera
{
void click();
void record();
}

interface MusicPlayer
{
void play();
void pause();
void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer
{
public void click()
{
System.out.println("Clicking...");
} 
public void record()
{
System.out.println("Recording...");
} 
public void play()
{
System.out.println("Playing...");
} 
public void pause()
{
System.out.println("pausing...");
} 
public void stop()
{
System.out.println("Stoping...");
} 
}

public class InterfaceMore
{
public static void main(String[]args)
{
SmartPhone sp = new SmartPhone();
sp.call();
sp.click();
sp.play();
sp.pause();
sp.stop();
sp.record();
sp.sms();
}
}
