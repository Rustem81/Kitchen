package view;

import java.io.IOException;

import application.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class RootLayoutController {
	 private MainApp mainApp;
	
	/**
	 * Вызывается, когда пользователь кликает по кнопке New...
	 * Открывает диалоговое окно с дополнительной информацией нового адресата.
	 */
	@FXML
	private void handleNewPerson() {
			this.showPersonEditDialog();
	 
	}

	public boolean showPersonEditDialog() {
	    try {
	        // Загружаем fxml-файл и создаём новую сцену
	        // для всплывающего диалогового окна.
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainApp.class.getResource("/view/Form519.fxml"));
	        
	        AnchorPane page = (AnchorPane) loader.load();

	        // Создаём диалоговое окно Stage.
	    	Stage dialogStage = new Stage();
			dialogStage.setTitle("Добавить отчет");
			dialogStage.initModality(Modality.WINDOW_MODAL);
//			dialogStage.initOwner(primaryStage);
			dialogStage.getIcons().add(new Image("file:resources/images/1481029999_Cauldron.png"));
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

	        // Передаём адресата в контроллер.
	        Form519OverviewController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	 //       controller.setPerson(person);

	        // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
	        dialogStage.showAndWait();

	        return controller.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	/**
	 * Вызывается, когда пользователь кликает по кнопка Edit...
	 * Открывает диалоговое окно для изменения выбранного адресата.
	 
	@FXML
	private void handleEditPerson() {
	    Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
	    if (selectedPerson != null) {
	        boolean okClicked = mainApp.showPersonEditDialog(selectedPerson);
	        if (okClicked) {
	            showPersonDetails(selectedPerson);
	        }

	    } else {
	        // Ничего не выбрано.
	        Alert alert = new Alert(AlertType.WARNING);
	        alert.initOwner(mainApp.getPrimaryStage());
	        alert.setTitle("No Selection");
	        alert.setHeaderText("No Person Selected");
	        alert.setContentText("Please select a person in the table.");

	        alert.showAndWait();
	    }
	}*/

}
