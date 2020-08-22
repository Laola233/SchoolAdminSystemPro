package sasyspro.template;

import java.util.ArrayList;

/**
 * @author Laola233
 * @serial SchoolAdminSystemPro
 * @version 0.2B
 * @since 0.1B <br>
 *        <strong> 管理员模板 </strong>
 */
public class Administrator {
	/**
	 * 模板是否启用
	 */
	private static boolean isEnabled = true; // Whether this template should be enabled?
	/**
	 * 模板类型
	 */
	private final String templatetype = "Administrator";// This template type
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 性别
	 */
	private char gender;
	/**
	 * 入职时间
	 */
	private String getJobDate;
	/**
	 * 工作或职务
	 */
	private String Job;
	/**
	 * 管理班级
	 */
	private String adminClasses;
	/**
	 * 编号
	 */
	private int No;
	/**
	 * 权限
	 */
	public ArrayList<String> permission = new ArrayList<String>();
	/**
	 * 创建一个空管理人员
	 */
	public Administrator() {
		System.out.println("将创建空管理人员模板");
	}
	/**
	 * 创建一个有基本信息的管理人员
	 * @param name 姓名
	 * @param age 年龄
	 * @param gender 性别
	 * @param getJobDate 入职时间
	 */
	public Administrator(String name, int age, char gender, String getJobDate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.getJobDate = getJobDate;
	}

	/**
	 * 创建一个全部信息的管理人员
	 * @param name 姓名
	 * @param age 年龄
	 * @param gender 性别
	 * @param getJobDate 入职时间
	 * @param Job 工作
	 * @param adminClasses 管理班级
	 */
	public Administrator(String name, int age, char gender, String getJobDate, String Job, String adminClasses) {
		this(name, age, gender, getJobDate);
		this.Job = Job;
		this.adminClasses = adminClasses;
	}
	/**
	 * 获取模板是否启用方法
	 * @return 是否启用
	 */
	public final static boolean getIsEnabled() {
		return isEnabled;
	}
	/**
	 *  获取模板类型
	 * @return 模板类型
	 */
	public final String getType() {
		return this.templatetype;
	}
	/**
	 * 设置是否启用模板
	 * @param Enabled 是否启用
	 */
	public final static void setIsEnabled(boolean Enabled) {
		isEnabled = Enabled;
	}
	/**
	 * 获取管理人员名称
	 * @return 管理人员名称
	 */
	public final String getName() {
		return this.name;
	}
	/**
	 * 设置管理人员名称
	 * @param name 名称
	 */
	public final void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取管理人员年龄
	 * @return 年龄
	 */
	public final int getAge() {
		return this.age;
	}
	/**
	 * 设置管理人员年龄
	 * @param age 年龄
	 */
	public final void setAge(int age) {
		this.age = age;
	}
	/**
	 * 获取性别
	 * @return 性别
	 */
	public final char getGender() {
		return this.gender;
	}
	/**
	 * 设置性别
	 * @param gender 性别
	 */
	public final void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * 获取入职时间
	 * @return 入职时间
	 */
	public final String getGetJobDate() {
		return this.getJobDate;
	}
	/**
	 * 设置入职时间
	 * @param getJobDate 入职时间
	 */
	public final void setGetJobDate(String getJobDate) {
		this.getJobDate = getJobDate;
	}
	/**
	 * 获取工作
	 * @return 工作
	 */
	public final String getJob() {
		return this.Job;
	}
	/**
	 * 设置工作
	 * @param Job 工作
	 */
	public final void setJob(String Job) {
		this.Job = Job;
	}
	/**
	 * 获取编号
	 * @return 编号
	 */
	public final int getNo() {
		return this.No;
	}
	/**
	 * 设置编号
	 * @param No 编号
	 */
	public final void setNo(int No) {
		this.No = No;
	}
	/**
	 * 获取管理班级
	 * @return 管理班级
	 */
	public final String getAdminClasses() {
		return this.adminClasses;
	}
	/**
	 * 设置管理班级
	 * @param adminClasses 管理班级
	 */ 
	public final void setAdminClasses(String adminClasses) {
		this.adminClasses = adminClasses;
	}
	/**
	 * TOSTRING方法
	 */
	@Override
	public final String toString() {
		String msg = "\t" + this.No + "\t" + this.name + "\t" + this.age + "\t" + this.gender + "\t" + this.getJobDate
				+ "\t" + this.Job + "\t" + this.adminClasses;
		return msg;
	}

}
