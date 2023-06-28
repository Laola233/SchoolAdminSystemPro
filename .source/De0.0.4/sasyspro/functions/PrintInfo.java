package sasyspro.functions;


import sasyspro.main.Main;
import sasyspro.membersadmin.AdministratorsAdmin;
import sasyspro.membersadmin.StudentsAdmin;
import sasyspro.membersadmin.TeachersAdmin;
import sasyspro.template.Administrator;
import sasyspro.template.Student;
import sasyspro.template.Teacher;

import java.util.ArrayList;

/**
 * @author Laola233
 * @version 0.1
 * @serial SchoolAdminSystemPro
 * @since 0.4B
 */
public class PrintInfo {
    public final void printInfo(int NoNum, ArrayList<Student> arr) {
        Main a = new Main();
        StudentsAdmin a1 = new StudentsAdmin();
        if (a1.exist(NoNum, arr.get(NoNum))) {
            if (a.stu.get(NoNum).getName() != null && a.stu.get(NoNum).getAge() != 0
                    && a.stu.get(NoNum).getGender() != '\u0000' && a.stu.get(NoNum).getEnterDate() != null
                    && a.stu.get(NoNum).getEducatenum() != 0) {
                System.out.println("=====第" + NoNum + "号学生的信息=====");
                System.out.println("名字:\t" + a.stu.get(NoNum).getName());
                System.out.println("年龄:\t" + a.stu.get(NoNum).getAge());
                System.out.println("性别:\t" + a.stu.get(NoNum).getGender());
                System.out.println("入学时间:\t" + a.stu.get(NoNum).getEnterDate());
                System.out.println("学籍号:\t" + a.stu.get(NoNum).getEducatenum());
            } else {
                System.err.println("将要打印信息,编号为\t" + NoNum + "的学生信息不完整!请检查!");
            }
        } else {
            System.err.println("学生不存在!");
        }
    }

    @SuppressWarnings("static-access")
    public final void printTeaInfo(int NoNum, ArrayList<Teacher> arr) {
        TeachersAdmin a1 = new TeachersAdmin();
        Main a = new Main();
        if (a1.exist(NoNum, arr.get(NoNum))) {
            if (a.tea.get(NoNum).getName() != null && a.tea.get(NoNum).getAge() != 0
                    && a.tea.get(NoNum).getGender() != '\u0000' && a.tea.get(NoNum).getGetProjDate() != null) {
                System.out.println("=====第" + NoNum + "号教师的信息=====");
                System.out.println("名字:\t" + a.tea.get(NoNum).getName());
                System.out.println("年龄:\t" + a.tea.get(NoNum).getAge());
                System.out.println("性别:\t" + a.tea.get(NoNum).getGender());
                System.out.println("入职时间:\t" + a.tea.get(NoNum).getGetProjDate());
                System.out.println("教学科目:\t" + a.tea.get(NoNum).getProj());
                System.out.println("教学班级:\t" + a.tea.get(NoNum).getClassProj());
            } else {
                System.err.println("将要打印信息,编号为\t" + NoNum + "的教师信息不完整!请检查!");
            }
        } else {
            System.err.println("教师不存在!");
        }
    }

    @SuppressWarnings("static-access")
    public final void printAdmInfo(int NoNum, ArrayList<Administrator> arr) {
        AdministratorsAdmin a1 = new AdministratorsAdmin();
        Main a = new Main();
        if (a1.exist(NoNum, arr.get(NoNum))) {
            if (a.adm.get(NoNum).getName() != null && a.adm.get(NoNum).getAge() != 0
                    && a.adm.get(NoNum).getGender() != '\u0000' && a.adm.get(NoNum).getGetJobDate() != null) {
                System.out.println("=====第" + NoNum + "号管理人员的信息=====");
                System.out.println("名字:\t" + a.adm.get(NoNum).getName());
                System.out.println("年龄:\t" + a.adm.get(NoNum).getAge());
                System.out.println("性别:\t" + a.adm.get(NoNum).getGender());
                System.out.println("入职时间:\t" + a.adm.get(NoNum).getGetJobDate());
                System.out.println("职务:\t" + a.adm.get(NoNum).getJob());
                System.out.println("管理班级:\t" + a.adm.get(NoNum).getAdminClasses());
            } else {
                System.err.println("将要打印信息,编号为\t" + NoNum + "的管理人员信息不完整!请检查!");
            }
        } else {
            System.err.println("管理人员不存在!");
        }
    }
}
