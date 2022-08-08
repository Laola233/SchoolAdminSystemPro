package sasyspro.template;

import java.util.ArrayList;

/**
 * @author Laola233
 * @serial SchoolAdminSystemPro
 * @version 0.2B
 * @since 0.1B <br>
 *        <strong> ����Աģ�� </strong>
 */
public class Administrator {
	/**
	 * ģ���Ƿ�����
	 */
	private static boolean isEnabled = true; // Whether this template should be enabled?

	/**
	 * ��ȡģ���Ƿ����÷���
	 * 
	 * @return �Ƿ�����
	 */
	public final static boolean getIsEnabled() {
		return isEnabled;
	}

	/**
	 * �����Ƿ�����ģ��
	 * 
	 * @param Enabled �Ƿ�����
	 */
	public final static void setIsEnabled(boolean Enabled) {
		isEnabled = Enabled;
	}

	/**
	 * ����༶
	 */
	private String adminClasses;
	/**
	 * ����
	 */
	private int age;
	/**
	 * �Ա�
	 */
	private char gender;
	/**
	 * ��ְʱ��
	 */
	private String getJobDate;
	/**
	 * ������ְ��
	 */
	private String Job;
	/**
	 * ����
	 */
	private String name;
	/**
	 * ���
	 */
	private int No;

	/**
	 * Ȩ��
	 */
	public ArrayList<String> permission = new ArrayList<String>();

	/**
	 * ģ������
	 */
	private final String templatetype = "Administrator";// This template type

	/**
	 * ����һ���չ�����Ա
	 */
	public Administrator() {
		System.out.println("�������չ�����Աģ��");
	}

	/**
	 * ����һ���л�����Ϣ�Ĺ�����Ա
	 * 
	 * @param name       ����
	 * @param age        ����
	 * @param gender     �Ա�
	 * @param getJobDate ��ְʱ��
	 */
	public Administrator(String name, int age, char gender, String getJobDate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.getJobDate = getJobDate;
	}

	/**
	 * ����һ��ȫ����Ϣ�Ĺ�����Ա
	 * 
	 * @param name         ����
	 * @param age          ����
	 * @param gender       �Ա�
	 * @param getJobDate   ��ְʱ��
	 * @param Job          ����
	 * @param adminClasses ����༶
	 */
	public Administrator(String name, int age, char gender, String getJobDate, String Job, String adminClasses) {
		this(name, age, gender, getJobDate);
		this.Job = Job;
		this.adminClasses = adminClasses;
	}

	/**
	 * ��ȡ����༶
	 * 
	 * @return ����༶
	 */
	public final String getAdminClasses() {
		return this.adminClasses;
	}

	/**
	 * ��ȡ������Ա����
	 * 
	 * @return ����
	 */
	public final int getAge() {
		return this.age;
	}

	/**
	 * ��ȡ�Ա�
	 * 
	 * @return �Ա�
	 */
	public final char getGender() {
		return this.gender;
	}

	/**
	 * ��ȡ��ְʱ��
	 * 
	 * @return ��ְʱ��
	 */
	public final String getGetJobDate() {
		return this.getJobDate;
	}

	/**
	 * ��ȡ����
	 * 
	 * @return ����
	 */
	public final String getJob() {
		return this.Job;
	}

	/**
	 * ��ȡ������Ա����
	 * 
	 * @return ������Ա����
	 */
	public final String getName() {
		return this.name;
	}

	/**
	 * ��ȡ���
	 * 
	 * @return ���
	 */
	public final int getNo() {
		return this.No;
	}

	/**
	 * ��ȡģ������
	 * 
	 * @return ģ������
	 */
	public final String getType() {
		return this.templatetype;
	}

	/**
	 * ���ù���༶
	 * 
	 * @param adminClasses ����༶
	 */
	public final void setAdminClasses(String adminClasses) {
		this.adminClasses = adminClasses;
	}

	/**
	 * ���ù�����Ա����
	 * 
	 * @param age ����
	 */
	public final void setAge(int age) {
		this.age = age;
	}

	/**
	 * �����Ա�
	 * 
	 * @param gender �Ա�
	 */
	public final void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * ������ְʱ��
	 * 
	 * @param getJobDate ��ְʱ��
	 */
	public final void setGetJobDate(String getJobDate) {
		this.getJobDate = getJobDate;
	}

	/**
	 * ���ù���
	 * 
	 * @param Job ����
	 */
	public final void setJob(String Job) {
		this.Job = Job;
	}

	/**
	 * ���ù�����Ա����
	 * 
	 * @param name ����
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * ���ñ��
	 * 
	 * @param No ���
	 */
	public final void setNo(int No) {
		this.No = No;
	}

	/**
	 * TOSTRING����
	 */
	@Override
	public final String toString() {
		String msg = "\t" + this.No + "\t" + this.name + "\t" + this.age + "\t" + this.gender + "\t" + this.getJobDate
				+ "\t" + this.Job + "\t" + this.adminClasses;
		return msg;
	}

}
