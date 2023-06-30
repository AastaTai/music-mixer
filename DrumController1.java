package finalproject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class DrumController1  implements Initializable{
	
	ObservableList<String> drumList = FXCollections.observableArrayList
	("Bass Drum", "Floor Tom", "Snare Tom","Tom-tom", "Hi-hat", "Crash", "Ride", "Silence");
			
	ObservableList<Media> mediaList = FXCollections.observableArrayList(); 
	
	@FXML
	public ChoiceBox<String> list;
	public Button back;
	public Button sure;
	public TextField frequency;
	public TextField volume;
	public TextField time;
	public ImageView imageBD;
	public ImageView imageFT;
	public ImageView imageST;
	public ImageView imageTT;
	public ImageView imageHH;
	public ImageView imageC;
	public ImageView imageR;
	
	Media mediaBD = new Media(new File("mp3/BassDrum.mp3").toURI().toString());
	MediaPlayer playerBD= new MediaPlayer(mediaBD);
	Media mediaFT = new Media(new File("mp3/FloorTom.mp3").toURI().toString());
	MediaPlayer playerFT= new MediaPlayer(mediaFT);
	Media mediaST = new Media(new File("mp3/SnareTom.mp3").toURI().toString());
	MediaPlayer playerST= new MediaPlayer(mediaST);
	Media mediaTT = new Media(new File("mp3/Tomtom.mp3").toURI().toString());
	MediaPlayer playerTT= new MediaPlayer(mediaTT);
	Media mediaHH = new Media(new File("mp3/Hihat.mp3").toURI().toString());
	MediaPlayer playerHH= new MediaPlayer(mediaHH);
	Media mediaC = new Media(new File("mp3/Crash.mp3").toURI().toString());
	MediaPlayer playerC= new MediaPlayer(mediaC);
	Media mediaR = new Media(new File("mp3/Ride.mp3").toURI().toString());
	MediaPlayer playerR= new MediaPlayer(mediaR);
	Media mediaS = new Media(new File("mp3/silence.mp3").toURI().toString());
	MediaPlayer playerS= new MediaPlayer(mediaS);
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle rescources) {
		
		list.setItems(drumList);
	}
	
	public void onSurePress() {
		
		picture();
		
		int times = Integer.parseInt(time.getText());
		if(list.getSelectionModel().getSelectedItem() == "Bass Drum") {
			System.out.println("����BD");
			for(int i=1;i<=times;i++) {
				mediaList.add(mediaBD);
				System.out.println("�[��LIST BD");
			}
		}else if(list.getSelectionModel().getSelectedItem() == "Floor Tom") {
			System.out.println("����FT");
			for(int i=1;i<=times;i++) {
				mediaList.add(mediaFT);
				System.out.println("�[��LIST FT");
			}
		}else if(list.getSelectionModel().getSelectedItem() == "Snare Tom") {
			System.out.println("����ST");
			for(int i=1;i<=times;i++) {
				mediaList.add(mediaST);
				System.out.println("�[��LIST ST");
			}
		}else if(list.getSelectionModel().getSelectedItem() == "Tom-tom") {
			System.out.println("����TT");
			for(int i=1;i<=times;i++) {
				mediaList.add(mediaTT);
				System.out.println("�[��LIST TT");
			}
		}else if(list.getSelectionModel().getSelectedItem() == "Hi-hat") {
			System.out.println("����HH");
			for(int i=1;i<=times;i++) {
				mediaList.add(mediaHH);
				System.out.println("�[��LIST HH");
			}
		}else if(list.getSelectionModel().getSelectedItem() == "Crash") {
			System.out.println("����C");
			for(int i=1;i<=times;i++) {
				mediaList.add(mediaC);
				System.out.println("�[��LIST C");
			}
		}else if(list.getSelectionModel().getSelectedItem() == "Ride") {
			System.out.println("����R");
			for(int i=1;i<=times;i++) {
				mediaList.add(mediaR);
				System.out.println("�[��LIST R");
			}
		}else if(list.getSelectionModel().getSelectedItem() == "Silence") {
			System.out.println("����S");
			for(int i=1;i<=times;i++) {
				mediaList.add(mediaS);
				System.out.println("�[��LIST S");
			}
		}
		
	}
	
	public void onBackPress() {
		Main_final.currentStage.setScene(Main_final.menuScene);
	}
	
	public void onPlayPress() {
		System.out.println("�I����");
		playMediaTracks(mediaList); 
	}
	
	private void playMediaTracks(ObservableList<Media> mediaList) { 
	    if (mediaList.size() == 0) {
	    	return;
	    }
	       
	     
	    MediaPlayer mediaplayer = new MediaPlayer(mediaList.remove(0)); 
	    System.out.println("����@��" + mediaList.size());
	    mediaplayer.play();

	    mediaplayer.setOnEndOfMedia(new Runnable() { 
	    	@Override 
	    	public void run() { 
	    		playerBD.seek(Duration.ZERO);
	    		playerFT.seek(Duration.ZERO);
	    		playerST.seek(Duration.ZERO);
	    		playerTT.seek(Duration.ZERO);
	    		playerHH.seek(Duration.ZERO);
	    		playerC.seek(Duration.ZERO);
	    		playerR.seek(Duration.ZERO);
	    		playerS.seek(Duration.ZERO);
	    		 
	    		playMediaTracks(mediaList); 
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
		playerR.seek(Duration.ZERO);
		
		if(list.getSelectionModel().getSelectedItem() == "Bass Drum") {
			imageBD.setVisible(true);
			playerBD.play();
			playerBD.seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Floor Tom") {
			imageFT.setVisible(true);
			playerFT.play();
			playerFT.seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Snare Tom") {
			imageST.setVisible(true);
			playerST.play();
			playerST.seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Tom-tom") {
			imageTT.setVisible(true);
			playerTT.play();
			playerTT.seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Hi-hat") {
			imageHH.setVisible(true);
			playerHH.play();
			playerHH.seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Crash") {
			imageC.setVisible(true);
			playerC.play();
			playerC.seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Ride") {
			imageR.setVisible(true);
			playerR.play();
			playerR.seek(Duration.ZERO);
		}else if(list.getSelectionModel().getSelectedItem() == "Silence") {
			playerS.play();
			playerS.seek(Duration.ZERO);
		}
	}
	
}
