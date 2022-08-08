package sasyspro.enums;

/**
 * 
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 */
public enum Permissions {
	sasyspro_accounts_loginin(2, "�����˻�"), sasyspro_accounts_manage(3, "�����˻�����Ȩ��"),
	sasyspro_admin_disable_functions(35, "���ù���"), sasyspro_admin_disable_system(36, "����ϵͳ"),
	sasyspro_admin_permission_add(37, "���Ȩ��"), sasyspro_admin_permission_del(38, "ɾ��Ȩ��"),
	sasyspro_admin_permission_lookup(39, "����Ȩ��"), sasyspro_admin_permission_set(40, "����Ȩ��"),
	sasyspro_admin_shutdown_system(41, "�ر�ϵͳ"), sasyspro_all_permission(0, "��ȡ����Ȩ��"),
	sasyspro_message_receive(42, "������Ϣ����"), sasyspro_sys_account_manage_add(4, "����˺�"),
	sasyspro_sys_account_manage_ban(5, "����˺�"), sasyspro_sys_account_manage_del(6, "ɾ���˺�"),
	sasyspro_sys_account_manage_disable(7, "�����˺�"), sasyspro_sys_account_manage_edit(8, "�༭�˺���Ϣ"),
	sasyspro_sys_account_manage_enable(9, "�����˺�"), sasyspro_sys_account_manage_lookup(10, "�����˻�"),
	sasyspro_sys_function_create_exam(11, "��������"), sasyspro_sys_function_create_member(12, "������Ա"),
	sasyspro_sys_function_look_mark_class_all(13, "�鿴�ð����������гɼ�"),
	sasyspro_sys_function_look_mark_class_Biology(14, "��ð�����������ɼ�"),
	sasyspro_sys_function_look_mark_class_Chemistry(15, "��ð������˻�ѧ�ɼ�"),
	sasyspro_sys_function_look_mark_class_Chinese(16, "��ð����������ĳɼ�"),
	sasyspro_sys_function_look_mark_class_English(17, "��ð�������Ӣ��ɼ�"),
	sasyspro_sys_function_look_mark_class_Geography(18, "��ð������˵���ɼ�"),
	sasyspro_sys_function_look_mark_class_History(19, "��ð���������ʷ�ɼ�"),
	sasyspro_sys_function_look_mark_class_IT(20, "��ð���������Ϣ�����ɼ�"),
	sasyspro_sys_function_look_mark_class_Maths(21, "��ð���������ѧ�ɼ�"),
	sasyspro_sys_function_look_mark_class_PE(22, "��ð������������ɼ�"),
	sasyspro_sys_function_look_mark_class_Physics(23, "��ð�����������ɼ�"),
	sasyspro_sys_function_look_mark_class_Political(24, "��ð����������γɼ�"),
	sasyspro_sys_function_look_mark_grade(25, "��ѯ�꼶�ɼ�"), sasyspro_sys_function_look_mark_school(26, "������ѧУ�ĳɼ�"),
	sasyspro_sys_function_look_mark_self_all(27, "���Լ���ȫ���ɼ�"), sasyspro_sys_function_look_time_on_main_board(28, "��ʾʱ��"),
	sasyspro_sys_function_print_out_empty_placeholder_all(29, "��ʾ�շָ���"), sasyspro_sys_function_set_mark(30, "���óɼ�"),
	sasyspro_sys_function_set_mark_part(31, "���ò��ֳɼ�"), sasyspro_sys_function_set_template_manage_disabled(32, "����ģ�����"),
	sasyspro_sys_function_set_template_manage_enabled(33, "����ģ������"),
	sasyspro_sys_function_set_template_manage_lookstatus(34, "�鿴ģ���������"), sayspro_all_permission_no(1, "���κ�Ȩ��");

	public static Permissions[] toArray() {
		return values();
	}

	@SuppressWarnings("unused")
	private int num;

	@SuppressWarnings("unused")
	private String zuoyong;

	private Permissions() {

	}

	private Permissions(int num, String zuoyong) {
		this.num = num;
		this.zuoyong = zuoyong;
	}
}
