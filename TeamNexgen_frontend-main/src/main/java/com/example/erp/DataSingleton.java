package com.example.erp;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class DataSingleton {
    private String data = "test";
    private static final DataSingleton instance = new DataSingleton();

    private DataSingleton(){}

    public static DataSingleton getInstance() { //getter
        return instance;
    }

    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

    private Stage managerJoinStage;

    public Stage getManagerJoinStage() {
        return managerJoinStage;
    }

    public void setManagerJoinStage(Stage managerJoinStage) {
        this.managerJoinStage = managerJoinStage;
    }
}
