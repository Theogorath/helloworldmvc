package helloworldmvc.main;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller(new View(), new Model());
		controller.run();
	}
	
}
