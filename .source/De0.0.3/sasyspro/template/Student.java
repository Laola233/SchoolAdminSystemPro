package sasyspro.template;

import java.util.ArrayList;

/**
 * @author Laola233
 * @serial SchoolAdminSystemPro
 * @version 0.2B
 * @since 0.1B <br>
 *        <strong> 学生模板 </strong>
 */
public class Student {
	private static boolean isEnabled = true; // Whether this template should be enabled?

	public final static boolean getIsEnabled() {
		return isEnabled;
	}

	public final static void setIsEnabled(boolean Enabled) {
		isEnabled = Enabled;
	}

	private int age;
	private double avg;
	private Parent bindedparent;
	private double biology;
	private double chemistry;
	private double chinese;
	private int educatenum;
	private double english;
	private String enterdate;
	private char gender;
	private double geography;
	private double history;
	private double IT;
	private double maths;
	private String name;
	private int on;
	private double PE;
	public ArrayList<String> permission = new ArrayList<String>();
	private double physics;
	private double political;

	private double sum;

	private final String templatetype = "Student";// This template type

	public Student() {
		System.out.println("将创建空模板");
	}

	public Student(String name, int age, char gender, String enterdate, int educationnum) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.enterdate = enterdate;
		this.educatenum = educationnum;
	}

	/**
	 * @deprecated
	 * @param name
	 * @param age
	 * @param gender
	 * @param enterdate
	 * @param educationnum
	 * @param chinese
	 * @param maths
	 * @param english
	 * @param physics
	 * @param chemistry
	 * @param histry
	 * @param political
	 * @param geography
	 * @param biology
	 * @param PE
	 * @param IT
	 */
	public Student(String name, int age, char gender, String enterdate, int educationnum, double chinese, double maths,
			double english, double physics, double chemistry, double histry, double political, double geography,
			double biology, double PE, double IT) {
		this(name, age, gender, enterdate, educationnum);
		this.chinese = chinese;
		this.maths = maths;
		this.english = english;
		this.physics = physics;
		this.chemistry = chemistry;
		this.history = histry;
		this.political = political;
		this.geography = geography;
		this.biology = biology;
		this.PE = PE;
		this.IT = IT;
		this.setSum();
		this.setAvg();
	}

	public final int getAge() {
		return age;
	}

	public final double getAvg() {
		setAvg();
		return avg;
	}

	public String getBind() {
		return bindedparent.toString();
	}

	public final double getBiologyMark() {
		return biology;
	}

	public final double getChemistryMark() {
		return chemistry;
	}

	public final double getChineseMark() {
		return chinese;
	}

	public final int getEducatenum() {
		return educatenum;
	}

	public final double getEnglishMark() {
		return english;
	}

	public final String getEnterDate() {
		return enterdate;
	}

	public final char getGender() {
		return gender;
	}

	public final double getGeographyMark() {
		return geography;
	}

	public final double getHistoryMark() {
		return history;
	}

	public final double getITMark() {
		return IT;
	}

	public final double getMathsMark() {
		return maths;
	}

	public final String getName() {
		return name;
	}

	public final int getOn() {
		return this.on;
	}

	public final double getPEMark() {
		return PE;
	}

	public final double getPhysicsMark() {
		return physics;
	}

	public final double getPoliticalMark() {
		return political;
	}

	public final double getSum() {
		setSum();
		return sum;
	}

	public final String getType() {
		return this.templatetype;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final void setAvg() {
		avg = this.getSum() / 11;
	}

	public final void setBind(Parent par) {
		this.bindedparent = par;
	}

	public final void setBiologyMark(double biology) {
		this.biology = biology;
	}

	public final void setChemistryMark(double chemistry) {
		this.chemistry = chemistry;
	}

	public final void setChineseMark(double chinese) {
		this.chinese = chinese;
	}

	public final void setEducatenum(int educatenum) {
		this.educatenum = educatenum;
	}

	public final void setEnglishMark(double english) {
		this.english = english;
	}

	public final void setEnterDate(String enterdate) {
		this.enterdate = enterdate;
	}

	public final void setGender(char gender) {
		this.gender = gender;
	}

	public final void setGeographyMark(double geography) {
		this.geography = geography;
	}

	public final void setHistoryMark(double history) {
		this.history = history;
	}

	public final void setITMark(double IT) {
		this.IT = IT;
	}

	public final void setMathsMark(double maths) {
		this.maths = maths;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final void setOn(int on) {
		this.on = on;
	}

	public final void setPEMark(double PE) {
		this.PE = PE;
	}

	public final void setPhysicsMark(double physics) {
		this.physics = physics;
	}

	public final void setPoliticalMark(double political) {
		this.political = political;
	}

	public final void setSum() {
		this.sum = this.chinese + this.maths + this.english + this.physics + this.chemistry + this.history
				+ this.political + this.geography + this.biology + this.PE + this.IT;
	}

	@Override
	public final String toString() {
		this.setSum();
		this.setAvg();
		String msg = "\t" + this.on + "\t" + this.name + "\t" + this.age + "\t" + this.gender + "\t" + this.enterdate
				+ "\t" + this.educatenum + "\t" + this.chinese + "\t" + this.maths + "\t" + this.english + "\t"
				+ this.physics + "\t" + this.chemistry + "\t" + this.history + "\t" + this.political + "\t" + "\t"
				+ +this.geography + "\t" + this.biology + "\t" + this.PE + "\t" + this.IT + "\t" + this.sum + "\t"
				+ this.avg;
		return msg;
	}
}
