package student_management.ui.frame;

import student_management.dto.Department;
import student_management.ui.panel.AbsItemPanel;
import student_management.ui.panel.DepartmentPanel;

@SuppressWarnings("serial")
public class DepartmentManagementFrame extends AbsManagementFrame<Department>{
	private DepartmentPanel deptPanel;
	
	public DepartmentManagementFrame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected AbsItemPanel<Department> createItemPanel() {
		deptPanel = new DepartmentPanel();
		return deptPanel;
	}

	@Override
	protected Department getItem() {
		return deptPanel.getItem();
	}
	
}
