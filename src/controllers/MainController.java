
package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Muhammad anas
 */
public class MainController {
@FXML
Label price,items,condition;
@FXML
Button menubtn,alter,setting;
@FXML
AnchorPane main,menu,third,deals;
 
public void menu(){
main.setVisible(false);
menu.setVisible(true);



}


}
