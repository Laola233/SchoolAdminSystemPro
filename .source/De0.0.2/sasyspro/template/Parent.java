package sasyspro.template;

import java.util.ArrayList;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.2B
 *
 */
public class Parent {
	private static boolean isEnabled = true; // Whether this template should be enabled?
	private final String templatetype = "Parent"; // This template type
	private int ArrayNo;
	private String name;
	private String[] relationship = new String[3];
	private ArrayList<Student> bindstudent = new ArrayList<Student>(3);
	private int No;
	public ArrayList<String> permission = new ArrayList<String>();

	{
		ArrayNo = 0;
	}

	public Parent() {
		System.out.println("��ģ���Ѵ���");
	}

	public Parent(String name) {
		this.name = name;
	}

	/**
	 * @deprecated
	 * @param name
	 * @param relationship
	 * @param bindstu
	 * @throws Exception
	 */
	public Parent(String name, String[] relationship, ArrayList<Student> bindstu) throws Exception {
		this(name);
		this.relationship = relationship;
		this.bindstudent = bindstu;
	}
	
	public int getNo() {
		return this.No;
	}
	
	public void setNo(int No)throws Exception {
		this.No = No;
	}
	public final String getType() {
		return this.templatetype;
	}

	public final static boolean getIsEnabled() {
		return isEnabled;
	}
	
	public final static void setIsEnabled(boolean status) {
		isEnabled = status;
	}

	public final void setBindStu(Student stu) {
		bindstudent.add(stu);
	}

	public final String getBindStu() throws Exception {
		return this.bindstudent.get(0).getName() + this.bindstudent.get(1).getName()
				+ this.bindstudent.get(2).getName();
	}
	
	public final Object[] getBindStu(boolean dothis) throws Exception {
		return this.bindstudent.toArray();
	}

	public final void setBindRelationShip(String rea) throws Exception {
		if (ArrayNo > 2) {
			return;
		}
		relationship[ArrayNo] = rea;
		ArrayNo++;
	}

	public final String getBindRealationShip() throws Exception {
		return this.relationship[0] + this.relationship[1] + this.relationship[2];
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getName() {
		return this.name;
	}

	@Override
	public final String toString() {
		try {
			return this.name +"\t"+this.getBindRealationShip()+ "\t\t\t\t\t\t\t\t" + this.getBindStu();
		} catch (Exception e) {
			return "Error!";
		}
	}
}
