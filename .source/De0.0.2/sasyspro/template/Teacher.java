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
	private final String templatetype = "Teacher"; // This template type
	private String name;
	private int age;
	private char gender;
	private int No;
	private String getProjDate;
	private String Proj;
	private String classProj;
	private double khMark;
	public ArrayList<String> permission = new ArrayList<String>();

	public Teacher() {
		System.out.println("将创建空教师模板");
	}
	
	public Teacher(String name,int age,char gender,String getProjDate) {
		this.name = name;
		this.age = age;
		this.gender= gender;
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
	public Teacher(String name,int age,char gender,String getProjDate,String Proj,String classProj,double khMark) {
		this(name,age,gender,getProjDate);
		this.Proj = Proj;
		this.classProj = classProj;
		this.khMark = khMark;
	}
	public final static boolean getIsEnabled() {
		return isEnabled;
	}

	public final String getType() {
		return this.templatetype;
	}

	public final static void setIsEnabled(boolean Enabled) {
		isEnabled = Enabled;
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

	public final void setNo(int No) {
		this.No = No;
	}

	public final int getNo() {
		return this.No;
	}

	public final double getkhMark() {
		return this.khMark;
	}

	public final void setkhMark(double khMark) {
		this.khMark = khMark;
	}

	public final String getGetProjDate() {
		return this.getProjDate;
	}

	public final void setGetProjDate(String getProjDate) {
		this.getProjDate = getProjDate;
	}

	public final String getProj() {
		return this.Proj;
	}

	public final void setProj(String Proj) {
		this.Proj = Proj;
	}

	public final String getClassProj() {
		return this.classProj;
	}

	public final void setClassProj(String classProj) {
		this.classProj = classProj;
	}

	@Override
	public final String toString() {
		String msg = "\t" + this.No + "\t" + this.name + "\t" + this.age + "\t" + this.gender + "\t" + this.getProjDate
				+ "\t" + this.Proj + "\t" + this.classProj + "\t" + this.khMark;
		return msg;
	}
}
