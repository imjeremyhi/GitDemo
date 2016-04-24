/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goals;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Aaron
 */
public class Scene2Controller implements Initializable {

    @FXML
    private Button cancel;
    @FXML
    private TextArea w;
    @FXML
    private TextArea o1;
    @FXML
    private TextArea o2;
    @FXML
    private TextArea p;

    @FXML
    private void handleButtonCancel(ActionEvent event) throws IOException {
        System.out.println("Cancel");
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        Stage stage = Goals.getStage();
        stage.setScene(scene);

    }

    @FXML
    private void handleButtonSubmit(ActionEvent event) 
        throwss IOException{
        System.out.println("Goal has been saved");

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
