package sasyspro.functions;


import sasyspro.main.Main;
import sasyspro.membersadmin.StudentsAdmin;
import sasyspro.membersadmin.TeachersAdmin;
import sasyspro.template.Student;
import sasyspro.template.Teacher;

import java.util.ArrayList;

/**
 * @author Laola233
 * @version 0.1
 * @serial SchoolAdminSystemPro
 * @since 0.4B
 */
public class PrintMarks {
    public final void printMarks(int NoNum, ArrayList<Student> arr) {
        Main a = new Main();
        StudentsAdmin a1 = new StudentsAdmin();
        if (a1.exist(NoNum, arr.get(NoNum))) {
            System.out.println("======学生" + a.stu.get(NoNum).getName() + "的成绩报告======");
            System.out.println("语文成绩:\t" + a.stu.get(NoNum).getChineseMark());
            System.out.println("数学成绩:\t" + a.stu.get(NoNum).getMathsMark());
            System.out.println("英语成绩:\t" + a.stu.get(NoNum).getEnglishMark());
            System.out.println("物理成绩:\t" + a.stu.get(NoNum).getPhysicsMark());
            System.out.println("化学成绩:\t" + a.stu.get(NoNum).getChemistryMark());
            System.out.println("历史成绩:\t" + a.stu.get(NoNum).getHistoryMark());
            System.out.println("政治成绩:\t" + a.stu.get(NoNum).getPoliticalMark());
            System.out.println("地理成绩:\t" + a.stu.get(NoNum).getGeographyMark());
            System.out.println("生物成绩:\t" + a.stu.get(NoNum).getBiologyMark());
            System.out.println("体育成绩:\t" + a.stu.get(NoNum).getPEMark());
            System.out.println("信息成绩:\t" + a.stu.get(NoNum).getITMark());
            System.out.println();
            a.stu.get(NoNum).setSum();
            a.stu.get(NoNum).setAvg();
            System.out.println("总成绩:\t" + a.stu.get(NoNum).getSum());
            System.out.println("平均分:\t" + a.stu.get(NoNum).getAvg());
        } else {
            System.err.println("学生不存在!");
        }
    }


    public final void printTeaMarks(int NoNum, ArrayList<Teacher> arr) {
        Main a = new Main();
        TeachersAdmin a1 = new TeachersAdmin();
        if (a1.exist(NoNum, arr.get(NoNum))) {
            System.out.println("======教师" + a.tea.get(NoNum).getName() + "的考核分报告======");
            System.out.println("考核分为:" + a.tea.get(NoNum).getkhMark());
        } else {
            System.err.println("教师不存在!");
        }
    }
}
