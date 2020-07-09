package pt.iscte.pidesco.tasklist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import pt.iscte.pidesco.taskUtils.Task;

public class TaskEngine {

	private final static String TODOWORD = "//TODO";

	private Map<String, Task> listOfTasks = new HashMap<>();

	public TaskEngine(String pathToWorkSpace) {

		/*
		 * BundleContext context = Activator.getContext();
		 * 
		 * ServiceReference<JavaEditorServices> serviceReference =
		 * context.getServiceReference(JavaEditorServices.class); JavaEditorServices
		 * javaServ = context.getService(serviceReference);
		 * 
		 * // First step, open the file in the editor javaServ.openFile(file);
		 * 
		 * javaServ.parseFile(file, this);
		 */

		File folderOfRunTime = new File(pathToWorkSpace);

		File[] listOfFiles = folderOfRunTime.listFiles();

		for (File file : listOfFiles) {

			int location = 1;
			if (file.isFile()) {
				// System.out.println(file.getName());

				try {
					Scanner in = new Scanner(file);

					while (in.hasNextLine()) {

						String line = in.nextLine();
						// System.out.println(line);

						String[] vector = line.split(" ");

						String specialWord = vector[0].trim();

						if (specialWord.equals(TODOWORD)) {

							String resource = file.getName();
							String path = file.getPath();
							String locationS = location + "";

							Task task;
							
							System.out.println(resource);
							System.out.println(line);
							System.out.println(path);
							System.out.println(locationS);

							System.out.println("###################");

							task = new Task(line, resource, path, locationS);
							/*
							 * if (vector[1].equalsIgnoreCase("LOW")) {
							 * 
							 * } else if (vector[1].equalsIgnoreCase("MEDIUM")) {
							 * 
							 * } else {
							 * 
							 * }
							 */

							String chave = path + locationS;

							listOfTasks.put(chave, task);

						}
						location++;
					}

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		//System.out.println(listOfTasks.size());

	}

	public static void main(String args[]) {
		TaskEngine task = new TaskEngine(
				"C:\\Users\\KWAN\\Desktop\\METI\\1Semestre\\Programação Avançada\\Projeto\\Project_ pa-iscde\\runtime-ISCDE");

	}

}
