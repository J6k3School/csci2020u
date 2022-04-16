package csci2020u.Lab10;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2 implements Initializable{
    @FXML
    private Label LabelM;
    String Printed;
    String User2;
    String message2;

    private Stage stage;
    private Scene scene;
    private Parent root;
    public void moveToFX(javafx.event.ActionEvent event) throws IOException {

        FXMLLoader loader = FXMLLoader.load(getClass().getResource("lab10fx.fxml"));
        root = loader.load();
        scene = new Scene(root);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Printed = Printed + User2 + "\n" + message2 + "\n";
        LabelM.setText(Printed);
    }
}
