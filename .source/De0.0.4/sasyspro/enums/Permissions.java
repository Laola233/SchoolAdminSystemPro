package sasyspro.enums;

/**
 * @author Laola233
 * @version 0.2B
 * @serial SchoolAdminSystemPro
 * @since 0.1B
 */
public enum Permissions {
    sasyspro_accounts_loginin(2, "登入账户"), sasyspro_accounts_manage(3, "管理账户所有权限"),
    sasyspro_admin_disable_functions(35, "禁用功能"), sasyspro_admin_disable_system(36, "禁用系统"),
    sasyspro_admin_permission_add(37, "添加权限"), sasyspro_admin_permission_del(38, "删除权限"),
    sasyspro_admin_permission_lookup(39, "查找权限"), sasyspro_admin_permission_set(40, "设置权限"),
    sasyspro_admin_shutdown_system(41, "关闭系统"), sasyspro_all_permission(0, "获取所有权限"),
    sasyspro_message_receive(42, "接受信息提醒"), sasyspro_sys_account_manage_add(4, "添加账号"),
    sasyspro_sys_account_manage_ban(5, "封禁账号"), sasyspro_sys_account_manage_del(6, "删除账号"),
    sasyspro_sys_account_manage_disable(7, "禁用账号"), sasyspro_sys_account_manage_edit(8, "编辑账号信息"),
    sasyspro_sys_account_manage_enable(9, "启用账号"), sasyspro_sys_account_manage_lookup(10, "查找账户"),
    sasyspro_sys_function_create_exam(11, "创建考试"), sasyspro_sys_function_create_member(12, "创建成员"),
    sasyspro_sys_function_look_mark_class_all(13, "查看该班所有人所有成绩"),
    sasyspro_sys_function_look_mark_class_Biology(14, "查该班所有人生物成绩"),
    sasyspro_sys_function_look_mark_class_Chemistry(15, "查该班所有人化学成绩"),
    sasyspro_sys_function_look_mark_class_Chinese(16, "查该班所有人语文成绩"),
    sasyspro_sys_function_look_mark_class_English(17, "查该班所有人英语成绩"),
    sasyspro_sys_function_look_mark_class_Geography(18, "查该班所有人地理成绩"),
    sasyspro_sys_function_look_mark_class_History(19, "查该班所有人历史成绩"),
    sasyspro_sys_function_look_mark_class_IT(20, "查该班所有人信息技术成绩"),
    sasyspro_sys_function_look_mark_class_Maths(21, "查该班所有人数学成绩"),
    sasyspro_sys_function_look_mark_class_PE(22, "查该班所有人体育成绩"),
    sasyspro_sys_function_look_mark_class_Physics(23, "查该班所有人物理成绩"),
    sasyspro_sys_function_look_mark_class_Political(24, "查该班所有人政治成绩"),
    sasyspro_sys_function_look_mark_grade(25, "查询年级成绩"), sasyspro_sys_function_look_mark_school(26, "查整个学校的成绩"),
    sasyspro_sys_function_look_mark_self_all(27, "看自己的全部成绩"), sasyspro_sys_function_look_time_on_main_board(28, "显示时间"),
    sasyspro_sys_function_print_out_empty_placeholder_all(29, "显示空分割线"), sasyspro_sys_function_set_mark(30, "设置成绩"),
    sasyspro_sys_function_set_mark_part(31, "设置部分成绩"), sasyspro_sys_function_set_template_manage_disabled(32, "设置模板禁用"),
    sasyspro_sys_function_set_template_manage_enabled(33, "设置模板启用"),
    sasyspro_sys_function_set_template_manage_lookstatus(34, "查看模板启用情况"), sayspro_all_permission_no(1, "无任何权限");

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

    public static Permissions[] toArray() {
        return values();
    }
}
