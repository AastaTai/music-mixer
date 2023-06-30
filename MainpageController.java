package finalproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import java.io.File;
import java.io.IOException;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;


public class MainpageController{
	
	public ImageView imageBD;
	public ImageView imageFT;
	public ImageView imageST;
	public ImageView imageTT;
	public ImageView imageHH;
	public ImageView imageC;
	public ImageView imageR;
	public ImageView imagePiano;
	
	/*Media mediaBD = new Media(new File("mp3/BaseDrum.mp3").toURI().toString());
	MediaPlayer playerBD = new MediaPlayer(mediaBD);
	Media mediaFT = new Media(new File("mp3/FloorTom.mp3").toURI().toString());
	MediaPlayer playerFT = new MediaPlayer(mediaFT);
	Media mediaST = new Media(new File("mp3/SnareTom.mp3").toURI().toString());
	MediaPlayer playerST = new MediaPlayer(mediaST);
	Media mediaTT = new Media(new File("mp3/Tomtom.mp3").toURI().toString());
	MediaPlayer playerTT = new MediaPlayer(mediaTT);
	Media mediaHH = new Media(new File("mp3/Hihat.mp3").toURI().toString());
	MediaPlayer playerHH = new MediaPlayer(mediaHH);
	Media mediaC = new Media(new File("mp3/Crash.mp3").toURI().toString());
	MediaPlayer playerC = new MediaPlayer(mediaC);
	Media mediaR = new Media(new File("mp3/Ride.mp3").toURI().toString());
	MediaPlayer playerR = new MediaPlayer(mediaR);
	Media mediaS = new Media(new File("mp3/silence.mp3").toURI().toString());
	MediaPlayer playerS = new MediaPlayer(mediaS);*/

    @FXML
    public void piano_press() throws IOException{
        Parent piano = FXMLLoader.load(getClass().getResource("piano.fxml"));
        Scene pianoScene = new Scene(piano);
        pianoScene.getRoot().requestFocus();
        Main_final.currentStage.setScene(pianoScene);
    }
    @FXML
    public void drum_press() throws IOException{
        Parent drum = FXMLLoader.load(getClass().getResource("drum1.fxml"));
        Scene drumScene = new Scene(drum);
        drumScene.getRoot().requestFocus();
        Main_final.currentStage.setScene(drumScene);
    }
    @FXML
    public void exit_press() {
    	Main_final.currentStage.close();
   }
    
    /*public void play_press() {
    	play();
    }
    
    public void play() {
    	for(int k=0;k<120;k++) {
        	imageBD.setVisible(false);
    		imageFT.setVisible(false);
    		imageST.setVisible(false);
    		imageTT.setVisible(false);
    		imageHH.setVisible(false);
    		imageC.setVisible(false);
    		imageR.setVisible(false);
    		if(music[k].contains("1") == true) {
    			imageBD.setVisible(true);
    			//playerBD.play();
    		}else if(music[k].contains("2") == true) {
    			imageFT.setVisible(true);
    			//playerFT.play();
    		}else if(music[k].contains("3") == true) {
    			imageST.setVisible(true);
    			//playerST.play();
    		}else if(music[k].contains("4") == true) {
    			imageTT.setVisible(true);
    			//playerTT.play();
    		}else if(music[k].contains("5") == true) {
    			imageHH.setVisible(true);
    			//playerHH.play();
    		}else if(music[k].contains("6") == true) {
    			imageC.setVisible(true);
    			//playerC.play();
    		}else if(music[k].contains("7") == true) {
    			imageR.setVisible(true);
    			//playerR.play();
    		}else if(music[k].contains("8") == true) {
    			imagePiano.setVisible(true);
    		}
        }
    }*/
}


/*interface GlobalVariable{
	String[] music = new String[120];
}*/

