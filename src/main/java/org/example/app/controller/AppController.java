package org.example.app.controller;

import org.example.app.model.AppModel;
import org.example.app.utils.Constants;
import org.example.app.view.AppView;

public class AppController {
    AppModel model;
    AppView view;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;

    }
    public void runApp(){
filterChoise(Integer.parseInt(view.chooseOption()));
    }

    public void filterChoise(int choise) {
        switch (choise) {
            case 1 -> model.readAllPosts();
            case 2 -> model.readPostById();
            case 0 -> {
                String output = Constants.APP_CLOSED_MSG;
                view.getOutput(output, Integer.toString(choise));

            }
            default -> throw new IllegalStateException("Unexpected value: " + choise);
        }
    }
}
