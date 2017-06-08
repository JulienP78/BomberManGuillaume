package bbman;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Sound
{
	private AudioClip son;
	
	public Sound(String nomFichier)
	{
		URL url = Sound.class.getResource(nomFichier+".wav"); 
		this.son = Applet.newAudioClip(url); 
		son.play();
	}
	
	public void stop()
	{
		this.son.stop();
	}
}
