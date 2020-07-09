package pt.iscte.pidesco.tasklist;

import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.osgi.framework.BundleContext;

import pt.iscte.pidesco.extensibility.PidescoView;

public class TaskComponent implements PidescoView {

	@Override
	public void createContents(Composite viewArea, Map<String, Image> imageMap) {
		
		
		BundleContext context = Activator.getContext();
		
		
		
		
		
		
		
		

		// TODO KEVEN
		// TODO ANYEVER

		Table table = new Table(viewArea, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		table.setLayoutData(data);

		// example

		String[] titles = { "Check", "Priority", "Description", "Resource", "Path", "Location" };
		for (int i = 0; i < titles.length; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setText(titles[i]);
			table.getColumn(i).pack();
		}

		TableItem item = new TableItem(table, SWT.NONE);
		item.setText(0, "Done");
		item.setText(1, "LOW");
		item.setText(2, "Mudar método... ");
		item.setText(3, "TaskList.java");
		item.setText(4, "pt.iscte.tasklist.TaskList.java");
		item.setText(5, "line 16");

	}

}
