package application;

import java.io.IOException;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Doc519;
import view.Form519OverviewController;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;	
	

    
    @Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("�����");
        this.primaryStage.getIcons().add(new Image("file:resources/images/1481029999_Cauldron.png"));

        initRootLayout();
       // showScene();
      //  showPersonEditDialog(); 
	}

public void	initRootLayout()
	 {
	        try {
	            // ��������� �������� ����� �� fxml �����.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("/view/RootLayout.fxml"));
	            rootLayout = (BorderPane) loader.load();

	            // ���������� �����, ���������� �������� �����.
	            Scene scene = new Scene(rootLayout);
	            primaryStage.setScene(scene);
	            primaryStage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    /**
	     * ���������� � �������� ������ �������� �� ���������.
	     */
public void showScene() {
	        try {
	            // ��������� �������� �� ���������.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("/view/Form519.fxml"));
	            AnchorPane form519 = (AnchorPane) loader.load();

	            // �������� �������� �� ��������� � ����� ��������� ������.
	            rootLayout.setCenter(form519);
	            
	            
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    /**
	     * ���������� ������� �����.
	     * @return
	    */





public Stage getPrimaryStage() {
	    return primaryStage;
	    
	} 
		public static void main(String[] args) {
		launch(args);
	}
}
