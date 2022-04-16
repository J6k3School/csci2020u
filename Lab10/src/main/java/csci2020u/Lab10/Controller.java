package csci2020u.Lab10;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class Controller {
    @FXML
    private TextArea MessageL;
    @FXML
    private TextField UserNameL;
    @FXML
    private javafx.scene.control.Button ExitB;

    String User;
    String message;

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void moveToFX2(ActionEvent event) throws IOException {
        User = UserNameL.getText();
        message = MessageL.getText();
        FXMLLoader loader = FXMLLoader.load(getClass().getResource("lab10fx2.fxml"));
        root = loader.load();
        Controller2 controller2 = loader.getController();
        controller2.message2 = message;
        controller2.User2 = User;
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    private void exitS(){
        Stage stage = (Stage) ExitB.getScene().getWindow();
        stage.close();
    }


}
