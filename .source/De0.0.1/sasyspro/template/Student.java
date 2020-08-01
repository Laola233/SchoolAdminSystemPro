package sasyspro.template;

/**
 * @author Laola233
 * @serial SchoolAdminSystemPro
 * @version 0.1B
 * @since 0.1B <br>
 *        <strong> Ñ§ÉúÄ£°å </strong>
 */
public class Student {
	private static boolean isEnabled = true; // Whether this template should be enabled?
	private String templatetype = "Student";// This template type
	private String name;
	private int age;
	private char gender;
	private String enterdate;
	private int educatenum;
	private double chinese;
	private double maths;
	private double english;
	private double physics;
	private double chemistry;
	private double history;
	private double political;
	private double geography;
	private double biology;
	private double PE;
	private double IT;
	private double sum;
	private double avg;
	private int on;
	public String[] permission = new String[99999];

	public final int checkLast() {
		for (int i = 0; i < permission.length; i++) {
			if (permission[i] == null) {
				return i;
			}
		}
		return permission.length;
	}

	public final void setOn(int on) {
		this.on = on;
	}

	public final int getOn() {
		return this.on;
	}

	public final String getType() {
		return this.templatetype;
	}

	public final static boolean getIsEnabled() {
		return isEnabled;
	}

	@SuppressWarnings("static-access")
	public final void setIsEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public final void setPEMark(double PE) {
		this.PE = PE;
	}

	public final double getPEMark() {
		return PE;
	}

	public final void setITMark(double IT) {
		this.IT = IT;
	}

	public final double getITMark() {
		return IT;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final int getAge() {
		return age;
	}

	public final void setGender(char gender) {
		this.gender = gender;
	}

	public final char getGender() {
		return gender;
	}

	public final void setEnterDate(String enterdate) {
		this.enterdate = enterdate;
	}

	public final String getEnterDate() {
		return enterdate;
	}

	public final void setEducatenum(int educatenum) {
		this.educatenum = educatenum;
	}

	public final int getEducatenum() {
		return educatenum;
	}

	public final void setChineseMark(double chinese) {
		this.chinese = chinese;
	}

	public final void setMathsMark(double maths) {
		this.maths = maths;
	}

	public final void setEnglishMark(double english) {
		this.english = english;
	}

	public final void setPhysicsMark(double physics) {
		this.physics = physics;
	}

	public final void setChemistryMark(double chemistry) {
		this.chemistry = chemistry;
	}

	public final void setHistoryMark(double history) {
		this.history = history;
	}

	public final void setPoliticalMark(double political) {
		this.political = political;
	}

	public final void setGeographyMark(double geography) {
		this.geography = geography;
	}

	public final double getGeographyMark() {
		return geography;
	}

	public final void setBiologyMark(double biology) {
		this.biology = biology;
	}

	public final double getBiologyMark() {
		return biology;
	}

	public final double getChineseMark() {
		return chinese;
	}

	public final double getMathsMark() {
		return maths;
	}

	public final double getEnglishMark() {
		return english;
	}

	public final double getPhysicsMark() {
		return physics;
	}

	public final double getChemistryMark() {
		return chemistry;
	}

	public final double getHistoryMark() {
		return history;
	}

	public final double getPoliticalMark() {
		return political;
	}

	public final double getSum() {
		this.sum = this.chinese + this.maths + this.english + this.physics + this.chemistry + this.history
				+ this.political + this.geography + this.biology + this.PE + this.IT;
		return sum;
	}

	public final double getAvg() {
		this.sum = this.chinese + this.maths + this.english + this.physics + this.chemistry + this.history
				+ this.political + this.geography + this.biology;
		avg = sum / 7;
		return sum / 7;
	}

	public final void setAvg() {
		this.avg = this.sum / 7;
	}

	public final void setSum() {
		this.sum = this.chinese + this.maths + this.english + this.physics + this.chemistry + this.history
				+ this.political + this.geography + this.biology;
	}

	@Override
	public final String toString() {
		String msg = "\t" + this.on + "\t" + this.name + "\t" + this.age + "\t" + this.gender + "\t" + this.enterdate
				+ "\t" + this.educatenum + "\t" + this.chinese + "\t" + this.maths + "\t" + this.english + "\t"
				+ this.physics + "\t" + this.chemistry + "\t" + this.history + "\t" + this.political + "\t" + "\t"
				+ +this.geography + "\t" + this.biology + "\t" + this.PE + "\t" + this.IT + "\t" + this.sum + "\t"
				+ this.avg;
		return msg;
	}
}
