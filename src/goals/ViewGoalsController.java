/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Aaron
 */
public class ViewGoalsController implements Initializable {

    @FXML
    TextArea goal;

    /**
     * Initializes the controller class.
     */
           

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            BufferedReader viewGoal = new BufferedReader(new FileReader("Goals.txt"));
            String text;
            while ((text = viewGoal.readLine()) != null) {
                goal.appendText("\n" + text);
            }

        } catch (IOException ex) {
            Logger.getLogger(ViewGoalsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }


