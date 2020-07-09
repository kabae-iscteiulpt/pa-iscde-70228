package pt.iscte.pidesco.extensibility;

import java.util.HashMap;

import pt.iscte.pidesco.taskUtils.Task;

public interface TaskServices {

	/**
	 * Gets the list of tasks implementing this method.
	 * 
	 * @param pathOfRuntimeWorkSpace
	 * @return list of tasks
	 */
	HashMap<String, Task> getListOfTasks(String pathOfRuntimeWorkSpace);

}
