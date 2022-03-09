package csci2020u.Lab04;

import javafx.event.ActionEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RegistrationFormController{
    public TextField uSF,fNF,eMF,pNF;
    public PasswordField pF;
    public DatePicker bDP;
    public void buttonPress(ActionEvent event){
        String phoneN = pNF.getText();
        String b = pNF.getText();
        String phoneNum;
        String a = phoneN.substring(4, 10);
        phoneNum = a;
        phoneNum += "-";
        phoneN.substring(0, 3);
        a = phoneN.substring(6,10);
        phoneNum += a + "-";
        phoneNum += b.substring(0, 6);

        System.out.println(uSF.getText());
        System.out.println(pF.toString());
        System.out.println(fNF.getText());
        System.out.println(eMF.getText());
        System.out.println(phoneNum);
        System.out.println(bDP.getValue());
    }
}

