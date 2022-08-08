package sasyspro.template;

import java.util.ArrayList;

/**
 * 
 * @author Laola233
 * @version 0.1B
 * @serial SchoolAdminSystemPro
 * @since 0.2B �༶ģ��
 */
public class Class {
	private static boolean isEnabled = true; // Whether this template should be enabled?

	public final static boolean getIsEnabled() {
		return isEnabled;
	}

	public final static void setIsEnabled(boolean status) {
		isEnabled = status;
	}

	private int classes;
	private String classtype;
	private int grade;
	private Teacher leader;
	private ArrayList<Student> Stu = new ArrayList<Student>();
	private ArrayList<Teacher> Tea = new ArrayList<Teacher>();

	private final String templatetype = "Class"; // This template type

	{
		classtype = "Normal";
	}

	public Class() {
		System.out.println("û���㹻�Ĳ���!������һ���հ༶!");
	}

	public Class(int grade, int classes, Student[] stuarr, Teacher leader, Teacher[] teacherarr) {
		for (int i = 0; i < stuarr.length; i++) {
			if (stuarr[i] != null) {
				Stu.add(stuarr[i]);
			} else {
				break;
			}
		}
		for (int i = 0; i < teacherarr.length; i++) {
			if (teacherarr[i] != null) {
				Tea.add(teacherarr[i]);
			} else {
				break;
			}
		}
		this.leader = leader;
		this.grade = grade;
		this.classes = classes;
	}

	public final int getClasses() {
		return this.classes;
	}

	public final String getClassType() {
		return this.classtype;
	}

	public final int getGrade() {
		return this.grade;
	}

	public final Teacher getLeader() {
		return this.leader;
	}

	public final Student getStudent(int num) {
		return this.Stu.get(num);
	}

	public final Object[] getStudentArray() {
		return this.Stu.toArray();
	}

	public final Teacher getTeacher(int num) {
		return this.Tea.get(num);
	}

	public final Object[] getTeacherArray() {
		return this.Tea.toArray();
	}

	public final String getType() {
		return this.templatetype;
	}

	public final void setClasses(int classes) {
		this.classes = classes;
	}

	/**
	 * @deprecated
	 * @param classes ���úͰ༶һ�������͵İ༶
	 */
	public final void setClassType(Class classes) {
		this.classtype = classes.classtype;
	}

	/**
	 * @deprecated
	 * @param classtype ���õİ༶����
	 */
	public final void setClassType(String classtype) {
		this.classtype = classtype;
	}

	public final void setGrade(int grade) {
		this.grade = grade;
	}

	public final void setLeader(Teacher leader) {
		this.leader = leader;
	}

	public final void setStudents(int num, Student stu) {
		Stu.add(num, stu);
	}

	public final void setStudents(Student stu) {
		Stu.add(stu);
	}

	public final void setStudents(Student[] stuarr) throws Exception {
		for (int i = 0; i < stuarr.length; i++) {
			if (stuarr[i] != null) {
				Stu.add(stuarr[i]);
			} else {
				break;
			}
		}
	}

	public final void setTeachers(int num, Teacher tea) {
		Tea.add(num, tea);
	}

	public final void setTeachers(Teacher tea) {
		Tea.add(tea);
	}

	public final void setTeachers(Teacher[] teaarr) throws Exception {
		for (int i = 0; i < teaarr.length; i++) {
			if (teaarr[i] != null) {
				Tea.add(teaarr[i]);
			} else {
				break;
			}
		}
	}
}
