package pt.iscte.pidesco.tasklist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import pt.iscte.pidesco.javaeditor.internal.JavaEditorServicesImpl;

public class TaskMotor {

	private JavaEditorServicesImpl servicesImplement = new JavaEditorServicesImpl(null);

	private File fileOpened = servicesImplement.getOpenedFile();



	public TaskMotor() throws FileNotFoundException {

		Scanner scanner = new Scanner(fileOpened);
		 
	}
}
