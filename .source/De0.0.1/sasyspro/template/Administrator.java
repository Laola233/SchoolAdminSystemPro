package sasyspro.template;

/**
 * @author Laola233
 * @serial SchoolAdminSystemPro
 * @version 0.1B
 * @since 0.1B <br>
 *        <strong> ����Աģ�� </strong>
 */
public class Administrator {
	private static boolean isEnabled = true; // Whether this template should be enabled?
	private String templatetype = "Administrator";// This template type
	private String name;
	private int age;
	private char gender;
	private String getJobDate;
	private String Job;
	private String adminClasses;
	private int No;
	public String[] permission = new String[99999];

	public final int checkLast() {
		for (int i = 0; i < permission.length; i++) {
			if (permission[i] == null) {
				return i;
			}
		}
		return permission.length;
	}

	public final static boolean getIsEnabled() {
		return isEnabled;
	}

	public final String getType() {
		return this.templatetype;
	}

	@SuppressWarnings("static-access")
	public final void setIsEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public final String getName() {
		return this.name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getAge() {
		return this.age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final char getGender() {
		return this.gender;
	}

	public final void setGender(char gender) {
		this.gender = gender;
	}

	public final String getGetJobDate() {
		return this.getJobDate;
	}

	public final void setGetJobDate(String getJobDate) {
		this.getJobDate = getJobDate;
	}

	public final String getJob() {
		return this.Job;
	}

	public final void setJob(String Job) {
		this.Job = Job;
	}

	public final int getNo() {
		return this.No;
	}

	public final void setNo(int No) {
		this.No = No;
	}

	public final String getAdminClasses() {
		return this.adminClasses;
	}

	public final void setAdminClasses(String adminClasses) {
		this.adminClasses = adminClasses;
	}

	@Override
	public final String toString() {
		String msg = "\t" + this.No + "\t" + this.name + "\t" + this.age + "\t" + this.gender + "\t" + this.getJobDate
				+ "\t" + this.Job + "\t" + this.adminClasses;
		return msg;
	}

}
