package com.example.erp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Manager_join implements  Initializable{
    public Button Manager_login;
    @FXML
    private Button Manager_join_close_btn;
    @FXML
    private Parent Manager_join;

    DataSingleton dataSingleton = DataSingleton.getInstance();
    public void initialize(URL location, ResourceBundle resources) {
        Manager_join_close_btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent actionEvent){
                try {
                    // DataSingleton에서 Stage를 가져와 닫음
                    Stage stage = dataSingleton.getManagerJoinStage();
                    stage.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
