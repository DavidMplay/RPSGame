package com.mycompany.rockpaperscissors;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class MainUI {

    private GameLogic gameLogic;

    public MainUI() {
        gameLogic = new GameLogic();
    }

    public Parent getView() {
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(25);
        layout.setAlignment(Pos.TOP_CENTER);
        layout.setPrefSize(320, 240);
        HBox playOptions = new HBox();
        playOptions.setSpacing(5);
        playOptions.setAlignment(Pos.CENTER);

        Label opponentsHand = new Label("");
        Label winOrLoss = new Label("");
        Button rock = new Button("Rock");
        Button paper = new Button("Paper");
        Button scissors = new Button("Scissors");

        opponentsHand.setPrefWidth(160);
        opponentsHand.setAlignment(Pos.CENTER);
        winOrLoss.setAlignment(Pos.CENTER);
        winOrLoss.setPrefWidth(160);
        
        
        rock.setOnMouseClicked(event -> {
            opponentsHand.setText(gameLogic.play());
            switch (opponentsHand.getText()) {
                case ("Rock"):
                    winOrLoss.setText("Draw");
                    return;
                case ("Paper"):
                    winOrLoss.setText("Loss");
                    return;
                case ("Scissors"):
                    winOrLoss.setText("Win");
                    return;
            }
        });
        paper.setOnMouseClicked(event -> {
            opponentsHand.setText(gameLogic.play());
            switch (opponentsHand.getText()) {
                case ("Rock"):
                    winOrLoss.setText("Win");
                    return;
                case ("Paper"):
                    winOrLoss.setText("Draw");
                    return;
                case ("Scissors"):
                    winOrLoss.setText("Loss");
                    return;
            }
        });
        scissors.setOnMouseClicked(event -> {
            opponentsHand.setText(gameLogic.play());
            switch (opponentsHand.getText()) {
                case ("Rock"):
                    winOrLoss.setText("Loss");
                    return;
                case ("Paper"):
                    winOrLoss.setText("Win");
                    return;
                case ("Scissors"):
                    winOrLoss.setText("Draw");
                    return;
            }
        });

        playOptions.getChildren().addAll(rock, paper, scissors);
        layout.add(playOptions, 0, 0);
        layout.add(opponentsHand, 0, 1);
        layout.add(winOrLoss, 0, 2);
        return layout;
    }
}
