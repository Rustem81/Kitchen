package view;


import java.io.File;

import org.controlsfx.dialog.Dialogs;

import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import util.DateUtil;


/**
 * Окно для изменения информации об адресате.
 * 
 */
public class Form519OverviewController {

	@FXML
    private TextField Date;
    @FXML
    private TextField PeopelKassa;
    @FXML
    private TextField PeopelEconomist;
    @FXML
    private TextField SumRUR;
    @FXML
    private TextField SumUSD;
    @FXML
    private TextField SumEUR;
    @FXML
    private TextField Cash_blank_Write;
    @FXML
    private TextField Cash_blank_Empty;
    @FXML
    private TextField Case_key_box;
    @FXML
    private TextField Case_key_TU;
    @FXML
    private TextField Case_GOLD_IBS;
    @FXML
    private TextField Service_card_ATM;
    @FXML
    private TextField Card_Person;
    @FXML
    private TextField Card_prepar_TU;
    @FXML
    private TextField Veksel_noWrite;
    @FXML
    private TextField Veksel_Write;


    private Stage dialogStage;
    private boolean okClicked = false;

    public boolean isOkClicked() {
        return okClicked;
    }


    /**
     * Инициализирует класс-контроллер. Этот метод вызывается автоматически
     * после того, как fxml-файл будет загружен.
     */
    @FXML
    private void initialize() {
    	
    }
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    @FXML
    private void handleOk() {
    	
    
    	String val= PeopelKassa.getText();
    	
    	System.out.println("ok" + val );
     }
    
 	/**
     * Вызывается, когда пользователь кликнул по кнопке Cancel.
     */
    @FXML
    private void handleCancel() {
    	
    	 System.out.println("Cancel");
    }
    
    
}