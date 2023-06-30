package finalproject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class PianoController implements Initializable{
	private final static int number_of_tone = 14;                            //可以選擇的鼓的數量   
    int currentIndex = 0;													 //目前選擇哪一種鼓
	int[] speed = new int[240];												 //存放每一次Onsure_Press
	int howmuchspeed = 0 ;													 //幾種speed
	ObservableList<String> tonelist =FXCollections.observableArrayList
	("C","Cm","D","Dm","E","Em","F","Fm","G","Gm","A","Am","B","Bm");
	@FXML
	Media[] me =new Media[number_of_tone];
    MediaPlayer[] mp = new MediaPlayer[number_of_tone];
	MediaPlayer[] mix = new MediaPlayer[60];
	public ChoiceBox<String> list;
	public Button back;
	public Button sure;
	public TextField frequency;
	public TextField volume;
	//public TextField multiple;
	public TextField time;
	public TextField time1;
	
	
	@Override
	public void initialize(URL location, ResourceBundle rescources) {		//初始化mp[i],  mp[i]存放音檔
	for(int i = 0;i < number_of_tone;i++) {
	    me[i] = new Media(new File("mp3/"+i+".mp3").toURI().toString());    
		mp[i] = new MediaPlayer(me[i]);
	}
	 list.setItems(tonelist);
	}
	
    public void onSurePress(){
    	String sound = list.getValue();											//sound 紀錄目前選擇的鼓是哪一種
    	if(sound=="C") {
    		currentIndex=0;														//currentIndex 跟 sound一樣 只是一個是string 一個是int
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
    	}else if(sound=="D") {
    		currentIndex=1;
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
    	}else if(sound=="E") {
    		currentIndex=2;
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
    	}else if(sound=="F") {
    		currentIndex=3;
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
    	}else if(sound=="G") {
    		currentIndex=4;
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
    	}else if(sound=="A") {
    		currentIndex=5;
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
    	}else if(sound=="B") {
    		currentIndex=6;
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
    	}
    }
   
   public void onBackPress() {
       for(int i=0;i<mix.length;i++) {											//每4個為一組所以howmuchspeed/4+1代表有幾組							    
    			mix[i].play();
       }
    	/*
    	Timeline fps = new Timeline(new KeyFrame(Duration.second(1/speed[i+2]),for(int j=i;i<3;j++) {mix[j].play();}));
		fps.setCycleCount(Timeline.INDEFINITE);
		fps.play();
    	}*/
	   /* Timeline fps = new Timeline(
	    	new KeyFrame(Duration.second(1/speed[i+2]), for(int i = 0;i < number_of_tone;i++) {
		    mp[i].play();
		   }));
		fps.setCycleCount(Timeline.INDEFINITE);
		fps.play();
	  */
		Main_final.currentStage.setScene(Main_final.menuScene);
		} 
}
