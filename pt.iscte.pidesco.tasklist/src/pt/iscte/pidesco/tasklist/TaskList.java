package pt.iscte.pidesco.tasklist;

import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class TaskList implements pt.iscte.pidesco.extensibility.PidescoView {

	@Override
	public void createContents(Composite viewArea, Map<String, Image> imageMap) {

		// TODO KEVEN
		// TODO ANYEVER

		Table table = new Table(viewArea, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		table.setLayoutData(data);

		String[] titles = { "Check", "Description", "Resource", "Path", "Location", "Priority", "Initial date ",
				"Final Date" };
		for (int i = 0; i < titles.length; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setText(titles[i]);
			table.getColumn(i).pack();
		}

		TableItem item = new TableItem(table, SWT.NONE);
		item.setText(0, "Done");
		item.setText(1, "Mudar método... ");
		item.setText(2, "TaskList.java");
		item.setText(3, "pt.iscte.tasklist.TaskList.java");
		item.setText(4, "line 16");
		item.setText(5, "LOW");
		item.setText(6, "21/12/2019");
		item.setText(7, "22/12/2019");

	}

}
