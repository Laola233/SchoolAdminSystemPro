package sasyspro.template;

import java.util.ArrayList;

/**
 * @author Laola233
 * @serial SchoolAdminSystemPro
 * @version 0.2B
 * @since 0.1B <br>
 *        <strong> 教师模板 </strong>
 */
public class Teacher {
	private static boolean isEnabled = true; // Whether this template should be enabled?

	public final static boolean getIsEnabled() {
		return isEnabled;
	}

	public final static void setIsEnabled(boolean Enabled) {
		isEnabled = Enabled;
	}

	private int age;
	private String classProj;
	private char gender;
	private String getProjDate;
	private double khMark;
	private String name;
	private int No;
	public ArrayList<String> permission = new ArrayList<String>();

	private String Proj;

	private final String templatetype = "Teacher"; // This template type

	public Teacher() {
		System.out.println("将创建空教师模板");
	}

	public Teacher(String name, int age, char gender, String getProjDate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.getProjDate = getProjDate;
	}

	/**
	 * @deprecated
	 * @param name
	 * @param age
	 * @param gender
	 * @param getProjDate
	 * @param Proj
	 * @param classProj
	 * @param khMark
	 */
	public Teacher(String name, int age, char gender, String getProjDate, String Proj, String classProj,
			double khMark) {
		this(name, age, gender, getProjDate);
		this.Proj = Proj;
		this.classProj = classProj;
		this.khMark = khMark;
	}

	public final int getAge() {
		return this.age;
	}

	public final String getClassProj() {
		return this.classProj;
	}

	public final char getGender() {
		return this.gender;
	}

	public final String getGetProjDate() {
		return this.getProjDate;
	}

	public final double getkhMark() {
		return this.khMark;
	}

	public final String getName() {
		return this.name;
	}

	public final int getNo() {
		return this.No;
	}

	public final String getProj() {
		return this.Proj;
	}

	public final String getType() {
		return this.templatetype;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final void setClassProj(String classProj) {
		this.classProj = classProj;
	}

	public final void setGender(char gender) {
		this.gender = gender;
	}

	public final void setGetProjDate(String getProjDate) {
		this.getProjDate = getProjDate;
	}

	public final void setkhMark(double khMark) {
		this.khMark = khMark;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final void setNo(int No) {
		this.No = No;
	}

	public final void setProj(String Proj) {
		this.Proj = Proj;
	}

	@Override
	public final String toString() {
		String msg = "\t" + this.No + "\t" + this.name + "\t" + this.age + "\t" + this.gender + "\t" + this.getProjDate
				+ "\t" + this.Proj + "\t" + this.classProj + "\t" + this.khMark;
		return msg;
	}
}
