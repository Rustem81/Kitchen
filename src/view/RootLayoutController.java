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
	 * ����������, ����� ������������ ������� �� ������ New...
	 * ��������� ���������� ���� � �������������� ����������� ������ ��������.
	 */
	@FXML
	private void handleNewPerson() {
			this.showPersonEditDialog();
	 
	}

	public boolean showPersonEditDialog() {
	    try {
	        // ��������� fxml-���� � ������ ����� �����
	        // ��� ������������ ����������� ����.
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainApp.class.getResource("/view/Form519.fxml"));
	        
	        AnchorPane page = (AnchorPane) loader.load();

	        // ������ ���������� ���� Stage.
	    	Stage dialogStage = new Stage();
			dialogStage.setTitle("�������� �����");
			dialogStage.initModality(Modality.WINDOW_MODAL);
//			dialogStage.initOwner(primaryStage);
			dialogStage.getIcons().add(new Image("file:resources/images/1481029999_Cauldron.png"));
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

	        // ������� �������� � ����������.
	        Form519OverviewController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	 //       controller.setPerson(person);

	        // ���������� ���������� ���� � ���, ���� ������������ ��� �� �������
	        dialogStage.showAndWait();

	        return controller.isOkClicked();
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	/**
	 * ����������, ����� ������������ ������� �� ������ Edit...
	 * ��������� ���������� ���� ��� ��������� ���������� ��������.
	 
	@FXML
	private void handleEditPerson() {
	    Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
	    if (selectedPerson != null) {
	        boolean okClicked = mainApp.showPersonEditDialog(selectedPerson);
	        if (okClicked) {
	            showPersonDetails(selectedPerson);
	        }

	    } else {
	        // ������ �� �������.
	        Alert alert = new Alert(AlertType.WARNING);
	        alert.initOwner(mainApp.getPrimaryStage());
	        alert.setTitle("No Selection");
	        alert.setHeaderText("No Person Selected");
	        alert.setContentText("Please select a person in the table.");

	        alert.showAndWait();
	    }
	}*/

}
