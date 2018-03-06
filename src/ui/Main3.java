package ui;

import java.security.acl.Group;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main3 extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}
	
	
	public void start(Stage stage) throws Exception 
	{
		BorderPane border = new BorderPane();
		
		HBox top=new HBox();
		HBox center=new HBox();
		HBox bottom=new HBox();
		
		
		top.setPadding(new Insets(40, 50, 40, 150));
	    top.setSpacing(10);
	    top.setStyle("-fx-background-color:orange;"+"-fx-background-radius:8;");
		
		Label title= new Label("LilljeHolmen Garage Application");
		title.setFont(new Font( 30));
		top.getChildren().add(title);
		border.setTop(top);
		
		
		
		TextField regNumber=new TextField("");
		Label vehicleNumber= new Label("Enter Vehicle Number :");
		vehicleNumber.setFont(new Font( 20));
		center.getChildren().addAll(vehicleNumber,regNumber);
		border.setCenter(center);
		
		
		center.setPadding(new Insets(50, 50, 50, 150));
	    center.setSpacing(30);
	    center.setStyle("-fx-background-color: ;");
		
		

	     Button park= new Button("Park");
	     Button unPark= new Button("Unpark");
	     Button seeAll= new Button("See All Vehicle");
	     Button find= new Button("Find");
	     Button exit= new Button("Exit");
	     
	     park.setPrefSize(70, 20);
	     unPark.setPrefSize(70, 20);
	     seeAll.setPrefSize(120, 20);
	     find.setPrefSize(70, 20);
	     exit.setPrefSize(70, 20);
	     
	     bottom.getChildren().addAll(park,unPark,seeAll,find,exit);
	     
	     	border.setBottom(bottom);
	     
	        bottom.setPadding(new Insets(40, 50, 40, 150));
		    bottom.setSpacing(10);
		    bottom.setStyle("-fx-background-color:orange;"+"-fx-background-radius:8;");
		
		    border.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
			        + "-fx-border-width: 6;" + "-fx-border-insets: 5;"
			        + "-fx-border-radius: 8;" + "-fx-border-color: orange;");
		
		
	    Scene scene=new Scene(border,800,400);
	    
	    stage.setScene(scene);
		stage.setTitle("LilljHolmen GarageApplication");
		stage.centerOnScreen();
		stage.setResizable(false);
		stage.show();
	   
	}

}
