package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAOHelloWorld {
	private static String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	public DAOHelloWorld(){
		this.readFile();
	}

	public static DAOHelloWorld getInstance() {
		setInstance(new DAOHelloWorld());
		return instance;
	}

	private static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}
	
	private void readFile(){
		BufferedReader buffer;
		try{
			buffer = new BufferedReader(new InputStreamReader(new FileInputStream(FileName)));
			this.setHelloWorldMessage(buffer.readLine());
			buffer.close();
		}
		catch (FileNotFoundException exception){
			exception.printStackTrace();
		}
		catch (IOException exception){
			exception.printStackTrace();
		}
	}
	
	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
	
}
