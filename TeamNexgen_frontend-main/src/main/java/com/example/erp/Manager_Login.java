package com.example.erp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Manager_Login implements Initializable{
    @FXML
    private Button btn_next;
    @FXML
    private TextField Manager_Login_nm;

    @FXML
    private TextField Manager_Login_pw;

    @FXML
    private TextField Manager_Login_bc;

    @FXML
    private Button Manager_join_btn;
    @FXML
    private Label welcomeText;

    DataSingleton dataSingleton = com.example.erp.DataSingleton.getInstance();
    public void initialize(URL location, ResourceBundle resources) {
        Manager_join_btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) { try {
                Parent Manager_join = FXMLLoader.load(getClass().getResource("Manager_join.fxml"));

                // 새로운 Scene 생성
                Scene scene = new Scene(Manager_join, 770, 630); // 넓이 770, 높이 630 설정

                // 새로운 Stage 생성
                Stage stage = new Stage();
                stage.setScene(scene);

                // Stage를 DataSingleton에 저장
                dataSingleton.setManagerJoinStage(stage);

                // Stage 표시
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            }
        });

    }


}