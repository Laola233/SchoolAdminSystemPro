package sasyspro.main;


import sasyspro.functions.EmptyPlaceholder;
import sasyspro.functions.GetNowTime;
import sasyspro.functions.PrintInfo;
import sasyspro.functions.PrintMarks;
import sasyspro.membersadmin.AdministratorsAdmin;
import sasyspro.membersadmin.ParentsAdmin;
import sasyspro.membersadmin.StudentsAdmin;
import sasyspro.membersadmin.TeachersAdmin;
import sasyspro.template.Administrator;
import sasyspro.template.Parent;
import sasyspro.template.Student;
import sasyspro.template.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Laola233
 * @version 0.1
 * @serial SchoolAdminSystemPro
 * @since 0.4B
 */
public class Main {
    public ArrayList<Administrator> adm = new ArrayList<Administrator>();
    public ArrayList<Parent> par = new ArrayList<Parent>();
    public ArrayList<Student> stu = new ArrayList<Student>();
    public ArrayList<Teacher> tea = new ArrayList<Teacher>();


    public void StartArea() {
        EmptyPlaceholder eph = new EmptyPlaceholder();
        Scanner setIn = new Scanner(System.in);
        int choose = 0;
        while (true) {
            StudentsAdmin stua = new StudentsAdmin();
            ParentsAdmin para = new ParentsAdmin();
            TeachersAdmin teaa = new TeachersAdmin();
            AdministratorsAdmin adma = new AdministratorsAdmin();
            System.out.println("========学校管理系统========");
            System.out.println("现在时间" + GetNowTime.Date());
            System.out.println("1:进入学生管理系统");
            System.out.println("2:进入教师管理系统");
            System.out.println("3:进入管理人员管理系统");
            System.out.println("4:进入家长管理系统");
            System.out.println("777:退出系统");
            System.out.println("请输入选择的功能编号:");
            try {
                choose = setIn.nextInt();
            } catch (Exception e) {
                System.err.println("输入错误!请检查!");
                continue;
            }
            switch (choose) {
                case 1:
                    while (true) {
                        System.out.println("==========学生管理系统==========");
                        System.out.println("1:添加一个学生");
                        System.out.println("2:查找一个学生");
                        System.out.println("3:根据编号更新学生的基本信息");
                        System.out.println("4:根据编号删除学生");
                        System.out.println("5:根据编号输入学生的各门成绩");
                        System.out.println("6:根据某门成绩进行排序");
                        System.out.println("7:根据总分进行排序");
                        System.out.println("8:打印学生信息");
                        System.out.println("9:打印学生成绩报告");
                        System.out.println("777:返回上级菜单");
                        System.out.println("你要执行的功能:");
                        try {
                            choose = setIn.nextInt();
                        } catch (Exception e) {
                            System.err.println("输入错误!请检查!");
                            continue;
                        }
                        switch (choose) {
                            case 1:
                                try {
                                    System.out.println("正在添加学生");
                                    System.out.println("请输入学生的姓名");
                                    String name = setIn.next();
                                    System.out.println("请输入学生的年龄");
                                    int age = setIn.nextInt();
                                    System.out.println("请输入学生的性别");
                                    char gender = setIn.next().charAt(0);
                                    System.out.println("请输入学生的入学日期");
                                    String enterdate = setIn.next();
                                    System.out.println("请输入学生的学籍号");
                                    int educatenum = setIn.nextInt();
                                    stua.addTarget(name, age, gender, enterdate, educatenum, stu);
                                    System.out.println("操作成功!");
                                    continue;
                                } catch (Exception e) {
                                    System.err.println("输入错误!请检查!");
                                    continue;
                                }
                            case 2:
                                System.out.println("查找查找学生");
                                System.out.println("请输入学生的编号:");
                                int on = setIn.nextInt();
                                stua.findTarget(on, stu);
                                continue;
                            case 3:
                                System.out.println("执行更新学生的基本信息");
                                System.out.println("请输入学生的编号：");
                                on = setIn.nextInt();
                                if (stua.exist(on, stu.get(on))) {
                                    System.out.println("请输入学生的姓名：");
                                    String name = setIn.next();
                                    System.out.println("请输入学生的年龄:");
                                    int age = setIn.nextInt();
                                    System.out.println("请输入学生的性别");
                                    char gender = setIn.next().charAt(0);
                                    System.out.println("请输入学生的入学日期");
                                    String enterdate = setIn.next();
                                    System.out.println("请输入学生的学籍号");
                                    int educatenum = setIn.nextInt();
                                    stua.replaceInfo(on, name, age, gender, enterdate, educatenum, stu);
                                    continue;
                                } else {
                                    System.err.println("学生不存在!");
                                    continue;
                                }
                            case 4:
                                System.out.println("执行删除操作");
                                System.out.println("请输入学生的编号:");
                                on = setIn.nextInt();
                                stua.delete(on, stu);
                                continue;
                            case 5:
                                System.out.println("执行设置学生成绩操作");
                                System.out.println("请输入学生的编号:");
                                on = setIn.nextInt();
                                try {
                                    stua.inputMarks(on, stu);
                                    continue;
                                } catch (Exception e) {
                                    System.err.println("输入错误!请检查!");
                                    continue;
                                }
                            case 6:
                                System.out.println("执行根据某科目成绩进行排序操作");
                                System.out.println("语文(1) 数学(2) 英语(3) 物理(4) 化学(5) 历史(6) 政治(7) 地理(8) 生物(9) 体育(10) 信息(11)");
                                System.out.println("请指定科目:");
                                int chosesubj = setIn.nextInt();
                                stua.setSort(chosesubj, stu);
                                continue;
                            case 7:
                                System.out.println("执行按照总分排序操作");
                                stua.setSumSort(stu);
                                continue;
                            case 8:
                                System.out.println("执行打印学生信息操作");
                                System.out.println("请输入学生编号");
                                if (setIn.hasNextInt()) {
                                    int NoNum = setIn.nextInt();
                                    PrintInfo a2 = new PrintInfo();
                                    a2.printInfo(NoNum, stu);
                                    continue;
                                } else {
                                    System.out.println("非法输入!请检查!");
                                    continue;
                                }
                            case 9:
                                System.out.println("执行打印学生成绩操作");
                                System.out.println("请输入学生编号");
                                if (setIn.hasNextInt()) {
                                    int NoNum = setIn.nextInt();
                                    PrintMarks a2 = new PrintMarks();
                                    a2.printMarks(NoNum, stu);
                                    continue;
                                } else {
                                    System.out.println("非法输入!请检查!");
                                    continue;
                                }
                            case 777:
                                eph.printPlaceholder(true);
                                System.out.println("您已退出系统!");
                                break;
                            default:
                                System.out.println("输入错误!请检查!");
                                break;
                        }break;
                    }break;
                case 2:
                    while (true) {
                        PrintInfo pi = new PrintInfo();
                        PrintMarks pm = new PrintMarks();
                        System.out.println("==========教师管理系统==========");
                        System.out.println("1:添加一个老师");
                        System.out.println("2:查找一个老师");
                        System.out.println("3:删除一个老师");
                        System.out.println("4:设置一个老师的考核分");
                        System.out.println("5:根据考核分排序");
                        System.out.println("6:打印老师信息");
                        System.out.println("7:打印老师考核分数");
                        System.out.println("8:更新老师信息");
                        System.out.println("9:设置老师所教学科");
                        System.out.println("10:设置所负责的班级");
                        System.out.println("777:返回上级菜单");
                        System.out.println("你要执行的功能:");
                        try {
                            choose = setIn.nextInt();
                        } catch (Exception e) {
                            System.err.println("输入错误!请检查!");
                            continue;
                        }
                        switch (choose) {
                            case 1:
                                try {
                                    System.out.println("进行添加教师操作");
                                    System.out.println("请输入教师的名字:");
                                    String namezj = setIn.next();
                                    System.out.println("请输入教师的年龄:");
                                    int agezj = setIn.nextInt();
                                    System.out.println("请输入教师的性别:");
                                    char genderzj = setIn.next().charAt(0);
                                    System.out.println("请输入教师的入职时间:");
                                    String getProjDatezj = setIn.next();
                                    teaa.addTarget(namezj, agezj, genderzj, getProjDatezj, tea);
                                    continue;
                                } catch (Exception e) {
                                    System.err.println("输入错误!请检查!");
                                    continue;
                                }
                            case 2:
                                System.out.println("执行查找教师的操作");
                                System.out.println("请输入教师的编号");
                                int No = setIn.nextInt();
                                teaa.findTarget(No, tea);
                                continue;
                            case 3:
                                System.out.println("执行删除教师的操作");
                                System.out.println("请输入教师的编号");
                                No = setIn.nextInt();
                                teaa.delete(No, tea);
                                continue;
                            case 4:
                                System.out.println("执行设置老师考核分操作");
                                System.out.println("请输入教师的编号");
                                No = setIn.nextInt();
                                teaa.inputMarks(No, tea);
                                continue;
                            case 5:
                                System.out.println("执行根据考核分排序操作");
                                teaa.setKHMarkSort(tea);
                                continue;
                            case 6:
                                System.out.println("执行打印教师信息操作");
                                System.out.println("请输入教师的编号");
                                No = setIn.nextInt();
                                pi.printTeaInfo(No, tea);
                                continue;
                            case 7:
                                System.out.println("执行打印考核分操作");
                                System.out.println("请输入教师的编号");
                                No = setIn.nextInt();
                                pm.printTeaMarks(No, tea);
                                continue;
                            case 8:
                                System.out.println("进行更新教师信息操作");
                                System.out.println("请输入教师的编号：");
                                No = setIn.nextInt();
                                if (teaa.exist(No, tea.get(No))) {
                                    System.out.println("请输入教师的名字:");
                                    String namezj = setIn.next();
                                    System.out.println("请输入教师的年龄:");
                                    int agezj = setIn.nextInt();
                                    System.out.println("请输入教师的性别:");
                                    char genderzj = setIn.next().charAt(0);
                                    System.out.println("请输入教师的入职时间:");
                                    String getProjDatezj = setIn.next();
                                    teaa.replaceInfo(No, namezj, agezj, genderzj, getProjDatezj, tea);
                                    continue;
                                } else {
                                    System.err.println("教师不存在!");
                                }
                            case 9:
                                System.out.println("请输入教师的编号：");
                                int Nozj = setIn.nextInt();
                                System.out.println("请输入教师的所教科目");
                                String Projzj = setIn.next();
                                teaa.setProj(Nozj, Projzj, tea);
                                continue;
                            case 10:
                                System.out.println("请输入教师的编号：");
                                No = setIn.nextInt();
                                System.out.println("请输入教师的所教班级");
                                String classProjzj = setIn.next();
                                teaa.setclassProj(No, classProjzj, tea);
                                continue;
                            case 777:
                                eph.printPlaceholder(true);
                                System.out.println("您已退出系统!");
                                break;
                            default:
                                System.out.println("输入错误!请检查!");
                                break;
                        }break;
                    }break;
                case 3:
                    while (true) {
                        PrintMarks pm = new PrintMarks();
                        PrintInfo pi = new PrintInfo();
                        System.out.println("==========管理人员管理系统==========");
                        System.out.println("1:添加一个管理人员");
                        System.out.println("2:查找一个管理人员");
                        System.out.println("3:删除一个管理人员");
                        System.out.println("4:更新一个管理人员信息");
                        System.out.println("5:设置管理人员职位");
                        System.out.println("6:设置管理班级");
                        System.out.println("7：打印管理人员信息");
                        System.out.println("777:返回上级菜单");
                        try {
                            choose = setIn.nextInt();
                        } catch (Exception e) {
                            System.err.println("输入错误!请检查!");
                            continue;
                        }
                        switch (choose) {
                            case 1:
                                System.out.println("进行添加管理人员操作");
                                System.out.println("请输入管理人员的名字:");
                                String namezj = setIn.next();
                                System.out.println("请输入管理人员的年龄:");
                                int agezj = setIn.nextInt();
                                System.out.println("请输入管理人员的性别:");
                                char genderzj = setIn.next().charAt(0);
                                System.out.println("请输入管理人员的入职时间:");
                                String getProjDatezj = setIn.next();
                                adma.addTarget(namezj, agezj, genderzj, getProjDatezj, adm);
                                continue;
                            case 2:
                                System.out.println("执行查找管理人员的操作");
                                System.out.println("请输入管理人员的编号");
                                int No = setIn.nextInt();
                                adma.findTarget(No, adm);
                                continue;
                            case 3:
                                System.out.println("执行删除管理人员的操作");
                                System.out.println("请输入管理人员的编号");
                                No = setIn.nextInt();
                                adma.delete(No, adm);
                                continue;
                            case 4:
                                System.out.println("进行更新管理人员信息操作");
                                System.out.println("请输入管理人员的编号：");
                                No = setIn.nextInt();
                                if (adma.exist(No, adm.get(No))) {
                                    System.out.println("请输入管理人员的名字:");
                                    namezj = setIn.next();
                                    System.out.println("请输入管理人员的年龄:");
                                    agezj = setIn.nextInt();
                                    System.out.println("请输入管理人员的性别:");
                                    genderzj = setIn.next().charAt(0);
                                    System.out.println("请输入管理人员的入职时间:");
                                    String getJobDatezj = setIn.next();
                                    adma.replaceInfo(No, namezj, agezj, genderzj, getJobDatezj, adm);
                                    continue;
                                } else {
                                    System.err.println("管理人员不存在!");
                                }
                            case 5:
                                System.out.println("请输入管理人员的编号：");
                                No = setIn.nextInt();
                                System.out.println("请输入管理人员的职务:");
                                String Jobzj = setIn.next();
                                adma.setJob(No, Jobzj, adm);
                                continue;
                            case 6:
                                System.out.println("请输入管理人员的编号：");
                                No = setIn.nextInt();
                                System.out.println("请输入管理人员所管理的班级:");
                                String adminClassesezj = setIn.next();
                                adma.setAdminClasses(No, adminClassesezj, adm);
                                continue;
                            case 7:
                                System.out.println("请输入管理人员的编号：");
                                int Nozj = setIn.nextInt();
                                PrintInfo ad2 = new PrintInfo();
                                ad2.printAdmInfo(Nozj, adm);
                                continue;
                            default:
                                System.out.println("输入错误!请检查!");
                                break;
                            case 777:
                                eph.printPlaceholder(true);
                                System.out.println("您已退出系统!");
                                break;
                        }break;
                    }break;
                case 4:
                    while (true) {

                    }
                case 777:
                    eph.printPlaceholder(true);
                    System.out.println("您已退出学校管理系统!");
                    System.exit(0);
                default:
                    System.out.println("输入错误!请检查!");
            }
        }
    }
}

