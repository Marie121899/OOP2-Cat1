
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FacebookRegistration extends Application {

    public static void main(String[]args){
     launch(args);

 	}

    @Override
 	public void start(Stage stage){
 	Text text1= new Text("First name");
 	Text text2= new Text("Last name");
 	Text text3= new Text("Date Of Birth");
 	Text text4= new Text("New Password");
 	Text text5= new Text("Confirm password");
 	Text text6= new Text("Phone number");

 	TextField textField1 = new TextField();
 	TextField textField2 = new TextField();
 	TextField textField3 = new TextField();
 	TextField textField4 = new TextField();
 	PasswordField textField5 = new PasswordField();
 	PasswordField textField6 = new PasswordField();
 	Button button1 = new Button("Create Account");

 	button1.setOnAction(e -> {
       System.out.print("Thank you for registering to facebook Application");
       button1.setStyle("-fx-background-color: blue; -fx-text-fill: blue;");

 	});

 	GridPane gridPane = new GridPane();
 	gridPane.setMinSize(800, 400);
 	gridPane.setPadding(new Insets(20, 20, 20, 20));

 	gridPane.setVgap(5);
 	gridPane.setHgap(5);

 	gridPane.setAlignment(Pos.CENTER);
 	gridPane.add(text1 ,0, 0);
 	gridPane.add(textField1 ,1, 0);
 	gridPane.add(text2 ,0, 1);
 	gridPane.add(textField2 ,1, 1);
 	gridPane.add(text3 ,0, 2);
 	gridPane.add(textField3 ,1, 2);
 	gridPane.add(text4 ,0, 3);
 	gridPane.add(textField4 ,1, 3);
 	gridPane.add(text5 ,0, 4);
 	gridPane.add(textField5 ,1, 4);
 	gridPane.add(text6 ,0, 5);
 	gridPane.add(textField6 ,1, 5);
 	gridPane.add(button1, 1, 6);

 	button1.setStyle("-fx-background-color: maroon; -fx-text-fill: white;");

 	text1.setStyle("-fx-font: normal bold 20px 'serif' ");
 	text2.setStyle("-fx-font: normal bold 20px 'serif' ");
 	text3.setStyle("-fx-font: normal bold 20px 'serif' ");
 	text4.setStyle("-fx-font: normal bold 20px 'serif' ");
 	text6.setStyle("-fx-font: normal bold 20px 'serif' ");
 	gridPane.setStyle("-fx-background-color: BLUE;");

 	Scene scene = new Scene(gridPane);

 	stage.setTitle("Sign Up Page ");
 	stage.setScene(scene);
 	stage.show();
 	}
}
