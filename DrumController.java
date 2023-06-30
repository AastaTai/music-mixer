package finalproject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import finalproject.Main_final;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class DrumController implements Initializable{
	
	private final static int number_of_tone1 = 8;                            //可以選擇的鼓的數量
	int currentIndex = 0;													 //目前選擇哪一種鼓
	int[] speed = new int[240];												 //存放每一次Onsure_Press
	int howmuchspeed = 0 ;													 //幾種speed
	
	ObservableList<String> drumList = FXCollections.observableArrayList
	("Bass Drum", "Floor Tom", "Snare Tom","Tom-tom", "Hi-hat", "Crash", "Ride");
	
	ObservableList<Media> mediaList = FXCollections.observableArrayList(); 
	
	@FXML
	Media[] me =new Media[number_of_tone1];
    MediaPlayer[] mp = new MediaPlayer[number_of_tone1];
	MediaPlayer[] mix = new MediaPlayer[60];
	public ChoiceBox<String> list;
	public Button back;
	public Button sure;
	public TextField frequency;
	public TextField volume;
	public TextField time;
	public TextField time1;
	public ImageView imageBD;
	public ImageView imageFT;
	public ImageView imageST;
	public ImageView imageTT;
	public ImageView imageHH;
	public ImageView imageC;
	public ImageView imageR;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle rescources) {
		me[0] = new Media(new File("mp3/BaseDrum.mp3").toURI().toString());
		mp[0] = new MediaPlayer(me[0]);
		me[1] = new Media(new File("mp3/FloorTom.mp3").toURI().toString());
		mp[1] = new MediaPlayer(me[1]);
		me[2] = new Media(new File("mp3/SnareTom.mp3").toURI().toString());
		mp[2] = new MediaPlayer(me[2]);
		me[3] = new Media(new File("mp3/Tomtom.mp3").toURI().toString());
		mp[3] = new MediaPlayer(me[3]);
		me[4] = new Media(new File("mp3/Hihat.mp3").toURI().toString());
		mp[4] = new MediaPlayer(me[4]);
		me[5] = new Media(new File("mp3/Crash.mp3").toURI().toString());
		mp[5] = new MediaPlayer(me[5]);
		me[6] = new Media(new File("mp3/Ride.mp3").toURI().toString());
		mp[6] = new MediaPlayer(me[6]);
		me[7] = new Media(new File("mp3/silence.mp3").toURI().toString());
		mp[7] = new MediaPlayer(me[7]);
		
		list.setItems(drumList);
	}
	
	public void onSurePress() {
		String sound = list.getValue();											//sound 紀錄目前選擇的鼓是哪一種
    	picture();
		if(sound == "Bass Drum") {
    		currentIndex = 0;														//currentIndex 跟 sound一樣 只是一個是string 一個是int
    		speed[howmuchspeed] = Integer.parseInt(time.getText());             //speed[]紀錄 開始的小節
    		speed[howmuchspeed+1] = Integer.parseInt(time1.getText());			//speed[]紀錄 結束的小節
    		speed[howmuchspeed+2] = Integer.parseInt(frequency.getText());	    //speed[]紀錄 從開始到結束的這一段小節的速度
    		speed[howmuchspeed+3] = Integer.parseInt(volume.getText());         //speed[]紀錄 從開始到結束的這一段小節的音量
    		howmuchspeed = howmuchspeed + 4;									//每4個紀錄點為一組 所以speed[howmuchspeed]往後推移4個位置

    		for(int i =Integer.parseInt(time.getText());i<=Integer.parseInt(time1.getText());i++) { 
    			mix[i-1] = mp[currentIndex];										//從開始的小節 到 結束的小節 將mp[]的音檔 存入 mix[i-1] 
    			mix[i-1].setRate(speed[i+2]);
    			mix[i-1].setVolume(speed[i+3]);
    		}
    	}else if(sound == "Floor Tom") {
    		currentIndex=1;
    		speed[howmuchspeed] = Integer.parseInt(time.getText());             //speed[]紀錄 開始的小節
    		speed[howmuchspeed+1] = Integer.parseInt(time1.getText());			//speed[]紀錄 結束的小節
    		speed[howmuchspeed+2] = Integer.parseInt(frequency.getText());	    //speed[]紀錄 從開始到結束的這一段小節的速度
    		speed[howmuchspeed+3] = Integer.parseInt(volume.getText());         //speed[]紀錄 從開始到結束的這一段小節的音量
    		howmuchspeed = howmuchspeed + 4;									//每4個紀錄點為一組 所以speed[howmuchspeed]往後推移4個位置

    		for(int i =Integer.parseInt(time.getText());i<=Integer.parseInt(time1.getText());i++) { 
    			mix[i-1] = mp[currentIndex];										//從開始的小節 到 結束的小節 將mp[]的音檔 存入 mix[i-1] 
    			mix[i-1].setRate(speed[i+2]);
    			mix[i-1].setVolume(speed[i+3]);
    		}
    	}else if(sound == "Snare Tom") {
    		currentIndex = 2;
    		speed[howmuchspeed] = Integer.parseInt(time.getText());             //speed[]紀錄 開始的小節
    		speed[howmuchspeed+1] = Integer.parseInt(time1.getText());			//speed[]紀錄 結束的小節
    		speed[howmuchspeed+2] = Integer.parseInt(frequency.getText());	    //speed[]紀錄 從開始到結束的這一段小節的速度
    		speed[howmuchspeed+3] = Integer.parseInt(volume.getText());         //speed[]紀錄 從開始到結束的這一段小節的音量
    		howmuchspeed = howmuchspeed + 4;									//每4個紀錄點為一組 所以speed[howmuchspeed]往後推移4個位置

    		for(int i =Integer.parseInt(time.getText());i<=Integer.parseInt(time1.getText());i++) { 
    			mix[i-1]=mp[currentIndex];										//從開始的小節 到 結束的小節 將mp[]的音檔 存入 mix[i-1] 
    			mix[i-1].setRate(speed[i+2]);
    			mix[i-1].setVolume(speed[i+3]);
    		}
    	}else if(sound == "Tom-tom") {
    		currentIndex = 3;
    		speed[howmuchspeed] = Integer.parseInt(time.getText());             //speed[]紀錄 開始的小節
    		speed[howmuchspeed+1] = Integer.parseInt(time1.getText());			//speed[]紀錄 結束的小節
    		speed[howmuchspeed+2] = Integer.parseInt(frequency.getText());	    //speed[]紀錄 從開始到結束的這一段小節的速度
    		speed[howmuchspeed+3] = Integer.parseInt(volume.getText());         //speed[]紀錄 從開始到結束的這一段小節的音量
    		howmuchspeed = howmuchspeed + 4;									//每4個紀錄點為一組 所以speed[howmuchspeed]往後推移4個位置

    		for(int i =Integer.parseInt(time.getText());i<=Integer.parseInt(time1.getText());i++) { 
    			mix[i-1] = mp[currentIndex];										//從開始的小節 到 結束的小節 將mp[]的音檔 存入 mix[i-1] 
    			mix[i-1].setRate(speed[i+2]);
    			mix[i-1].setVolume(speed[i+3]);
    		}
    	}else if(sound == "Hi-hat") {
    		currentIndex = 4;
    		speed[howmuchspeed] = Integer.parseInt(time.getText());             //speed[]紀錄 開始的小節
    		speed[howmuchspeed+1] = Integer.parseInt(time1.getText());			//speed[]紀錄 結束的小節
    		speed[howmuchspeed+2] = Integer.parseInt(frequency.getText());	    //speed[]紀錄 從開始到結束的這一段小節的速度
    		speed[howmuchspeed+3] = Integer.parseInt(volume.getText());         //speed[]紀錄 從開始到結束的這一段小節的音量
    		howmuchspeed = howmuchspeed + 4;									//每4個紀錄點為一組 所以speed[howmuchspeed]往後推移4個位置

    		for(int i =Integer.parseInt(time.getText());i<=Integer.parseInt(time1.getText());i++) { 
    			mix[i-1] = mp[currentIndex];										//從開始的小節 到 結束的小節 將mp[]的音檔 存入 mix[i-1] 
    			mix[i-1].setRate(speed[i+2]);
    			mix[i-1].setVolume(speed[i+3]);
    		}
    	}else if(sound == "Crash") {
    		currentIndex = 5;
    		speed[howmuchspeed] = Integer.parseInt(time.getText());             //speed[]紀錄 開始的小節
    		speed[howmuchspeed+1] = Integer.parseInt(time1.getText());			//speed[]紀錄 結束的小節
    		speed[howmuchspeed+2] = Integer.parseInt(frequency.getText());	    //speed[]紀錄 從開始到結束的這一段小節的速度
    		speed[howmuchspeed+3] = Integer.parseInt(volume.getText());         //speed[]紀錄 從開始到結束的這一段小節的音量
    		howmuchspeed = howmuchspeed + 4;									//每4個紀錄點為一組 所以speed[howmuchspeed]往後推移4個位置

    		for(int i = Integer.parseInt(time.getText());i<=Integer.parseInt(time1.getText());i++) { 
    			mix[i-1] = mp[currentIndex];										//從開始的小節 到 結束的小節 將mp[]的音檔 存入 mix[i-1] 
    			mix[i-1].setRate(speed[i+2]);
    			mix[i-1].setVolume(speed[i+3]);
    		}
    	}else if(sound == "Ride") {
    		currentIndex = 6;
    		speed[howmuchspeed] = Integer.parseInt(time.getText());             //speed[]紀錄 開始的小節
    		speed[howmuchspeed+1] = Integer.parseInt(time1.getText());			//speed[]紀錄 結束的小節
    		speed[howmuchspeed+2] = Integer.parseInt(frequency.getText());	    //speed[]紀錄 從開始到結束的這一段小節的速度
    		speed[howmuchspeed+3] = Integer.parseInt(volume.getText());         //speed[]紀錄 從開始到結束的這一段小節的音量
    		howmuchspeed = howmuchspeed + 4;									//每4個紀錄點為一組 所以speed[howmuchspeed]往後推移4個位置

    		for(int i =Integer.parseInt(time.getText());i<=Integer.parseInt(time1.getText());i++) { 
    			mix[i-1] = mp[currentIndex];										//從開始的小節 到 結束的小節 將mp[]的音檔 存入 mix[i-1] 
    			mix[i-1].setRate(speed[i+2]);
    			mix[i-1].setVolume(speed[i+3]);
    		}
    	}
	}
	
	public void onBackPress() {
		Main_final.currentStage.setScene(Main_final.menuScene);
	}
	
	int i = 0;
	public void onPlayPress() {
		for(int k=0;k<mix.length;k++) {
			if(mix[k] == null) {
				mix[k] = mp[7];
			}
		}
		mix[i].setOnEndOfMedia(new Runnable() {
			@Override
		       public void run() {
		           mix[i+1].play();
		           mix[i+1].seek(Duration.ZERO);
		           i++;
		        }
			}); 
		
	}
	
	public void picture() {
		imageBD.setVisible(false);
		imageFT.setVisible(false);
		imageST.setVisible(false);
		imageTT.setVisible(false);
		imageHH.setVisible(false);
		imageC.setVisible(false);
		imageR.setVisible(false);
		
		if(list.getSelectionModel().getSelectedItem() == "Bass Drum") {
			imageBD.setVisible(true);
			mp[0].play();
			mp[0].seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Floor Tom") {
			imageFT.setVisible(true);
			mp[1].play();
			mp[1].seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Snare Tom") {
			imageST.setVisible(true);
			mp[2].play();
			mp[2].seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Tom-tom") {
			imageTT.setVisible(true);
			mp[3].play();
			mp[3].seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Hi-hat") {
			imageHH.setVisible(true);
			mp[4].play();
			mp[4].seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Crash") {
			imageC.setVisible(true);
			mp[5].play();
			mp[5].seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Ride") {
			imageR.setVisible(true);
			mp[6].play();
			mp[6].seek(Duration.ZERO);
		}
	}
	
}
