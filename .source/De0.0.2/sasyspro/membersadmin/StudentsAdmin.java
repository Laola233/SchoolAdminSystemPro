package sasyspro.membersadmin;

import sasyspro.template.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 *
 */
public class StudentsAdmin {
	private int ArrayNo = 0;
	private final static String say = "\t编号\t姓名\t年龄\t性别\t入学时间\t\t学籍号\t语文成绩\t数学成绩\t英语成绩\t物理成绩\t化学成绩\t历史成绩\t政治成绩\t地理成绩\t生物成绩\t体育成绩\t信息成绩\t总分\t平均分";

	public StudentsAdmin() {
	}

	/**
	 * @deprecated
	 * @param isDoDefaultMessage
	 */
	public StudentsAdmin(boolean isDoDefaultMessage) {
		if (isDoDefaultMessage) {
			System.out.println("正在载入学生管理系统");
		}
	}

	private final Student FindNoTarget(int No, ArrayList<Student> arr) throws NullPointerException {
		if (arr.isEmpty()) {
			return null;
		}
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getOn() == No) {
				return arr.get(i);
			}
		}
		return null;
	}

	public final void addTargetS(String name, int age, char gender, String enterdate, int educatenum,
			ArrayList<Student> arr) {
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(age);
		stu.setGender(gender);
		stu.setEnterDate(enterdate);
		stu.setEducatenum(educatenum);
		stu.setOn(ArrayNo);
		arr.add(stu);
		ArrayNo++;
		this.print(arr.toArray());
	}

	public final void print(Object[] arr) {
		System.out.println(say);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}

	public final boolean exist(int on, Student stu) {
		if (stu != null) {
			if (stu.getOn() == on) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public final void findTarget(int on, ArrayList<Student> arr) {
		Student a = this.FindNoTarget(on, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(on, a)) {
				System.out.println(a);
				return;
			}
		}
		System.out.println("学生不存在!");
	}

	public final void replaceInfo(int on, String name, int age, char gender, String enterdate, int educatenum,
			ArrayList<Student> arr) {
		Student a = this.FindNoTarget(on, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(on, a)) {
				a.setName(name);
				a.setAge(age);
				a.setGender(gender);
				a.setEnterDate(enterdate);
				a.setEducatenum(educatenum);
				System.out.println("更新学生信息成功!");
				this.print(arr.toArray());
				return;
			}
		}
		System.out.println("学生不存在!更新信息失败!");
	}

	public final void delete(int on, ArrayList<Student> arr) {
		Student a = this.FindNoTarget(on, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(on, a)) {
				arr.remove(a);
				this.print(arr.toArray());
				return;
			}
		}
		System.out.println("学生不存在!");
	}

	public final void inputMarks(int on, ArrayList<Student> arr) throws Exception {
		Student a = this.FindNoTarget(on, arr);
		for (int i = 0; i < arr.size(); i++) {
			if (this.exist(on, a)) {
				System.out.println("Notice!输入的成绩必须带小数点或者是整数!");
				@SuppressWarnings("resource")
				Scanner setMarksca = new Scanner(System.in);
				System.out.println("请输入" + a.getName() + "的语文成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setChineseMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的数学成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setMathsMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的英语成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setEnglishMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的物理成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setPhysicsMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的化学成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setChemistryMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的历史成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setHistoryMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的政治成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setPoliticalMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的地理成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setGeographyMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的生物成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setBiologyMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的体育成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setPEMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				System.out.println("请输入" + a.getName() + "的信息成绩");
				if (setMarksca.hasNextDouble() || setMarksca.hasNextInt()) {
					a.setITMark(setMarksca.nextDouble());
				} else {
					System.out.println("非法输入!请检查!");
				}
				a.setAvg();
				a.setSum();
				this.print(arr.toArray());
				break;
			}
		}
	}

	public final void setSort(int chosesubj, ArrayList<Student> arr) {
		if (chosesubj == 1) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getChineseMark() < arr.get(c).getChineseMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 2) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getMathsMark() < arr.get(c).getMathsMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 3) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getEnglishMark() < arr.get(c).getEnglishMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 4) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getPhysicsMark() < arr.get(c).getPhysicsMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 5) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getChemistryMark() < arr.get(c).getChemistryMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 6) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getHistoryMark() < arr.get(c).getHistoryMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 7) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getPoliticalMark() < arr.get(c).getPoliticalMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 8) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getGeographyMark() < arr.get(c).getGeographyMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 9) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getBiologyMark() < arr.get(c).getBiologyMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 10) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getPEMark() < arr.get(c).getPEMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		} else if (chosesubj == 11) {
			for (int i = 0; i < arr.size() - 1; i++) {
				for (int c = i + 1; c < arr.size(); c++) {
					if (arr.get(i) != null && arr.get(c) != null) {
						if (arr.get(i).getITMark() < arr.get(c).getITMark()) {
							Student lei = arr.get(i);
							arr.set(i, arr.get(c));
							arr.set(c, lei);
						}
					}
				}
			}
		}
		this.print(arr.toArray());
	}

	public final void setSumSort(ArrayList<Student> arr) {
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int c = i + 1; c < arr.size(); c++) {
				if (arr.get(i) != null && arr.get(c) != null) {
					if (arr.get(i).getSum() < arr.get(c).getSum()) {
						Student lei = arr.get(i);
						arr.set(i, arr.get(c));
						arr.set(c, lei);
					}
				}
			}
		}
		this.print(arr.toArray());
	}

	public final void setAvgSort(ArrayList<Student> arr) {
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int c = i + 1; c < arr.size(); c++) {
				if (arr.get(i) != null && arr.get(c) != null) {
					if (arr.get(i).getAvg() < arr.get(c).getAvg()) {
						Student lei = arr.get(i);
						arr.set(i, arr.get(c));
						arr.set(c, lei);
					}
				}
			}
		}
		this.print(arr.toArray());
	}
}
