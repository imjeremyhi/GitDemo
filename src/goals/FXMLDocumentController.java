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
import javafx.scene.control.Label;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.stage.Stage;

/**
 *
 * @author Aaron
 */
public class FXMLDocumentController implements Initializable {

    
    @FXML
    private void handleButton1(ActionEvent event) throws IOException {
        System.out.println("Set goals");
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        Scene scene = new Scene(root);
        Stage stage = Goals.getStage();
        stage.setScene(scene);

    }

    @FXML
    private void handleButton2(ActionEvent event) throws IOException {
        System.out.println("View goals");
        Parent root = FXMLLoader.load(getClass().getResource("ViewGoals.fxml"));
        Scene scene = new Scene(root);
        Stage stage = Goals.getStage();
        stage.setScene(scene);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
